module extensions::arrow::Compatibility
extend \test::Compatibility;

import extensions::arrow::Syntax;
import extensions::arrow::Desugar;

test bool arrowCompatibility() {
	return
	describe( "arrow function", [
		
		\it( "zero parameters", tryRunning(
			"(() =\> 5)() === 5;"
		)),
		
		\it( "1 parameter, no brackets", tryRunning(
			"var b = x =\> x + \"foo\";
        	'(b(\"fee fie foe \") === \"fee fie foe foo\");"
		)),
		
		\it( "multiple parameters", tryRunning(
			"var c = (v, w, x, y, z) =\> \"\" + v + w + x + y + z;
        	'(c(6, 5, 4, 3, 2) === \"65432\");"
        )),
        
        \it( "lexical this binding", tryRunning(
        	"var d = { x : \"bar\", y : function() { return z =\> this.x + z; }}.y();
        	'var e = { x : \"baz\", y : d };
        	'd(\"ley\") === \"barley\" && e.y(\"ley\") === \"barley\";"
        )),
        
        \it( "\"this\" unchanged by call or apply", tryRunning(
        	"var d = { x : \"foo\", y : function() { return () =\> this.x; }};
        	'var e = { x : \"bar\" };
        	'd.y().call(e) === \"foo\" && d.y().apply(e) === \"foo\";"
        )),
        
        \it( "cant be bound, can be curried", tryRunning(
        	"var d = { x : \"bar\", y : function() { return z =\> this.x + z; }};
        	'var e = { x : \"baz\" };
        	'd.y().bind(e, \"ley\")() === \"barley\";"
        )),
        
        \it( "lexical \"arguments\" binding", tryRunning(
        	"var f = (function() { return z =\> arguments[0]; }(5));
        	'f(6) === 5;"
        )),
        
        \it( "no line break between params and =\>", tryRunning(
        	"(() =\> {
          	'try { Function(\"x\\n =\> 2\")(); } catch(e) { return true; }
        	'})();"
        )),
        
        \it( "no prototype property", tryRunning(
        	"var a = () =\> 5;
        	'return !a.hasOwnProperty(\"prototype\");"
        )),
        
        \it( "lexical super binding", tryRunning(
        	"class B {
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
        	'arrow() === \"quux\";"
        )),
        
        \it( "lexical new.target binding", tryRunning(
        	"function C() {
          	'return x =\> new.target;
        	'}
        	'new C()() === C && C()() === undefined;"
        ))
		
	] );
}