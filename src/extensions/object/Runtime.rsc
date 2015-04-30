module extensions::object::Runtime

import extensions::object::Syntax;

public Statement _defineProperty 
	= (Statement)`var _defineProperty = function(obj, key, value) { return Object.defineProperty(obj, key, { value: value, enumerable: key == null || typeof Symbol == undefined || key.constructor !== Symbol, configurable: true, writable: true }); };`;