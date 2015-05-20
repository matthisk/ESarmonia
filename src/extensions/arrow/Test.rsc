module extensions::arrow::Test
extend desugar::Visitor;
extend \test::Base;

import IO;

import extensions::arrow::Desugar;

test bool parsingArrowFunctions() {	
	return
	describe( "Arrow function", [
	
		\it( "can have an expression as a body", tryParsing("
                var f = x =\> x;
		") ),
		
		\it( "can have a list of statements as body", tryParsing("
				var f = x =\> { return x; };
		") ),
		
		\it( "can have multiple parameters, with an expression as a body", tryParsing("
				var f = (x,y) =\> x + y;
		") ),
		
		\it( "can have multiple parameters, with a list of statements as a body", tryParsing("
				var f = (x,y) =\> { return x + y; };
		") )
	
	]);
}

test bool desugaringArrowFunctions() {
	return
	describe( "Arrow function", [
		
		\it( "is desugared when inside a function", tryDesugar(
			"function() {
            '    var f = x =\> x;
        	'}",
			[< "function(x) { return x; }", bool( pt ) { return /(Function)`function(x) { return x; }` := pt; } >,
			 < "function() { var _this = this; \<Statement* _\> }", bool( pt ) { return /(Function)`function() { var _this = this; <Statement* _> }` := pt; } >]
		)),
		
		\it( "is desugared when in root of parse tree", tryDesugar(
			"var f = x =\> x;",
			[< "function(x) { return x; }", bool( pt ) { return /(Function)`function(x) { return x; }` := pt; }>]
		)),

		\it( "is desugared with reference to enclosing scope\'s this", tryDesugar( 
			"function() {
		  	'	var f = x =\> { console.log( this ); };
		  	'}",
			[ <"function() { var _this = this; var f = function(x) { console.log(_this); }; }", bool( pt ) { return /(Function)`function() { var _this = this; var f = function(x) { console.log(_this); }; }` := pt; } >]
		)),
	  
	   \it( "is desugared for multiple arguments and statement body", tryDesugar(
	  		"var f = ( x, y ) =\> { return x + y; };",
	  		[<"var f = function( x, y ) { return x + y; };",bool( pt ) { return /(Statement)`var f = function( x, y ) { return x + y; };` := pt; }>]
		)), 
	
		\it( "is desugared with undefined this in global scope", tryDesugar(
			"var f = x =\> { console.log(this); };",
			[<"var f = function(x) { console.log(undefined); };",bool( pt ) { return /(Statement)`var f = function(x) { console.log(undefined); };` := pt; }>]
		))
	]);
}