
module extensions::letconst::Util

import ParseTree;
import Message;
import IO;
import extensions::letconst::Syntax;

alias LEnv = lrel[str name, loc def];
alias Env = map[str name,loc def];

alias Refs = rel[loc use, loc def, str name];

alias Declare = bool(loc, str, loc, Scope);
alias Lookup = set[loc](str, loc, Scope);
alias GetRenaming = map[loc,str](Refs refs);
alias GetMessages = set[Message]();

data Scope 
	= block( Env env, Scope parent )
	| closure( Env env, LEnv unaccesiblestuff, Scope parent )
	| root();

&T <: Tree rename(&T <: Tree src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
    	when x@\loc in renaming
    case (Statement)`<Function f>` => (Statement)`var <Id fName> = <Function fNew>;`
    	when f@\loc in renaming, 
    		 Id fName := [Id]renaming[f@\loc],
    		 Params ps := f.parameters,
    		 Statement* body := f.body,
    		 Function fNew := (Function)`function (<Params ps>) { <Statement* body> }`
  }
}

bool nameInClosure( str name, Scope scope ) {
	top-down visit( scope ) {
		case closure( _, LEnv env, _ ) : return size(env[name]) > 1;
	}
	return false;
}

bool varInClosure( str name, Scope scope ) {
	top-down visit( scope ) {
		case closure( Env env, _, _ ) : return name in env;
	}
	return false;
}

tuple[Declare, Lookup, GetRenaming, GetMessages] makeResolver() {
  set[Message] messages = {};
  map[loc, str] toRename = ();
  
  bool declare( loc decl, str name, loc def, Scope scope ) {	
  	if( name in scope.env || varInClosure( name, scope ) ) messages += error("Duplicate declaration \"<name>\"",decl);
  	else if( nameInClosure( name, scope ) ) {
  		toRename[def] = name;
  	}
  	return true;
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
  
  set[loc] lookup(str name, loc use, Scope scope) {
	top-down visit( scope ) {
		case block( Env env, _ ) : {
			if(name in env) return {env[name]};
		}
		// If the variable references to a declaration in the function scope
		// but not to a declaration in its block scope, this reference is seen
		// as illegal, thus the referenced declaration is to be renamed
		case closure( Env env, LEnv cl, _ ) : {
			if(name in cl) 
				for( loc def <- cl[name] ) 
					toRename[def] = name;
			if(name in env) return {env[name]};
		}
	}
	
	messages += error("<name> is not defined",use);	
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