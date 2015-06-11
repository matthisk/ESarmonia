module extensions::classes::desugar::Method
extend desugar::Base;

import util::Maybe;
import extensions::classes::Syntax;
import extensions::classes::desugar::Super;
import extensions::classes::Runtime;
import extensions::object::desugar::Shared;

Expression createFunctionObject( Expression keyValue, Id p, Params ps, Statement* body )
	= (Expression)
				`{
				'	key: <Expression keyValue>,
				'	<Id p>: function(<Params ps>) {
				'		<Statement* body>
				'	}
				'}`;

Expression desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`<PropertyName methodName>(<Params ps>) { <Statement* body> }` )
	= createFunctionObject( key, (Id)`value`, ps, desugaredBody ) 
	when
		Expression key := stringExp( methodName ),
		Statement* desugaredBody := desugarSuperReference( key, parent, body ); 
	
Expression desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`get <PropertyName methodName>() { <Statement* body> }` )
	= createFunctionObject( key, (Id)`get`, params( psEmpty() ), body )
	when
		Expression key := stringExp( methodName ), 
		Statement* body := desugarSuperReference( key, parent, body );
		
Expression desugarMethod( Id name, Maybe[Id] parent,(ClassElement)`set <PropertyName methodName>(<Param param>) { <Statement* body> }` )
	= createFunctionObject( key, (Id)`set`, params( param ), body )
	when
		Expression key := stringExp( methodName ),
		Statement* body := desugarSuperReference( key, parent, body );

Expression stringExp( (PropertyName)`<String s>` ) = (Expression)`<String s>`;
Expression stringExp( (PropertyName)`<Numeric n>` ) = [Expression]"\"<n>\"";
Expression stringExp( (PropertyName)`<Id id>` ) = [Expression]"\"<id>\"";