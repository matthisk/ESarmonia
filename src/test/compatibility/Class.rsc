module \test::compatibility::Class
extend \test::compatibility::Base;

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
		        '  };
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
		        'var m = C.method;
		        'return m();
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