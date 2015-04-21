module \test::Compatibility
extend \test::Base;

import Desugar;
import Parse;

import util::ShellExec;

Spec tryRunning( str input ) {
	return bool() {
		try {
			dpt = desugar( parse( #start[Source], input ) );
			
			nodeP = createProcess( "/usr/local/bin/node", ["-p","<dpt>"] );
			output = readEntireStream( nodeP );
			err = readEntireErrStream( nodeP );
			killProcess( nodeP );			
			
			res = and([ expect( output ).toBe( "true" ), expect( err ).toBe("") ]);
			
			if( ! res ) { println( dpt ); }
			
			return res;
		} catch exception : {
			println( "failed with error: <exception>" );
			return false;
		}
	};
}

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

test bool classCompatibility() {
	return
	describe( "class declaration", [
		\it( "class statement", tryRunning(
			"class C {}
        	'typeof C === \"function\";"
		)),
		
		\it( "is block-scoped", tryRunning(
			"class C {}
        	'var c1 = C;
        	'{
          	'	class C {}
          	'	var c2 = C;
        	'}
        	'C === c1;"
		)),
		
		\it( "class expression", tryRunning(
			"typeof class C {} === \"function\";"
		)),
		
		\it( "anonymous class", tryRunning(
			"typeof class {} === \"function\";"
		)),
		
		\it( "constructor", tryRunning(
			"class C {
          	'	constructor() { this.x = 1; }
        	'}
        	'C.prototype.constructor === C
          	'&& new C().x === 1;"
		)),
		
		\it( "prototype method", tryRunning(
			"class C {
          	'	method() { return 2; }
        	'}
        	'typeof C.prototype.method === \"function\"
          	'&& new C().method() === 2;"
		))
	]);
}