module extensions::arrow::Desugar
extend core::Desugar;

import extensions::arrow::Syntax;

&T replaceThisReference( &T <: Tree e ) {
	return top-down-break visit (e) {
		case Function _: ;
		case (Expression)`this` => (Expression)`_this`
	}
}

Expression desugar( s:(Expression)`function(<{Id ","}* ps>) {<Statement* body>}` ) {
	body = top-down-break visit ( body ) {
		case Function _: ;
		case (Expression)`Id "=\>" <Expression e>` => (Expression)`function(<Id x>) { return <Expression e2>; }`
			when e2 := replaceThisReference( e )
	}
	return (Expression)`function (<{Id ","}* ps>) { var_this = this; <Statement* body> }`;
}