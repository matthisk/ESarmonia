module \test::compatibility::ObjectLiteral
extend \test::compatibility::Base;


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