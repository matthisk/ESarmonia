function() {
	var foo = 123;
	return (foo == 123);
}

function() {
	var bar = 123;
	{ var bar_0 = 234; }
	return (bar == 123);
}

function() {
	var baz = 0;
	for(var baz = 1; false; false) {}
	return (baz == 0);
}

function() {
	var passed = (function() { try{ qux; } catch(e) { return true; }})();
	var qux = 123;
	return passed;
}

function() {
	var x = 0;
	{ var x = 1; }
}