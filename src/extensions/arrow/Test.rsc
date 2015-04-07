module extensions::arrow::Test

import \test::RascalSpec;

import extensions::arrow::Syntax;
import extensions::arrow::Desugar;

import ParseTree;

void() tryParsing( str input ) {
	return () {
		parsing = void() { parse( #start[Source], input ); };
		expect( parsing, id=not ).toThrow();
	};
}

void parsingArrowFunctions() {
	str input =
	"
		
	";
	
	describe( "Arrow function", void() {
	
		\it( "can have an expression as a body", tryParsing("
                var f = x =\> x;
		") );
		
		\it( "can have a list of statements as body", tryParsing("
				var f = x =\> { return x; };
		") );
		
		\it( "can have multiple parameters, with an expression as a body", tryParsing("
				var f = (x,y) =\> x + y;
		") );
		
		\it( "can have multiple parameters, with a list of statements as a body", tryParsing("
				var f = (x,y) =\> { return x + y; };
		") );
	
	});
}