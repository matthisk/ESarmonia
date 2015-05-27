@cachedParser{extensions.letconst.cached.Parser}
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

Refs resolve( Statement* stats, Scope parentScope, Declare declare, Lookup lookup, Env startScope = () ) {
	Scope scope = block( startScope, parentScope );
	refs = {};
	
	for( s <- stats ) {
		scope.env += matchDeclaration( s, declare, scope );
		refs += resolve( s, scope, declare, lookup );
	}
	
	return refs;	
}

Refs resolve(Statement stat, Scope scope, Declare declare, Lookup lookup ) {
  Refs refs = {};
  top-down-break visit (stat) {
  	case Function f: 
  		refs += resolve(f, scope, declare, lookup);
    
    case s:(Statement)`{<Statement* stats>}`:
      	refs += resolve(stats, scope, declare, lookup);
    
    case (Statement)`for (let <{VariableDeclarationNoIn ","}+ vds>;<{Expression ","}* _>;<{Expression ","}* _>) { <Statement* stats> }`:
    	refs += resolve(stats, scope, declare, lookup, startScope = ( "<vd.id>" : vd.id@\loc | vd <- vds ));
      
    case (Statement)`for (let <Id x> in <Expression _>) { <Statement* stats> }`:
    	refs += resolve(stats, scope, declare, lookup, startScope = ( "<x>" : x@\loc ) );
    
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
  
  top-down-break visit (body) {
    case Function f: 
      if (f has name) varDefine(f.name);
    
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

default Env matchDeclaration( Statement s, Declare _, Scope _ ) = ();
Env matchDeclaration( s:(Statement)`let <{VariableDeclaration ","}+ vds>;`, Declare declare, Scope scope ) 
	= ( "<vd.id>" : vd.id@\loc | vd <- vds, declare( s@\loc, "<vd.id>", vd.id@\loc, scope ) );