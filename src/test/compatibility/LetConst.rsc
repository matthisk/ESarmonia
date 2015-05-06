module \test::compatibility::LetConst
extend \test::compatibility::Base;


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