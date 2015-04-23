module extensions::arrow::Desugar
extend desugar::Desugar;

import extensions::arrow::Syntax;
import IO;

Function desugar( s:(Function)`function(<Params ps>) {<Statement* body>}` ) {
	desugaredBody = desugarArrow( body ); 

	if( desugaredBody != body ) {
		s = (Function)`function (<Params ps>) { var _this = this; <Statement* desugaredBody> }`;
	}
	
	return s;
}

Source desugar( Source src ) = desugarArrow( src, thisReplacement = (Expression)`undefined` )
	when
		/(Expression)`<Arrow _>` := src;

private &T replaceThisReference( &T <: Tree e, Expression replacement ) {
	return top-down-break visit (e) {
		case Function _: ;
		case (Expression)`this` => replacement
	}
}

private &T <: Tree desugarArrow( &T <: Tree body, Expression thisReplacement = (Expression)`_this` ) {
	return top-down-break visit ( body ) {
		case Function _: ;
		case (Expression)`<Param p> =\> <Expression e>` => (Expression)`function(<Param p>) { return <Expression e2>; }`
			when e2 := replaceThisReference( e, thisReplacement )
		case (Expression)`<Param p> =\> { <Statement* body> }` => (Expression)`function(<Param p>) { <Statement* body2> }`
			when body2 := replaceThisReference( body, thisReplacement )
		case (Expression)`(<Params ps>) =\> <Expression e>` => (Expression)`function(<Params ps>) { return <Expression e2>; }`
			when e2 := replaceThisReference( e, thisReplacement )
		case (Expression)`(<Params ps>) =\> { <Statement* body> }` => (Expression)`function(<Params ps>) { <Statement* body2> }`
			when body2 := replaceThisReference( body, thisReplacement )
	}
}