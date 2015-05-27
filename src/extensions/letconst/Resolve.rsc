@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import Message;
import IO;
import util::Maybe;
import extensions::letconst::Syntax;

alias PScope = lrel[str name, loc def];
alias Env = map[str name,tuple[int declarator,loc at] decl];
alias SiblingScopes = map[loc, Env];

alias Refs = rel[loc use, loc def, str name];

alias Declare = void(loc, str, loc, PScope, PScope);
alias GetRenaming = map[loc,str](Refs refs);
alias GetMessages = list[Message]();

alias Def = tuple[loc def,bool valid];

alias Scope = list[Env];

data ScopeTree
	= scope( Env current )
	| scope( Env current, set[Env] siblings, ScopeTree parent )
	| closure( Env current, ScopeTree parent )
	;

int LET = 0;
int CONST = 1;
int VAR = 2;

start[Source] resolve( start[Source] pt ) {
	<declare, getRenaming, getMessages> = makeResolver();
	refs = resolve( pt.top, declare );
	ren = getRenaming(refs);
	println( getMessages() );
	
	return rename(pt,ren); 
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

tuple[Declare, GetRenaming, GetMessages] makeResolver() {
  list[Message] messages = [];
  map[loc, str] toRename = ();
  
  void declare( loc sloc, str name, loc def, PScope scope, PScope defs ) {	
  	// Redeclaration in current scope
	if( name in defs<0> ) messages += error("Duplicate declaration \"<name>\"",sloc);
	// Redeclaration in nested scope
	else if( name in (scope + defs)<0> ) {
		for( <name,d> <- scope ) toRename[d] = name;
		toRename[def] = name;
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
  
  list[Message] getMessages() {
  	return messages;
  }
 
  return <declare, getRenaming, getMessages>;
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
  = resolve( stats, scope( () ), declare )
  when PScope defs := letConstDefs( stats, declare, [] ); 

Refs resolve(Function f, ScopeTree scTree, Declare declare )
	= resolve( f.body, closure( (), scTree ), declare )
	when PScope defs := letConstDefs( f.body, declare, [] );

Refs resolve( Statement* stats, ScopeTree scTree, Declare declare ) {
	refs = {};
	siblings = ( () | it + createSiblingEnv(s) | Statement s <- stats );
	
	for( s <- stats ) {
		scTree.current += matchDeclaration( s );
		refs += resolve( s, scTree, siblings, declare );
	}
	
	return refs;	
}

PScope letConstDefs( Statement* stats, Declare declare, PScope scope ) {
	PScope defs = []; // Holds definitions from current block, used to detect redeclaration

	top-down-break visit( stats ) {
		case Function f: ;
		case (Statement)`{ <Statement* block> }` : scope += letConstDefs( block, declare, scope + defs );
		case s:(Statement)`let <{VariableDeclaration ","}+ vds>;`:
			for( vd <- vds ) {
				declare( s@\loc, "<vd.id>", vd.id@\loc, scope, defs );
				defs += <"<vd.id>", vd.id@\loc>;
			}
	}
	
	return scope + defs;
}

Refs resolve(Statement stat, ScopeTree scTree, SiblingScopes siblings, Declare declare ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, scTree, declare);
    	
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