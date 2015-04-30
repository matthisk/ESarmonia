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
	= desugarClassDeclaration( name, nothing(), (Constructor)`constructor() {}`, ms );
Expression desugar( Maybe[Id] name, (ClassTail)`{ <Constructor ctor> <Methods ms> }` )
	= desugarClassDeclaration( name, nothing(), ctor, ms );

Statement desugar( (Statement)`class <Id name> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), nothing(), (Constructor)`constructor() {}`, ms );

Statement desugar( (Statement)`class <Id name> extends <Id extends> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), just(extends), (Constructor)`constructor() {}`, ms );
	
Statement desugar( (Statement)`class <Id name> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), nothing(), ctor, ms );

Statement desugar( (Statement)`class <Id name> extends <Id extends> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), just(extends), ctor, ms );

/////////////////////////////////
/////////////////////////////////

default Statement ctor2Function( Id name, Maybe[Id] parent, Params ps, Statement* body ) 
	= setRuntime( res, _classCallCheck )	
	when
		Statement* desugaredBody := desugarSuperConstructorCall( parent, body ),
		Statement* desugaredBody := desugarSuperMemberCall( parent, body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); <Statement* desugaredBody> }`;

Statement ctor2Function( Id name, just( parent ), Params ps, Statement* body )
	= setRuntime( res, _classCallCheck )
	when
		empty( body ),
		Statement* desugaredBody := desugarSuperConstructorCall( just(parent), body ),
		Statement* desugaredBody := desugarSuperMemberCall( just(parent), body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); if( <Id parent> != null ) { <Id parent>.apply(this,arguments); } }`;

Expression desugarClassDeclaration( nothing(), Maybe[Id] extends, Constructor ctor, Methods ms )
	= desugarClassDeclaration( just( [Id]"_class" ), ctor, ms ); 

Expression desugarClassDeclaration( just( Id name ), Maybe[Id] extends, Constructor ctor, Methods ms )
	= makeClassDeclaration( extends, ctorFunction, methods, ret )
	when
		Maybe[Id] parent := nameParent( extends ),
		(Constructor)`constructor(<Params ps>) { <Statement* body> }` := ctor,
		Statement* methods := desugarMethods( name, parent, ms ),
		Statement ctorFunction := ctor2Function( name, parent, ps, body ),
		Statement ret := (Statement)`return <Id name>;`;

default Expression makeClassDeclaration( extends:nothing(), Statement ctor, Statement* methods, Statement ret )
	= (Expression)`(function() { <Statement ctor> <Statement* methods> <Statement ret> })()`;

