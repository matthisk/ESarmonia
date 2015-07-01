/*
 * Test: temporal dead zone
 */
function() {
    var passed = (function(){ try { qux; } catch(e) { return true; }}());
    var qux = 456;
    return passed;
}

function(x,y) {
	x;
	this.x;
	y.x;
	
}


var obj = { x : 0, m : function() { return; } };

var Aap = (function(_A) { function Aap() { _classCallCheck(this,Aap); _A.prototype.constructor.call(this); } _inherits(Aap,_A); Aap.prototype.update = function() { for( var _len = arguments.length, args = Array( _len > 1 ? _len - 1 : 0 ), _key = 0; _key < _len; _key++) { 
	args[_key - 1] = arguments[_key]; 
} (_ref = _A.prototype.update).apply(_ref,_toConsumableArray(args)); }; return Aap; })(A);

var f_0 = function () {  };
{
	var f_1 = function () {  };
}