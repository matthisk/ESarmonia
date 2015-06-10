module extensions::classes::desugar::Method
extend desugar::Base;

import util::Maybe;
import extensions::classes::Syntax;
import extensions::classes::desugar::Super;
import extensions::classes::Runtime;
import extensions::object::desugar::Shared;

Statement desugarStaticMethod( Id name, Maybe[Id] parent, (ClassElement)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= createFunction( lhs, extractKey( methodName ), parent, ps, body ) 
	when
		Expression lhs := extractLHS( (Expression)`<Id name>`, methodName );
		
Statement desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= createFunction( lhs, extractKey( methodName ), parent, ps, body ) 
	when
		Expression lhs := extractLHS( (Expression)`<Id name>.prototype`, methodName );

Statement createFunction( Expression lhs,  Expression key, Maybe[Id] parent, Params ps, Statement* body )
	= (Statement)
				`_createClass(<Expression key>, [{
				'	key: <Expression methodName>,
				'	value: function(<Params ps>) {
				'		<Statement* desugaredBody>
				'	}
				'}]);`
	when
		Expression methodName := [Expression]"\"<key>\"",
		Statement* desugaredBody := desugarSuperReference( key, parent, body );

//`<Expression lhs> = function(<Params ps>) { 
//'	<Statement* desugaredBody> 
//'};

Statement desugarStaticMethod( Id name, Maybe[Id] parent,(ClassElement)`get <PropertyName methodName>() { <Statement* body> }` )
	= createGetterSetter( args, parent, stringExp( methodName ), [PropertyName]"get", params( psEmpty() ), body ) 
	when
		(Expression)`call(<{ArgExpression ","}* args>)` := (Expression)`call(<Id name>,null)`;

Statement desugarStaticMethod( Id name, Maybe[Id] parent,(ClassElement)`set <PropertyName methodName>(<Param param>) { <Statement* body> }` )
	= createGetterSetter( args, parent, stringExp( methodName ), [PropertyName]"set", params( param ), body ) 
	when
		(Expression)`call(<{ArgExpression ","}* args>)` := (Expression)`call(<Id name>,null)`;

Statement desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`get <PropertyName methodName>() { <Statement* body> }` )
	= createGetterSetter( args, parent, stringExp( methodName ), [PropertyName]"get", params( psEmpty() ), body )
	when
		(Expression)`call(<{ArgExpression ","}* args>)` := (Expression)`call(<Id name>)`;
		
Statement desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`set <PropertyName methodName>(<Param param>) { <Statement* body> }` )
	= createGetterSetter( args, parent, stringExp( methodName ), [PropertyName]"set", params( param ), body )
	when
		(Expression)`call(<{ArgExpression ","}* args>)` := (Expression)`call(<Id name>)`;

Statement createGetterSetter( {ArgExpression ","}* args, Maybe[Id] parent, Expression key, PropertyName gs, Params ps, Statement* body )
	= setRuntime( result, _createClass )
	when
		Statement* desugaredBody := desugarSuperReference( key, parent, body ),
		Statement result := (Statement)
									`_createClass( <{ArgExpression ","}* args>, [{ 
									'	key: <Expression key>, 
									'	<PropertyName gs>: function(<Params ps>) { 
									'		<Statement* desugaredBody> 
									'	} 
									'}]);`;

Expression stringExp( (PropertyName)`<String s>` ) = (Expression)`<String s>`;
Expression stringExp( (PropertyName)`<Numeric n>` ) = [Expression]"\"<n>\"";
Expression stringExp( (PropertyName)`<Id id>` ) = [Expression]"\"<id>\"";

Expression extractLHS( Expression name, (PropertyName)`<String s>` ) 
	= (Expression)`<Expression name>[<String s>]`;
Expression extractLHS( Expression name, (PropertyName)`<Numeric n>` )
	= (Expression)`<Expression name>[<Numeric n>]`;
Expression extractLHS( Expression name, (PropertyName)`<Id id>` )
	= (Expression)`<Expression name>.<Id id>`;