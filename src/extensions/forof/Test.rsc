module extensions::forof::Test
extend \test::Base;

import extensions::forof::Syntax;
import extensions::forof::Desugar;

test bool parsing() {
	return
	describe( "For of loops (parsing)", [
		\it( "parse with id as expression", tryParsing(
			"for( var i of arr ) { console.log( i ); }"
		)),
		
		\it( "parse with array expression", tryParsing(
			"for( var i of [1,2,3] ) { console.log( i ); }"
		))
	]);
}

test bool desugaring() {
	return
	describe( "For of loops (desugaring)", [
		\it( "with array expression", tryDesugar(
			"for( var x of [1,2,3] ) { console.log(x); }",
			[<"",bool(pt) { return false; }>]
		)),
		
		\it( "with identifier expression", tryDesugar(
			"for( var x of arr ) { console.log(x); }",
			[<"",bool(pt) { return false; }>]
		))
	]);
}