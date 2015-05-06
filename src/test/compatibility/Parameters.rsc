module \test::compatibility::Parameters
extend \test::compatibility::Base;

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