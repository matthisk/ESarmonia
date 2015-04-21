module extensions::spread::Test
extend desugar::Visitor;
extend runtime::Visitor;
extend \test::Base;

import extensions::spread::Syntax;
import extensions::spread::Desugar;
import extensions::spread::Runtime;

test bool parsingSpreadOperator() {
	return
	describe( "Spread operator (parsing)", [
		\it( "can have spread argument", tryParsing(
			"f( ...[1,2,3] );"
		)),
		
		\it( "can have any argument with spread operator, and multiple times", tryParsing(
			"f( -1, ...args, 2, ...[3] );"
		)),
		
		\it( "can have spread argument in array", tryParsing(
			"arr = [...iterableObj, 4, 5, 6];"
		)),
		
		\it( "can have any position with spread operator, and multiple times in array", tryParsing(
			"arr = [1, ...iterableObj, 4, 5, ...iterableObj];"
		))
	]);
}

test bool desugaringSpreadOperator() {
	return
	describe( "Spread operator (desugaring)", [
		\it( "can be desugared as an array element", tryDesugar(
			"function() { var xs = [ 1, ...ys, 5 ]; }",
			[<"[1].concat(_toConsumableArray(ys),[5])", 
			  bool( pt ) { return /(Expression)`[1].concat(_toConsumableArray(ys),[5])` := pt; }>]
		)),
		
		\it( "can be desugared as multiple array elements", tryDesugar(
			"function() { var xs = [ 1, ...[2,3,4], 5, ...[6,7,8] ]; }",
			[<"[1].concat([2,3,4],[5],[6,7,8]);", 
			  bool( pt ) { return /(Expression)`[1].concat([2,3,4],[5],[6,7,8])` := pt; }>]
		)),
		
		\it( "can be desugared with nested arrays", tryDesugar(
			"function() { var xs = [ 1, ...[2,3,4], [ 5, ...[6,7,8] ] ]; }",
			[<"[1].concat([2,3,4],[[5].concat([6,7,8])])", 
			  bool( pt ) { return /(Expression)`[1].concat([2,3,4],[[5].concat([6,7,8])])` := pt; }>]
		)),
		
		\it( "can be desugared within function arguments", tryDesugar(
			"f( ...[1,2,3] );",
			[<"f.apply(undefined,[1,2,3])", 
			  bool( pt ) { return /(Expression)`f.apply(undefined,[1,2,3])` := pt; }>]
		)),
		
		\it( "can be desugared within function arguments, and without losing scope of the callee", tryDesugar(
			"f.g( ...[1,2,3] );",
			[<"f.g.apply(f,[1,2,3])", 
			  bool( pt ) { return /(Expression)`f.g.apply(f,[1,2,3])` := pt; }>]
		)),
		
		\it( "can be desugared within function arguments, and without losing scope of the callee", tryDesugar(
			"h.f()( ...[1,2,3] );",
			[<"h.f().apply(undefined,[1,2,3])", 
			  bool( pt ) { return /(Expression)`h.f().apply(undefined,[1,2,3])` := pt; }>]
		)),
		
		\it( "can be desugared within function arguments, and without losing scope of the callee", tryDesugar(
			"h.f[0]( ...[1,2,3] );",
			[<"(_h$f=h.f)[0].apply(_h$f,[1,2,3])", 
			  bool( pt ) { return /(Expression)`(_h$f=h.f)[0].apply(_h$f,[1,2,3])` := pt; }>]
		)),
		
		\it( "can be desugared with apply call", tryDesugar(
			"g.f.apply( sc, ...[1,2,3] );",
			[<"(_g$f = g.f).apply.apply(_g$f,[sc].concat([1,2,3], []))", 
			  bool( pt ) { return /(Expression)`(_g$f=g.f).apply.apply(_g$f,[sc].concat([1,2,3]))` := pt; }>]
		)),
		
		\it( "can be desugared with string as spread operator argument", tryDesugar(
			"Math.max( ...\"1234\" );",
			[<"Math.max.apply(Math, _toConsumableArray(\"1234\"))", 
			  bool( pt ) { return /(Expression)`Math.max.apply(Math, _toConsumableArray("1234"))` := pt; }>]
		))
		
	]);
}

test bool runtimeSpreadOperator() {
	return describe( "Spread operator (runtime)", [
		\it( "runtime is detected for array conversion", tryRuntime(
			"Math.max( ...\"1234\" );",
			[<"var _toConsumableArray = function(\<Params _\>) { \<Statement* _\> };", bool( pt ) { return /(Statement)`var _toConsumableArray = function(<Params _>) { <Statement* _> };` := pt; }>]
		))
	]);
}
