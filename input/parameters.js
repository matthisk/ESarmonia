/*
 * <<<=== Defaul + Rest + Spread ====>>>
 */
(function() {
	return (function (a = 1, b = 2) { return a === 3 && b === 2; }(3));
})();

function f ( x, y=12 ) { return x + y; }
f(3) == 15;

function f ( x ) { for( var _len = arguments.length, y = Array( _len > 1 ? _len - 1 : 0 ), _key = 1; _key < _len; _key++) { y[_key - 1] = arguments[_key]; } return x * y.length; }
f(3, "hello", true) == 6;

function f ( x, y, z ) { return x + y + z; }
// Pass each elem of array as argument
f.apply(undefined,[1,2,3]) == 6;
