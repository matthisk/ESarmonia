module extensions::newtarget::Desugar
extend extensions::newtarget::Syntax;

Source desugar( Source src, _ ) 
	= visitor( src )
	when /(Expression)`new.target` := src;

Source visitor( Source src ) {
	src = top-down-break visit( src ) {
		case (Expression)`new <Expression e>(<{ArgExpression ","}* args>)`
			=>
		(Expression)`[_cons = <Expression e>, OLD_TARGET = TARGET, TARGET = _cons, new _cons(<{ArgExpression ","}* args>), TARGET = OLD_TARGET][3]`	
		
		case (Expression)`new.target`
			=>
		(Expression)`TARGET`	
	}
	
	return setVars( src );
}

Source setVars( (Source)`<Statement* stats>` ) 
	= (Source)
			`var TARGET = undefined, OLD_TARGET = undefined;
			'<Statement* stats>`;