module extensions::destructuring::Test
extend desugar::Visitor;
extend \test::Base;

import extensions::destructuring::Syntax;
import extensions::destructuring::Desugar;

test bool parsingObjectDestructure() {
	return
	describe( "Parsing object destructurings", [
		\it( "as a left hand side expression", tryParsing(
			"({ a, b } = { a : 0, b : 1 });"
		)),
		
		\it( "as a variable declaration", tryParsing(
			"var {a,b} = {a:0,b:1};"
		)),
		
		\it( "as a function parameter", tryParsing(
			"function( {a,b} ) { return a + b; }"
		)),
		
		\it( "with nested objects", tryParsing(
			"var {a,b:{c,d}} = obj;"
		)),
		
		\it( "with named values", tryParsing(
			"var { a : foo, b : bar } = obj;"
		)),
		
		\it( "mixed with array destructurings", tryParsing(
			"var { a : [ b,c ] } = obj;"
		))
	]);
}

test bool parsingArrayDestructure() {
	return
	describe( "Parsing array destructurings", [
		\it( "as a left hand side expression", tryParsing( 
			"[x,y] = [y,x];"
		)),
		
		\it( "as a variable declaration", tryParsing(
			"var [x,y] = [y,x];"
		)),
		
		\it( "as a function parameter", tryParsing(
			"function( [x,y] ) { return x + y; }"
		)),
		
		\it( "with nested arrays", tryParsing(
			"var [ x, [y,z] ] = xs;"
		)),
		
		\it( "with empty slots", tryParsing(
			"var [ , y, z ] = xs;"
		)),
		
		\it( "with trailing comma", tryParsing(
			"var [x,y,] = xs;"
		)),
		
		\it( "with default value", tryParsing(
			"var [x=10,y] = xs;"
		)),
		
		\it( "with rest value", tryParsing(
			"var [x,y,...rest] = xs;"
		)),
		
		\it( "mixed with object destructuring", tryParsing(
			"var [x,{y,z}] = lst;"
		))
	]);
}

test bool desugarArrayDestructure() {
	return
	describe( "Desugaring array destructurings", [
	
		\it( "as chained assignment", tryDesugar(
			"var a,b,c,d;
			'var arr = [a,b] = [c,d] = [1,2];",
			[<"",
			  bool(pt) { return false; }>]
		) ),
	
		\xit( "as a left hand side expression", tryDesugar(
			"var x = 10, y = 12;
			'[x,y] = [y,x];",
			[<"{ var ref = [y,x]; var x = ref[0]; var y = ref[1]; }",bool(pt) { return /(Statement)`{ var ref = [y,x]; var x = ref[0]; var y = ref[1]; }` := pt; }>]
		) ),
		
		\xit( "as a variable declaration", tryDesugar(
			"var [x,y] = [10,12];",
			[<"{ var ref = [10,12]; var x = ref[0]; var y = ref[1]; }",
			  bool(pt) { return /(Statement)`{ var ref = [10,12]; var x = ref[0]; var y = ref[1]; }` := pt; }>]
		) ),
		
		\xit( "as a function parameter", tryDesugar(
			"function( [ a, b, c ] ) {
			'  return a + b + c;
			'}",
			[<"function( _ref0 ) { var _ref02 = _slicedtoArray( _ref0, 3); var a = _ref02[0]; var b = _ref02[1]; var c = _ref02[2]; return a + b + c; }",
			  bool(pt) { return /(Function)`function( _ref0 ) { var _ref02 = _slicedtoArray( _ref0, 3 ); var a = _ref02[0]; var b = _ref02[1]; var c = _ref02[2]; return a + b + c ; }` := pt; }>]
		)),
		
		\xit( "as a function parameter, multiple times", tryDesugar(
			"function( [ a, b, c ], [ d, e ] ) {
			'  return a + b + c + d + e;
			'}",
			[<"",bool(pt) { return false; }>]
		)),
		
		\xit( "as a function parameter, with nested destructurings", tryDesugar(
			"function( [ a, [ d, e ] ] ) {
			'  return a + d + e;
			'}",
			[<"",bool(pt) { return false; }>]
		)),
		
		\xit( "as a function parameter, with rest value", tryDesugar(
			"function( [a, ...rest] ) {
			'
			'}",
			[<"",bool(pt) {
				return false;
			}>]
		))
		
	]);
}

