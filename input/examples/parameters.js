var _classCallCheck = function (instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }; var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })(); function() {
    var C = (function() { 
	function C() { 
	_classCallCheck(this,C); 
} 
	
	_createClass(C, [{ key: "method", value: function() {
		return typeof C === "function";
	} }], []); 
	
	return C; 
})();
    var M = C.prototype.method;
    C = undefined;
    return C === undefined && M();
}

