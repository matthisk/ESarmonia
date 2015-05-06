module \test::compatibility::Spread
extend \test::compatibility::Base;


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