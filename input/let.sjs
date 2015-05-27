function() {
	let foo = 123;
	return (foo == 123);
}

function() {
	let bar = 123;
	{ let bar = 234; }
	return (bar == 123);
}

function() {
	let baz = 0;
	for(let baz = 1; false; false) {}
	return (baz == 0);
}

function() {
	var passed = (function() { try{ qux; } catch(e) { return true; }})();
	let qux = 123;
	return passed;
}

function() {
	let x = 0;
	{ var x = 1; }
}