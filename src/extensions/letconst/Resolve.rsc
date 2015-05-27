@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import IO;
import util::Maybe;
import extensions::letconst::Syntax;

alias Env = map[str name,tuple[int declarator,loc at] decl];
alias SiblingScopes = map[loc, Env];

alias Refs = rel[loc use, loc def, str name];

alias Declare = void(loc, str, loc, ScopeTree);
alias GetRenaming = map[loc,str](Refs refs);

alias Def = tuple[loc def,bool valid];

data ScopeTree
	= scope( Env current )
	| scope( Env current, set[Env] siblings, ScopeTree parent )
	| closure( Env current, ScopeTree parent )
	;

int LET = 0;
int CONST = 1;
int VAR = 2;

start[Source] resolve( start[Source] pt ) {
	<declare, getRenaming> = makeResolver();
	refs = resolve( pt.top, declare );
	ren = getRenaming(refs);
	
	return rename(pt,ren); 
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

tuple[Declare, GetRenaming] makeResolver() {
  map[loc, str] toRename = ();
  
  void declare( loc stat, str name, loc def, ScopeTree scTree ) {	
  	top-down visit(scTree) {
  		// Declaration capture cannot happen outside of functions closure
  		case closure( Env sc, ScopeTree parent ) : {
  			return;
  		}
  		
  		case scope( Env sc, set[Env] siblings, ScopeTree parent ) : {
  			if( name in sc && sc[name].at != def ) {
  				toRename[def] = name;
  			}
  			
  			for( env <- siblings, name in env ) {
		    	toRename[def] = name;
		    }
  		}
  		case scope( Env rt ) : {
  			if(name in rt && rt[name].at != def) {
  				toRename[def] = name;
  			}
  		}
  	}
  }
  
  map[loc,str] getRenaming(Refs refs) {
    ren = ();
    allNames = refs<2>;
    for(d <- toRename) {
    	n = gensym(allNames, toRename[d]);
    	allNames += {n};
    	
    	ren[d] = n;
    	ren += ( u : n | <u,def,_> <- refs, def == d );
    }
    return ren;
  }
 
  return <declare, getRenaming>;
}

set[loc] lookup(str name, loc use, ScopeTree scTree) {
	top-down visit(scTree) {
	    case ScopeTree s : {
	    	if(name in s.current) return {s.current[name].at};
	    }
	}
	
	return {};
}

str gensym(set[str] ns, str base) = gensym(ns, base + "_", 0);

str gensym(set[str] ns, str base, int i) {
  n = "<base><i>";
  if (n in ns) {
    return gensym(ns, base, i + 1);
  }
  return n;
}

Refs resolve(src:(Source)`<Statement* stats>`, Declare declare) 
  = resolve( stats, scope( () ), declare );
  
Refs resolve(Function f, ScopeTree scTree, Declare declare )
	= resolve( f.body, closure( (), scTree ), declare );  

ScopeTree addEnv( scope( Env current ), Env new ) = scope( current + new );
ScopeTree addEnv( scope( Env current, set[Env] siblings, ScopeTree parent ), Env new ) 
	= scope( current + new, siblings, parent );

Refs resolve( Statement* stats, ScopeTree scTree, Declare declare ) {
	refs = {};
	siblings = ( () | it + createSiblingEnv(s) | Statement s <- stats );
	
	for( s <- stats ) {
		scTree.current += matchDeclaration( s );
		refs += resolve( s, scTree, siblings, declare );
	}
	
	return refs;	
}

Refs resolve(Statement stat, ScopeTree scTree, SiblingScopes siblings, Declare declare ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, scTree, declare);
    
    case s:(Statement)`let <{VariableDeclaration ","}+ vds>;` : {
    	for( vd <- vds ) declare( s@\loc, "<vd.id>", vd.id@\loc, scTree );
    }
    
    case s:(Statement)`const <{VariableDeclaration ","}+ vds>;` : {
    	for( vd <- vds ) declare( s@\loc, "<vd.id>", vd.id@\loc, scTree );
    }
    	
    case s:(Statement)`{<Statement* stats>}`: {
      Env env = siblings[s@\loc];
      refs += resolve(stats, scope( env, siblings<1> - env, scTree ), declare );
    }
    
    case Expression e:
      refs += resolve(e, scTree );  
    
   }
   return refs;
}

Refs resolve(Expression exp, ScopeTree scTree) {
  Refs refs = {};
  
  top-down-break visit (exp) {
    case Function f: 
    	refs += resolve(f);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name,use,scTree) };
    }
  }
  return refs;
}

default SiblingScopes createSiblingEnv( Statement s ) = ();
SiblingScopes createSiblingEnv( s:(Statement)`{ <Statement* block> }` ) 
	= ( s@\loc : c )
	when Env c := ( () | it + matchDeclaration(s) | Statement s <- block );

default Env matchDeclaration( Statement s ) = ();
Env matchDeclaration( (Statement)`let <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <LET,vd.id@\loc> | vd <- vds );
Env matchDeclaration( (Statement)`const <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <CONST,vd.id@\loc> | vd <- vds );
Env matchDeclaration( (Statement)`var <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <VAR,vd.id@\loc> | vd <- vds );