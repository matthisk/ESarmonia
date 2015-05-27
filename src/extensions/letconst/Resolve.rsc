@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import Message;
import IO;
import util::Maybe;
import extensions::letconst::Syntax;

alias FScope = lrel[str name, loc def];
alias Env = map[str name,loc def];

alias Refs = rel[loc use, loc def, str name];

alias Declare = void(loc, str, loc, FScope, FScope);
alias Lookup = set[loc](str, loc, FScope, BScope);
alias GetRenaming = map[loc,str](Refs refs);
alias GetMessages = set[Message]();

alias Def = tuple[loc def,bool valid];

alias BScope = list[Env];

int LET = 0;
int CONST = 1;
int VAR = 2;

start[Source] resolve( start[Source] pt ) {
	<declare, lookup, getRenaming, getMessages> = makeResolver();
	refs = resolve( pt.top, declare, lookup );
	ren = getRenaming(refs);
	
	pt = rename(pt,ren)[@messages = getMessages()]; 
	pt = visit(pt) {
		case (Declarator)`<LetOrConst _>` => (Declarator)`var`
	}
	
	return pt;
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

tuple[Declare, Lookup, GetRenaming, GetMessages] makeResolver() {
  set[Message] messages = {};
  map[loc, str] toRename = ();
  
  void declare( loc sloc, str name, loc def, FScope scope, FScope defs ) {	
  	// Redeclaration in current scope
	if( name in defs<0> ) messages += error("Duplicate declaration \"<name>\"",sloc); 
	// Redeclaration in nested scope
	else if( name in scope<0> ) {
		//for( <name,d> <- scope ) toRename[d] = name;
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
  
  set[loc] lookup(str name, loc use, FScope fScope, BScope scope) {
	for( Env env <- scope ) {
		if(name in env) return {env[name]};
	}
	
	// If the variable references to a declaration in the function scope
	// but not to a declaration in its block scope, this reference is seen
	// as illegal, thus the referenced declaration is to be renamed
	if( name in fScope<0> ) {
		for( loc def <- fScope[name] ) toRename[def] = name; 
	};
	
	return {};
  }
  
  set[Message] getMessages() {
  	return messages;
  }
 
  return <declare, lookup, getRenaming, getMessages>;
}

str gensym(set[str] ns, str base) = gensym(ns, base + "_", 0);

str gensym(set[str] ns, str base, int i) {
  n = "<base><i>";
  if (n in ns) {
    return gensym(ns, base, i + 1);
  }
  return n;
}

Refs resolve(src:(Source)`<Statement* stats>`, Declare declare, Lookup lookup) 
  = resolve( stats, fScope, [], declare, lookup )
  when FScope fScope := letConstDefs( stats, declare, [] );

Refs resolve(Function f, FScope _, BScope scope, Declare declare, Lookup lookup )
	= resolve( f.body, fScope, scope, declare, lookup )
	when FScope fScope := letConstDefs( f.body, declare, [] );

Refs resolve( Statement* stats, FScope fScope, BScope scope, Declare declare, Lookup lookup ) {
	BScope scope = [varDefs( stats ),*scope];
	refs = {};
	
	for( s <- stats ) {
		scope[0] += matchDeclaration( s );
		refs += resolve( s, fScope, scope, declare, lookup );
	}
	
	return refs;	
}

FScope letConstDefs( Statement* stats, Declare declare, FScope scope, FScope outerDefs = [] ) {
	FScope defs = []; // Holds definitions from current block, used to detect redeclaration

	top-down-break visit( stats ) {
		case Function f: ;
		case (Statement)`{ <Statement* block> }` : scope += letConstDefs( block, declare, scope, outerDefs = defs );
		case s:(Statement)`let <{VariableDeclaration ","}+ vds>;`:
			for( vd <- vds ) {
				declare( s@\loc, "<vd.id>", vd.id@\loc, scope + outerDefs, defs );
				defs += <"<vd.id>", vd.id@\loc>;
			}
		case s:(Statement)`var <{VariableDeclaration ","}+ vds>;`:
			for( vd <- vds ) {
				declare( s@\loc, "<vd.id>", vd.id@\loc, [], scope + defs );
				defs += <"<vd.id>", vd.id@\loc>;
			}
	}

	return scope + defs;
}

Refs resolve(Statement stat, FScope fScope, BScope scope, Declare declare, Lookup lookup ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, fScope, scope, declare, lookup);
    	
    case s:(Statement)`{<Statement* stats>}`: {
      refs += resolve(stats, fScope, scope, declare, lookup);
    }
    
    case Expression e:
      refs += resolve(e, fScope, scope, declare, lookup);  
    
   }
   return refs;
}

Refs resolve(Expression exp, FScope fScope, BScope scope, Declare declare, Lookup lookup) {
  Refs refs = {};
  
  top-down-break visit (exp) {
    case Function f: 
    	refs += resolve(f, fScope, scope, declare, lookup);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name,use,fScope,scope) };
    }
  }
  return refs;
}

Env varDefs(Statement* body) {
  env = (); 
  
  void define(Id x) {  env["<x>"] = x@\loc;  }
  
  top-down-break visit (body) {
    case Function f: 
      if (f has name) define(f.name);
    
    case (VarDecl)`var <{VariableDeclaration ","}+ vds>;`:
      for (vd <- vds) define(vd.id);
    
    case VariableDeclarationNoIn vd: 
      define(vd.id);
      
    case (Statement)`for (var <Id x> in <Expression _>) <Statement _>`:
      define(x);

    // todo: labels
  }
  
  return env;
}

default Env matchDeclaration( Statement s ) = ();
Env matchDeclaration( (Statement)`let <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : vd.id@\loc | vd <- vds );
Env matchDeclaration( (Statement)`const <{VariableDeclaration ","}+ vds>;` )
	= ( "<vd.id>" : vd.id@\loc | vd <- vds );