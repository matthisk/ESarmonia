module extensions::object::Test
extend desugar::Visitor;
extend runtime::Visitor;
extend \test::Base;

import extensions::object::Desugar;
import extensions::object::Runtime;

test bool parsingObjectLiterals() {
	return
	describe( "Object literals (parsing)", [
		\it( "can be parsed with shorthand properties", tryParsing(
			"var obj = { handler };"
		)),
		
		\it( "can be parsed with method(s)", tryParsing(
			"var obj = { toString() { return \"een string\"; } };"
		)),
		
		\it( "can be parsed with computed property name(s)", tryParsing(
			"var obj = { [ \'prop_\' + (function() { return 42; })() ] : 42 };"
		))
		
	]);
}

test bool desugaringObjectLiterals() {
	return
	describe( "Object literals (desugaring)", [
		\it( "can be desugared with method(s)", tryDesugar(
			"var obj = { toString() { return \" een string \"; } };",
			[<"var obj = { toString : function() { \<Statement* _\> } };",
			  bool( pt ) { return /(Statement)`var obj = { toString : function() { <Statement* _> } };` := pt; }>]
		)),
		
		\it( "can be desugared with computed property name", tryDesugar(
			"var obj = { [ \'prop_\' + (function() { return 42; })() ] : 42, };",
			[<"var obj = _defineProperty({}, \'prop_\' + (function() { return 42; })(), 42);",
			  bool( pt ) { return /(Statement)`var obj = _defineProperty({}, 'prop_' + (function() { return 42; })(), 42);` := pt; }
			 >]
		)),
		
		\it( "can be desugared with shorthand property", tryDesugar(
			"var obj = { handler };",
			[<"var obj = { handler : handler };",
			   bool( pt ) { return /(Statement)`var obj = { handler : handler };` := pt; }>]
		))
	]);
}

test bool runtimeObjectLiterals() {
	return
	describe( "Object literals (runtime)", [
		\it( "runtime is detected for dynamic property keys", tryRuntime(
			"var obj = { [ \'prop_\' + (function() { return 42; })() ] : 42, };",
			[<"var _defineProperty = function(\<Params _\>) { \<Statement* _\> };",
			  bool( pt ) { return /(Statement)`var _defineProperty = function(<Params _>) { <Statement* _> };` := pt; }
			 >]
		))
	]);
}