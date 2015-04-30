module \test::compatibility::Forof
extend \test::compatibility::Base;

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
		        'iter[\'return\'] = function(){ closed = true; return {}; };
		        'for (var it of iter) break;
		        'return closed;
		        '})();"
		)),
		\it( "iterator closing, throw", tryRunning(
				"
		        '(function() {
		        'var closed = false;
		        'var iter = __createIterableObject(1, 2, 3);
		        'iter[\'return\'] = function(){ closed = true; return {}; };
		        'try {
		        '  for (var it of iter) throw 0;
		        '} catch(e){}
		        'return closed;
		        '})();"
		))
	]);
}