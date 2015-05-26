@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Resolve

import ParseTree;
import IO;
import extensions::letconst::Syntax;

alias Env = map[str name,loc decl];
alias Refs = rel[loc use, loc def, str name, bool valid];
alias Lookup = set[Def](str, loc, ScopeTree);
alias GetRenaming = map[loc,str](Refs refs);

alias Def = tuple[loc def,bool valid];

data ScopeTree
	= scope( Env )
	| scope( Env current, set[Env] siblings, ScopeTree parent )
	;

start[Source] debug( loc l ) {
	pt = parse( #start[Source], l );
	<lookup,getRenaming> = makeResolver();
	refs = resolve( pt.top, lookup );
	ren = getRenaming(refs);
	
	println("REFERENCES");
	iprintln(refs);
	
	println("TO RENAME:");
	iprintln(ren);
	
	return rename(pt,ren); 
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

tuple[Lookup, GetRenaming] makeResolver() {
  map[loc, str] toRename = ();
  
  set[Def] lookup(str name, loc use, ScopeTree scTree ) {
	set[Def] refs = {};
	bool found = false;
	
	set[Def] make( loc def, str name, bool Found ) {
		if( found ) { toRename[def] = name; }
		return {<def,!found>};
	}
	
	println("Lookup for <name> at <use>");
	iprintln(scTree);
	top-down visit(scTree) {
		case scope( Env sc, set[Env] siblings, ScopeTree parent ) : {
		    if( name in sc ) {
		    	refs += make( sc[name], name, found );
		 		found = true;
		    }
		    
		    for( env <- siblings, name in env ) {
		    	def = env[name];
		    	toRename[def] = name;
		    	refs += <def,false>;
		    }
		}
		case scope( Env rt ) : {
			if(name in rt) { 
	    		refs += make(rt[name],name,found);
	    	}
		}
	}
	
	return refs;
  }
  
  map[loc,str] getRenaming(Refs refs) {
    ren = ();
    allNames = refs<2>;
    for (d <- toRename) {
      n = gensym(allNames, toRename[d]);
      allNames += {n};
      ren[d] = n;
      ren += ( u: n | <u, d, _, true> <- refs ); 
    }
    return ren;
  }
  
  return <lookup, getRenaming>;
}

str gensym(set[str] ns, str base) = gensym(ns, base + "_", 0);

str gensym(set[str] ns, str base, int i) {
  n = "<base><i>";
  if (n in ns) {
    return gensym(ns, base, i + 1);
  }
  return n;
}

Refs resolve(src:(Source)`<Statement* stats>`, Lookup lookup) 
  = resolve( stats, scope( parent ), lookup )
  	when Env parent := letConstDefs( stats );
  
Refs resolve(Function f, Lookup lookup)
	= resolve( f.body, scope( letConstDefs(f.body) ), lookup );  

Refs resolve( Statement* stats, ScopeTree scTree, Lookup lookup ) {
	refs = {};
	siblings = getSiblingEnvs( stats );
	return ( {} | it + resolve( s, scTree, siblings, lookup ) | s <- stats );
}

Refs resolve(Statement stat, ScopeTree scTree, map[Statement,Env] siblings, Lookup lookup ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, lookup);
    
    case (Statement)`for( <LetOrConst _> <Id x> in <Expression e> ) <Statement s>` : {
    	if( (Statement)`{ <Statement* body> }` := s ) {
	    	Env env = letConstDefs( body );
	    	refs += resolve(body, scope( env + ("<x>":x@\loc), siblings - env, scTree ), lookup );
	    } else {
	    	Env env = letConstDefs( s );
	    	refs += resolve( s, scope( env + ("<x>":x@\loc), siblings, scTree ), [], lookup );
	    }
    }
    
    case (Statement)`for( <LetOrConst _> <{VariableDeclarationNoIn ","}+ vds> ; <{Expression ","}* conds> ; <{Expression ","}* ops> ) <Statement s>`: {
    	Env env = letConstDefs( s );
    	for( vd <- vds ) {
    		;
    	}
    	if( (Statement)`{ <Statement* body> }` := s ) {
    		;
    	} else {
    		;
    	}
    }
    
    case s:(Statement)`{<Statement* stats>}`: {
      Env env = siblings[s];
      refs += resolve(stats, scope( env, siblings<1> - env, scTree ), lookup);
    }
    case Expression e:
      refs += resolve(e, scTree, lookup);  
    case (Statement)`try {<Statement* t>} catch (<Id e>) {<Statement* c>}`: {
      Env tEnv = letConstDefs(t);
      Env cEnv = letConstDefs(c);
      tresolve = resolve(t, scope( siblings[t], siblings<1> - tEnv, scTree), lookup);
      cresolve = resolve(c, scope( siblings[c], siblings<1> - cEnv, scTree), lookup);
      refs += tresolve + cresolve;
    }
   }
   return refs;
}

Refs resolve(Expression exp, ScopeTree scTree, Lookup lookup) {
  Refs refs = {};
  top-down-break visit (exp) {
    case Function f: 
    	refs += resolve(f, lookup);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name, valid> | <loc def,bool valid> <- lookup(name,use,scTree) };
    }
  }
  return refs;
}

map[Statement,Env] getSiblingEnvs( Statement* stats ) {
	res = ();
	top-down-break visit( stats ) {
		case Function f: ;
		case s:(Statement)`{ <Statement* block> }` :
			res[s]  = letConstDefs( block );
		case s:(Statement)`try {<Statement* t>} catch (<Id e>) {<Statement* c>}`: {
      		res[t] = letConstDefs(t);
      		res[c] = letConstDefs(c);
      	}
      	case s:(Statement)`for( <LetOrConst _> <Id x> in arr ) <Statement s>`:
      		res[s] = letConstDefs( s ) + ("<x>":x@\loc);
      	case s:(Statement)`for( <LetOrConst _> <{VariableDeclarationNoIn ","}+ vds>; <{Expression ","}* conds> ; <{Expression ","}* ops> ) <Statement s>`:
      		res[s] = letConstDefs( s ) + ( "<vd.id>":vd.id@\loc | vd <- vds );
	}	
	return res;
}

Env letConstDefs(Statement s)
	= letConstDefs(sStar)
	when (Statement)`{<Statement* sStar>}` := (Statement)`{<Statement s>}`;
	
Env letConstDefs(Statement* body) {
  env = (); 
  
  void define(Id x) {  env["<x>"] = x@\loc;  }
  
  top-down-break visit (body) {
    case (Statement)`{ <Statement* _> }`: ;
    case Function f: ;
      
    case (VarDecl)`let <{VariableDeclaration ","}+ vds>;`:
      for (vd <- vds) define(vd.id);
    case (VarDecl)`const <{VariableDeclaration ","}+ vds>;`:
    	for(vd <- vds) define(vd.id);

    // todo: labels
  }
  
  return env;
}