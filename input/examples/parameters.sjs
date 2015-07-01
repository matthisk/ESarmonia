/*
 * <<<=== Defaul + Rest + Spread ====>>>
 */
(function() {
	return (function (a = 1, b = 2) { return a === 3 && b === 2; }(3));
})();

function f(x, y=12) {
  // y is 12 if not passed (or passed as undefined)
  return x + y;
}
f(3) == 15;

function f(x, ...y) {
  // y is an Array
  return x * y.length;
}
f(3, "hello", true) == 6;

function f2(x, y, z) {
  return x + y + z;
}
// Pass each elem of array as argument
f(...[1,2,3]) == 6;


function ff() {
    var called = false;
    function fn(parts, a, b) {
      called = true;
      return parts instanceof Array &&
        parts[0]     === "foo"      &&
        parts[1]     === "bar\n"    &&
        parts.raw[0] === "foo"      &&
        parts.raw[1] === "bar\\n"   &&
        a === 123                   &&
        b === 456;
    }
    return fn `foo${123}ba\tr\n${456}` && called;
}