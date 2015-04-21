module extensions::object::Runtime
extend runtime::Base;

import extensions::object::Syntax;

Maybe[Statement] runtime( (Expression)`_defineProperty(<Expression obj>, <Expression key>, <Expression val>)` ) 
	= just( (Statement)`var _defineProperty = function(obj, key, value) { return Object.defineProperty(obj, key, { value: value, enumerable: key == null || typeof Symbol == undefined || key.constructor !== Symbol, configurable: true, writable: true }); };` );