module extensions::arrow::Desugar
extend desugar::Desugar;

import extensions::arrow::Syntax;
import IO;

private &T replaceThisReference( &T <: Tree e, Expression replacement ) {
	return top-down-break visit (e) {
		case Function _: ;
		case (Expression)`this` => replacement
	}
}

private &T <: Tree desugarArrow( &T <: Tree body, Expression thisReplacement = (Expression)`_this` ) {
	return top-down-break visit ( body ) {
		case Function _: ;
		case (Expression)`<Id x> =\> <Expression e>` => (Expression)`function(<Id x>) { return <Expression e2>; }`
			when e2 := replaceThisReference( e, thisReplacement )
		case (Expression)`<Id x> =\> { <Statement* body> }` => (Expression)`function(<Id x>) { <Statement* body2> }`
			when body2 := replaceThisReference( body, thisReplacement )
		case (Expression)`(<{Id ","}* xs>) =\> <Expression e>` => (Expression)`function(<{Id ","}* xs>) { return <Expression e2>; }`
			when e2 := replaceThisReference( e, thisReplacement )
		case (Expression)`(<{Id ","}* xs>) =\> { <Statement* body> }` => (Expression)`function(<{Id ","}* xs>) { <Statement* body2> }`
			when body2 := replaceThisReference( body, thisReplacement )
	}
}

Function desugar( s:(Function)`function(<{Id ","}* ps>) {<Statement* body>}` ) {
	desugaredBody = desugarArrow( body ); 

	if( desugaredBody != body ) {
		s = (Function)`function (<{Id ","}* ps>) { var _this = this; <Statement* desugaredBody> }`;
	}
	
	return s;
}

Source desugar( Source src ) = desugarArrow( src, thisReplacement = (Expression)`undefined` );