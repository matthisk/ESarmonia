// <<<==== ARROW FUNCTIONS ====>>> //

var myFunc = _this => _this + (_this => this);


var noot = "noot";
var str = `aap ${ noot }`;

// Expression bodies
var odds = evens.map(v => v + 1);
var nums = evens.map((v, i) => v + i);
var pairs = evens.map(v => ({even: v, odd: v + 1}));

// Statement bodies
nums.forEach(v => {
  if (v % 5 === 0)
    fives.push(v);
});

// Lexical this
var bob = {
  _name: "Bob",
  _friends: [],
  printFriends() {
    this._friends.forEach(f =>
      console.log(this._name + " knows " + f));
  }
};

// <<<==== CLASSES ====>>>> //
class SkinnedMesh extends THREE.Mesh {
  constructor(geometry, materials) {
    super(geometry, materials);

    this.idMatrix = SkinnedMesh.defaultMatrix();
    this.bones = [];
    this.boneMatrices = [];
    //...
  }
  update(camera) {
    //...
    super.update();
  }
  get boneCount() {
    return this.bones.length;
  }
  set matrixType(matrixType) {
    this.idMatrix = SkinnedMesh[matrixType]();
  }
  static defaultMatrix() {
    return new THREE.Matrix4();
  }
}

/*
 * <<<=== ENHANCED OBJECT LITERALS ====>>>
 */
var obj = {
    // __proto__
    __proto__: theProtoObj,
    // Shorthand for ‘handler: handler’
    handler,
    // Methods
    toString() {
     // Super calls
     return "d " + super.toString();
    },
    // Computed (dynamic) property names
    [ 'prop_' + (() => 42)() ]: 42
};

/*
 * <<<=== DESTRUCTURING ====>>>
 */
// list matching
var [a, c, b] = [1,2,3];

// object matching
var { op: a, lhs: { op: b }, rhs: c }
       = getASTNode();

// object matching shorthand
// binds `op`, `lhs` and `rhs` in scope
var {op, lhs, rhs} = getASTNode();

// Can be used in parameter position
function g({name: x}, _arg0 ) {
  console.log(x);
}
g({name: 5});

// Fail-soft destructuring
var [a] = [];

a === undefined;

// Fail-soft destructuring with defaults
var [a = 1] = [];
a === 1;

/*
 * <<<=== Defaul + Rest + Spread ====>>>
 */
function f(x, y=12) {
  // y is 12 if not passed (or passed as undefined)
  return x + y;
}
f(3) == 15;

function f1(x, ...y) {
  // y is an Array
  return x * y.length;
}
f(3, "hello", true) == 6;

function f2(x, y, z) {
  return x + y + z;
}
// Pass each elem of array as argument
f(...[1,2,3]) == 6;

/*
 * <<<=== For of ====>>>
 */

let fibonacci = {
  [Symbol.iterator]() {
    let pre = 0, cur = 1;
    return {
      next() {
        [pre, cur] = [cur, pre + cur];
        return { done: false, value: cur };
      }
    };
  }
};

for (var n of fibonacci) {
  // truncate the sequence at 1000
  if (n > 1000)
    break;
  console.log(n);
}

/*
 * <<<=== Template Strings ===>>>
 */
 
var template = `this is ${alsdf} a string`;

var string = "aap";