default Expression makeClassDeclaration( just( Id extends ), Statement ctor, Statement* methods, Statement ret )
	= setRuntime( res, _inherits ) 	
	when
		Id parent := [Id]"_<extends>",
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> <Statement* methods> _inherits(<Id name>,<Id parent>); <Statement ret> })(<Id extends>)`;

Maybe[Id] nameParent( nothing() ) = nothing();
Maybe[Id] nameParent( just( Id extends ) ) = just( nameParent( extends ) );
Id nameParent( Id extends ) = [Id]"_<extends>";

Expression makeClassDeclaration( nothing(), Statement ctor, Statement* methods, Statement ret ) 
	= (Expression)`(function() { <Statement ctor> <Statement ret> })()`
	when
		empty( methods );

Expression makeClassDeclaration( just( Id extends ), Statement ctor, Statement* methods, Statement ret ) 
	= setRuntime( res, _inherits )	
	when
		Id parend := [Id]"_<extends>",
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`,
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> _inherits(<Id name>,<Id parent>); <Statement ret> })(<Id extends>)`;

Statement makeClassDeclarationStm( Id name, Expression class )
	= (Statement)`var <Id name> = <Expression class>;`;

Statement* desugarMethods( Id name, Maybe[Id] parent,(Methods)`` ) = stmEmpty();
Statement* desugarMethods( Id name,Maybe[Id] parent, (Methods)`<Method m><Method* ms>` )
	= prepend( s, ss )
	when
		Statement s := desugarMethod( name,parent, m ),
		Statement* ss := desugarMethods( name,parent, (Methods)`<Method* ms>` );

Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`static <MethodDefinition m>` )
	= desugarStaticMethod( name, parent, m );
default Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`static <ClassElement c>` )
	= desugarStaticMethod( name, parent, c );
Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`<ClassElement c>` )
	= desugarMethod( name, parent, c );
	
Statement desugarStaticMethod( Id name, Maybe[Id] parent, (ClassElement)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Expression lhs> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( key, parent, body ),
		desugaredBody := desugarSuperMemberCall( parent, body ),	
		Expression lhs := extractLHS( (Expression)`<Id name>`, methodName );
Statement desugarStaticMethod( Id name, Maybe[Id] parent,(MethodDefinition)`get <PropertyName methodName>() { <Statement* body> }` )
	= setRuntime( res, _createClass )
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( parent, body ),
		desugaredBody := desugarSuperMemberCall( key, parent, body ),
		Statement res := (Statement)`_createClass( <Id name>, null, [{ key: <Expression key>, get: function() { <Statement* desugaredBody> } }] );`;
Statement desugarStaticMethod( Id name, Maybe[Id] parent,(MethodDefinition)`set <PropertyName methodName>(<Id p>) { <Statement* body> }` )
	= setRuntime( res, _createClass )
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( parent, body ),
		desugaredBody := desugarSuperMemberCall( key, parent, body ),
		Statement res := (Statement)`_createClass( <Id name>, null, [{ key: <Expression key>, set: function(<Id p>) { <Statement* desugaredBody> } }] );`;

Statement desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= (Statement)`<Expression lhs> = function(<Params ps>) { <Statement* desugaredBody> };`
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( key, parent, body ),
		desugaredBody := desugarSuperMemberCall( parent, body ),
		Expression lhs := extractLHS( (Expression)`<Id name>.prototype`, methodName );
Statement desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`get <PropertyName methodName>() { <Statement* body> }` )
	= setRuntime( res, _createClass )
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( parent, body ),
		desugaredBody := desugarSuperMemberCall( key, parent, body ),
		Statement res := (Statement)`_createClass( <Id name>, [{ key: <Expression key>, get: function() { <Statement* desugaredBody> } }]);`;
Statement desugarMethod( Id name, Maybe[Id] parent, (ClassElement)`set <PropertyName methodName>( <Id p> ) { <Statement* body> }` )
	= setRuntime( res, _createClass ) 	
	when
		Expression key := stringExp( methodName ),
		desugaredBody := desugarSuperMethodConstructorCall( parent, body ),
		desugaredBody := desugarSuperMemberCall( key, parent, body ),
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

Statement* desugarSuperConstructorCall( just(Id parent), Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{ArgExpression ","}* args>)` 
			=> 
			(Expression)`<Id parent>.call(this,<{ArgExpression ","}* args>)`
	}
}

Statement* desugarSuperConstructorCall( nothing(), Statement* stms ) {
	return stms;
}

Statement* desugarSuperMethodConstructorCall( Expression funName, Maybe[Id] parent, Statement* stms ) {
	return top-down-break visit( stms ) {
		case
			e:(Expression)`super(<{ArgExpression ","}* args>)`
			=>
			superCall( funName, parent, stms )
	}
}

Expression superCall( (Expression)`<Id funName>`, {ArgExpression ","}* args, just(Id parent), Statement* stms )
	= (Expression)`<Id parent>.prototype.<Id funName>.call(this,<{ArgExpression ","}* args>)`;
default Expression superCall( Expression funName, {ArgExpression ","}* args, just(Id parent), Statement* stms )
	= (Expression)`<Id parent>.prototype[<Expression funName>].call(this,<{ArgExpression ","}* args>)`;
default Expression superCall( Expression funName, {ArgExpression ","}* args, nothing(), Statement* stms )
	= (Expression)`Function.prototype[<Expression funName>].call(this,<{ArgExpression ","}* args>)`;
Expression superCall( (Expression)`<Id funName>`, {ArgExpression ","}* args, nothing(), Statement* stms )
	= (Expression)`Function.prototype.<Id funName>.call(this,<{ArgExpression ","}* args>)`;

Statement* desugarSuperMemberCall( Maybe[Id] parent, Statement* stms ) {
	return top-down-break visit( stms ) {	
		case
			(Expression)`super.<Id call>(<{ArgExpression ","}* args>)`
			=>
			superMemberCall( parent, call, args )
		case
			(Expression)`super.<Id member>`
			=>
			superMember( parent, member )
	}
}

Expression superMember( just(Id parent), Id member )
	= (Expression)`<Id parent>.prototype.<Id member>`;
Expression superMember( nothing(), Id member )
	= (Expression)`Function.prototype.<Id member>`;

Expression superMemberCall( just(Id parent), Id call, {ArgExpression ","}* args )
	= (Expression)`<Id parent>.prototype.<Id call>.call(this,<{ArgExpression ","}* args>)`;
Expression superMemberCall( nothing(), Id call, {ArgExpression ","}* args )
	= (Expression)`Function.prototype.<Id call>.call(this,<{ArgExpression ","}* args>)`;