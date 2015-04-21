module extensions::parameters::Test
extend \test::Base;
extend desugar::Visitor;

import extensions::parameters::Syntax;
import extensions::parameters::Desugar;

test bool parsingParameters() {
	return
	describe( "Default parameter (parsing)", [
		\it( "can have default values", tryParsing(
			"function( x = 12 ) { return x; }"
		)),
		
		\it( "can have default values surrounded with other parameters", tryParsing(
			"function( x, y = 12, z ) { return x; }"
		)),
		
		\it( "can have multiple default values", tryParsing(
			"function( x = 12, y = 10 ) { return x; }"
		))
		
	]);
}

test bool parsingRestParameter() {
	return
	describe( "Rest parameter (parsing)", [
		\it( "can have rest values", tryParsing(
			"function( ...xs ) { return xs; }"
		)),
		
		\it( "can not have rest values in non-latest position", failParsing(
			"function( x, ...xs, y ) { }"
		))
	]);
}

test bool desugaringDefaultParameters() {
	return
	describe( "Default parameter (desugaring)", [
		\it( "can be desugared with default parameters", tryDesugar(
			"function( x = 12 ) { return x; }",
			[< "function(x) { var x = arguments[0] === undefined ? 12 : arguments[0]; return x; }", 
			   bool( pt ) { return /(Statement)`function(x) { var x = arguments[0] === undefined ? 12 : arguments[0]; return x; }` := pt; } >]
		)),
		
		\it( "can be desugared with default parameters and normal parameters", tryDesugar(
			"function( x, y, p = 12, z ) { return x; }",
			[< "function(x,y,p,z) { var p = arguments[2] === undefined ? 12 : arguments[2]; return x; }", 
			   bool( pt ) { return /(Statement)`function(x,y,p,z) { var p = arguments[2] === undefined ? 12 : arguments[2]; return x; }` := pt; } >]
		)),
		
		\it( "can be desugared with multiple default parameters", tryDesugar(
			"function( x = 12, y = 10 ) { return x + y; }",
			[< "function(x,y) { var y = arguments[1] === undefined ? 10 : arguments[1]; var x = arguments[0] === undefined ? 12 : arguments[0]; return x + y; }", 
			   bool( pt ) { return /(Statement)`function(x,y) { var y = arguments[1] === undefined ? 10 : arguments[1]; var x = arguments[0] === undefined ? 12 : arguments[0]; return x + y; }` := pt; } >]
		)),
	
		\it( "can desugar named function with default parameter(s)", tryDesugar(
			"function f( x = 12, y = 10 ) { return x + y; }",
			[< "function f(x,y) { var y = arguments[1] === undefined ? 10 : arguments[1]; var x = arguments[0] === undefined ? 12 : arguments[0]; return x + y; }", 
			   bool( pt ) { return /(Statement)`function f(x,y) { var y = arguments[1] === undefined ? 10 : arguments[1]; var x = arguments[0] === undefined ? 12 : arguments[0]; return x + y; }` := pt; } >]
		))	
	]);
}

test bool desugaringRestParameter() {
	return
	describe( "Rest parameter (desugaring)", [
		\it( "can be desugared within parameter", tryDesugar(
			"function( ...args ) { return args; }",
			[< "function() { for( var _len = arguments.length, args = Array( _len \> 1 ? _len - 1 : 0 ), _key = 0; _key \< _len; _key++) { args[_key - 1] = arguments[_key]; } return args; }", 
			   bool( pt ) { 
			   	return /(Statement)`function() { for( var _len = arguments.length, args = Array( _len \> 1 ? _len - 1 : 0 ), _key = 0; _key \< _len; _key++ ) { args[_key - 1] = arguments[_key]; } return args; }` := pt; 
			   }
			>]
		)),
		
		\it( "can be desugared as final parameter", tryDesugar(
			"function( x, y, ...args ) { return args; }",
			[< "function( x, y ) { for( var _len = arguments.length, args = Array( _len \> 1 ? _len - 1 : 0 ), _key = 2; _key \< _len; _key++) { args[_key - 1] = arguments[_key]; } return args; }",
			   bool( pt ) { 
			   	return /(Statement)`function( x, y ) { for( var _len = arguments.length, args = Array( _len \> 1 ? _len - 1 : 0 ), _key = 2; _key \< _len; _key++) { args[_key - 1] = arguments[_key]; } return args; }` := pt ; 
			}>]
		))
	]);
}