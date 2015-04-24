module \test::compatibility::Compatibility
extend \test::compatibility::Base;

test bool propertailcalls() {
	return
	describe("proper tail calls (tail call optimisation)", [
		\it( "direct recursion", tryRunning(
				"
		        '(function() {
		        '\"use strict\";
		        'return (function f(n){
		        '  if (n \<= 0) {
		        '    return  \"foo\";
		        '  }
		        '  return f(n - 1);
		        '}(1e6)) === \"foo\";
		        '})();"
		)),
		\it( "mutual recursion", tryRunning(
				"
		        '(function() {
		        '\"use strict\";
		        'function f(n){
		        '  if (n \<= 0) {
		        '    return  \"foo\";
		        '  }
		        '  return g(n - 1);
		        '}
		        'function g(n){
		        '  if (n \<= 0) {
		        '    return  \"bar\";
		        '  }
		        '  return f(n - 1);
		        '}
		        'return f(1e6) === \"foo\" && f(1e6+1) === \"bar\";
		        '})();"
		))
	]);
}
test bool defaultfunctionparameters() {
	return
	describe("default function parameters", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'return (function (a = 1, b = 2) { return a === 3 && b === 2; }(3));
		        '})();"
		)),
		\it( "explicit undefined defers to the default", tryRunning(
				"
		        '(function() {
		        'return (function (a = 1, b = 2) { return a === 1 && b === 3; }(undefined, 3));
		        '})();"
		)),
		\it( "defaults can refer to previous params", tryRunning(
				"
		        '(function() {
		        'return (function (a, b = a) { return b === 5; }(5));
		        '})();"
		)),
		\it( "temporal dead zone", tryRunning(
				"
		        '(function() {
		        'return (function(x = 1) {
		        '  try {
		        '    eval(\"(function(a=a){}())\");
		        '    return false;
		        '  } catch(e) {}
		        '  try {
		        '    eval(\"(function(a=b,b){}())\");
		        '    return false;
		        '  } catch(e) {}
		        '  return true;
		        '}());
		        '})();"
		)),
		\it( "separate scope", tryRunning(
				"
		        '(function() {
		        'return (function(a=function(){
		        '  return typeof b === \'undefined\';
		        '}){
		        '  var b = 1;
		        '  return a();
		        '}());
		        '})();"
		)),
		\it( "new Function() support", tryRunning(
				"
		        '(function() {
		        'return new Function(\"a = 1\", \"b = 2\",
		        '  \"return a === 3 && b === 2;\"
		        ')(3);
		        '})();"
		))
	]);
}
test bool restparameters() {
	return
	describe("rest parameters", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'return (function (foo, ...args) {
		        '  return args instanceof Array && args + \"\" === \"bar,baz\";
		        '}(\"foo\", \"bar\", \"baz\"));
		        '})();"
		)),
		\it( "function \'length\' property", tryRunning(
				"
		        '(function() {
		        'return function(a, ...b){}.length === 1 && function(...c){}.length === 0;
		        '})();"
		)),
		\it( "arguments object interaction", tryRunning(
				"
		        '(function() {
		        'return (function (foo, ...args) {
		        '  foo = \"qux\";
		        '  // The arguments object is not mapped to the
		        '  // parameters, even outside of strict mode.
		        '  return arguments.length === 3
		        '    && arguments[0] === \"foo\"
		        '    && arguments[1] === \"bar\"
		        '    && arguments[2] === \"baz\";
		        '}(\"foo\", \"bar\", \"baz\"));
		        '})();"
		)),
		\it( "can\'t be used in setters", tryRunning(
				"
		        '(function() {
		        'return (function (...args) {
		        '  try {
		        '    eval(\"({set e(...args){}})\");
		        '  } catch(e) {
		        '    return true;
		        '  }
		        '}());
		        '})();"
		)),
		\it( "new Function() support", tryRunning(
				"
		        '(function() {
		        'return new Function(\"a\", \"...b\",
		        '  \"return b instanceof Array && a+b === \'foobar,baz\';\"
		        ')(\'foo\',\'bar\',\'baz\');
		        '})();"
		))
	]);
}
test bool spreadoperator() {
	return
	describe("spread (...) operator", [
		\it( "with arrays, in function calls", tryRunning(
				"
		        '(function() {
		        'return Math.max(...[1, 2, 3]) === 3
		        '})();"
		)),
		\it( "with arrays, in array literals", tryRunning(
				"
		       '(function() {
		       'return [...[1, 2, 3]][2] === 3;
		       '})();"
		)),
		\it( "with strings, in function calls", tryRunning(
				"
		       '(function() {
		       'return Math.max(...\"1234\") === 4;
		       '})();"
		)),
		\it( "with strings, in array literals", tryRunning(
				"
		       '(function() {
		       'return [\"a\", ...\"bcd\", \"e\"][3] === \"d\";
		       '})();"
		)),
		\it( "with astral plane strings, in function calls", tryRunning(
				"
		       '(function() {
		       'return Array(...\"𠮷𠮶\")[0] === \"𠮷\";
		       '})();"
		)),
		\it( "with astral plane strings, in array literals", tryRunning(
				"
		       '(function() {
		       'return [...\"𠮷𠮶\"][0] === \"𠮷\";
		       '})();"
		)),
		\it( "with generic iterables, in calls", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'return Math.max(...iterable) === 3;
		        '})();"
		)),
		\it( "with generic iterables, in arrays", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(\"b\", \"c\", \"d\");
		        'return [\"a\", ...iterable, \"e\"][3] === \"d\";
		        '})();"
		)),
		\it( "with instances of iterables, in calls", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'return Math.max(...Object.create(iterable)) === 3;
		        '})();"
		)),
		\it( "with instances of iterables, in arrays", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(\"b\", \"c\", \"d\");
		        'return [\"a\", ...Object.create(iterable), \"e\"][3] === \"d\";
		        '})();"
		))
	]);
}
test bool objectliteralextensions() {
	return
	describe("object literal extensions", [
		\it( "computed properties", tryRunning(
				"
		        '(function() {
		        'var x = \'y\';
		        'return ({ [x]: 1 }).y === 1;
		        '})();"
		)),
		\it( "shorthand properties", tryRunning(
				"
		        '(function() {
		        'var a = 7, b = 8, c = {a,b};
		        'return c.a === 7 && c.b === 8;
		        '})();"
		)),
		\it( "shorthand methods", tryRunning(
				"
		        '(function() {
		        'return ({ y() { return 2; } }).y() === 2;
		        '})();"
		)),
		\it( "string-keyed shorthand methods", tryRunning(
				"
		        '(function() {
		        'return ({ \"foo bar\"() { return 4; } })[\"foo bar\"]() === 4;
		        '})();"
		)),
		\it( "computed shorthand methods", tryRunning(
				"
		        '(function() {
		        'var x = \'y\';
		        'return ({ [x](){ return 1 } }).y() === 1;
		        '})();"
		)),
		\it( "computed accessors", tryRunning(
				"
		        '(function() {
		        'var x = \'y\',
		        '    valueSet,
		        '    obj = {
		        '      get [x] () { return 1 },
		        '      set [x] (value) { valueSet = value }
		        '    };
		        'obj.y = \'foo\';
		        'return obj.y === 1 && valueSet === \'foo\';
		        '})();"
		))
	]);
}
test bool forofloops() {
	return
	describe("for..of loops", [
		\it( "with arrays", tryRunning(
				"
		        '(function() {
		        'var arr = [5];
		        'for (var item of arr)
		        '  return item === 5;
		        '})();"
		)),
		\it( "with strings", tryRunning(
				"
		        '(function() {
		        'var str = \"\";
		        'for (var item of \"foo\")
		        '  str += item;
		        'return str === \"foo\";
		        '})();"
		)),
		\it( "with astral plane strings", tryRunning(
				"
		        '(function() {
		        'var str = \"\";
		        'for (var item of \"𠮷𠮶\")
		        '  str += item + \" \";
		        'return str === \"𠮷 𠮶 \";
		        '})();"
		)),
		\it( "with generic iterables", tryRunning(
				"
		        '(function() {
		        'var result = \"\";
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'for (var item of iterable) {
		        '  result += item;
		        '}
		        'return result === \"123\";
		        '})();"
		)),
		\it( "with instances of generic iterables", tryRunning(
				"
		        '(function() {
		        'var result = \"\";
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'for (var item of Object.create(iterable)) {
		        '  result += item;
		        '}
		        'return result === \"123\";
		        '})();"
		)),
		\it( "iterator closing, break", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'for (var it of iter) break;
		        'return closed;
		        '})();"
		)),
		\it( "iterator closing, throw", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'try {
		        '  for (var it of iter) throw 0;
		        '} catch(e){}
		        'return closed;
		        '})();"
		))
	]);
}
test bool octalandbinaryliterals() {
	return
	describe("octal and binary literals", [
		\it( "octal literals", tryRunning(
				"
		        '(function() {
		        'return 0o10 === 8 && 0O10 === 8;
		        '})();"
		)),
		\it( "binary literals", tryRunning(
				"
		        '(function() {
		        'return 0b10 === 2 && 0B10 === 2;
		        '})();"
		)),
		\it( "octal supported by Number()", tryRunning(
				"
		        '(function() {
		        'return Number(\'0o1\') === 1;
		        '})();"
		)),
		\it( "binary supported by Number()", tryRunning(
				"
		        '(function() {
		        'return Number(\'0b1\') === 1;
		        '})();"
		))
	]);
}
test bool templatestrings() {
	return
	describe("template strings", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var a = \"ba\", b = \"QUX\";
		        'return `foo bar
		        '${a + \"z\"} ${b.toLowerCase()}` === \"foo bar\\nbaz qux\";
		        '})();"
		)),
		\it( "tagged template strings", tryRunning(
				"
		        '(function() {
		        'var called = false;
		        'function fn(parts, a, b) {
		        '  called = true;
		        '  return parts instanceof Array &&
		        '    parts[0]     === \"foo\"      &&
		        '    parts[1]     === \"bar\\n\"    &&
		        '    parts.raw[0] === \"foo\"      &&
		        '    parts.raw[1] === \"bar\\\\n\"   &&
		        '    a === 123                   &&
		        '    b === 456;
		        '}
		        'return fn `foo${123}bar\\n${456}` && called;
		        '})();"
		))
	]);
}
test bool RegExpyanduflags() {
	return
	describe("RegExp \"y\" and \"u\" flags", [
		\it( "\"y\" flag", tryRunning(
				"
		        '(function() {
		        'var re = new RegExp(\'\\\\w\');
		        'var re2 = new RegExp(\'\\\\w\', \'y\');
		        're.exec(\'xy\');
		        're2.exec(\'xy\');
		        'return (re.exec(\'xy\')[0] === \'x\' && re2.exec(\'xy\')[0] === \'y\');
		        '})();"
		)),
		\it( "\"u\" flag", tryRunning(
				"
		        '(function() {
		        'return \"𠮷\".match(/^.$/u)[0].length === 2;
		        '})();"
		))
	]);
}
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
test bool Unicodecodepointescapes() {
	return
	describe("Unicode code point escapes", [
		\it( "in strings", tryRunning(
				"
		        '(function() {
		        'return \'\\u{1d306}\' == \'\\ud834\\udf06\';
		        '})();"
		)),
		\it( "in identifiers", tryRunning(
				"
		        '(function() {
		        'var \\u{102C0} = { \\u{102C0} : 2 };
		        'return \\u{102C0}[\'\\ud800\\udec0\'] === 2;
		        '})();"
		))
	]);
}
test bool const() {
	return
	describe("const", [
		\it( "basic support", tryRunning(
				"
		        '(function() {
		        'const foo = 123;
		        'return (foo === 123);
		        '})();"
		)),
		\it( "is block-scoped", tryRunning(
				"
		        '(function() {
		        'const bar = 123;
		        '{ const bar = 456; }
		        'return bar === 123;
		        '})();"
		)),
		\it( "redefining a const is an error", tryRunning(
				"
		        '(function() {
		        'const baz = 1;
		        'try {
		        '  Function(\"const foo = 1; foo = 2;\")();
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "temporal dead zone", tryRunning(
				"
		        '(function() {
		        'var passed = (function(){ try { qux; } catch(e) { return true; }}());
		        'const qux = 456;
		        'return passed;
		        '})();"
		)),
		\it( "basic support (strict mode)", tryRunning(
				"
		        '(function() {
		        '\"use strict\";
		        'const foo = 123;
		        'return (foo === 123);
		        '})();"
		)),
		\it( "is block-scoped (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'const bar = 123;
		        '{ const bar = 456; }
		        'return bar === 123;
		        '})();"
		)),
		\it( "redefining a const (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'const baz = 1;
		        'try {
		        '  Function(\"\'use strict\'; const foo = 1; foo = 2;\")();
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "temporal dead zone (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'var passed = (function(){ try { qux; } catch(e) { return true; }}());
		        'const qux = 456;
		        'return passed;
		        '})();"
		))
	]);
}
test bool let() {
	return
	describe("let", [
		\it( "basic support", tryRunning(
				"
		        '(function() {
		        'let foo = 123;
		        'return (foo === 123);
		        '})();"
		)),
		\it( "is block-scoped", tryRunning(
				"
		        '(function() {
		        'let bar = 123;
		        '{ let bar = 456; }
		        'return bar === 123;
		        '})();"
		)),
		\it( "for-loop statement scope", tryRunning(
				"
		        '(function() {
		        'let baz = 1;
		        'for(let baz = 0; false; false) {}
		        'return baz === 1;
		        '})();"
		)),
		\it( "temporal dead zone", tryRunning(
				"
		        '(function() {
		        'var passed = (function(){ try {  qux; } catch(e) { return true; }}());
		        'let qux = 456;
		        'return passed;
		        '})();"
		)),
		\it( "for-loop iteration scope", tryRunning(
				"
		        '(function() {
		        'let scopes = [];
		        'for(let i = 0; i \< 2; i++) {
		        '  scopes.push(function(){ return i; });
		        '}
		        'let passed = (scopes[0]() === 0 && scopes[1]() === 1);
		
		        'scopes = [];
		        'for(let i in { a:1, b:1 }) {
		        '  scopes.push(function(){ return i; });
		        '}
		        'passed &= (scopes[0]() === \"a\" && scopes[1]() === \"b\");
		        'return passed;
		        '})();"
		)),
		\it( "basic support (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'let foo = 123;
		        'return (foo === 123);
		        '})();"
		)),
		\it( "is block-scoped (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'let bar = 123;
		        '{ let bar = 456; }
		        'return bar === 123;
		        '})();"
		)),
		\it( "for-loop statement scope (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'let baz = 1;
		        'for(let baz = 0; false; false) {}
		        'return baz === 1;
		        '})();"
		)),
		\it( "temporal dead zone (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'var passed = (function(){ try {  qux; } catch(e) { return true; }}());
		        'let qux = 456;
		        'return passed;
		        '})();"
		)),
		\it( "for-loop iteration scope (strict mode)", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'let scopes = [];
		        'for(let i = 0; i \< 2; i++) {
		        '  scopes.push(function(){ return i; });
		        '}
		        'let passed = (scopes[0]() === 0 && scopes[1]() === 1);
		
		        'scopes = [];
		        'for(let i in { a:1, b:1 }) {
		        '  scopes.push(function(){ return i; });
		        '}
		        'passed &= (scopes[0]() === \"a\" && scopes[1]() === \"b\");
		        'return passed;
		        '})();"
		))
	]);
}
test bool blocklevelfunctiondeclaration() {
	return
	describe("block-level function declaration", [
		\it( "block-level function declaration", tryRunning(
				"
		    '(function() {
		    '\'use strict\';
		    'function f() { return 1; }
		    '{
		    '  function f() { return 2; }
		    '}
		    'return f() === 1;
		    '})();"
		))
	]);
}
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
test bool class() {
	return
	describe("class", [
		\it( "class statement", tryRunning(
				"
		        '(function() {
		        'class C {}
		        'return typeof C === \"function\";
		        '})();"
		)),
		\it( "is block-scoped", tryRunning(
				"
		        '(function() {
		        'class C {}
		        'var c1 = C;
		        '{
		        '  class C {}
		        '  var c2 = C;
		        '}
		        'return C === c1;
		        '})();"
		)),
		\it( "class expression", tryRunning(
				"
		        '(function() {
		        'return typeof class C {} === \"function\";
		        '})();"
		)),
		\it( "anonymous class", tryRunning(
				"
		        '(function() {
		        'return typeof class {} === \"function\";
		        '})();"
		)),
		\it( "constructor", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  constructor() { this.x = 1; }
		        '}
		        'return C.prototype.constructor === C
		        '  && new C().x === 1;
		        '})();"
		)),
		\it( "prototype methods", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  method() { return 2; }
		        '}
		        'return typeof C.prototype.method === \"function\"
		        '  && new C().method() === 2;
		        '})();"
		)),
		\it( "string-keyed methods", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  \"foo bar\"() { return 2; }
		        '}
		        'return typeof C.prototype[\"foo bar\"] === \"function\"
		        '  && new C()[\"foo bar\"]() === 2;
		        '})();"
		)),
		\it( "computed prototype methods", tryRunning(
				"
		        '(function() {
		        'var foo = \"method\";
		        'class C {
		        '  [foo]() { return 2; }
		        '}
		        'return typeof C.prototype.method === \"function\"
		        '  && new C().method() === 2;
		        '})();"
		)),
		\it( "static methods", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  static method() { return 3; }
		        '}
		        'return typeof C.method === \"function\"
		        '  && C.method() === 3;
		        '})();"
		)),
		\it( "computed static methods", tryRunning(
				"
		        '(function() {
		        'var foo = \"method\";
		        'class C {
		        '  static [foo]() { return 3; }
		        '}
		        'return typeof C.method === \"function\"
		        '  && C.method() === 3;
		        '})();"
		)),
		\it( "accessor properties", tryRunning(
				"
		        '(function() {
		        'var baz = false;
		        'class C {
		        '  get foo() { return \"foo\"; }
		        '  set bar(x) { baz = x; }
		        '}
		        'new C().bar = true;
		        'return new C().foo === \"foo\" && baz;
		        '})();"
		)),
		\it( "computed accessor properties", tryRunning(
				"
		        '(function() {
		        'var garply = \"foo\", grault = \"bar\", baz = false;
		        'class C {
		        '  get [garply]() { return \"foo\"; }
		        '  set [grault](x) { baz = x; }
		        '}
		        'new C().bar = true;
		        'return new C().foo === \"foo\" && baz;
		        '})();"
		)),
		\it( "static accessor properties", tryRunning(
				"
		        '(function() {
		        'var baz = false;
		        'class C {
		        '  static get foo() { return \"foo\"; }
		        '  static set bar(x) { baz = x; }
		        '}
		        'C.bar = true;
		        'return C.foo === \"foo\" && baz;
		        '})();"
		)),
		\it( "computed static accessor properties", tryRunning(
				"
		        '(function() {
		        'var garply = \"foo\", grault = \"bar\", baz = false;
		        'class C {
		        '  static get [garply]() { return \"foo\"; }
		        '  static set [grault](x) { baz = x; }
		        '}
		        'C.bar = true;
		        'return C.foo === \"foo\" && baz;
		        '})();"
		)),
		\it( "class name is lexically scoped", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  method() { return typeof C === \"function\"; }
		        '}
		        'var M = C.prototype.method;
		        'C = undefined;
		        'return C === undefined && M();
		        '})();"
		)),
		\it( "computed names, temporal dead zone", tryRunning(
				"
		        '(function() {
		        'try {
		        '  var B = class C {
		        '    [C](){}
		        '  }
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "methods aren\'t enumerable", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  foo() {}
		        '  static bar() {}
		        '}
		        'return !C.prototype.propertyIsEnumerable(\"foo\") && !C.propertyIsEnumerable(\"bar\");
		        '})();"
		)),
		\it( "implicit strict mode", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  static method() { return this === undefined; }
		        '}
		        'return (0,C.method)();
		        '})();"
		)),
		\it( "constructor requires new", tryRunning(
				"
		        '(function() {
		        'class C {}
		        'try {
		        '  C();
		        '}
		        'catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "extends", tryRunning(
				"
		        '(function() {
		        'class B {}
		        'class C extends B {}
		        'return new C() instanceof B
		        '  && B.isPrototypeOf(C)
		        '  && B.prototype.isPrototypeOf(C.prototype);
		        '})();"
		)),
		\it( "extends expressions", tryRunning(
				"
		        '(function() {
		        'var B;
		        'class C extends (B = class {}) {}
		        'return new C() instanceof B
		        '  && B.isPrototypeOf(C)
		        '  && B.prototype.isPrototypeOf(C.prototype);
		        '})();"
		)),
		\it( "extends null", tryRunning(
				"
		        '(function() {
		        'class C extends null {
		        '  constructor() { return Object.create(null); }
		        '}
		        'var c = new C();
		        'return !(c instanceof Object)
		        '  && Function.prototype.isPrototypeOf(C)
		        '  && Object.getPrototypeOf(C.prototype) === null;
		        '})();"
		)),
		\it( "new.target", tryRunning(
				"
		        '(function() {
		        'var passed = false;
		        'class A {
		        '  constructor() {
		        '    passed = new.target === B;
		        '  }
		        '}
		        'class B extends A {}
		        'new B();
		        '(function() {
		        '  passed &= new.target === undefined;
		        '}());
		        'return passed;
		        '})();"
		))
	]);
}
test bool super() {
	return
	describe("super", [
		\it( "statement in constructors", tryRunning(
				"
		        '(function() {
		        'var passed = false;
		        'class B {
		        '  constructor(a) { passed = (a === \"barbaz\"); }
		        '}
		        'class C extends B {
		        '  constructor(a) { super(\"bar\" + a); }
		        '}
		        'new C(\"baz\");
		        'return passed;
		        '})();"
		)),
		\it( "expression in constructors", tryRunning(
				"
		        '(function() {
		        'class B {
		        '  constructor(a) { return [\"foo\" + a]; }
		        '}
		        'class C extends B {
		        '  constructor(a) { return super(\"bar\" + a); }
		        '}
		        'return new C(\"baz\")[0] === \"foobarbaz\";
		        '})();"
		)),
		\it( "in methods, property access", tryRunning(
				"
		        '(function() {
		        'class B {}
		        'B.prototype.qux = \"foo\";
		        'B.prototype.corge = \"baz\";
		        'class C extends B {
		        '  quux(a) { return super.qux + a + super[\"corge\"]; }
		        '}
		        'C.prototype.qux = \"garply\";
		        'return new C().quux(\"bar\") === \"foobarbaz\";
		        '})();"
		)),
		\it( "in methods, method calls", tryRunning(
				"
		        '(function() {
		        'class B {
		        '  qux(a) { return \"foo\" + a; }
		        '}
		        'class C extends B {
		        '  qux(a) { return super.qux(\"bar\" + a); }
		        '}
		        'return new C().qux(\"baz\") === \"foobarbaz\";
		        '})();"
		)),
		\it( "method calls use correct \"this\" binding", tryRunning(
				"
		        '(function() {
		        'class B {
		        '  qux(a) { return this.foo + a; }
		        '}
		        'class C extends B {
		        '  qux(a) { return super.qux(\"bar\" + a); }
		        '}
		        'var obj = new C();
		        'obj.foo = \"foo\";
		        'return obj.qux(\"baz\") === \"foobarbaz\";
		        '})();"
		)),
		\it( "is statically bound", tryRunning(
				"
		        '(function() {
		        'class B {
		        '  qux() { return \"bar\"; }
		        '}
		        'class C extends B {
		        '  qux() { return super.qux() + this.corge; }
		        '}
		        'var obj = {
		        '  qux: C.prototype.qux,
		        '  corge: \"ley\"
		        '};
		        'return obj.qux() === \"barley\";
		        '})();"
		))
	]);
}
test bool generators() {
	return
	describe("generators", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'function * generator(){
		        '  yield 5; yield 6;
		        '};
		        'var iterator = generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "generator function expressions", tryRunning(
				"
		        '(function() {
		        'var generator = function * (){
		        '  yield 5; yield 6;
		        '};
		        'var iterator = generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "correct \"this\" binding", tryRunning(
				"
		        '(function() {
		        'function * generator(){
		        '  yield this.x; yield this.y;
		        '};
		        'var iterator = { g: generator, x: 5, y: 6 }.g();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "can\'t use \"this\" with new", tryRunning(
				"
		        '(function() {
		        'function * generator(){
		        '  yield this.x; yield this.y;
		        '};
		        'try {
		        '  (new generator()).next();
		        '}
		        'catch (e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "sending", tryRunning(
				"
		        '(function() {
		        'var sent;
		        'function * generator(){
		        '  sent = [yield 5, yield 6];
		        '};
		        'var iterator = generator();
		        'iterator.next();
		        'iterator.next(\"foo\");
		        'iterator.next(\"bar\");
		        'return sent[0] === \"foo\" && sent[1] === \"bar\";
		        '})();"
		)),
		\it( "%GeneratorPrototype%", tryRunning(
				"
		        '(function() {
		        'function * generatorFn(){}
		        'var ownProto = Object.getPrototypeOf(generatorFn());
		        'var passed = ownProto === generatorFn.prototype;
		
		        'var sharedProto = Object.getPrototypeOf(ownProto);
		        'passed &= sharedProto !== Object.prototype &&
		        '  sharedProto === Object.getPrototypeOf(function*(){}.prototype) &&
		        '  sharedProto.hasOwnProperty(\'next\');
		
		        'return passed;
		        '})();"
		)),
		\it( "%GeneratorPrototype%.throw", tryRunning(
				"
		        '(function() {
		        'var passed = false;
		        'function * generator(){
		        '  try {
		        '    yield 5; yield 6;
		        '  } catch(e) {
		        '    passed = (e === \"foo\");
		        '  }
		        '};
		        'var iterator = generator();
		        'iterator.next();
		        'iterator.throw(\"foo\");
		        'return passed;
		        '})();"
		)),
		\it( "%GeneratorPrototype%.return", tryRunning(
				"
		        '(function() {
		        'function * generator(){
		        '  yield 5; yield 6;
		        '};
		        'var iterator = generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.return(\"quxquux\");
		        'passed    &= item.value === \"quxquux\" && item.done === true;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield operator precedence", tryRunning(
				"
		        '(function() {
		        'var passed;
		        'function * generator(){
		        '  passed = yield 0 ? true : false;
		        '};
		        'var iterator = generator();
		        'iterator.next();
		        'iterator.next(true);
		        'return passed;
		        '})();"
		)),
		\it( "yield *, arrays", tryRunning(
				"
		        '(function() {
		        'var iterator = (function * generator() {
		        '  yield * [5, 6];
		        '}());
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield *, strings", tryRunning(
				"
		        '(function() {
		        'var iterator = (function * generator() {
		        '  yield * \"56\";
		        '}());
		        'var item = iterator.next();
		        'var passed = item.value === \"5\" && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === \"6\" && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield *, astral plane strings", tryRunning(
				"
		        '(function() {
		        'var iterator = (function * generator() {
		        '  yield * \"𠮷𠮶\";
		        '}());
		        'var item = iterator.next();
		        'var passed = item.value === \"𠮷\" && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === \"𠮶\" && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield *, generic iterables", tryRunning(
				"
		        '(function() {
		        'var iterator = (function * generator() {
		        '  yield * global.__createIterableObject(5, 6, 7);
		        '}());
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 7 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield *, instances of iterables", tryRunning(
				"
		        '(function() {
		        'var iterator = (function * generator() {
		        '  yield * Object.create(__createIterableObject(5, 6, 7));
		        '}());
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 7 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "yield *, iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = \'\';
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){
		        '  closed += \'a\';
		        '  return {done: true};
		        '}
		        'var gen = (function* generator(){
		        '  try {
		        '    yield *iter;
		        '  } finally {
		        '    closed += \'b\';
		        '  }
		        '})();
		        'gen.next();
		        'gen[\'return\']();
		        'return closed === \'ab\';
		        '})();"
		)),
		\it( "yield *, iterator closing via throw()", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'throw\'] = undefined;
		        'iter[\'return\'] = function(){
		        '  closed = true;
		        '  return {done: true};
		        '}
		        'var gen = (function*(){
		        '  try {
		        '    yield *iter;
		        '  } catch(e){}
		        '})();
		        'gen.next();
		        'gen[\'throw\']();
		        'return closed;
		        '})();"
		)),
		\it( "shorthand generator methods", tryRunning(
				"
		        '(function() {
		        'var o = {
		        '  * generator() {
		        '    yield 5; yield 6;
		        '  },
		        '};
		        'var iterator = o.generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "string-keyed shorthand generator methods", tryRunning(
				"
		        '(function() {
		        'var o = {
		        '  * \"foo bar\"() {
		        '    yield 5; yield 6;
		        '  },
		        '};
		        'var iterator = o[\"foo bar\"]();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "computed shorthand generators", tryRunning(
				"
		        '(function() {
		        'var garply = \"generator\";
		        'var o = {
		        '  * [garply] () {
		        '    yield 5; yield 6;
		        '  },
		        '};
		        'var iterator = o.generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "shorthand generator methods, classes", tryRunning(
				"
		        '(function() {
		        'class C {
		        '  * generator() {
		        '    yield 5; yield 6;
		        '  }
		        '};
		        'var iterator = new C().generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		)),
		\it( "computed shorthand generators, classes", tryRunning(
				"
		        '(function() {
		        'var garply = \"generator\";
		        'class C {
		        '  * [garply] () {
		        '    yield 5; yield 6;
		        '  }
		        '}
		        'var iterator = new C().generator();
		        'var item = iterator.next();
		        'var passed = item.value === 5 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === 6 && item.done === false;
		        'item = iterator.next();
		        'passed    &= item.value === undefined && item.done === true;
		        'return passed;
		        '})();"
		))
	]);
}
test bool typedarrays() {
	return
	describe("typed arrays", [
		\it( "Int8Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Int8Array(buffer);         view[0] = 0x80;
		        'return view[0] === -0x80;
		        '})();"
		)),
		\it( "Uint8Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Uint8Array(buffer);        view[0] = 0x100;
		        'return view[0] === 0;
		        '})();"
		)),
		\it( "Uint8ClampedArray", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Uint8ClampedArray(buffer); view[0] = 0x100;
		        'return view[0] === 0xFF;
		        '})();"
		)),
		\it( "Int16Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Int16Array(buffer);        view[0] = 0x8000;
		        'return view[0] === -0x8000;
		        '})();"
		)),
		\it( "Uint16Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Uint16Array(buffer);       view[0] = 0x10000;
		        'return view[0] === 0;
		        '})();"
		)),
		\it( "Int32Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Int32Array(buffer);        view[0] = 0x80000000;
		        'return view[0] === -0x80000000;
		        '})();"
		)),
		\it( "Uint32Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Uint32Array(buffer);       view[0] = 0x100000000;
		        'return view[0] === 0;
		        '})();"
		)),
		\it( "Float32Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Float32Array(buffer);       view[0] = 0.1;
		        'return view[0] === 0.10000000149011612;
		        '})();"
		)),
		\it( "Float64Array", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new Float64Array(buffer);       view[0] = 0.1;
		        'return view[0] === 0.1;
		        '})();"
		)),
		\it( "DataView (Int8)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setInt8 (0, 0x80);
		        'return view.getInt8(0) === -0x80;
		        '})();"
		)),
		\it( "DataView (Uint8)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setUint8(0, 0x100);
		        'return view.getUint8(0) === 0;
		        '})();"
		)),
		\it( "DataView (Int16)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setInt16(0, 0x8000);
		        'return view.getInt16(0) === -0x8000;
		        '})();"
		)),
		\it( "DataView (Uint16)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setUint16(0, 0x10000);
		        'return view.getUint16(0) === 0;
		        '})();"
		)),
		\it( "DataView (Int32)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setInt32(0, 0x80000000);
		        'return view.getInt32(0) === -0x80000000;
		        '})();"
		)),
		\it( "DataView (Uint32)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setUint32(0, 0x100000000);
		        'return view.getUint32(0) === 0;
		        '})();"
		)),
		\it( "DataView (Float32)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setFloat32(0, 0.1);
		        'return view.getFloat32(0) === 0.10000000149011612;
		        '})();"
		)),
		\it( "DataView (Float64)", tryRunning(
				"
		        '(function() {
		        'var buffer = new ArrayBuffer(64);
		        'var view = new DataView(buffer);
		        'view.setFloat64(0, 0.1);
		        'return view.getFloat64(0) === 0.1;
		        '})();"
		)),
		\it( "%TypedArray%.from", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.from === \"function\" &&
		  '  typeof Uint8Array.from === \"function\" &&
		  '  typeof Uint8ClampedArray.from === \"function\" &&
		  '  typeof Int16Array.from === \"function\" &&
		  '  typeof Uint16Array.from === \"function\" &&
		  '  typeof Int32Array.from === \"function\" &&
		  '  typeof Uint32Array.from === \"function\" &&
		  '  typeof Float32Array.from === \"function\" &&
		  '  typeof Float64Array.from === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.of", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.of === \"function\" &&
		  '  typeof Uint8Array.of === \"function\" &&
		  '  typeof Uint8ClampedArray.of === \"function\" &&
		  '  typeof Int16Array.of === \"function\" &&
		  '  typeof Uint16Array.of === \"function\" &&
		  '  typeof Int32Array.of === \"function\" &&
		  '  typeof Uint32Array.of === \"function\" &&
		  '  typeof Float32Array.of === \"function\" &&
		  '  typeof Float64Array.of === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.subarray", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.subarray === \"function\" &&
		  '  typeof Uint8Array.prototype.subarray === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.subarray === \"function\" &&
		  '  typeof Int16Array.prototype.subarray === \"function\" &&
		  '  typeof Uint16Array.prototype.subarray === \"function\" &&
		  '  typeof Int32Array.prototype.subarray === \"function\" &&
		  '  typeof Uint32Array.prototype.subarray === \"function\" &&
		  '  typeof Float32Array.prototype.subarray === \"function\" &&
		  '  typeof Float64Array.prototype.subarray === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.join", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.join === \"function\" &&
		  '  typeof Uint8Array.prototype.join === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.join === \"function\" &&
		  '  typeof Int16Array.prototype.join === \"function\" &&
		  '  typeof Uint16Array.prototype.join === \"function\" &&
		  '  typeof Int32Array.prototype.join === \"function\" &&
		  '  typeof Uint32Array.prototype.join === \"function\" &&
		  '  typeof Float32Array.prototype.join === \"function\" &&
		  '  typeof Float64Array.prototype.join === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.indexOf", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.indexOf === \"function\" &&
		  '  typeof Uint8Array.prototype.indexOf === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.indexOf === \"function\" &&
		  '  typeof Int16Array.prototype.indexOf === \"function\" &&
		  '  typeof Uint16Array.prototype.indexOf === \"function\" &&
		  '  typeof Int32Array.prototype.indexOf === \"function\" &&
		  '  typeof Uint32Array.prototype.indexOf === \"function\" &&
		  '  typeof Float32Array.prototype.indexOf === \"function\" &&
		  '  typeof Float64Array.prototype.indexOf === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.lastIndexOf", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Uint8Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.lastIndexOf === \"function\" &&
		  '  typeof Int16Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Uint16Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Int32Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Uint32Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Float32Array.prototype.lastIndexOf === \"function\" &&
		  '  typeof Float64Array.prototype.lastIndexOf === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.slice", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.slice === \"function\" &&
		  '  typeof Uint8Array.prototype.slice === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.slice === \"function\" &&
		  '  typeof Int16Array.prototype.slice === \"function\" &&
		  '  typeof Uint16Array.prototype.slice === \"function\" &&
		  '  typeof Int32Array.prototype.slice === \"function\" &&
		  '  typeof Uint32Array.prototype.slice === \"function\" &&
		  '  typeof Float32Array.prototype.slice === \"function\" &&
		  '  typeof Float64Array.prototype.slice === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.every", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.every === \"function\" &&
		  '  typeof Uint8Array.prototype.every === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.every === \"function\" &&
		  '  typeof Int16Array.prototype.every === \"function\" &&
		  '  typeof Uint16Array.prototype.every === \"function\" &&
		  '  typeof Int32Array.prototype.every === \"function\" &&
		  '  typeof Uint32Array.prototype.every === \"function\" &&
		  '  typeof Float32Array.prototype.every === \"function\" &&
		  '  typeof Float64Array.prototype.every === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.filter", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.filter === \"function\" &&
		  '  typeof Uint8Array.prototype.filter === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.filter === \"function\" &&
		  '  typeof Int16Array.prototype.filter === \"function\" &&
		  '  typeof Uint16Array.prototype.filter === \"function\" &&
		  '  typeof Int32Array.prototype.filter === \"function\" &&
		  '  typeof Uint32Array.prototype.filter === \"function\" &&
		  '  typeof Float32Array.prototype.filter === \"function\" &&
		  '  typeof Float64Array.prototype.filter === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.forEach", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.forEach === \"function\" &&
		  '  typeof Uint8Array.prototype.forEach === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.forEach === \"function\" &&
		  '  typeof Int16Array.prototype.forEach === \"function\" &&
		  '  typeof Uint16Array.prototype.forEach === \"function\" &&
		  '  typeof Int32Array.prototype.forEach === \"function\" &&
		  '  typeof Uint32Array.prototype.forEach === \"function\" &&
		  '  typeof Float32Array.prototype.forEach === \"function\" &&
		  '  typeof Float64Array.prototype.forEach === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.map", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.map === \"function\" &&
		  '  typeof Uint8Array.prototype.map === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.map === \"function\" &&
		  '  typeof Int16Array.prototype.map === \"function\" &&
		  '  typeof Uint16Array.prototype.map === \"function\" &&
		  '  typeof Int32Array.prototype.map === \"function\" &&
		  '  typeof Uint32Array.prototype.map === \"function\" &&
		  '  typeof Float32Array.prototype.map === \"function\" &&
		  '  typeof Float64Array.prototype.map === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.reduce", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.reduce === \"function\" &&
		  '  typeof Uint8Array.prototype.reduce === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.reduce === \"function\" &&
		  '  typeof Int16Array.prototype.reduce === \"function\" &&
		  '  typeof Uint16Array.prototype.reduce === \"function\" &&
		  '  typeof Int32Array.prototype.reduce === \"function\" &&
		  '  typeof Uint32Array.prototype.reduce === \"function\" &&
		  '  typeof Float32Array.prototype.reduce === \"function\" &&
		  '  typeof Float64Array.prototype.reduce === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.reduceRight", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.reduceRight === \"function\" &&
		  '  typeof Uint8Array.prototype.reduceRight === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.reduceRight === \"function\" &&
		  '  typeof Int16Array.prototype.reduceRight === \"function\" &&
		  '  typeof Uint16Array.prototype.reduceRight === \"function\" &&
		  '  typeof Int32Array.prototype.reduceRight === \"function\" &&
		  '  typeof Uint32Array.prototype.reduceRight === \"function\" &&
		  '  typeof Float32Array.prototype.reduceRight === \"function\" &&
		  '  typeof Float64Array.prototype.reduceRight === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.reverse", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.reverse === \"function\" &&
		  '  typeof Uint8Array.prototype.reverse === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.reverse === \"function\" &&
		  '  typeof Int16Array.prototype.reverse === \"function\" &&
		  '  typeof Uint16Array.prototype.reverse === \"function\" &&
		  '  typeof Int32Array.prototype.reverse === \"function\" &&
		  '  typeof Uint32Array.prototype.reverse === \"function\" &&
		  '  typeof Float32Array.prototype.reverse === \"function\" &&
		  '  typeof Float64Array.prototype.reverse === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.some", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.some === \"function\" &&
		  '  typeof Uint8Array.prototype.some === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.some === \"function\" &&
		  '  typeof Int16Array.prototype.some === \"function\" &&
		  '  typeof Uint16Array.prototype.some === \"function\" &&
		  '  typeof Int32Array.prototype.some === \"function\" &&
		  '  typeof Uint32Array.prototype.some === \"function\" &&
		  '  typeof Float32Array.prototype.some === \"function\" &&
		  '  typeof Float64Array.prototype.some === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.sort", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.sort === \"function\" &&
		  '  typeof Uint8Array.prototype.sort === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.sort === \"function\" &&
		  '  typeof Int16Array.prototype.sort === \"function\" &&
		  '  typeof Uint16Array.prototype.sort === \"function\" &&
		  '  typeof Int32Array.prototype.sort === \"function\" &&
		  '  typeof Uint32Array.prototype.sort === \"function\" &&
		  '  typeof Float32Array.prototype.sort === \"function\" &&
		  '  typeof Float64Array.prototype.sort === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.copyWithin", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.copyWithin === \"function\" &&
		  '  typeof Uint8Array.prototype.copyWithin === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.copyWithin === \"function\" &&
		  '  typeof Int16Array.prototype.copyWithin === \"function\" &&
		  '  typeof Uint16Array.prototype.copyWithin === \"function\" &&
		  '  typeof Int32Array.prototype.copyWithin === \"function\" &&
		  '  typeof Uint32Array.prototype.copyWithin === \"function\" &&
		  '  typeof Float32Array.prototype.copyWithin === \"function\" &&
		  '  typeof Float64Array.prototype.copyWithin === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.find", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.find === \"function\" &&
		  '  typeof Uint8Array.prototype.find === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.find === \"function\" &&
		  '  typeof Int16Array.prototype.find === \"function\" &&
		  '  typeof Uint16Array.prototype.find === \"function\" &&
		  '  typeof Int32Array.prototype.find === \"function\" &&
		  '  typeof Uint32Array.prototype.find === \"function\" &&
		  '  typeof Float32Array.prototype.find === \"function\" &&
		  '  typeof Float64Array.prototype.find === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.findIndex", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.findIndex === \"function\" &&
		  '  typeof Uint8Array.prototype.findIndex === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.findIndex === \"function\" &&
		  '  typeof Int16Array.prototype.findIndex === \"function\" &&
		  '  typeof Uint16Array.prototype.findIndex === \"function\" &&
		  '  typeof Int32Array.prototype.findIndex === \"function\" &&
		  '  typeof Uint32Array.prototype.findIndex === \"function\" &&
		  '  typeof Float32Array.prototype.findIndex === \"function\" &&
		  '  typeof Float64Array.prototype.findIndex === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.fill", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.fill === \"function\" &&
		  '  typeof Uint8Array.prototype.fill === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.fill === \"function\" &&
		  '  typeof Int16Array.prototype.fill === \"function\" &&
		  '  typeof Uint16Array.prototype.fill === \"function\" &&
		  '  typeof Int32Array.prototype.fill === \"function\" &&
		  '  typeof Uint32Array.prototype.fill === \"function\" &&
		  '  typeof Float32Array.prototype.fill === \"function\" &&
		  '  typeof Float64Array.prototype.fill === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.keys", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.keys === \"function\" &&
		  '  typeof Uint8Array.prototype.keys === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.keys === \"function\" &&
		  '  typeof Int16Array.prototype.keys === \"function\" &&
		  '  typeof Uint16Array.prototype.keys === \"function\" &&
		  '  typeof Int32Array.prototype.keys === \"function\" &&
		  '  typeof Uint32Array.prototype.keys === \"function\" &&
		  '  typeof Float32Array.prototype.keys === \"function\" &&
		  '  typeof Float64Array.prototype.keys === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.values", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.values === \"function\" &&
		  '  typeof Uint8Array.prototype.values === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.values === \"function\" &&
		  '  typeof Int16Array.prototype.values === \"function\" &&
		  '  typeof Uint16Array.prototype.values === \"function\" &&
		  '  typeof Int32Array.prototype.values === \"function\" &&
		  '  typeof Uint32Array.prototype.values === \"function\" &&
		  '  typeof Float32Array.prototype.values === \"function\" &&
		  '  typeof Float64Array.prototype.values === \"function\";
		  '})();"
		)),
		\it( "%TypedArray%.prototype.entries", tryRunning(
				"
		  '(function() {
		  'return typeof Int8Array.prototype.entries === \"function\" &&
		  '  typeof Uint8Array.prototype.entries === \"function\" &&
		  '  typeof Uint8ClampedArray.prototype.entries === \"function\" &&
		  '  typeof Int16Array.prototype.entries === \"function\" &&
		  '  typeof Uint16Array.prototype.entries === \"function\" &&
		  '  typeof Int32Array.prototype.entries === \"function\" &&
		  '  typeof Uint32Array.prototype.entries === \"function\" &&
		  '  typeof Float32Array.prototype.entries === \"function\" &&
		  '  typeof Float64Array.prototype.entries === \"function\";
		  '})();"
		))
	]);
}
test bool Map() {
	return
	describe("Map", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var key = {};
		        'var map = new Map();
		
		        'map.set(key, 123);
		
		        'return map.has(key) && map.get(key) === 123;
		        '})();"
		)),
		\it( "constructor arguments", tryRunning(
				"
		        '(function() {
		        'var key1 = {};
		        'var key2 = {};
		        'var map = new Map([[key1, 123], [key2, 456]]);
		
		        'return map.has(key1) && map.get(key1) === 123 &&
		        '       map.has(key2) && map.get(key2) === 456;
		        '})();"
		)),
		\it( "iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'try {
		        '  new Map(iter);
		        '} catch(e){}
		        'return closed;
		        '})();"
		)),
		\it( "Map.prototype.set returns this", tryRunning(
				"
		        '(function() {
		        'var map = new Map();
		        'return map.set(0, 0) === map;
		        '})();"
		)),
		\it( "-0 key converts to +0", tryRunning(
				"
		        '(function() {
		        'var map = new Map();
		        'map.set(-0, \"foo\");
		        'var k;
		        'map.forEach(function (value, key) {
		        '  k = 1 / key;
		        '});
		        'return k === Infinity && map.get(+0) == \"foo\";
		        '})();"
		)),
		\it( "Map.prototype.size", tryRunning(
				"
		        '(function() {
		        'var key = {};
		        'var map = new Map();
		
		        'map.set(key, 123);
		
		        'return map.size === 1;
		        '})();"
		)),
		\it( "Map.prototype.delete", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.delete === \"function\";
		        '})();"
		)),
		\it( "Map.prototype.clear", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.clear === \"function\";
		        '})();"
		)),
		\it( "Map.prototype.forEach", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.forEach === \"function\";
		        '})();"
		)),
		\it( "Map.prototype.keys", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.keys === \"function\";
		        '})();"
		)),
		\it( "Map.prototype.values", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.values === \"function\";
		        '})();"
		)),
		\it( "Map.prototype.entries", tryRunning(
				"
		        '(function() {
		        'return typeof Map.prototype.entries === \"function\";
		        '})();"
		))
	]);
}
test bool Set() {
	return
	describe("Set", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'var set = new Set();
		
		        'set.add(123);
		        'set.add(123);
		
		        'return set.has(123);
		        '})();"
		)),
		\it( "constructor arguments", tryRunning(
				"
		        '(function() {
		        'var obj1 = {};
		        'var obj2 = {};
		        'var set = new Set([obj1, obj2]);
		
		        'return set.has(obj1) && set.has(obj2);
		        '})();"
		)),
		\it( "iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'var add = Set.prototype.add;
		        'Set.prototype.add = function(){ throw 0 };
		        'try {
		        '  new Set(iter);
		        '} catch(e){}
		        'Set.prototype.add = add;
		        'return closed;
		        '})();"
		)),
		\it( "Set.prototype.add returns this", tryRunning(
				"
		        '(function() {
		        'var set = new Set();
		        'return set.add(0) === set;
		        '})();"
		)),
		\it( "-0 key converts to +0", tryRunning(
				"
		        '(function() {
		        'var set = new Set();
		        'set.add(-0);
		        'var k;
		        'set.forEach(function (value) {
		        '  k = 1 / value;
		        '});
		        'return k === Infinity && set.has(+0);
		        '})();"
		)),
		\it( "Set.prototype.size", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'var set = new Set();
		
		        'set.add(123);
		        'set.add(123);
		        'set.add(456);
		
		        'return set.size === 2;
		        '})();"
		)),
		\it( "Set.prototype.delete", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.delete === \"function\";
		        '})();"
		)),
		\it( "Set.prototype.clear", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.clear === \"function\";
		        '})();"
		)),
		\it( "Set.prototype.forEach", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.forEach === \"function\";
		        '})();"
		)),
		\it( "Set.prototype.keys", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.keys === \"function\";
		        '})();"
		)),
		\it( "Set.prototype.values", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.values === \"function\";
		        '})();"
		)),
		\it( "Set.prototype.entries", tryRunning(
				"
		        '(function() {
		        'return typeof Set.prototype.entries === \"function\";
		        '})();"
		))
	]);
}
test bool WeakMap() {
	return
	describe("WeakMap", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var key = {};
		        'var weakmap = new WeakMap();
		
		        'weakmap.set(key, 123);
		
		        'return weakmap.has(key) && weakmap.get(key) === 123;
		        '})();"
		)),
		\it( "constructor arguments", tryRunning(
				"
		        '(function() {
		        'var key1 = {};
		        'var key2 = {};
		        'var weakmap = new WeakMap([[key1, 123], [key2, 456]]);
		
		        'return weakmap.has(key1) && weakmap.get(key1) === 123 &&
		        '       weakmap.has(key2) && weakmap.get(key2) === 456;
		        '})();"
		)),
		\it( "iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'try {
		        '  new WeakMap(iter);
		        '} catch(e){}
		        'return closed;
		        '})();"
		)),
		\it( "WeakMap.prototype.set returns this", tryRunning(
				"
		        '(function() {
		        'var weakmap = new WeakMap();
		        'var key = {};
		        'return weakmap.set(key, 0) === weakmap;
		        '})();"
		)),
		\it( "WeakMap.prototype.delete", tryRunning(
				"
		        '(function() {
		        'return typeof WeakMap.prototype.delete === \"function\";
		        '})();"
		)),
		\it( "Support frozen objects as keys", tryRunning(
				"
		        '(function() {
		        'var f = Object.freeze({});
		        'var m = new WeakMap;
		        'm.set(f, 42);
		        'return m.get(f) === 42;
		        '})();"
		))
	]);
}
test bool WeakSet() {
	return
	describe("WeakSet", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var obj1 = {};
		        'var weakset = new WeakSet();
		
		        'weakset.add(obj1);
		        'weakset.add(obj1);
		
		        'return weakset.has(obj1);
		        '})();"
		)),
		\it( "constructor arguments", tryRunning(
				"
		        '(function() {
		        'var obj1 = {}, obj2 = {};
		        'var weakset = new WeakSet([obj1, obj2]);
		
		        'return weakset.has(obj1) && weakset.has(obj2);
		        '})();"
		)),
		\it( "iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'try {
		        '  new WeakSet(iter);
		        '} catch(e){}
		        'return closed;
		        '})();"
		)),
		\it( "WeakSet.prototype.add returns this", tryRunning(
				"
		        '(function() {
		        'var weakset = new WeakSet();
		        'var obj = {};
		        'return weakset.add(obj) === weakset;
		        '})();"
		)),
		\it( "WeakSet.prototype.delete", tryRunning(
				"
		        '(function() {
		        'return typeof WeakSet.prototype.delete === \"function\";
		        '})();"
		))
	]);
}
test bool Proxy() {
	return
	describe("Proxy", [
		\it( "\"get\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = { };
		        'var proxy = new Proxy(proxied, {
		        '  get: function (t, k, r) {
		        '    return t === proxied && k === \"foo\" && r === proxy && 5;
		        '  }
		        '});
		        'return proxy.foo === 5;
		        '})();"
		)),
		\it( "\"get\" handler, instances of proxies", tryRunning(
				"
		        '(function() {
		        'var proxied = { };
		        'var proxy = Object.create(new Proxy(proxied, {
		        '  get: function (t, k, r) {
		        '    return t === proxied && k === \"foo\" && r === proxy && 5;
		        '  }
		        '}));
		        'return proxy.foo === 5;
		        '})();"
		)),
		\it( "\"set\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = { };
		        'var passed = false;
		        'var proxy = new Proxy(proxied, {
		        '  set: function (t, k, v, r) {
		        '    passed = t === proxied && k + v === \"foobar\" && r === proxy;
		        '  }
		        '});
		        'proxy.foo = \"bar\";
		        'return passed;
		        '})();"
		)),
		\it( "\"set\" handler, instances of proxies", tryRunning(
				"
		        '(function() {
		        'var proxied = { };
		        'var passed = false;
		        'var proxy = Object.create(new Proxy(proxied, {
		        '  set: function (t, k, v, r) {
		        '    passed = t === proxied && k + v === \"foobar\" && r === proxy;
		        '  }
		        '}));
		        'proxy.foo = \"bar\";
		        'return passed;
		        '})();"
		)),
		\it( "\"has\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        '\"foo\" in new Proxy(proxied, {
		        '  has: function (t, k) {
		        '    passed = t === proxied && k === \"foo\";
		        '  }
		        '});
		        'return passed;
		        '})();"
		)),
		\it( "\"has\" handler, instances of proxies", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        '\"foo\" in Object.create(new Proxy(proxied, {
		        '  has: function (t, k) {
		        '    passed = t === proxied && k === \"foo\";
		        '  }
		        '}));
		        'return passed;
		        '})();"
		)),
		\it( "\"deleteProperty\" handler", tryRunning(
				"
		      '(function() {
		      'var proxied = {};
		      '  var passed = false;
		      '  delete new Proxy(proxied, {
		      '    deleteProperty: function (t, k) {
		      '      passed = t === proxied && k === \"foo\";
		      '    }
		      '  }).foo;
		      '  return passed;
		      '})();"
		)),
		\it( "\"getOwnPropertyDescriptor\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var fakeDesc = { value: \"foo\", configurable: true };
		        'var returnedDesc = Object.getOwnPropertyDescriptor(
		        '  new Proxy(proxied, {
		        '    getOwnPropertyDescriptor: function (t, k) {
		        '      return t === proxied && k === \"foo\" && fakeDesc;
		        '    }
		        '  }),
		        '  \"foo\"
		        ');
		        'return (returnedDesc.value     === fakeDesc.value
		        '  && returnedDesc.configurable === fakeDesc.configurable
		        '  && returnedDesc.writable     === false
		        '  && returnedDesc.enumerable   === false);
		        '})();"
		)),
		\it( "\"defineProperty\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        'Object.defineProperty(
		        '  new Proxy(proxied, {
		        '    defineProperty: function (t, k, d) {
		        '      passed = t === proxied && k === \"foo\" && d.value === 5;
		        '      return true;
		        '    }
		        '  }),
		        '  \"foo\",
		        '  { value: 5, configurable: true }
		        ');
		        'return passed;
		        '})();"
		)),
		\it( "\"getPrototypeOf\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var fakeProto = {};
		        'var proxy = new Proxy(proxied, {
		        '  getPrototypeOf: function (t) {
		        '    return t === proxied && fakeProto;
		        '  }
		        '});
		        'return Object.getPrototypeOf(proxy) === fakeProto;
		        '})();"
		)),
		\it( "\"setPrototypeOf\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var newProto = {};
		        'var passed = false;
		        'Object.setPrototypeOf(
		        '  new Proxy(proxied, {
		        '    setPrototypeOf: function (t, p) {
		        '      passed = t === proxied && p === newProto;
		        '      return true;
		        '    }
		        '  }),
		        '  newProto
		        ');
		        'return passed;
		        '})();"
		)),
		\it( "\"isExtensible\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        'Object.isExtensible(
		        '  new Proxy(proxied, {
		        '    isExtensible: function (t) {
		        '      passed = t === proxied; return true;
		        '    }
		        '  })
		        ');
		        'return passed;
		        '})();"
		)),
		\it( "\"preventExtensions\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        'Object.preventExtensions(
		        '  new Proxy(proxied, {
		        '    preventExtensions: function (t) {
		        '      passed = t === proxied;
		        '      return Object.preventExtensions(proxied);
		        '    }
		        '  })
		        ');
		        'return passed;
		        '})();"
		)),
		\it( "\"enumerate\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        'for (var i in
		        '  new Proxy(proxied, {
		        '    enumerate: function (t) {
		        '      passed = t === proxied;
		        '      return {
		        '        next: function(){ return { done: true, value: null };}
		        '      };
		        '    }
		        '  })
		        ') { }
		        'return passed;
		        '})();"
		)),
		\it( "\"ownKeys\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = {};
		        'var passed = false;
		        'Object.keys(
		        '  new Proxy(proxied, {
		        '    ownKeys: function (t) {
		        '      passed = t === proxied; return [];
		        '    }
		        '  })
		        ');
		        'return passed;
		        '})();"
		)),
		\it( "\"apply\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = function(){};
		        'var passed = false;
		        'var host = {
		        '  method: new Proxy(proxied, {
		        '    apply: function (t, thisArg, args) {
		        '      passed = t === proxied && thisArg === host && args + \"\" === \"foo,bar\";
		        '    }
		        '  })
		        '};
		        'host.method(\"foo\", \"bar\");
		        'return passed;
		        '})();"
		)),
		\it( "\"construct\" handler", tryRunning(
				"
		        '(function() {
		        'var proxied = function(){};
		        'var passed = false;
		        'new new Proxy(proxied, {
		        '  construct: function (t, args) {
		        '    passed = t === proxied && args + \"\" === \"foo,bar\";
		        '    return {};
		        '  }
		        '})(\"foo\",\"bar\");
		        'return passed;
		        '})();"
		)),
		\it( "Proxy.revocable", tryRunning(
				"
		        '(function() {
		        'var obj = Proxy.revocable({}, { get: function() { return 5; } });
		        'var passed = (obj.proxy.foo === 5);
		        'obj.revoke();
		        'try {
		        '  obj.proxy.foo;
		        '} catch(e) {
		        '  passed &= e instanceof TypeError;
		        '}
		        'return passed;
		        '})();"
		)),
		\it( "Array.isArray support", tryRunning(
				"
		        '(function() {
		        'return Array.isArray(new Proxy([], {}));
		        '})();"
		)),
		\it( "JSON.stringify support", tryRunning(
				"
		        '(function() {
		        'return JSON.stringify(new Proxy([\'foo\'], {})) === \'[\"foo\"]\';
		        '})();"
		))
	]);
}
test bool Reflect() {
	return
	describe("Reflect", [
		\it( "Reflect.get", tryRunning(
				"
		        '(function() {
		        'return Reflect.get({ qux: 987 }, \"qux\") === 987;
		        '})();"
		)),
		\it( "Reflect.set", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'Reflect.set(obj, \"quux\", 654);
		        'return obj.quux === 654;
		        '})();"
		)),
		\it( "Reflect.has", tryRunning(
				"
		        '(function() {
		        'return Reflect.has({ qux: 987 }, \"qux\");
		        '})();"
		)),
		\it( "Reflect.deleteProperty", tryRunning(
				"
		        '(function() {
		        'var obj = { bar: 456 };
		        'Reflect.deleteProperty(obj, \"bar\");
		        'return !(\"bar\" in obj);
		        '})();"
		)),
		\it( "Reflect.getOwnPropertyDescriptor", tryRunning(
				"
		        '(function() {
		        'var obj = { baz: 789 };
		        'var desc = Reflect.getOwnPropertyDescriptor(obj, \"baz\");
		        'return desc.value === 789 &&
		        '  desc.configurable && desc.writable && desc.enumerable;
		        '})();"
		)),
		\it( "Reflect.defineProperty", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'Reflect.defineProperty(obj, \"foo\", { value: 123 });
		        'return obj.foo === 123;
		        '})();"
		)),
		\it( "Reflect.getPrototypeOf", tryRunning(
				"
		        '(function() {
		        'return Reflect.getPrototypeOf([]) === Array.prototype;
		        '})();"
		)),
		\it( "Reflect.setPrototypeOf", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'Reflect.setPrototypeOf(obj, Array.prototype);
		        'return obj instanceof Array;
		        '})();"
		)),
		\it( "Reflect.isExtensible", tryRunning(
				"
		        '(function() {
		        'return Reflect.isExtensible({}) &&
		        '  !Reflect.isExtensible(Object.preventExtensions({}));
		        '})();"
		)),
		\it( "Reflect.preventExtensions", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'Reflect.preventExtensions(obj);
		        'return !Object.isExtensible(obj);
		        '})();"
		)),
		\it( "Reflect.enumerate", tryRunning(
				"
		        '(function() {
		        'var obj = { foo: 1, bar: 2 };
		        'var iterator = Reflect.enumerate(obj);
		        'var passed = 1;
		        'if (typeof Symbol === \'function\' && \'iterator\' in Symbol) {
		        '  passed &= Symbol.iterator in iterator;
		        '}
		        'var item = iterator.next();
		        'passed &= item.value === \"foo\" && item.done === false;
		        'item = iterator.next();
		        'passed &= item.value === \"bar\" && item.done === false;
		        'item = iterator.next();
		        'passed &= item.value === undefined && item.done === true;
		        'return passed === 1;
		        '})();"
		)),
		\it( "Reflect.ownKeys", tryRunning(
				"
		        '(function() {
		        'var obj = {
		        '  2:    true,
		        '  0:    true,
		        '  1:    true,
		        '  \' \':  true,
		        '  9:    true,
		        '  D:    true,
		        '  B:    true,
		        '  \'-1\': true,
		        '};
		        'obj.A = true;
		        'obj[3] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, \'4\', { value: true, enumerable: true });
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'return Reflect.ownKeys(obj).join(\'\') === \"012349 DB-1AC\";
		        '})();"
		)),
		\it( "Reflect.ownKeys, symbol order", tryRunning(
				"
		        '(function() {
		        'var sym1 = Symbol(), sym2 = Symbol(), sym3 = Symbol();
		        'var obj = {
		        '  1:    true,
		        '  A:    true,
		        '};
		        'obj.B = true;
		        'obj[sym1] = true;
		        'obj[2] = true;
		        'obj[sym2] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, sym3,{ value: true, enumerable: true });
		        'Object.defineProperty(obj, \'D\', { value: true, enumerable: true });
		        '
		        'var result = Reflect.ownKeys(obj);
		        'var l = result.length;
		        'return result[l-3] === sym1 && result[l-2] === sym2 && result[l-1] === sym3;
		        '})();"
		)),
		\it( "Reflect.apply", tryRunning(
				"
		        '(function() {
		        'return Reflect.apply(Array.prototype.push, [1,2], [3,4,5]) === 5;
		        '})();"
		)),
		\it( "Reflect.construct", tryRunning(
				"
		        '(function() {
		        'return Reflect.construct(function(a, b, c) {
		        '  this.qux = a + b + c;
		        '}, [\"foo\", \"bar\", \"baz\"]).qux === \"foobarbaz\";
		        '})();"
		)),
		\it( "Reflect.construct, new.target", tryRunning(
				"
		        '(function() {
		        'return Reflect.construct(function(a, b, c) {
		        '  if (new.target === Object) {
		        '    this.qux = a + b + c;
		        '  }
		        '}, [\"foo\", \"bar\", \"baz\"], Object).qux === \"foobarbaz\";
		        '})();"
		))
	]);
}
test bool Promise() {
	return
	describe("Promise", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var p1 = new Promise(function(resolve, reject) { resolve(\"foo\"); });
		        'var p2 = new Promise(function(resolve, reject) { reject(\"quux\"); });
		        'var score = 0;
		
		        'function thenFn(result)  { score += (result === \"foo\");  check(); }
		        'function catchFn(result) { score += (result === \"quux\"); check(); }
		        'function shouldNotRun(result)  { score = -Infinity;   }
		
		        'p1.then(thenFn, shouldNotRun);
		        'p2.then(shouldNotRun, catchFn);
		        'p1.catch(shouldNotRun);
		        'p2.catch(catchFn);
		
		        'p1.then(function() {
		        '  // Promise.prototype.then() should return a new Promise
		        '  score += p1.then() !== p1;
		        '  check();
		        '});
		
		        'function check() {
		        '  if (score === 4) asyncTestPassed();
		        '}
		        '})();"
		)),
		\it( "Promise.all", tryRunning(
				"
		        '(function() {
		        'var fulfills = Promise.all([
		        '  new Promise(function(resolve)   { setTimeout(resolve,200,\"foo\"); }),
		        '  new Promise(function(resolve)   { setTimeout(resolve,100,\"bar\"); }),
		        ']);
		        'var rejects = Promise.all([
		        '  new Promise(function(_, reject) { setTimeout(reject, 200,\"baz\"); }),
		        '  new Promise(function(_, reject) { setTimeout(reject, 100,\"qux\"); }),
		        ']);
		        'var score = 0;
		        'fulfills.then(function(result) { score += (result + \"\" === \"foo,bar\"); check(); });
		        'rejects.catch(function(result) { score += (result === \"qux\"); check(); });
		
		        'function check() {
		        '  if (score === 2) asyncTestPassed();
		        '}
		        '})();"
		)),
		\it( "Promise.race", tryRunning(
				"
		        '(function() {
		        'var fulfills = Promise.race([
		        '  new Promise(function(resolve)   { setTimeout(resolve,200,\"foo\"); }),
		        '  new Promise(function(_, reject) { setTimeout(reject, 300,\"bar\"); }),
		        ']);
		        'var rejects = Promise.race([
		        '  new Promise(function(_, reject) { setTimeout(reject, 200,\"baz\"); }),
		        '  new Promise(function(resolve)   { setTimeout(resolve,300,\"qux\"); }),
		        ']);
		        'var score = 0;
		        'fulfills.then(function(result) { score += (result === \"foo\"); check(); });
		        'rejects.catch(function(result) { score += (result === \"baz\"); check(); });
		
		        'function check() {
		        '  if (score === 2) asyncTestPassed();
		        '}
		        '})();"
		))
	]);
}
test bool Symbol() {
	return
	describe("Symbol", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'var object = {};
		        'var symbol = Symbol();
		        'var value = {};
		        'object[symbol] = value;
		        'return object[symbol] === value;
		        '})();"
		)),
		\it( "typeof support", tryRunning(
				"
		        '(function() {
		        'return typeof Symbol() === \"symbol\";
		        '})();"
		)),
		\it( "symbol keys are hidden to pre-ES6 code", tryRunning(
				"
		        '(function() {
		        'var object = {};
		        'var symbol = Symbol();
		        'object[symbol] = 1;
		
		        'for (var x in object){}
		        'var passed = !x;
		
		        'if (Object.keys && Object.getOwnPropertyNames) {
		        '  passed &= Object.keys(object).length === 0
		        '    && Object.getOwnPropertyNames(object).length === 0;
		        '}
		
		        'return passed;
		        '})();"
		)),
		\it( "Object.defineProperty support", tryRunning(
				"
		        '(function() {
		        'var object = {};
		        'var symbol = Symbol();
		        'var value = {};
		
		        'if (Object.defineProperty) {
		        '  Object.defineProperty(object, symbol, { value: value });
		        '  return object[symbol] === value;
		        '}
		
		        'return passed;
		        '})();"
		)),
		\it( "cannot coerce to string or number", tryRunning(
				"
		        '(function() {
		        'var symbol = Symbol();
		
		        'try {
		        '  symbol + \"\";
		        '  return false;
		        '}
		        'catch(e) {}
		
		        'try {
		        '  symbol + 0;
		        '  return false;
		        '} catch(e) {}
		
		        'return true;
		        '})();"
		)),
		\it( "can convert with String()", tryRunning(
				"
		        '(function() {
		        'return String(Symbol(\"foo\")) === \"Symbol(foo)\";
		        '})();"
		)),
		\it( "new Symbol() throws", tryRunning(
				"
		        '(function() {
		        'var symbol = Symbol();
		        'try {
		        '  new Symbol();
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "Object(symbol)", tryRunning(
				"
		        '(function() {
		        'var symbol = Symbol();
		        'var symbolObject = Object(symbol);
		
		        'return typeof symbolObject === \"object\" &&
		        '  symbolObject == symbol &&
		        '  symbolObject !== symbol &&
		        '  symbolObject.valueOf() === symbol;
		        '})();"
		)),
		\it( "global symbol registry", tryRunning(
				"
		        '(function() {
		        'var symbol = Symbol.for(\'foo\');
		        'return Symbol.for(\'foo\') === symbol &&
		        '   Symbol.keyFor(symbol) === \'foo\';
		        '})();"
		))
	]);
}
test bool wellknownsymbols() {
	return
	describe("well-known symbols", [
		\it( "Symbol.hasInstance", tryRunning(
				"
		        '(function() {
		        'var passed = false;
		        'var obj = { foo: true };
		        'var C = function(){};
		        'Object.defineProperty(C, Symbol.hasInstance, {
		        '  value: function(inst) { passed = inst.foo; return false; }
		        '});
		        'obj instanceof C;
		        'return passed;
		        '})();"
		)),
		\it( "Symbol.isConcatSpreadable", tryRunning(
				"
		        '(function() {
		        'var a = [], b = [];
		        'b[Symbol.isConcatSpreadable] = false;
		        'a = a.concat(b);
		        'return a[0] === b;
		        '})();"
		)),
		\it( "Symbol.iterator", tryRunning(
				"
		        '(function() {
		        'var a = 0, b = {};
		        'b[Symbol.iterator] = function() {
		        '  return {
		        '    next: function() {
		        '      return {
		        '        done: a++ === 1,
		        '        value: \"foo\"
		        '      };
		        '    }
		        '  };
		        '};
		        'var c;
		        'for (c of b) {}
		        'return c === \"foo\";
		        '})();"
		)),
		\it( "Symbol.species", tryRunning(
				"
		        '(function() {
		        'return RegExp[Symbol.species] === RegExp
		        '  && Array[Symbol.species] === Array
		        '  && !(Symbol.species in Object);
		        '})();"
		)),
		\it( "Symbol.toPrimitive", tryRunning(
				"
		        '(function() {
		        'var a = {}, b = {}, c = {};
		        'var passed = 0;
		        'a[Symbol.toPrimitive] = function(hint) { passed += hint === \"number\";  return 0; };
		        'b[Symbol.toPrimitive] = function(hint) { passed += hint === \"string\";  return 0; };
		        'c[Symbol.toPrimitive] = function(hint) { passed += hint === \"default\"; return 0; };
		
		        'a \>= 0;
		        'b in {};
		        'c == 0;
		        'return passed === 3;
		        '})();"
		)),
		\it( "Symbol.toStringTag", tryRunning(
				"
		        '(function() {
		        'var a = {};
		        'a[Symbol.toStringTag] = \"foo\";
		        'return (a + \"\") === \"[object foo]\";
		        '})();"
		)),
		\it( "Symbol.unscopables", tryRunning(
				"
		        '(function() {
		        'var a = { foo: 1, bar: 2 };
		        'a[Symbol.unscopables] = { bar: true };
		        'with (a) {
		        '  return foo === 1 && typeof bar === \"undefined\";
		        '}
		        '})();"
		))
	]);
}
test bool Objectstaticmethods() {
	return
	describe("Object static methods", [
		\it( "Object.assign", tryRunning(
				"
		        '(function() {
		        'var o = Object.assign({a:true}, {b:true}, {c:true});
		        'return \"a\" in o && \"b\" in o && \"c\" in o;
		        '})();"
		)),
		\it( "Object.is", tryRunning(
				"
		        '(function() {
		        'return typeof Object.is === \'function\' &&
		        '  Object.is(NaN, NaN) &&
		        ' !Object.is(-0, 0);
		        '})();"
		)),
		\it( "Object.getOwnPropertySymbols", tryRunning(
				"
		        '(function() {
		        'var o = {};
		        'var sym = Symbol(), sym2 = Symbol(), sym3 = Symbol();
		        'o[sym]  = true;
		        'o[sym2] = true;
		        'o[sym3] = true;
		        'var result = Object.getOwnPropertySymbols(o);
		        'return result[0] === sym
		        '  && result[1] === sym2
		        '  && result[2] === sym3;
		        '})();"
		)),
		\it( "Object.setPrototypeOf", tryRunning(
				"
		        '(function() {
		        'return Object.setPrototypeOf({}, Array.prototype) instanceof Array;
		        '})();"
		))
	]);
}
test bool functionnameproperty() {
	return
	describe("function \"name\" property", [
		\it( "function statements", tryRunning(
				"
		        '(function() {
		        'function foo(){};
		        'return foo.name === \'foo\' &&
		        '  (function(){}).name === \'\';
		        '})();"
		)),
		\it( "function expressions", tryRunning(
				"
		        '(function() {
		        'return (function foo(){}).name === \'foo\' &&
		        '  (function(){}).name === \'\';
		        '})();"
		)),
		\it( "new Function", tryRunning(
				"
		        '(function() {
		        'return (new Function).name === \"anonymous\";
		        '})();"
		)),
		\it( "bound functions", tryRunning(
				"
		        '(function() {
		        'function foo() {};
		        'return foo.bind({}).name === \"bound foo\" &&
		        '  (function(){}).bind({}).name === \"bound \";
		        '})();"
		)),
		\it( "variables (function)", tryRunning(
				"
		        '(function() {
		        'var foo = function() {};
		        'var bar = function baz() {};
		        'return foo.name === \"foo\" && bar.name === \"baz\";
		        '})();"
		)),
		\it( "object methods (function)", tryRunning(
				"
		        '(function() {
		        'var o = { foo: function(){}, bar: function baz(){}};
		        'o.qux = function(){};
		        'return o.foo.name === \"foo\" &&
		        '       o.bar.name === \"baz\" &&
		        '       o.qux.name === \"\";
		        '})();"
		)),
		\it( "accessor properties", tryRunning(
				"
		        '(function() {
		        'var o = { get foo(){}, set foo(x){} };
		        'var descriptor = Object.getOwnPropertyDescriptor(o, \"foo\");
		        'return descriptor.get.name === \"get foo\" &&
		        '       descriptor.set.name === \"set foo\";
		        '})();"
		)),
		\it( "shorthand methods", tryRunning(
				"
		        '(function() {
		        'var o = { foo(){} };
		        'return o.foo.name === \"foo\";
		        '})();"
		)),
		\it( "shorthand methods (no lexical binding)", tryRunning(
				"
		        '(function() {
		        'var f = \"foo\";
		        'return ({f() { return f; }}).f() === \"foo\";
		        '})();"
		)),
		\it( "symbol-keyed methods", tryRunning(
				"
		        '(function() {
		        'var sym1 = Symbol(\"foo\");
		        'var sym2 = Symbol();
		        'var o = {
		        '  [sym1]: function(){},
		        '  [sym2]: function(){}
		        '};
		
		        'return o[sym1].name === \"[foo]\" &&
		        '       o[sym2].name === \"\";
		        '})();"
		)),
		\it( "class statements", tryRunning(
				"
		        '(function() {
		        'class foo {};
		        'class bar { static name() {} };
		        'return foo.name === \"foo\" &&
		        '  typeof bar.name === \"function\";
		        '})();"
		)),
		\it( "class expressions", tryRunning(
				"
		        '(function() {
		        'return class foo {}.name === \"foo\" &&
		        '  typeof class bar { static name() {} }.name === \"function\";
		        '})();"
		)),
		\it( "variables (class)", tryRunning(
				"
		        '(function() {
		        'var foo = class {};
		        'var bar = class baz {};
		        'var qux = class { static name() {} };
		        'return foo.name === \"foo\" &&
		        '       bar.name === \"baz\" &&
		        '       typeof qux.name === \"function\";
		        '})();"
		)),
		\it( "object methods (class)", tryRunning(
				"
		        '(function() {
		        'var o = { foo: class {}, bar: class baz {}};
		        'o.qux = class {};
		        'return o.foo.name === \"foo\" &&
		        '       o.bar.name === \"baz\" &&
		        '       o.qux.name === \"\";
		        '})();"
		)),
		\it( "class prototype methods", tryRunning(
				"
		        '(function() {
		        'class C { foo(){} };
		        'return (new C).foo.name === \"foo\";
		        '})();"
		)),
		\it( "class static methods", tryRunning(
				"
		        '(function() {
		        'class C { static foo(){} };
		        'return C.foo.name === \"foo\";
		        '})();"
		)),
		\it( "isn\'t writable, is configurable", tryRunning(
				"
		        '(function() {
		        'var descriptor = Object.getOwnPropertyDescriptor(function f(){},\"name\");
		        'return descriptor.enumerable   === false &&
		        '       descriptor.writable     === false &&
		        '       descriptor.configurable === true;
		        '})();"
		))
	]);
}
test bool Stringstaticmethods() {
	return
	describe("String static methods", [
		\it( "String.raw", tryRunning(
				"
		        '(function() {
		        'return typeof String.raw === \'function\';
		        '})();"
		)),
		\it( "String.fromCodePoint", tryRunning(
				"
		        '(function() {
		        'return typeof String.fromCodePoint === \'function\';
		        '})();"
		))
	]);
}
test bool Stringprototypemethods() {
	return
	describe("String.prototype methods", [
		\it( "String.prototype.codePointAt", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.codePointAt === \'function\';
		        '})();"
		)),
		\it( "String.prototype.normalize", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.normalize === \"function\"
		        '  && \"c\\u0327\\u0301\".normalize(\"NFC\") === \"\\u1e09\"
		        '  && \"\\u1e09\".normalize(\"NFD\") === \"c\\u0327\\u0301\";
		        '})();"
		)),
		\it( "String.prototype.repeat", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.repeat === \'function\'
		        '  && \"foo\".repeat(3) === \"foofoofoo\";
		        '})();"
		)),
		\it( "String.prototype.startsWith", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.startsWith === \'function\'
		        '  && \"foobar\".startsWith(\"foo\");
		        '})();"
		)),
		\it( "String.prototype.endsWith", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.endsWith === \'function\'
		        '  && \"foobar\".endsWith(\"bar\");
		        '})();"
		)),
		\it( "String.prototype.includes", tryRunning(
				"
		        '(function() {
		        'return typeof String.prototype.includes === \'function\'
		        '  && \"foobar\".includes(\"oba\");
		        '})();"
		))
	]);
}
test bool RegExpprototypeproperties() {
	return
	describe("RegExp.prototype properties", [
		\it( "RegExp.prototype.flags", tryRunning(
				"
		        '(function() {
		        'return /./igm.flags === \"gim\" && /./.flags === \"\";
		        '})();"
		)),
		\it( "RegExp.prototype[Symbol.match]", tryRunning(
				"
		        '(function() {
		        'return typeof RegExp.prototype[Symbol.match] === \'function\';
		        '})();"
		)),
		\it( "RegExp.prototype[Symbol.replace]", tryRunning(
				"
		        '(function() {
		        'return typeof RegExp.prototype[Symbol.replace] === \'function\';
		        '})();"
		)),
		\it( "RegExp.prototype[Symbol.split]", tryRunning(
				"
		        '(function() {
		        'return typeof RegExp.prototype[Symbol.split] === \'function\';
		        '})();"
		)),
		\it( "RegExp.prototype[Symbol.search]", tryRunning(
				"
		        '(function() {
		        'return typeof RegExp.prototype[Symbol.search] === \'function\';
		        '})();"
		))
	]);
}
test bool Arraystaticmethods() {
	return
	describe("Array static methods", [
		\it( "Array.from, array-like objects", tryRunning(
				"
		        '(function() {
		        'return Array.from({ 0: \"foo\", 1: \"bar\", length: 2 }) + \'\' === \"foo,bar\";
		        '})();"
		)),
		\it( "Array.from, generic iterables", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'return Array.from(iterable) + \'\' === \"1,2,3\";
		        '})();"
		)),
		\it( "Array.from, instances of generic iterables", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(1, 2, 3);
		        'return Array.from(Object.create(iterable)) + \'\' === \"1,2,3\";
		        '})();"
		)),
		\it( "Array.from map function, array-like objects", tryRunning(
				"
		        '(function() {
		        'return Array.from({ 0: \"foo\", 1: \"bar\", length: 2 }, function(e, i) {
		        '  return e + this.baz + i;
		        '}, { baz: \"d\" }) + \'\' === \"food0,bard1\";
		        '})();"
		)),
		\it( "Array.from map function, generic iterables", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(\"foo\", \"bar\", \"bal\");
		        'return Array.from(iterable, function(e, i) {
		        '  return e + this.baz + i;
		        '}, { baz: \"d\" }) + \'\' === \"food0,bard1,bald2\";
		        '})();"
		)),
		\it( "Array.from map function, instances of iterables", tryRunning(
				"
		        '(function() {
		        'var iterable = global.__createIterableObject(\"foo\", \"bar\", \"bal\");
		        'return Array.from(Object.create(iterable), function(e, i) {
		        '  return e + this.baz + i;
		        '}, { baz: \"d\" }) + \'\' === \"food0,bard1,bald2\";
		        '})();"
		)),
		\it( "Array.from, iterator closing", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; }
		        'try {
		        '  Array.from(iter, function() { throw 42 });
		        '} catch(e){}
		        'return closed;
		        '})();"
		)),
		\it( "Array.of", tryRunning(
				"
		        '(function() {
		        'return typeof Array.of === \'function\' &&
		        '  Array.of(2)[0] === 2;
		        '})();"
		))
	]);
}
test bool Arrayprototypemethods() {
	return
	describe("Array.prototype methods", [
		\it( "Array.prototype.copyWithin", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.copyWithin === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.find", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.find === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.findIndex", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.findIndex === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.fill", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.fill === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.keys", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.keys === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.values", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.values === \'function\';
		        '})();"
		)),
		\it( "Array.prototype.entries", tryRunning(
				"
		        '(function() {
		        'return typeof Array.prototype.entries === \'function\';
		        '})();"
		)),
		\it( "Array.prototype[Symbol.unscopables]", tryRunning(
				"
		        '(function() {
		        'var unscopables = Array.prototype[Symbol.unscopables];
		        'if (!unscopables) {
		        '  return false;
		        '}
		        'var ns = \"find,findIndex,fill,copyWithin,entries,keys,values\".split(\",\");
		        'for (var i = 0; i \< ns.length; i++) {
		        '  if (Array.prototype[ns[i]] && !unscopables[ns[i]]) return false;
		        '}
		        'return true;
		        '})();"
		))
	]);
}
test bool Numberproperties() {
	return
	describe("Number properties", [
		\it( "Number.isFinite", tryRunning(
				"
		        '(function() {
		        'return typeof Number.isFinite === \'function\';
		        '})();"
		)),
		\it( "Number.isInteger", tryRunning(
				"
		        '(function() {
		        'return typeof Number.isInteger === \'function\';
		        '})();"
		)),
		\it( "Number.isSafeInteger", tryRunning(
				"
		        '(function() {
		        'return typeof Number.isSafeInteger === \'function\';
		        '})();"
		)),
		\it( "Number.isNaN", tryRunning(
				"
		        '(function() {
		        'return typeof Number.isNaN === \'function\';
		        '})();"
		)),
		\it( "Number.EPSILON", tryRunning(
				"
		        '(function() {
		        'return typeof Number.EPSILON === \'number\';
		        '})();"
		)),
		\it( "Number.MIN_SAFE_INTEGER", tryRunning(
				"
		        '(function() {
		        'return typeof Number.MIN_SAFE_INTEGER === \'number\';
		        '})();"
		)),
		\it( "Number.MAX_SAFE_INTEGER", tryRunning(
				"
		        '(function() {
		        'return typeof Number.MAX_SAFE_INTEGER === \'number\';
		        '})();"
		))
	]);
}
test bool Mathmethods() {
	return
	describe("Math methods", [
		\it( "Math.clz32", tryRunning(
				"
		  '(function() {
		  'return typeof Math.clz32 === \"function\";
		  '})();"
		)),
		\it( "Math.imul", tryRunning(
				"
		  '(function() {
		  'return typeof Math.imul === \"function\";
		  '})();"
		)),
		\it( "Math.sign", tryRunning(
				"
		  '(function() {
		  'return typeof Math.sign === \"function\";
		  '})();"
		)),
		\it( "Math.log10", tryRunning(
				"
		  '(function() {
		  'return typeof Math.log10 === \"function\";
		  '})();"
		)),
		\it( "Math.log2", tryRunning(
				"
		  '(function() {
		  'return typeof Math.log2 === \"function\";
		  '})();"
		)),
		\it( "Math.log1p", tryRunning(
				"
		  '(function() {
		  'return typeof Math.log1p === \"function\";
		  '})();"
		)),
		\it( "Math.expm1", tryRunning(
				"
		  '(function() {
		  'return typeof Math.expm1 === \"function\";
		  '})();"
		)),
		\it( "Math.cosh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.cosh === \"function\";
		  '})();"
		)),
		\it( "Math.sinh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.sinh === \"function\";
		  '})();"
		)),
		\it( "Math.tanh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.tanh === \"function\";
		  '})();"
		)),
		\it( "Math.acosh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.acosh === \"function\";
		  '})();"
		)),
		\it( "Math.asinh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.asinh === \"function\";
		  '})();"
		)),
		\it( "Math.atanh", tryRunning(
				"
		  '(function() {
		  'return typeof Math.atanh === \"function\";
		  '})();"
		)),
		\it( "Math.trunc", tryRunning(
				"
		  '(function() {
		  'return typeof Math.trunc === \"function\";
		  '})();"
		)),
		\it( "Math.fround", tryRunning(
				"
		  '(function() {
		  'return typeof Math.fround === \"function\";
		  '})();"
		)),
		\it( "Math.cbrt", tryRunning(
				"
		  '(function() {
		  'return typeof Math.cbrt === \"function\";
		  '})();"
		)),
		\it( "Math.hypot", tryRunning(
				"
		        '(function() {
		        'return Math.hypot() === 0 &&
		        '  Math.hypot(1) === 1 &&
		        '  Math.hypot(9, 12, 20) === 25 &&
		        '  Math.hypot(27, 36, 60, 100) === 125;
		        '})();"
		))
	]);
}
test bool Arrayissubclassable() {
	return
	describe("Array is subclassable", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'class C extends Array {}
		        'var c = new C();
		        'var len1 = c.length;
		        'c[2] = \'foo\';
		        'var len2 = c.length;
		        'c.length = 1;
		        'return len1 === 0 && len2 === 3 && c.length === 1 && !(2 in c);
		        '})();"
		)),
		\it( "Array.prototype.slice", tryRunning(
				"
		        '(function() {
		        'class C extends Array {}
		        'var c = new C();
		        'c.push(2,4,6);
		        'return c.slice(1,2) instanceof C;
		        '})();"
		)),
		\it( "Array.from", tryRunning(
				"
		        '(function() {
		        'class C extends Array {}
		        'return C.from({ length: 0 }) instanceof C;
		        '})();"
		)),
		\it( "Array.of", tryRunning(
				"
		        '(function() {
		        'class C extends Array {}
		        'return C.of(0) instanceof C;
		        '})();"
		))
	]);
}
test bool RegExpissubclassable() {
	return
	describe("RegExp is subclassable", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'class R extends RegExp {}
		        'var r = new R(\"baz\",\"g\");
		        'return r.global && r.source === \"baz\";
		        '})();"
		)),
		\it( "RegExp.prototype.exec", tryRunning(
				"
		        '(function() {
		        'class R extends RegExp {}
		        'var r = new R(\"baz\",\"g\");
		        'return r.exec(\"foobarbaz\")[0] === \"baz\" && r.lastIndex === 9;
		        '})();"
		)),
		\it( "RegExp.prototype.test", tryRunning(
				"
		        '(function() {
		        'class R extends RegExp {}
		        'var r = new R(\"baz\");
		        'return r.test(\"foobarbaz\");
		        '})();"
		))
	]);
}
test bool Functionissubclassable() {
	return
	describe("Function is subclassable", [
		\it( "can be called", tryRunning(
				"
		        '(function() {
		        'class C extends Function {}
		        'var c = new C(\"return \'foo\';\");
		        'return c() === \'foo\';
		        '})();"
		)),
		\it( "can be used with \"new\"", tryRunning(
				"
		        '(function() {
		        'class C extends Function {}
		        'var c = new C(\"this.bar = 2;\");
		        'c.prototype.baz = 3;
		        'return new c().bar === 2 && new c().baz === 3;
		        '})();"
		)),
		\it( "Function.prototype.call", tryRunning(
				"
		        '(function() {
		        'class C extends Function {}
		        'var c = new C(\"x\", \"return this.bar + x;\");
		        'return c.call({bar:1}, 2) === 3;
		        '})();"
		)),
		\it( "Function.prototype.apply", tryRunning(
				"
		        '(function() {
		        'class C extends Function {}
		        'var c = new C(\"x\", \"return this.bar + x;\");
		        'return c.apply({bar:1}, [2]) === 3;
		        '})();"
		)),
		\it( "Function.prototype.bind", tryRunning(
				"
		        '(function() {
		        'class C extends Function {}
		        'var c = new C(\"x\", \"y\", \"return this.bar + x + y;\").bind({bar:1}, 2);
		        'return c(6) === 9 && c instanceof C;
		        '})();"
		))
	]);
}
test bool Promiseissubclassable() {
	return
	describe("Promise is subclassable", [
		\it( "basic functionality", tryRunning(
				"
		        '(function() {
		        'class P extends Promise {}
		        'var p1 = new P(function(resolve, reject) { resolve(\"foo\"); });
		        'var p2 = new P(function(resolve, reject) { reject(\"quux\"); });
		        'var score = +(p1 instanceof P);
		
		        'function thenFn(result)  { score += (result === \"foo\");  check(); }
		        'function catchFn(result) { score += (result === \"quux\"); check(); }
		        'function shouldNotRun(result)  { score = -Infinity;   }
		
		        'p1.then(thenFn, shouldNotRun);
		        'p2.then(shouldNotRun, catchFn);
		        'p1.catch(shouldNotRun);
		        'p2.catch(catchFn);
		
		        'p1.then(function() {
		        '  // P.prototype.then() should return a new P
		        '  score += p1.then() instanceof P && p1.then() !== p1;
		        '  check();
		        '});
		
		        'function check() {
		        '  if (score === 5) asyncTestPassed();
		        '}
		        '})();"
		)),
		\it( "Promise.all", tryRunning(
				"
		        '(function() {
		        'class P extends Promise {}
		        'var fulfills = P.all([
		        '  new Promise(function(resolve)   { setTimeout(resolve,200,\"foo\"); }),
		        '  new Promise(function(resolve)   { setTimeout(resolve,100,\"bar\"); }),
		        ']);
		        'var rejects = P.all([
		        '  new Promise(function(_, reject) { setTimeout(reject, 200,\"baz\"); }),
		        '  new Promise(function(_, reject) { setTimeout(reject, 100,\"qux\"); }),
		        ']);
		        'var score = +(fulfills instanceof P);
		        'fulfills.then(function(result) { score += (result + \"\" === \"foo,bar\"); check(); });
		        'rejects.catch(function(result) { score += (result === \"qux\"); check(); });
		
		        'function check() {
		        '  if (score === 3) asyncTestPassed();
		        '}
		        '})();"
		)),
		\it( "Promise.race", tryRunning(
				"
		        '(function() {
		        'class P extends Promise {}
		        'var fulfills = P.race([
		        '  new Promise(function(resolve)   { setTimeout(resolve,200,\"foo\"); }),
		        '  new Promise(function(_, reject) { setTimeout(reject, 300,\"bar\"); }),
		        ']);
		        'var rejects = P.race([
		        '  new Promise(function(_, reject) { setTimeout(reject, 200,\"baz\"); }),
		        '  new Promise(function(resolve)   { setTimeout(resolve,300,\"qux\"); }),
		        ']);
		        'var score = +(fulfills instanceof P);
		        'fulfills.then(function(result) { score += (result === \"foo\"); check(); });
		        'rejects.catch(function(result) { score += (result === \"baz\"); check(); });
		
		        'function check() {
		        '  if (score === 3) asyncTestPassed();
		        '}
		        '})();"
		))
	]);
}
test bool miscellaneoussubclassables() {
	return
	describe("miscellaneous subclassables", [
		\it( "Boolean is subclassable", tryRunning(
				"
		        '(function() {
		        'class C extends Boolean {}
		        'var c = new C(true);
		        'return c instanceof Boolean
		        '  && c == true;
		        '})();"
		)),
		\it( "Number is subclassable", tryRunning(
				"
		        '(function() {
		        'class C extends Number {}
		        'var c = new C(6);
		        'return c instanceof Number
		        '  && +c === 6;
		        '})();"
		)),
		\it( "String is subclassable", tryRunning(
				"
		        '(function() {
		        'class C extends String {}
		        'var c = new C(\"golly\");
		        'return c instanceof String
		        '  && c + \'\' === \"golly\"
		        '  && c[0] === \"g\"
		        '  && c.length === 5;
		        '})();"
		)),
		\it( "Map is subclassable", tryRunning(
				"
		        '(function() {
		        'var key = {};
		        'class M extends Map {}
		        'var map = new M();
		
		        'map.set(key, 123);
		
		        'return map.has(key) && map.get(key) === 123;
		        '})();"
		)),
		\it( "Set is subclassable", tryRunning(
				"
		        '(function() {
		        'var obj = {};
		        'class S extends Set {}
		        'var set = new S();
		
		        'set.add(123);
		        'set.add(123);
		
		        'return set.has(123);
		        '})();"
		))
	]);
}
test bool Objectstaticmethodsacceptprimitives() {
	return
	describe("Object static methods accept primitives", [
		\it( "Object.getPrototypeOf", tryRunning(
				"
		        '(function() {
		        'return Object.getPrototypeOf(\'a\').constructor === String;
		        '})();"
		)),
		\it( "Object.getOwnPropertyDescriptor", tryRunning(
				"
		        '(function() {
		        'return Object.getOwnPropertyDescriptor(\'a\', \'foo\') === undefined;
		        '})();"
		)),
		\it( "Object.getOwnPropertyNames", tryRunning(
				"
		        '(function() {
		        'var s = Object.getOwnPropertyNames(\'a\');
		        'return s.length === 2 &&
		        '  ((s[0] === \'length\' && s[1] === \'0\') || (s[0] === \'0\' && s[1] === \'length\'));
		        '})();"
		)),
		\it( "Object.seal", tryRunning(
				"
		        '(function() {
		        'return Object.seal(\'a\') === \'a\';
		        '})();"
		)),
		\it( "Object.freeze", tryRunning(
				"
		        '(function() {
		        'return Object.freeze(\'a\') === \'a\';
		        '})();"
		)),
		\it( "Object.preventExtensions", tryRunning(
				"
		        '(function() {
		        'return Object.preventExtensions(\'a\') === \'a\';
		        '})();"
		)),
		\it( "Object.isSealed", tryRunning(
				"
		        '(function() {
		        'return Object.isSealed(\'a\') === true;
		        '})();"
		)),
		\it( "Object.isFrozen", tryRunning(
				"
		        '(function() {
		        'return Object.isFrozen(\'a\') === true;
		        '})();"
		)),
		\it( "Object.isExtensible", tryRunning(
				"
		        '(function() {
		        'return Object.isExtensible(\'a\') === false;
		        '})();"
		)),
		\it( "Object.keys", tryRunning(
				"
		        '(function() {
		        'var s = Object.keys(\'a\');
		        'return s.length === 1 && s[0] === \'0\';
		        '})();"
		))
	]);
}
test bool ownpropertyorder() {
	return
	describe("own property order", [
		\it( "for..in", tryRunning(
				"
		        '(function() {
		        'var obj = {
		        '  2:    true,
		        '  0:    true,
		        '  1:    true,
		        '  \' \':  true,
		        '  9:    true,
		        '  D:    true,
		        '  B:    true,
		        '  \'-1\': true,
		        '};
		        'obj.A = true;
		        'obj[3] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, \'4\', { value: true, enumerable: true });
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'var result = \'\';
		        'for(var i in obj) {
		        '  result += i;
		        '}
		        'return result === \"012349 DB-1AC\";
		        '})();"
		)),
		\it( "Object.keys", tryRunning(
				"
		        '(function() {
		        'var obj = {
		        '  2:    true,
		        '  0:    true,
		        '  1:    true,
		        '  \' \':  true,
		        '  9:    true,
		        '  D:    true,
		        '  B:    true,
		        '  \'-1\': true,
		        '};
		        'obj.A = true;
		        'obj[3] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, \'4\', { value: true, enumerable: true });
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'return Object.keys(obj).join(\'\') === \"012349 DB-1AC\";
		        '})();"
		)),
		\it( "Object.getOwnPropertyNames", tryRunning(
				"
		        '(function() {
		        'var obj = {
		        '  2:    true,
		        '  0:    true,
		        '  1:    true,
		        '  \' \':  true,
		        '  9:    true,
		        '  D:    true,
		        '  B:    true,
		        '  \'-1\': true,
		        '};
		        'obj.A = true;
		        'obj[3] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, \'4\', { value: true, enumerable: true });
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'return Object.getOwnPropertyNames(obj).join(\'\') === \"012349 DB-1AC\";
		        '})();"
		)),
		\it( "Object.assign", tryRunning(
				"
		        '(function() {
		        'function f(key) {
		        '  return {
		        '    get: function() { result += key; return true; },
		        '    set: Object,
		        '    enumerable: true
		        '  };
		        '};
		        'var result = \'\';
		        'var obj = Object.defineProperties({}, {
		        '  2:    f(2),
		        '  0:    f(0),
		        '  1:    f(1),
		        '  \' \':  f(\' \'),
		        '  9:    f(9),
		        '  D:    f(\'D\'),
		        '  B:    f(\'B\'),
		        '  \'-1\': f(\'-1\'),
		        '});
		        'Object.defineProperty(obj,\'A\',f(\'A\')); 
		        'Object.defineProperty(obj,\'3\',f(\'3\'));
		        'Object.defineProperty(obj,\'C\',f(\'C\')); 
		        'Object.defineProperty(obj,\'4\',f(\'4\'));
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'Object.assign({}, obj);
		        '
		        'return result === \"012349 DB-1AC\";
		        '})();"
		)),
		\it( "JSON.stringify", tryRunning(
				"
		        '(function() {
		        'var obj = {
		        '  2:    true,
		        '  0:    true,
		        '  1:    true,
		        '  \' \':  true,
		        '  9:    true,
		        '  D:    true,
		        '  B:    true,
		        '  \'-1\': true,
		        '};
		        'obj.A = true;
		        'obj[3] = true;
		        'Object.defineProperty(obj, \'C\', { value: true, enumerable: true });
		        'Object.defineProperty(obj, \'4\', { value: true, enumerable: true });
		        'delete obj[2];
		        'obj[2] = true;
		        '
		        'return JSON.stringify(obj) ===
		        '  \'{\"0\":true,\"1\":true,\"2\":true,\"3\":true,\"4\":true,\"9\":true,\" \":true,\"D\":true,\"B\":true,\"-1\":true,\"A\":true,\"C\":true}\';
		        '})();"
		)),
		\it( "JSON.parse", tryRunning(
				"
		        '(function() {
		        'var result = \'\';
		        'JSON.parse(
		        '  \'{\"0\":true,\"1\":true,\"2\":true,\"3\":true,\"4\":true,\"9\":true,\" \":true,\"D\":true,\"B\":true,\"-1\":true,\"A\":true,\"C\":true}\',
		        '  function reviver(k,v) {
		        '    result += k;
		        '    return v;
		        '  }
		        ');
		        'return result === \"012349 DB-1AC\";
		        '})();"
		))
	]);
}
test bool miscellaneous() {
	return
	describe("miscellaneous", [
		\it( "no escaped reserved words as identifiers", tryRunning(
				"
		        '(function() {
		        'var \\u0061;
		        'try {
		        '  eval(\'var v\\\\u0061r\');
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "duplicate property names in strict mode", tryRunning(
				"
		        '(function() {
		        '\'use strict\';
		        'return this === undefined && ({ a:1, a:1 }).a === 1;
		        '})();"
		)),
		\it( "no semicolon needed after do-while", tryRunning(
				"
		        '(function() {
		        'do {} while (false) return true;
		        '})();"
		)),
		\it( "no assignments allowed in for-in head", tryRunning(
				"
		        '(function() {
		        'try {
		        '  eval(\'for (var i = 0 in {}) {}\');
		        '}
		        'catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "accessors aren\'t constructors", tryRunning(
				"
		        '(function() {
		        'try {
		        '  new (Object.getOwnPropertyDescriptor({get a(){}}, \'a\')).get;
		        '} catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "Invalid Date", tryRunning(
				"
		        '(function() {
		        'return new Date(NaN) + \"\" === \"Invalid Date\";
		        '})();"
		)),
		\it( "RegExp constructor can alter flags", tryRunning(
				"
		        '(function() {
		        'return new RegExp(/./im, \"g\").global === true;
		        '})();"
		)),
		\it( "built-in prototypes are not instances", tryRunning(
				"
		        '(function() {
		        'try {
		        '  Boolean.prototype.valueOf(); return false;
		        '} catch(e) {}
		        'try {
		        '  Number.prototype.valueOf(); return false;
		        '} catch(e) {}
		        'try {
		        '  String.prototype.toString(); return false;
		        '} catch(e) {}
		        'try {
		        '  RegExp.prototype.source; return false;
		        '} catch(e) {}
		        'try {
		        '  Date.prototype.valueOf(); return false;
		        '} catch(e) {}
		        'return true;
		        '})();"
		))
	]);
}
test bool hoistedblocklevelfunctiondeclaration() {
	return
	describe("hoisted block-level function declaration", [
		\it( "hoisted block-level function declaration", tryRunning(
				"
		    '(function() {
		    '// Note: only available outside of strict mode.
		    '{ function f() { return 1; } }
		    '  function g() { return 1; }
		    '{ function g() { return 2; } }
		    '{ function h() { return 1; } }
		    '  function h() { return 2; }
		
		    'return f() === 1 && g() === 2 && h() === 1;
		    '})();"
		))
	]);
}
test bool protoinobjectliterals() {
	return
	describe("__proto__ in object literals", [
		\it( "basic support", tryRunning(
				"
		        '(function() {
		        'return { __proto__ : [] } instanceof Array
		        '  && !({ __proto__ : null } instanceof Object);
		        '})();"
		)),
		\it( "multiple __proto__ is an error", tryRunning(
				"
		        '(function() {
		        'try {
		        '  eval(\"({ __proto__ : [], __proto__: {} })\");
		        '}
		        'catch(e) {
		        '  return true;
		        '}
		        '})();"
		)),
		\it( "not a computed property", tryRunning(
				"
		        '(function() {
		        'if (!({ __proto__ : [] } instanceof Array)) {
		        '  return false;
		        '}
		        'var a = \"__proto__\";
		        'return !({ [a] : [] } instanceof Array);
		        '})();"
		)),
		\it( "not a shorthand property", tryRunning(
				"
		        '(function() {
		        'if (!({ __proto__ : [] } instanceof Array)) {
		        '  return false;
		        '}
		        'var __proto__ = [];
		        'return !({ __proto__ } instanceof Array);
		        '})();"
		)),
		\it( "not a shorthand method", tryRunning(
				"
		        '(function() {
		        'if (!({ __proto__ : [] } instanceof Array)) {
		        '  return false;
		        '}
		        'return !({ __proto__(){} } instanceof Function);
		        '})();"
		))
	]);
}
test bool Objectprototypeproto() {
	return
	describe("Object.prototype.__proto__", [
		\it( "get prototype", tryRunning(
				"
		        '(function() {
		        'var A = function(){};
		        'return (new A()).__proto__ === A.prototype;
		        '})();"
		)),
		\it( "set prototype", tryRunning(
				"
		        '(function() {
		        'var o = {};
		        'o.__proto__ = Array.prototype;
		        'return o instanceof Array;
		        '})();"
		)),
		\it( "absent from Object.create(null)", tryRunning(
				"
		        '(function() {
		        'var o = Object.create(null), p = {};
		        'o.__proto__ = p;
		        'return Object.getPrototypeOf(o) !== p;
		        '})();"
		)),
		\it( "present in hasOwnProperty()", tryRunning(
				"
		        '(function() {
		        'return Object.prototype.hasOwnProperty(\'__proto__\');
		        '})();"
		)),
		\it( "correct property descriptor", tryRunning(
				"
		        '(function() {
		        'var desc = Object.getOwnPropertyDescriptor(Object.prototype,\"__proto__\");
		        'var A = function(){};
		
		        'return (desc
		        '  && \"get\" in desc
		        '  && \"set\" in desc
		        '  && desc.configurable
		        '  && !desc.enumerable);
		        '})();"
		)),
		\it( "present in Object.getOwnPropertyNames()", tryRunning(
				"
		        '(function() {
		        'return Object.getOwnPropertyNames(Object.prototype).indexOf(\'__proto__\') \> -1;
		        '})();"
		))
	]);
}
test bool StringprototypeHTMLmethods() {
	return
	describe("String.prototype HTML methods", [
		\it( "existence", tryRunning(
				"
		        '(function() {
		        'var i, names = [\"anchor\", \"big\", \"bold\", \"fixed\", \"fontcolor\", \"fontsize\",
		        '  \"italics\", \"link\", \"small\", \"strike\", \"sub\", \"sup\"];
		        'for (i = 0; i \< names.length; i++) {
		        '  if (typeof String.prototype[names[i]] !== \'function\') {
		        '    return false;
		        '  }
		        '}
		        'return true;
		        '})();"
		)),
		\it( "tags\' names are lowercase", tryRunning(
				"
		        '(function() {
		        'var i, names = [\"anchor\", \"big\", \"bold\", \"fixed\", \"fontcolor\", \"fontsize\",
		        '  \"italics\", \"link\", \"small\", \"strike\", \"sub\", \"sup\"];
		        'for (i = 0; i \< names.length; i++) {
		        '  if (\"\"[names[i]]().toLowerCase() !== \"\"[names[i]]()) {
		        '    return false;
		        '  }
		        '}
		        'return true;
		        '})();"
		)),
		\it( "quotes in arguments are escaped", tryRunning(
				"
		        '(function() {
		        'var i, names = [\"anchor\", \"fontcolor\", \"fontsize\", \"link\"];
		        'for (i = 0; i \< names.length; i++) {
		        '  if (\"\"[names[i]](\'\"\') !== \"\"[names[i]](\'&\' + \'quot;\')) {
		        '    return false;
		        '  }
		        '}
		        'return true;
		        '})();"
		))
	]);
}
test bool RegExpprototypecompile() {
	return
	describe("RegExp.prototype.compile", [
		\it( "RegExp.prototype.compile", tryRunning(
				"
		    '(function() {
		    'return typeof RegExp.prototype.compile === \'function\';
		    '})();"
		))
	]);
}
