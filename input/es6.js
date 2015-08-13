// <<<==== ARROW FUNCTIONS ====>>> //

var myFunc = (function(_this,_arguments) { 
		return function(_this) { 
		return _this + ((function(_this,_arguments) { 
		return function(_this_0) { 
		return _this; 
		}; 
})(this,arguments)); 
		}; 
})(this,undefined);


var noot = "noot";
var str = "aap " + (noot) + "";

// Expression bodies
var odds = evens.map((function(_this,_arguments) { 
		return function(v) { 
		return v + 1; 
		}; 
})(this,undefined));
var nums = evens.map((function(_this,_arguments) { 
		return function(v, i) { 
		return v + i; 
		}; 
})(this,undefined));
var pairs = evens.map((function(_this,_arguments) { 
		return function(v) { 
		return ({ even: v, odd: v + 1 }); 
		}; 
})(this,undefined));

// Statement bodies
nums.forEach((function(_this,_arguments) { 
		return function(v) { 
		if (v % 5 === 0)
    fives.push(v);
 
		}; 
})(this,undefined));

// Lexical this
var bob = { _name: "Bob", _friends: [], printFriends : function() { this._friends.forEach((function(_this,_arguments) { 
		return function(f) { 
		return console.log(_this._name + " knows " + f); 
		}; 
})(this,arguments)); } };

// <<<==== CLASSES ====>>>> //
var SkinnedMesh = (function(_ref) { 
	var SkinnedMesh_0 = function (geometry, materials) { 
	_classCallCheck(this,SkinnedMesh); 
	_ref.prototype.constructor.call(this,geometry, materials);

    this.idMatrix = SkinnedMesh.defaultMatrix();
    this.bones = [];
    this.boneMatrices = []; 
}; 
	
	_inherits(SkinnedMesh,_ref); 
	
	_createClass(SkinnedMesh, [{ key: "update", value: function(camera) {
		_ref.prototype.update.call(this);
	} },{ key: "boneCount", get: function() {
		return this.bones.length;
	} },{ key: "matrixType", set: function(matrixType) {
		this.idMatrix = SkinnedMesh[matrixType]();
	} }], [{ key: "defaultMatrix", value: function() {
		return new THREE.Matrix4();
	} }]); 
	
	return SkinnedMesh; 
})(THREE.Mesh);

/*
 * <<<=== ENHANCED OBJECT LITERALS ====>>>
 */
var obj = _defineProperty({ __proto__: theProtoObj, handler : handler, toString : function() { return "d " + super.toString(); } }, 'prop_' + ((function(_this,_arguments) { 
		return function() { 
		return 42; 
		}; 
})(this,undefined))(), 42);

/*
 * <<<=== DESTRUCTURING ====>>>
 */
// list matching
{
var _ref = [1,2,3]; 
var a = _ref[0]; 
var c = _ref[1]; 
var b = _ref[2];
}

// object matching
{
var _ref$0 = getASTNode(); 
var a = _ref$0.op; 
var lhs = _ref$0.lhs; 
var b = lhs.op; 
var c = _ref$0.rhs;
}

// object matching shorthand
// binds `op`, `lhs` and `rhs` in scope
{
var _ref$1 = getASTNode(); 
var op = _ref$1.op; 
var lhs = _ref$1.lhs; 
var rhs = _ref$1.rhs;
}

// Can be used in parameter position
var g_0 = function (_arg, _arg0) { 
	var x = _arg.name; 
console.log(x); 
};
g({ name: 5 });

// Fail-soft destructuring
{
var _ref$2 = []; 
var a = _ref$2[0];
}

a === undefined;

// Fail-soft destructuring with defaults
{
var _ref$3 = []; 
var a = _ref$3[0] === undefined ? 1 : _ref$3[0];
}
a === 1;

/*
 * <<<=== Defaul + Rest + Spread ====>>>
 */
var f_0 = function (x, y) { 
	var y = arguments[1] === undefined ? 12 : arguments[1]; 
return x + y; 
};
f(3) == 15;

function f1( x ) { 
	for( var _len = arguments.length, y = Array( _len > 1 ? _len - 1 : 0 ), _key = 1; _key < _len; _key++) { 
	y[_key - 1] = arguments[_key]; 
} 
return x * y.length; 
}
f(3, "hello", true) == 6;

function f2(x, y, z) {
  return x + y + z;
}
// Pass each elem of array as argument
f.apply(undefined,[1,2,3]) == 6;

/*
 * <<<=== For of ====>>>
 */

var fibonacci = _defineProperty({}, Symbol.iterator, function() { var pre = 0, cur = 1;
    return { next : function() { ((function(_this,_arguments) { 
		return function(_ref$4) { 
		return ((function(_this,_arguments) { 
		return function() { 
		var result = pre = _ref$4[0]; 
_ref$4 = [cur, pre + cur]; 
cur = _ref$4[1]; 
return result; 
		}; 
})(this,arguments))(); 
		}; 
})(this,arguments))();
        return { done: false, value: cur }; } }; });

{
var _iteratorNormalCompletion = true, _didIteratorError = false, _iteratorError = undefined;
try { 
	for(var _iterator = fibonacci[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true ) { var n = _step.value; if (n > 1000)
    break;
  console.log(n); } 
} catch(err) { 
	_didIteratorError = true; _iteratorError = err; 
} finally { 
	try { if(!_iteratorNormalCompletion && _iterator["return"]) { _iterator["return"](); } } finally { if(_didIteratorError) { throw _iteratorError; } } 
}
}

/*
 * <<<=== Template Strings ===>>>
 */
 
var template = "this is " + (alsdf) + " a string";

var string = "aap";