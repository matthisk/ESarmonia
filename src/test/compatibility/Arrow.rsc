module \test::compatibility::Arrow
extend \test::compatibility::Base;

test bool arrowfunctions() {
	return
	describe("arrow functions", [
		\it( "0 parameters", tryRunning(
				"
		        '(function() {
		        'return (() =\> 5)() === 5;
		        '})();"
		)),
		\it( "1 parameter, no brackets", tryRunning(
				"
		        '(function() {
		        'var b = x =\> x + \"foo\";
		        'return (b(\"fee fie foe \") === \"fee fie foe foo\");
		        '})();"
		)),
		\it( "multiple parameters", tryRunning(
				"
		        '(function() {
		        'var c = (v, w, x, y, z) =\> \"\" + v + w + x + y + z;
		        'return (c(6, 5, 4, 3, 2) === \"65432\");
		        '})();"
		)),
		\it( "lexical \"this\" binding", tryRunning(
				"
		        '(function() {
		        'var d = { x : \"bar\", y : function() { return z =\> this.x + z; }}.y();
		        'var e = { x : \"baz\", y : d };
		        'return d(\"ley\") === \"barley\" && e.y(\"ley\") === \"barley\";
		        '})();"
		)),
		\it( "\"this\" unchanged by call or apply", tryRunning(
				"
		        '(function() {
		        'var d = { x : \"foo\", y : function() { return () =\> this.x; }};
		        'var e = { x : \"bar\" };
		        'return d.y().call(e) === \"foo\" && d.y().apply(e) === \"foo\";
		        '})();"
		)),
		\it( "can\'t be bound, can be curried", tryRunning(
				"
		        '(function() {
		        'var d = { x : \"bar\", y : function() { return z =\> this.x + z; }};
		        'var e = { x : \"baz\" };
		        'return d.y().bind(e, \"ley\")() === \"barley\";
		        '})();"
		)),
		\it( "lexical \"arguments\" binding", tryRunning(
				"
		        '(function() {
		        'var f = (function() { return z =\> arguments[0]; }(5));
		        'return f(6) === 5;
		        '})();"
		)),
		\it( "no line break between params and \<code\>=\>\</code\>", tryRunning(
				"
		        '(function() {
		        'return (() =\> {
		        '  try { Function(\"x\\n =\> 2\")(); } catch(e) { return true; }
		        '})();
		        '})();"
		)),
		\it( "no \"prototype\" property", tryRunning(
				"
		        '(function() {
		        'var a = () =\> 5;
		        'return !a.hasOwnProperty(\"prototype\");
		        '})();"
		)),
		\it( "lexical \"super\" binding", tryRunning(
				"
		        '(function() {
		        'class B {
		        '  qux() {
		        '    return \"quux\";
		        '  }
		        '}
		        'class C extends B {
		        '  baz() {
		        '    return x =\> super.qux();
		        '  }
		        '}
		        'var arrow = new C().baz();
		        'return arrow() === \"quux\";
		        '})();"
		)),
		\it( "lexical \"new.target\" binding", tryRunning(
				"
		        '(function() {
		        'function C() {
		        '  return x =\> new.target;
		        '}
		        'return new C()() === C && C()() === undefined;
		        '})();"
		))
	]);
}