module extensions::generators::Desugar
extend extensions::generators::Syntax;

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

Expression appendExpression( (Expression)`[ <{ArgExpression ","}* args> ]`, Expression e )
	= (Expression)`[ <{ArgExpression ","}* args>, <Expression e> ]`;

Statement* makeGenerator( Function f ) {
	<vars,hBody> = hoist( f.body );
	Id marked = [Id]"marked";
	Id context = [Id]"context";

	return f.body;	
}

	//(Statement) `return regeneratorRuntime.wrap(function <Id name>$(<Id context>) {
	//			'	while(1) switch (<Id context>.prev = <Id context>.next) {
	//			'		case 0: ;
	//			'		case 3: ;
	//			'		case 5: ;
	//			'		case 'end': 
	//			'			return <Id context>.stop();
	//			'	}
	//			'}, <Id marked>[0], this);`;