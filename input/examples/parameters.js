var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })(); var _defineProperty = function(obj, key, value) { return Object.defineProperty(obj, key, { value: value, enumerable: key == null || typeof Symbol == undefined || key.constructor !== Symbol, configurable: true, writable: true }); }; var _inherits = function (subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) subClass.__proto__ = superClass; }; var _classCallCheck = function (instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }; var _iteratorError = undefined, _iteratorNormalCompletion = true, _didIteratorError = false; var myFunc = (function(_this,_arguments) { 
		return function(_this) { 
		return _this + ((function(_this,_arguments) { 
		return function(_this$0) { 
		return _this; 
		}; 
})(this,arguments)); 
		}; 
})(undefined,undefined);

var str = "aap " + noot + "";

// Expression bodies
var odds = evens.map((function(_this,_arguments) { 
		return function(v) { 
		return v + 1; 
		}; 
})(undefined,undefined));
var nums = evens.map((function(_this,_arguments) { 
		return function(v, i) { 
		return v + i; 
		}; 
})(undefined,undefined));
var pairs = evens.map((function(_this,_arguments) { 
		return function(v) { 
		return ({even: v, odd: v + 1}); 
		}; 
})(undefined,undefined));

// Statement bodies
nums.forEach((function(_this,_arguments) { 
		return function(v) { 
		if (v % 5 === 0)
    fives.push(v);
 
		}; 
})(undefined,undefined));

// Lexical this
var bob = { _name: "Bob",
  _friends: [], printFriends : function() { this._friends.forEach((function(_this,_arguments) { 
		return function(f) { 
		return console.log(_this._name + " knows " + f); 
		}; 
})(this,arguments)); } };

// <<<==== CLASSES ====>>>> //
var SkinnedMesh = (function(_ref) { function SkinnedMesh(geometry, materials) { _classCallCheck(this,SkinnedMesh); _ref.prototype.constructor.call(this,geometry, materials);

    this.idMatrix = SkinnedMesh.defaultMatrix();
    this.bones = [];
    this.boneMatrices = []; } _inherits(SkinnedMesh,_ref); SkinnedMesh.prototype.update = function(camera) { _ref.prototype.update.call(this); }; _createClass( SkinnedMesh, [{ key: "boneCount", get: function() { return this.bones.length; } }]); _createClass( SkinnedMesh, [{ key: "matrixType", set: function(matrixType) { this.idMatrix = SkinnedMesh[matrixType](); } }]); SkinnedMesh.defaultMatrix = function() { return new THREE.Matrix4(); }; return SkinnedMesh; })(THREE.Mesh);

/*
 * <<<=== ENHANCED OBJECT LITERALS ====>>>
 */
var obj = _defineProperty({ __proto__: theProtoObj, handler : handler, toString : function() { return "d " + super.toString(); } }, 'prop_' + ((function(_this,_arguments) { 
		return function() { 
		return 42; 
		}; 
})(undefined,undefined))(), 42);

/*
 * <<<=== DESTRUCTURING ====>>>
 */
// list matching
{ var _ref = [1,2,3]; var a = _ref[0]; var c = _ref[1]; var b = _ref[2]; }

// object matching
{ var _ref = getASTNode(); var a = _ref.op; var lhs = _ref.lhs; var b = lhs.op; var c = _ref.rhs; }

// object matching shorthand
// binds `op`, `lhs` and `rhs` in scope
{ var _ref = getASTNode(); var op = _ref.op; var lhs = _ref.lhs; var rhs = _ref.rhs; }

// Can be used in parameter position
function g( _arg0, _arg0$0 ) { var x = _arg0.name; console.log(x); }
g({name: 5});

// Fail-soft destructuring
{ var _ref = []; var a = _ref[0]; }

a === undefined;

// Fail-soft destructuring with defaults
{ var _ref = []; var a = _ref[0] === undefined ? 1 : _ref[0]; }
a === 1;

/*
 * <<<=== Defaul + Rest + Spread ====>>>
 */
function f(x, y) { var y = arguments[1] === undefined ? 12 : arguments[1]; return x + y; }
f(3) == 15;

function f( x ) { for( var _len = arguments.length, y = Array( _len > 1 ? _len - 1 : 0 ), _key = 1; _key < _len; _key++) { y[_key - 1] = arguments[_key]; } return x * y.length; }
f(3, "hello", true) == 6;

function f(x, y, z) {
  return x + y + z;
}
// Pass each elem of array as argument
f.apply(undefined,[1,2,3]) == 6;

/*
 * <<<=== For of ====>>>
 */

let fibonacci = _defineProperty({  }, Symbol.iterator, function() { let pre$0 = 0, cur$0 = 1;
    return { next : function() { var _ref; [_ref = [cur$0, pre$0 + cur$0], pre = _ref[0], cur = _ref[1] ].shift();
        return { done: false, value: cur$0 }; } }; });

try { for(var _iterator = fibonacci[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true ) { var n = _step.value; if (n > 1000)
    break;
  console.log(n); } } catch(err) { _didIteratorError = true; _iteratorError = err; } finally { try { if(!_iteratorNormalCompletion && _iterator["return"]) { _iterator["return"](); } } finally { if(_didIteratorError) { throw _iteratorError; } } }