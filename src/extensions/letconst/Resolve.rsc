@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import IO;
import util::Maybe;
import extensions::letconst::Syntax;

alias Env = map[str name,tuple[int declarator,loc at] decl];
alias SiblingScopes = map[loc, Env];

alias Refs = rel[loc use, loc def, str name, Maybe[loc] redecl];

alias Declare = void(loc, str, loc, ScopeTree);
alias GetRenaming = map[loc,str](Refs refs);
alias GetErrors = map[loc,Statement]();

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
	<declare, getRenaming, getErrors> = makeResolver();
	refs = resolve( pt.top, declare );
	ren = getRenaming(refs);
	errors = ();
	
	for( <use,def,name,just(loc e)> <- refs ) {
		errors[e] = (Expression)`console.error("re-assignment of const forbidden")`;
	}
	
	statErrors = getErrors();
	iprintln(statErrors);
	return rename(pt,ren,errors,statErrors); 
}

start[Source] rename(start[Source] src, map[loc, str] renaming, map[loc, Expression] errors,map[loc, Statement] statErrors) {
  return visit (src) {
  	case Statement s => statErrors[s@\loc]
  		when s@\loc in statErrors
  	case Expression e => errors[e@\loc]
  		when e@\loc in errors
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

tuple[Declare, GetRenaming, GetErrors] makeResolver() {
  map[loc, str] toRename = ();
  map[loc, Statement] toError = ();
  
  void declare( loc stat, str name, loc def, ScopeTree scTree ) {	
  	top-down visit(scTree) {
  		// Declaration capture cannot happen outside of functions closure
  		case closure( Env sc, ScopeTree parent ) : {
  			return;
  		}
  		
  		case scope( Env sc, set[Env] siblings, ScopeTree parent ) : {
  			if( name in sc && sc[name].at != def ) {
  				if(sc[name].declarator == CONST) toError[stat] = (Statement)`throw new ReferenceError("Redeclaration of const");`;
  				else toRename[def] = name;
  			}
  			
  			for( env <- siblings, name in env ) {
		    	toRename[def] = name;
		    }
  		}
  		case scope( Env rt ) : {
  			if(name in rt && rt[name].at != def) {
  				if(sc[name].declarator == CONST) toError[stat] = (Statement)`throw new ReferenceError();`;
  				else toRename[def] = name;
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
    	ren += ( u : n | <u,def,_,_> <- refs, def == d );
    }
    return ren;
  }
  
  map[loc,Statement] getErrors() {
  	return toError;
  }
  
  return <declare, getRenaming, getErrors>;
}

set[loc] lookup(str name, loc use, ScopeTree scTree) {
	top-down visit(scTree) {
	    case ScopeTree s : {
	    	if(name in s.current) return {s.current[name].at};
	    }
	}
	
	return {};
}

set[loc] lookupAssignment(str name, loc use, ScopeTree scTree) {
	top-down visit(scTree) {
		case ScopeTree s : {
			if(name in s.current && s.current[name].declarator == CONST)
				return {s.current[name].at};
			if(name in s.current)
				return {};
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
		println(s);
		scTree = addEnv( scTree, matchDeclaration( s ) );
		iprintln(scTree);
		//siblings += createSiblingEnv( s );
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
    case (Expression)`<Id x> = <Expression e>` : {
    	name = "<x>";
    	use = x@\loc;
    	refs += { <use, def, name, just(e@\loc)> | loc def <- lookupAssignment(name,use,scTree) };
    	refs += { <use, def, name, nothing()> | loc def <- lookup(name,use,scTree) };
    }
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name, nothing()> | loc def <- lookup(name,use,scTree) };
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