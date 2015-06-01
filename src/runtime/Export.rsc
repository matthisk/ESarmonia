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
			  '<_taggedTemplateLiteral>";
						 
	writeFile( l, src );
}