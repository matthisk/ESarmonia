module extensions::generators::Desugar
extend extensions::generators::Syntax;

import extensions::generators::Emitter;

public str fun =
"function* f() {
  var pre = 0, cur = 1;
  for (;;) {
    var temp = pre;
    pre = cur;
    cur += temp;
   	yield cur;
  }
}";

public Function gen = [Function]"<fun>";

Function desugar( f:(Function)`function * <Id name> (<Params ps>) { <Statement* body> }` )
	= (Function)`function <Id name> (<Params ps>) { 
				'	<Statement* generator> 
				'}`
	when
		Statement* generator := makeGenerator( f );

tuple[list[Id],Statement*] hoist( Statement* body ) {
	list[Id] vars = [];
	
	body = top-down visit( body ) {
		case (Statement)`var <{VariableDeclaration ","}+ vds>;` : {
			list[Expression] assigns = [];
			Statement* ss := statementStar( (Statement)`;` );	
			
			for( vd <- vds ) {
				id = vd.id;
				if( vd.exp? ) exp = vd.exp;
				vars += vd;
				
				if( vd.exp? ) 	
					assigns += (Expression)`<Id id> = <Expression exp>`;	
			}
		
			for( ass <- assigns ) \append( ss, (Statement)`<Expression ass>;` );
			if( size( assigns ) > 0 )
				insert n;	
			else
				insert (Statement)`;`;
		}
	}
	
	return <vars,body>;
}

Statement varDecl( list[Id] vars ) {
	Statement d = (Statement)`var id;`;

	void app( (Statement)`var <{VariableDeclaration ","}+ vds>;`, Id id ) {
		d = (Statement)`var <{VariableDeclaration ","}+ vds>, <Id id>;`;
	}

	for( id <- vars ) app( d, id );
	
	return d;
}

Statement* makeGenerator( Function f ) {
	<explode,getContextFunction,getTryLocList> = emitter();

	<vars,hBody> = hoist( f.body );
	list[Statement] outerBody = [];
	list[Statement] innerBody = [];
	Id marked = [Id]"marked";
	Id context = [Id]"context";

	explode(f.body);

	if( size( vars ) > 0 ) outerBody += varDecl( vars );
	
	list[Expression] wrapArgs = [
		getContextFunction(innerFnId),
		(Expression)`false`,
		(Expression)`this`
	];
	
	return f.body;	
}