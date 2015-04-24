module extensions::object::Runtime
extend runtime::Base;

public Statement _defineProperty 
	= (Statement)`var _defineProperty = function(obj, key, value) { return Object.defineProperty(obj, key, { value: value, enumerable: key == null || typeof Symbol == undefined || key.constructor !== Symbol, configurable: true, writable: true }); };`;