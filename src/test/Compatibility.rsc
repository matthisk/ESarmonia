module \test::Compatibility
extend \test::Base;

import Desugar;
import Parse;
import ParseTree;

import util::ShellExec;

private bool runNodeProcess( &T <: Tree dpt ) {
	nodeP = createProcess( "/usr/local/bin/node", ["-p","<dpt>"] );
	output = readEntireStream( nodeP );
	err = readEntireErrStream( nodeP );
	killProcess( nodeP );			
	
	res = and([ expect( output ).toBe( "true" ), expect( err ).toBe("") ]);
	
	if( ! res ) { println( dpt ); }
	
	return res;
}

Spec tryRunning( str input ) {
	return bool() {
		try {
			dpt = desugar( parse( #start[Source], input ) );			
			return runNodeProcess( dpt );
		} catch exception : {
			println( "failed with error: <exception>" );
			return false;
		}
	};
}

Spec tryRunning( &T <: Tree src ) {
	return bool() {
		try {
			dpt = desugarVisitor( src );
			return runNodeProcess( dpt );
		} catch exception : {
			println( "failed with error: <excpetion>" );
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

test bool destructuringCompatibility() {
	return
	describe( "with arrays", [
		\it( "msg", tryRunning(
			"var [a, , [b], c] = [5, null, [6]];
			'var d, e;
			'[d,e] = [7,8];
			'a === 5 && b === 6 && c === undefined && d === 7 && e === 8;"
		)),
		
		\it( "with strings", tryRunning( 
			"var [a, b, c] = \"ab\";
			'var d, e;
			'[d,e] = \"de\";
			'return a === \"a\" && b === \"b\" && c === undefined && d === \"d\" && e === \"e\";"
		)),
    	
	 \it( "with astral plane string", tryRunning(
	    "var c;
	    '[c] = \"𠮷𠮶\";
	    'c === \"𠮷\";"
	  )),
	  
	  \it( "with generic iterables", tryRunning(
	    "var [a, b, c] = global.__createIterableObject(1, 2);
	    'var d, e;
	    '[d, e] = global.__createIterableObject(3, 4);
	    'a === 1 && b === 2 && c === undefined && d === 3 && e === 4;"
	  )),
	  
	  \it( "with instances of generic iterables", tryRunning("
	    var [a, b, c] = Object.create(global.__createIterableObject(1, 2))
	    var d, e;
	    [d, e] = Object.create(global.__createIterableObject(3, 4));
	    a === 1 && b === 2 && c === undefined && d === 3 && e === 4;"
	  )),
	  
	  \it( "iterator closing", tryRunning("
	    var closed = false;
	    var iter = __createIterableObject(1, 2, 3);
	    iter[\'return\'] = function(){ closed = true; return {}; }
	    var [a, b] = iter;
	    closed;
	  ")),
	  
	  \it( "iterator destructuring expression", tryRunning("
	    var a, b, iterable = [1,2];
	    ([a, b] = iterable) === iterable;
	  ")),
	  
	  \it( "chained iterable destructuring", tryRunning("
	    var a,b,c,d;
	    [a,b] = [c,d] = [1,2];
	    a === 1 && b === 2 && c === 1 && d === 2;
	  ")),
	  
	  \it( "trailing commas in iterable", tryRunning("
	    var [a,] = [1];
	    a === 1;
	  ")),
	  
	  \it( "with objects", tryRunning("
	    var {c, x:d, e} = {c:7, x:8};
	    var f, g;
	    ({f,g} = {f:9,g:10});
	    c === 7 && d === 8 && e === undefined
	      && f === 9 && g === 10;
	  ")),
	  
	  \it( "object destructuring primitives", tryRunning("
	    var {toFixed} = 2;
	    var {slice} = \'\';
	    var toString, match;
	    ({toString} = 2);
	    ({match} = \'\');
	    toFixed === Number.prototype.toFixed
	      && toString === Number.prototype.toString
	      && slice === String.prototype.slice
	      && match === String.prototype.match;
	  ")),
	  
	  \it( "trailing commas in object patterns", tryRunning("
	    var {a,} = {a:1};
	    a === 1;
	  ")),
	  
	  \it( "object destructuring expression", tryRunning("
	    var a, b, obj = { a:1, b:2 };
	    ({a,b} = obj) === obj;
	  ")),
	  
	  \it( "chained object destructuring", tryRunning("
	    var a,b,c,d;
	    ({a,b} = {c,d} = {a:1,b:2,c:3,d:4});
	    a === 1 && b === 2 && c === 3 && d === 4;
	  ")),
	  
	  \it( "throws on null and undefined", tryRunning("
	    try {
	      var {a} = null;
	      false;
	    } catch(e) {}
	    try {
	      var {b} = undefined;
	      false;
	    } catch(e) {}
	    true;
	  ")),
	  
	  \it( "computed properties", tryRunning("
	    var qux = \"corge\";
	    var { [qux]: grault } = { corge: \"garply\" };
	    grault === \"garply\";
	  ")),
	  
	  \it( "multiples in a single var statement", tryRunning("
	    var [a,b] = [5,6], {c,d} = {c:7,d:8};
	    a === 5 && b === 6 && c === 7 && d === 8;
	  ")),
	  
	  \it( "nested", tryRunning("
	    var [e, {x:f, g}] = [9, {x:10}];
	    var {h, x:[i]} = {h:11, x:[12]};
	    e === 9 && f === 10 && g === undefined
	      && h === 11 && i === 12;
	  ")),
	  
	  \it( "in parameters", tryRunning("
	    (function({a, x:b, y:e}, [c, d]) {
	      return a === 1 && b === 2 && c === 3 &&
	        d === 4 && e === undefined;
	    }({a:1, x:2}, [3, 4]));
	  ")),
	  
	  \it( "in parameters, new Function() support", tryRunning("
	    new Function(\"{a, x:b, y:e}\",\"[c, d]\",
	      \"return a === 1 && b === 2 && c === 3 && \"
	      + \"d === 4 && e === undefined;\"
	    )({a:1, x:2}, [3, 4]);
	  ")),
	  
	  \it( "in parameters, function \'length\' property", tryRunning("
	    function({a, b}, [c, d]){}.length === 2;
	  ")),
	  
	  \it( "in for-in loop heads", tryRunning("
	    for(var [i, j, k] in { qux: 1 }) {
	      i === \"q\" && j === \"u\" && k === \"x\";
	    }
	  ")),
	  
	  \it( "in for-of loop heads", tryRunning("
	    for(var [i, j, k] of [[1,2,3]]) {
	      i === 1 && j === 2 && k === 3;
	    }
	  ")),
	  
	  \it( "rest", tryRunning("
	    var [a, ...b] = [3, 4, 5];
	    var [c, ...d] = [6];
	    a === 3 && b instanceof Array && (b + \"\") === \"4,5\" &&
	       c === 6 && d instanceof Array && d.length === 0;
	  ")),
	  
	  \it( "nested rest", tryRunning("
	    var a = [1, 2, 3], first, last;
	    [first, ...[a[2], last]] = a;
	    first === 1 && last === 3 && (a + \"\") === \"1,2,2\";
	  ")),
	  
	  \it( "defaults", tryRunning("
	    var {a = 1, b = 0, c = 3} = {b:2, c:undefined};
	    a === 1 && b === 2 && c === 3;
	  ")),
	  
	  \it( "defaults in parameters", tryRunning("
	    (function({a = 1, b = 0, c = 3, x:d = 0, y:e = 5, z:f}) {
	      return a === 1 && b === 2 && c === 3 && d === 4 &&
	        e === 5 && f === undefined;
	    }({b:2, c:undefined, x:4}));
	  ")),
	  
	  \it( "defaults, let temporal dead zone", tryRunning("
	    var {a, b = 2} = {a:1};
	    try {
	      eval(\"let {c = c} = {};\");
	      false;
	    } catch(e){}
	    try {
	      eval(\"let {c = d, d} = {d:1};\");
	      false;
	    } catch(e){}
	    a === 1 && b === 2;
	  ")),
	  
	  \it( "defaults in parameters, separate scope", tryRunning("
	    (function({a=function(){
	      return typeof b === \'undefined\';
	    }}){
	      var b = 1;
	      return a();
	    }({}));
	  ")),
	  
	  \it( "defaults in parameters, new Function() support", tryRunning("
	    new Function(\"{a = 1, b = 0, c = 3, x:d = 0, y:e = 5, z:f}\",
	      \"return a === 1 && b === 2 && c === 3 && d === 4 && \"
	      + \"e === 5 && f === undefined;\"
	    )({b:2, c:undefined, x:4});
	  "))

]);
}