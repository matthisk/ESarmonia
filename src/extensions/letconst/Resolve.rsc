module extensions::letconst::Resolve

import ParseTree;
import Message;
import IO;
import extensions::letconst::Syntax;
import extensions::letconst::Globals;

import extensions::letconst::Util;

&T <: Tree resolve( &T <: Tree pt ) = resolve(pt)<0>; 

tuple[&T <: Tree, Refs, map[loc, str]] resolver( &T <: Tree pt ) {
	pt = uniqueify(pt);
	<declare, lookup, getRenaming, getMessages> = makeResolver();
	refs = resolve( pt, declare, lookup );
	renaming = getRenaming(refs);
	
	pt = rename(pt,renaming)[@messages = getMessages()]; 
	pt = visit(pt) {
		case (Declarator)`<LetOrConst _>` => (Declarator)`var`
	}
	
	return <pt, refs, renaming>;	
}

Refs resolve(src:(start[Source])`<Statement* stats>`, Declare declare, Lookup lookup) 
  = resolve( stats, scope, declare, lookup )
  when Scope scope := varDefs( stats, root( globals ) );

default Refs resolve( &T <: Tree pt, Declare declare, Lookup lookup )
	= resolve( pt, root( globals ), declare, lookup );

Refs resolve(Function f, Scope parentScope, Declare declare, Lookup lookup )
	= resolve( f.body, scope, declare, lookup )
	when 
		Scope scope := addParametersToScope( f, varDefs( f.body, parentScope ) );

Scope addParametersToScope( Function f, Scope scope ) 
	= scope[env = scope.env + p]
	when
		Env p := ( "<x>" : x.id@\loc | x <- f.parameters.lst);

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
		case Function f: if(f has name) define(f@\loc,"<f.name>",f@\loc);
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
    
    case (Statement)`try { <Statement* tr> } catch(<Id n>) { <Statement* ct> }`: {
    	declare( n@\loc, "<n>", n@\loc, scope );
    	
    	refs += resolve(tr, scope, declare, lookup);
    	scope = block( ( "<n>": n@\loc ), scope );
    	refs += resolve(ct, scope, declare, lookup);
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
    case PropertyName _: ;
    case ee:(Expression)`<Expression e>.<Id _>` : 
    	refs += resolve( e, scope, declare, lookup );
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
  
  void define((Declarator)`var`,Id x) { env["<x>"] = x@\loc; } //cl += <"<x>",x@\loc>; }
  void define((Declarator)`let`,Id x) { cl += <"<x>",x@\loc>; }
  void define((Declarator)`const`,Id x) { cl += <"<x>",x@\loc>; }
  
  void definer( &T <: Tree n ) {
      top-down-break visit (n) {
        case Function f: 
          if (f has name) define((Declarator)`let`,f.name);
        
        case (VarDecl)`<Declarator d> <{VariableDeclaration ","}+ vds>;`:
          for (vd <- vds) define(d,vd.id);
        
        case (Statement)`for (<Declarator d> <{VariableDeclarationNoIn ","}+ vds>;<{Expression ","}* _>;<{Expression ","}* _>) <Statement s>`: {
          for( vd <- vds ) define(d,vd.id);
          definer(s);
        }
          
        case (Statement)`for (<Declarator d> <Id x> in <Expression _>) <Statement s>`: {
          define(d,x);
          definer(s);
        }

        // todo: labels
      }
  }
  
  definer(body);
  
  return closure(env,cl,parentScope);
}

// until we can make this generic...
// and maybe merg with resolve to prevent another traversal.
&T <: Tree uniqueify( &T <: Tree s) {
  int count = 0;

  loc uniq(loc id) {
    id.fragment = "<count>";
    count += 1;
    return id;
  };
    
  return visit (s) {
    case Id x => x[@\loc=uniq(x@\loc)]
      //when x@\loc.extension == "rsc"
  }
}