module extensions::class::Desugar
extend desugar::Desugar;

import util::Maybe;
import IO;
import extensions::class::Syntax;
import extensions::class::Runtime;

Expression desugar( (Expression)`class <ClassTail tail>` )
	= desugar( nothing(), tail );
Expression desugar( (Expression)`class <Id name> <ClassTail tail>` )
	= desugar( just(name), tail );

Expression desugar( Maybe[Id] name, (ClassTail)`{ <Methods ms> }` )
	= desugarClassDeclaration( name, (Constructor)`constructor() {}`, ms );
Expression desugar( Maybe[Id] name, (ClassTail)`{ <Constructor ctor> <Methods ms> }` )
	= desugarClassDeclaration( name, ctor, ms );

Statement desugar( (Statement)`class <Id name> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), (Constructor)`constructor() {}`, ms );
		
Statement desugar( (Statement)`class <Id name> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), ctor, ms );

Statement ctor2Function( Id name, Params ps, Statement* body ) 
	= setRuntime( res, _classCallCheck )	
	when
		Statement* desugaredBody := desugarSuperConstructorCall( name, body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); <Statement* desugaredBody> }`;

Expression desugarClassDeclaration( nothing(), Constructor ctor, Methods ms )
	= desugarClassDeclaration( just( [Id]"_class" ), ctor, ms ); 

Expression desugarClassDeclaration( just( Id name ), Constructor ctor, Methods ms )
	= makeClassDeclaration( ctorFunction, methods, ret )
	when
		(Constructor)`constructor(<Params ps>) { <Statement* body> }` := ctor,
		Statement* methods := desugarMethods( name, ms ),
		Statement ctorFunction := ctor2Function( name, ps, body ),
		Statement ret := (Statement)`return <Id name>;`;

default Expression makeClassDeclaration( Statement ctor, Statement* methods, Statement ret )
	= (Expression)`(function() { <Statement ctor> <Statement* methods> <Statement ret> })()`;

Expression makeClassDeclaration( Statement ctor, Statement* methods, Statement ret ) 
	= (Expression)`(function() { <Statement ctor> <Statement ret> })()`
	when
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`; 

Statement makeClassDeclarationStm( Id name, Expression class )
	= (Statement)`var <Id name> = <Expression class>;`;

Statement* desugarMethods( Id name, (Methods)`` ) = stmEmpty();
Statement* desugarMethods( Id name, (Methods)`<Method m><Method* ms>` )
	= prepend( s, ss )
	when
		Statement s := desugarMethod( name, m ),
		Statement* ss := desugarMethods( name, (Methods)`<Method* ms>` );

Statement desugarMethod( Id name, (Method)`static <PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Expression lhs> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body ),
		Expression lhs := extractLHS( (Expression)`<Id name>`, methodName );
Statement desugarMethod( Id name, (Method)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Expression lhs> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body ),
		Expression lhs := extractLHS( (Expression)`<Id name>.prototype`, methodName );
Statement desugarMethod( Id name, (Method)`get <PropertyName methodName>() { <Statement* body> }` )
	= setRuntime( res, _createClass )
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuper( name, body ),
		Statement res := (Statement)`_createClass( <Id name>, [{ key: <Expression key>, get: function() { <Statement* desugaredBody> } }]);`;
Statement desugarMethod( Id name, (Method)`set <PropertyName methodName>( <Id p> ) { <Statement* body> }` )
	= setRuntime( res, _createClass ) 	
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuper( name, body ),
		Statement res := (Statement)`_createClass( <Id name>, [{ key: <Expression key>, set: function( <Id p> ) { <Statement* desugaredBody> } }]);`;

Expression stringExp( (PropertyName)`<String s>` ) = (Expression)`<String s>`;
Expression stringExp( (PropertyName)`<Numeric n>` ) = [Expression]"\"<n>\"";
Expression stringExp( (PropertyName)`<Id id>` ) = [Expression]"\"<id>\"";

Expression extractLHS( Expression name, (PropertyName)`<String s>` ) 
	= (Expression)`<Expression name>[<String s>]`;
Expression extractLHS( Expression name, (PropertyName)`<Numeric n>` )
	= (Expression)`<Expression name>[<Numeric n>]`;
Expression extractLHS( Expression name, (PropertyName)`<Id id>` )
	= (Expression)`<Expression name>.<Id id>`;

Statement* desugarSuperConstructorCall( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{ArgExpression ","}* args>)` 
			=> 
			(Expression)`_get(Object.getPrototypeOf(<Id name>.prototype), "constructor", this).call(this, <{ArgExpression ","}* args>)`
	}
}

Statement* desugarSuper( Id name, Statement* stms ) {
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