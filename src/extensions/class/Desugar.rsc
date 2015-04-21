module extensions::class::Desugar
extend desugar::Desugar;

import IO;
import extensions::class::Syntax;

Statement desugar( Statement class )
	= ssr
	when
		(Statement)`class <Id name> { <Methods ms> }` := class,
		Statement ssr := desugarClassDeclaration( name, (Constructor)`constructor() {}`, ms );
		
Statement desugar( Statement class )
	= ssr
	when
		(Statement)`class <Id name> { <Constructor ctor> <Methods ms> }` := class,
		Statement ssr := desugarClassDeclaration( name, ctor, ms );

private Statement ctor2Function( Id name, Params ps, Statement* body ) 
	= (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); <Statement* desugaredBody> }`
	when
		Statement* desugaredBody := desugarSuperConstructorCall( name, body );

private Statement desugarClassDeclaration( Id name, Constructor ctor, Methods ms )
	= makeClassDeclaration( name, ctorFunction, methods, ret )
	when
		(Constructor)`constructor(<Params ps>) { <Statement* body> }` := ctor,
		Statement* methods := desugarMethods( name, ms ),
		Statement ctorFunction := ctor2Function( name, ps, body ),
		Statement ret := (Statement)`return <Id name>;`;

private default Statement makeClassDeclaration( Id name, Statement ctor, Statement* methods, Statement ret )
	= (Statement)`var <Id name> = (function() { <Statement ctor> <Statement* methods> <Statement ret> })();`;

private Statement makeClassDeclaration( Id name, Statement ctor, Statement* methods, Statement ret ) 
	= (Statement)`var <Id name> = (function() { <Statement ctor> <Statement ret> })();`
	when
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`; 

private Statement* desugarMethods( Id name, (Methods)`` ) = stmEmpty();
private Statement* desugarMethods( Id name, (Methods)`<Method m><Method* ms>` )
	= prepend( s, ss )
	when
		Statement s := desugarMethod( name, m ),
		Statement* ss := desugarMethods( name, (Methods)`<Method* ms>` );

private Statement desugarMethod( Id name, (Method)`static <Id methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Id name>.<Id methodName> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );
private Statement desugarMethod( Id name, (Method)`<Id methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Id name>.prototype.<Id methodName> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );

private Statement* desugarSuperConstructorCall( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{ArgExpression ","}* args>)` 
			=> 
			(Expression)`_get(Object.getPrototypeOf(<Id name>.prototype), "constructor", this).call(this, <{ArgExpression ","}* args>)`
	}
}

private Statement* desugarSuper( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case
			(Expression)`super.<Id call>(<{ArgExpression ","}* args>)`
			=>
			(Expression)`_get(Object.getPrototypeOf(<Id name>.prototype), <Expression funName>, this).call(this, <{ArgExpression ","}* args>)`
			when
				Expression funName := [Expression]"\"<call>\""
		case
			e:(Expression)`super(<{ArgExpression ","}* _>)`
			=>
			e[@message = error( "Direct super call is illegal in non-constructor, use super.\"<name>\"()", e@\loc )]
	}
}