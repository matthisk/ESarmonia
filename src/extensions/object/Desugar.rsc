@cachedParser{desugar.cached.Parser}
module extensions::object::Desugar
extend desugar::Base;
extend extensions::object::Syntax;

extend extensions::object::desugar::Shared;

import IO;
import Map;
import extensions::object::Runtime;

alias Properties = list[PropertyAssignment];

Expression desugar( e:(Expression)`{ <{PropertyAssignment ","}* _>, }`, Id(str) generateUId )
	= desugarProperties(e);
Expression desugar( e:(Expression)`{ <{PropertyAssignment ","}* _> }`, Id(str) generateUId )
	= desugarProperties(e);

Expression desugarProperties( Expression object ) {
	Expression obj = (Expression)`{}`;

	map[Expression,Statement*] getters = ();
	map[Expression,tuple[Param,Statement*]] setters = ();
	map[Expression,Expression] computed = ();
	
	for( PropertyAssignment prop <- object.props ) {
		if( g:(PropertyAssignment)`get [<Expression key>]() { <Statement* body> }` := prop ) {
			getters[key] = body;
	    } else if( s:(PropertyAssignment)`set [<Expression key>](<Param p>) { <Statement* body> }` := prop ) {
	    	setters[key] = <p,body>;
	    } else if( c:(PropertyAssignment)`[ <Expression key> ] : <Expression val>` := prop ) {
	    	computed[key] = val;
	    } else {
	    	obj = appendProperty( obj, desugarProperty(prop) );
	    }
	}
	
	Expression getSetObj = gettersSetters( (Expression)`{}`, getters, setters );

	for( Expression key <- computed ) {
		obj = defineProperty(obj,key,computed[key]);
	}

	if( (Expression)`{}` !:= getSetObj ) 
		object = (Expression)`Object.defineProperties(<Expression obj>,<Expression getSetObj>)`;
	else
		object = obj;

	return object;
}

Expression appendProperty( (Expression)`{ <{PropertyAssignment ","}* props> }`, PropertyAssignment prop )
	= (Expression)`{ <{PropertyAssignment ","}* props>, <PropertyAssignment prop> }`;

Expression gettersSetters( Expression getSetObj, map[Expression,Statement*] getters, map[Expression,tuple[Param,Statement*]] setters ) {
	for( Expression key <- (domain(getters) + domain(setters)) ) {
		Expression obj = (Expression)`{ configurable: true, enumerable: true }`;
	
		if( key in getters ) {
			Statement* body = getters[key];
			obj = appendProperty( obj, (PropertyAssignment)`get: function() { <Statement* body> }` );
		}
		
		if( key in setters ) {
			Param param = setters[key]<0>;
			Statement* body = setters[key]<1>;
			obj = appendProperty( obj, (PropertyAssignment)`set: function(<Param param>) { <Statement* body> }` );
		}
		
		getSetObj = defineProperty( getSetObj, key, obj );
	}
	
	return getSetObj;
}

Expression defineProperty( Expression ref, Expression key, Expression val ) 
	= (Expression)`_defineProperty(<Expression ref>, <Expression key>, <Expression val>)`;

default PropertyAssignment desugarProperty( PropertyAssignment p ) = p;
PropertyAssignment desugarProperty( (PropertyAssignment)`<PropertyName name>(<Params ps>) { <Statement* body> }` )
	= (PropertyAssignment)`<PropertyName name> : function(<Params ps>) { <Statement* body> }`;
PropertyAssignment desugarProperty( (PropertyAssignment)`<Id prop>` )
	= (PropertyAssignment)`<Id prop> : <Id prop>`;