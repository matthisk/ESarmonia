@cachedParser{extensions.arrow.cached.Parser}
module extensions::arrow::Desugar
extend desugar::Base;

extend extensions::arrow::Syntax;
import IO;

Source desugar( Source src ) = desugarArrows( src, undefined, undefined );
	  
Function desugar( f:(Function)`function(<Params ps>) {<Statement* body>}` )
	= f[body = desugarArrows(body, this, arguments)];

Expression wrap( Params ps, Statement* body, Expression this, Expression arguments )
	= (Expression)`(function(_this,_arguments) { 
				  '		return function(<Params ps>) { 
				  '		<Statement* body> 
				  '		}; 
				  '})(<Expression this>,<Expression arguments>)`;

Statement* replace( Expression e ) = statementStar( (Statement)`return <Expression e>;` )
	when Expression e := replaceThisArgumentsReference( e );
Statement* replace( Statement* b ) = replaceThisArgumentsReference( b );

private &T <: Tree replaceThisArgumentsReference( &T <: Tree e ) {
	return top-down-break visit (e) {
		case Function _: ;
		case (Expression)`this` => (Expression)`_this`
		case (Expression)`arguments` => (Expression)`_arguments`
	}
}

&T <: Tree desugarArrows( &T <: Tree src, Expression this, Expression arguments) {
	return top-down-break visit( src ) {
		case Function _: ;
		case (Expression)`(<Params ps>) =\> <Expression e>` => wrap( ps, replace(e), this, arguments )
		case (Expression)`<Param p> =\> <Expression e>` => wrap( params(p), replace(e), this, arguments )
		case (Expression)`(<Params ps>) =\> { <Statement* b> }` => wrap( ps, replace(b), this, arguments )
		case (Expression)`<Param p> =\> { <Statement* b> }` => wrap( params(p), replace(b), this, arguments )
	}
}