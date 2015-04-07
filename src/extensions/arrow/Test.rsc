module extensions::arrow::Test
extend desugar::Runner;

import \test::RascalSpec;

import extensions::arrow::Syntax;
import extensions::arrow::Desugar;

import ParseTree;

bool and( list[bool] l ) = ( true | it && elm | elm <- l );

Spec tryParsing( str input ) {
	return bool() {
		parsing = void() { parse( #start[Source], input ); };
		return expect( parsing, modifier=not ).toThrow();
	};
}

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
		
		\it( "is desugared when inside a function", Spec( str input ) {
			pt = desugar( parse( #start[Source], input ) );
			
			return bool() {
				return and([
				
					expect( pt ).toMatch( "function ( x ) { return x; }", bool( pt ) { 
						return /(Function)`function ( x ) { return x; }` := pt; 
					}),
					
					expect( pt ).toMatch( "function() { var _this = this; ... }", bool( pt ) {
						return /(Function)`function() { var _this = this; <Statement* _> }` := pt;
					})
				
				]);
			};
		}("function() {
            '    var f = x =\> x;
        	'}
		")),
		
		\it( "is desugared when in root of parse tree", Spec( str input ) {
			pt = desugar( parse( #start[Source], input ) );
			
			return bool() {
				return and([
					expect( pt ).toMatch("function(x) { return x; }", bool( pt ) { 
						return /(Function)`function(x) { return x; }` := pt;
					})
				]);
			};
		}("var f = x =\> x;")
		
		),

		\it( "is desugared with reference to enclosing scope\'s this", Spec( str input ) { 
			pt = desugar( parse( #start[Source], input ) );
			
			return bool() {
				return and([
					expect( pt ).toMatch("function() { var _this = this; var f = function(x) { console.log(_this); } }", bool( pt ) {
						return /(Function)`function() { var _this = this; var f = function(x) { console.log(_this); }; }` := pt;
					})
				]);
			}; 
		}("function() {
		  '	var f = x =\> { console.log( this ); };
		  '}") ),
		  
		  \it( "is desugared for multiple arguments and statement body", Spec( str input ) { 
			pt = desugar( parse( #start[Source], input ) );
			
			return bool() {
				return and([
					expect( pt ).toMatch("var f = function( x, y ) { return x + y; };", bool( pt ) {
						return /(Statement)`var f = function( x, y ) { return x + y; };` := pt;
					})
				]);
			}; 
		}("var f = ( x, y ) =\> { return x + y; };") ), 
		
		\it( "is desugared with undefined this in global scope", Spec( str input ) { 
			pt = desugar( parse( #start[Source], input ) );
			
			return bool() {
				return and([
					expect( pt ).toMatch("var f = function(x) { console.log(undefined); };", bool( pt ) {
						return /(Statement)`var f = function(x) { console.log(undefined); };` := pt;
					})
				]);
			}; 
		}("var f = x =\> { console.log(this); };") ) 
	
	]);
}