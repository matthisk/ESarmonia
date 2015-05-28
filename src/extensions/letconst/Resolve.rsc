
module extensions::letconst::Resolve

import ParseTree;
import Message;
import IO;
import extensions::letconst::Syntax;

import extensions::letconst::Util;

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

Refs resolve(src:(Source)`<Statement* stats>`, Declare declare, Lookup lookup) 
  = resolve( stats, scope, declare, lookup )
  when Scope scope := varDefs( stats, root() );

Refs resolve(Function f, Scope parentScope, Declare declare, Lookup lookup )
	= resolve( f.body, scope, declare, lookup )
	when Scope scope := varDefs( f.body, parentScope );

Refs resolve( Statement* stats, Scope parentScope, Declare declare, Lookup lookup ) {
	Scope scope = block( (), parentScope );
	refs = {};
	
	for( s <- stats ) {
		scope = setScope( scope, s, declare );
		refs += resolve( s, scope, declare, lookup );
	}
	
	return refs;	
}

Scope setScope(Scope scope, Statement stat, Declare declare) {
	void define( {VariableDeclaration ","}+ vds ) {
		for( vd <- vds ) define(vd@\loc,"<vd.id>",vd.id@\loc);
	}
	
	void define(decl,n,def) {
        declare( decl, n, def, scope );
        scope.env[n] = def;
	}

	top-down-break visit( stat ) {
		case (Statement)`{ <Statement* _> }`: ; 
		case Function f: if(f has name) define(f@\loc,"<f.name>",f.name@\loc);
		case (Statement)`let <{VariableDeclaration ","}+ vds>;`: define(vds);
		case (Statement)`const <{VariableDeclaration ","}+ vds>;`: define(vds);
	}

	return scope;
}

Refs resolve(Statement stat, Scope scope, Declare declare, Lookup lookup ) {
  Refs refs = {};
  
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, scope, declare, lookup);
    
    case s:(Statement)`{<Statement* stats>}`:
      	refs += resolve(stats, scope, declare, lookup);
    
    case (Statement)`for (let <{VariableDeclarationNoIn ","}+ vds>;<{Expression ","}* conds>;<{Expression ","}* ops>) <Statement body>`: {
    	defs = ( "<vd.id>" : vd.id@\loc | vd <- vds, declare( vd@\loc, "<vd.id>", vd.id@\loc, scope ) );
    	scope = block( defs, scope );

    	for( cond <- conds ) refs += resolve(cond, scope, declare, lookup);
    	for( op <- ops ) refs += resolve(op, scope, declare, lookup);

    	refs += resolve(body, scope, declare, lookup );
    }
      
    case (Statement)`for (let <Id x> in <Expression obj>) <Statement body>`: {
    	declare( x@\loc, "<x>", x@\loc, scope );
    	scope = block( ( "<x>" : x@\loc ), scope );
    	
    	refs += resolve(obj, scope, declare, lookup);
    	refs += resolve(body, scope, declare, lookup );
    }
    
    case Expression e:
      	refs += resolve(e, scope, declare, lookup); 
    
   }
   return refs;
}

Refs resolve(Expression exp, Scope scope, Declare declare, Lookup lookup) {
  Refs refs = {};
  
  top-down-break visit (exp) {
    case Function f: 
    	refs += resolve(f, scope, declare, lookup);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name,use,scope) };
    }
  }
  return refs;
}

Scope varDefs(Statement* body,Scope parentScope) {
  map[str,loc] env = (); 
  lrel[str,loc] cl = [];
  
  void define((Declarator)`var`,Id x) { env["<x>"] = x@\loc; cl += <"<x>",x@\loc>; }
  void define((Declarator)`let`,Id x) { cl += <"<x>",x@\loc>; }
  void define((Declarator)`const`,Id x) { cl += <"<x>",x@\loc>; }
  
  top-down-break visit (body) {
    case Function f: 
      if (f has name) define((Declarator)`let`,f.name);
    
    case (VarDecl)`<Declarator d> <{VariableDeclaration ","}+ vds>;`:
      for (vd <- vds) define(d,vd.id);
    
    case (Statement)`for (<Declarator d> <{VariableDeclarationNoIn ","}+ vds>;<{Expression ","}* _>;<{Expression ","}* _>) <Statement _>`:
    	for( vd <- vds ) define(d,vd.id);
      
    case (Statement)`for (<Declarator d> <Id x> in <Expression _>) <Statement _>`:
      define(d,x);

    // todo: labels
  }
  
  return closure(env,cl,parentScope);
}