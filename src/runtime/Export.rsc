module runtime::Export

import extensions::classes::Runtime;
import extensions::destructuring::Runtime;
import extensions::object::Runtime;
import extensions::spread::Runtime;
import extensions::template::Runtime;

import IO;

void exportRuntime(loc l = |project://rascal-sweetjs/src/runtime/runtime.js|) {
	str src = "<_classCallCheck>
			  '<_inherits>
			  '<_get>
			  '<_createClass>
			  '<_slicedToArray>
			  '<_toArray>
			  '<_defineProperty>
			  '<_toConsumableArray>
			  '<_taggedTemplateLiteral>
			  'function __createIterableObject(a, b, c) {if (typeof Symbol === \"function\" && Symbol.iterator) {var arr = [a, b, c,,]; var iterable = {next: function() {return { value: arr.shift(), done: arr.length \<= 0 };},}; iterable[Symbol.iterator] = function(){ return iterable; }; return iterable; } else {return eval(\"(function*() { yield a; yield b; yield c; }())\");}}
			  'var global = { __createIterableObject : __createIterableObject }; ";
						 
	writeFile( l, src );
}