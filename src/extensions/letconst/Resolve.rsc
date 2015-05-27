@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import Message;
import IO;
import util::Maybe;
import extensions::letconst::Syntax;

alias FScope = lrel[str name, loc def];
alias Env = map[str name,tuple[int declarator,loc at] decl];

alias Refs = rel[loc use, loc def, str name];

alias Declare = void(loc, str, loc, FScope, FScope);
alias GetRenaming = map[loc,str](Refs refs);
alias GetMessages = list[Message]();

alias Def = tuple[loc def,bool valid];

alias BScope = list[Env];

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
  
  void declare( loc sloc, str name, loc def, FScope scope, FScope defs ) {	
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

set[loc] lookup(str name, loc use, BScope scope) {
	for( Env env <- scope ) {
		if(name in env) return {env[name].at};
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
  = resolve( stats, [], declare )
  when FScope defs := letConstDefs( stats, declare, [] ); 

Refs resolve(Function f, BScope scope, Declare declare )
	= resolve( f.body, scope, declare )
	when FScope defs := letConstDefs( f.body, declare, [] );

Refs resolve( Statement* stats, BScope scope, Declare declare ) {
	BScope scope = [(),*scope];
	refs = {};
	
	for( s <- stats ) {
		scope[0] += matchDeclaration( s );
		refs += resolve( s, scope, declare );
	}
	
	return refs;	
}

FScope letConstDefs( Statement* stats, Declare declare, FScope scope ) {
	FScope defs = []; // Holds definitions from current block, used to detect redeclaration

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

Refs resolve(Statement stat, BScope scope, Declare declare ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, scope, declare);
    	
    case s:(Statement)`{<Statement* stats>}`: {
      refs += resolve(stats, scope, declare );
    }
    
    case Expression e:
      refs += resolve(e, scope);  
    
   }
   return refs;
}

Refs resolve(Expression exp, BScope scope) {
  Refs refs = {};
  
  top-down-break visit (exp) {
    case Function f: 
    	refs += resolve(f);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name,use,scope) };
    }
  }
  return refs;
}

default Env matchDeclaration( Statement s ) = ();
Env matchDeclaration( (Statement)`let <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <LET,vd.id@\loc> | vd <- vds );
Env matchDeclaration( (Statement)`const <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <CONST,vd.id@\loc> | vd <- vds );
Env matchDeclaration( (Statement)`var <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : <VAR,vd.id@\loc> | vd <- vds );