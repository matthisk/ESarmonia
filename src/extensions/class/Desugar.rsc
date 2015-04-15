module extensions::class::Desugar
extend desugar::Desugar;

import IO;
import Ambiguity;
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

private Statement ctor2Function( Id name, {Id ","}* ps, Statement* body ) 
	= (Statement)`function <Id name>(<{Id ","}* ps>) { _classCallCheck(this,<Expression name>); <Statement* body> }`;

private Statement desugarClassDeclaration( Id name, Constructor ctor, Methods ms )
	= makeClassDeclaration( name, ctorFunction, methods, ret )
	when
		(Constructor)`constructor(<{Id ","}* ps>) { <Statement* body> }` := ctor,
		Statement* desugaredBody := desugarSuperConstructorCall( name, body ),
		Statement* methods := desugarMethods( name, ms ),
		Statement ctorFunction := ctor2Function( name, ps, desugaredBody ),
		Statement ret := (Statement)`return <Expression name>;`;

private default Statement makeClassDeclaration( Id name, Statement ctor, Statement* methods, Statement ret )
	= (Statement)`var <Id name> = (function() { <Statement ctor> <Statement* methods> <Statement ret> })();`;

private Statement makeClassDeclaration( Id name, Statement ctor, Statement* methods, Statement ret ) 
	= (Statement)`var <Id name> = (function() { <Statement ctor> <Statement ret> })();`
	when
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`; 

private Statement* desugarMethods( Id name, (Methods)`` ) = stmEmpty();
private Statement* desugarMethods( Id name, (Methods)`<Method m><Method* ms>` )
	= result
	when
		Statement s := desugarMethod( name, m ),
		Statement* ss := desugarMethods( name, (Methods)`<Method* ms>` ),
		(Statement)`{<Statement* result>}` := (Statement)`{<Statement s><Statement* ss>}`;

private Statement desugarMethod( Id name, (Method)`static <Id methodName>(<{Id ","}* ps>) { <Statement* body> }` )
	= (Statement)`<Expression name>.<Id methodName> = function(<{Id ","}* ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );
private Statement desugarMethod( Id name, (Method)`<Id methodName>(<{Id ","}* ps>) { <Statement* body> }` )
	= (Statement)`<Expression name>.prototype.<Id methodName> = function(<{Id ","}* ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );

private Statement* desugarSuperConstructorCall( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{Expression ","}* args>)` 
			=> 
			(Expression)`_get(Object.getPrototypeOf(<Expression name>.prototype), "constructor", this).call(this, <{Expression ","}* args>)`
	}
}

private Statement* desugarSuper( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case
			(Expression)`super.<Id call>(<{Expression ","}* args>)`
			=>
			(Expression)`_get(Object.getPrototypeOf(<Expression name>.prototype), "<DoubleStringChar call>", this).call(this, <{Expression ","}* args>)`
		case
			e:(Expression)`super(<{Expression ","}* _>)`
			=>
			e[@message = error( "Direct super call is illegal in non-constructor, use super.\"<name>\"()", e@\loc )]
	}
}