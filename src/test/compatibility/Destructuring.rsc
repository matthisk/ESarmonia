module \test::compatibility::Destructuring
extend \test::compatibility::Base;

test bool destructuring() {
	return
	describe("destructuring", [
		\it( "with arrays", tryRunning(
				"
		        '(function() {
		        'var [a, , [b], c] = [5, null, [6]];
		        'var d, e;
		        '[d,e] = [7,8];
		        'return a === 5 && b === 6 && c === undefined
		        '  && d === 7 && e === 8;
		        '})();"
		)),
		\it( "with strings", tryRunning(
				"
		        '(function() {
		        'var [a, b, c] = \"ab\";
		        'var d, e;
		        '[d,e] = \"de\";
		        'return a === \"a\" && b === \"b\" && c === undefined
		        '  && d === \"d\" && e === \"e\";
		        '})();"
		)),
		\it( "with astral plane strings", tryRunning(
				"
		        '(function() {
		        'var c;
		        '[c] = \"𠮷𠮶\";
		        'return c === \"𠮷\";
		        '})();"
		)),
		\it( "with generic iterables", tryRunning(
				"
		        '(function() {
		        'var [a, b, c] = global.__createIterableObject(1, 2);
		        'var d, e;
		        '[d, e] = global.__createIterableObject(3, 4);
		        'return a === 1 && b === 2 && c === undefined
		        '  && d === 3 && e === 4;
		        '})();"
		)),
		\it( "with instances of generic iterables", tryRunning(
				"
		        '(function() {
		        'var [a, b, c] = Object.create(global.__createIterableObject(1, 2))
		        'var d, e;
		        '[d, e] = Object.create(global.__createIterableObject(3, 4));
		        'return a === 1 && b === 2 && c === undefined
		        '  && d === 3 && e === 4;
		        '})();"
		)),
		\it( "iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'var [a, b] = iter;
		        'return closed;
		        '})();"
		)),
		\it( "iterable destructuring expression", tryRunning(
				"
		        '(function() {
		        'var a, b, iterable = [1,2];
		        'return ([a, b] = iterable) === iterable;
		        '})();"
		)),
		\it( "chained iterable destructuring", tryRunning(
				"
		        '(function() {
		        'var a,b,c,d;
		        '[a,b] = [c,d] = [1,2];
		        'return a === 1 && b === 2 && c === 1 && d === 2;
		        '})();"
		)),
		\it( "trailing commas in iterable patterns", tryRunning(
				"
		        '(function() {
		        'var [a,] = [1];
		        'return a === 1;
		        '})();"
		)),
		\it( "with objects", tryRunning(
				"
		        '(function() {
		        'var {c, x:d, e} = {c:7, x:8};
		        'var f, g;
		        '({f,g} = {f:9,g:10});
		        'return c === 7 && d === 8 && e === undefined
		        '  && f === 9 && g === 10;
		        '})();"
		)),
		\it( "object destructuring with primitives", tryRunning(
				"
		        '(function() {
		        'var {toFixed} = 2;
		        'var {slice} = \'\';
		        'var toString, match;
		        '({toString} = 2);
		        '({match} = \'\');
		        'return toFixed === Number.prototype.toFixed
		        '  && toString === Number.prototype.toString
		        '  && slice === String.prototype.slice
		        '  && match === String.prototype.match;
		        '})();"
		)),
		\it( "trailing commas in object patterns", tryRunning(
				"
		        '(function() {
		        'var {a,} = {a:1};
		        'return a === 1;
		        '})();"
		)),
		\it( "object destructuring expression", tryRunning(
				"
		        '(function() {
		        'var a, b, obj = { a:1, b:2 };
		        'return ({a,b} = obj) === obj;
		        '})();"
		)),
		\it( "chained object destructuring", tryRunning(
				"
		        '(function() {
		        'var a,b,c,d;
		        '({a,b} = {c,d} = {a:1,b:2,c:3,d:4});
		        'return a === 1 && b === 2 && c === 3 && d === 4;
		        '})();"
		)),
		\it( "throws on null and undefined", tryRunning(
				"
		        '(function() {
		        'try {
		        '  var {a} = null;
		        '  return false;
		        '} catch(e) {}
		        'try {
		        '  var {b} = undefined;
		        '  return false;
		        '} catch(e) {}
		        'return true;
		        '})();"
		)),
		\it( "computed properties", tryRunning(
				"
		        '(function() {
		        'var qux = \"corge\";
		        'var { [qux]: grault } = { corge: \"garply\" };
		        'return grault === \"garply\";
		        '})();"
		)),
		\it( "multiples in a single var statement", tryRunning(
				"
		        '(function() {
		        'var [a,b] = [5,6], {c,d} = {c:7,d:8};
		        'return a === 5 && b === 6 && c === 7 && d === 8;
		        '})();"
		)),
		\it( "nested", tryRunning(
				"
		        '(function() {
		        'var [e, {x:f, g}] = [9, {x:10}];
		        'var {h, x:[i]} = {h:11, x:[12]};
		        'return e === 9 && f === 10 && g === undefined
		        '  && h === 11 && i === 12;
		        '})();"
		)),
		\it( "in parameters", tryRunning(
				"
		        '(function() {
		        'return (function({a, x:b, y:e}, [c, d]) {
		        '  return a === 1 && b === 2 && c === 3 &&
		        '    d === 4 && e === undefined;
		        '}({a:1, x:2}, [3, 4]));
		        '})();"
		)),
		\it( "in parameters, new Function() support", tryRunning(
				"
		        '(function() {
		        'return new Function(\"{a, x:b, y:e}\",\"[c, d]\",
		        '  \"return a === 1 && b === 2 && c === 3 && \"
		        '  + \"d === 4 && e === undefined;\"
		        ')({a:1, x:2}, [3, 4]);
		        '})();"
		)),
		\it( "in parameters, function \'length\' property", tryRunning(
				"
		        '(function() {
		        'return function({a, b}, [c, d]){}.length === 2;
		        '})();"
		)),
		\it( "in for-in loop heads", tryRunning(
				"
		        '(function() {
		        'for(var [i, j, k] in { qux: 1 }) {
		        '  return i === \"q\" && j === \"u\" && k === \"x\";
		        '}
		        '})();"
		)),
		\it( "in for-of loop heads", tryRunning(
				"
		        '(function() {
		        'for(var [i, j, k] of [[1,2,3]]) {
		        '  return i === 1 && j === 2 && k === 3;
		        '}
		        '})();"
		)),
		\it( "rest", tryRunning(
				"
		        '(function() {
		        'var [a, ...b] = [3, 4, 5];
		        'var [c, ...d] = [6];
		        'return a === 3 && b instanceof Array && (b + \"\") === \"4,5\" &&
		        '   c === 6 && d instanceof Array && d.length === 0;
		        '})();"
		)),
		\it( "nested rest", tryRunning(
				"
		        '(function() {
		        'var a = [1, 2, 3], first, last;
		        '[first, ...[a[2], last]] = a;
		        'return first === 1 && last === 3 && (a + \"\") === \"1,2,2\";
		        '})();"
		)),
		\it( "defaults", tryRunning(
				"
		        '(function() {
		        'var {a = 1, b = 0, c = 3} = {b:2, c:undefined};
		        'return a === 1 && b === 2 && c === 3;
		        '})();"
		)),
		\it( "defaults in parameters", tryRunning(
				"
		        '(function() {
		        'return (function({a = 1, b = 0, c = 3, x:d = 0, y:e = 5, z:f}) {
		        '  return a === 1 && b === 2 && c === 3 && d === 4 &&
		        '    e === 5 && f === undefined;
		        '}({b:2, c:undefined, x:4}));
		        '})();"
		)),
		\it( "defaults, let temporal dead zone", tryRunning(
				"
		        '(function() {
		        'var {a, b = 2} = {a:1};
		        'try {
		        '  eval(\"let {c = c} = {};\");
		        '  return false;
		        '} catch(e){}
		        'try {
		        '  eval(\"let {c = d, d} = {d:1};\");
		        '  return false;
		        '} catch(e){}
		        'return a === 1 && b === 2;
		        '})();"
		)),
		\it( "defaults in parameters, separate scope", tryRunning(
				"
		        '(function() {
		        'return (function({a=function(){
		        '  return typeof b === \'undefined\';
		        '}}){
		        '  var b = 1;
		        '  return a();
		        '}({}));
		        '})();"
		)),
		\it( "defaults in parameters, new Function() support", tryRunning(
				"
		        '(function() {
		        'return new Function(\"{a = 1, b = 0, c = 3, x:d = 0, y:e = 5, z:f}\",
		        '  \"return a === 1 && b === 2 && c === 3 && d === 4 && \"
		        '  + \"e === 5 && f === undefined;\"
		        ')({b:2, c:undefined, x:4});
		        '})();"
		))
	]);
}