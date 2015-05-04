module extensions::class::Test
extend desugar::Visitor;
extend runtime::Visitor;
extend \test::Base;

import extensions::class::Syntax;
import extensions::class::Desugar;

test bool parsingClassDeclarations() {	
	return
	describe( "Class declaration", [

		\it( "can be parsed as expression", tryParsing(
			"f( class Exp { } );"
		)),
	
		\it( "can have a name and empty body", tryParsing("
                class Name { };
		") ),
		
		\it( "can have a name and extend another class", tryParsing("
                class Name extends Parent { };
		") ),
		
		\it( "can have a constructor method", tryParsing("
                class Name { 
                	constructor() {
                		this.constructed = true;
                	}
                };
		") ),
		
		\it( "can have normal methods", tryParsing("
                class Math { 
                	add( x, y ) { return x + y; }
                	
                	subtract( x, y ) { return x - y; }
                };
		") ),
		
		\it( "can have string or numeric method identifiers", tryParsing(
			"class M { 
				\"str\"() { return 10; }
				0() { return 0; }
			}"
		)),
		
		\it( "can have static methods", tryParsing("
                class Math { 
                	static add( x, y ) { return x + y; }
                	
                	static subtract( x, y ) { return x + y; }
                };
		") ),

		\it( "can have calls to super method from constructor", tryParsing("
                class Math extends Something { 
                	constructor() {
                		super();
                	}
                };
		") ),
	
		\it( "can have access to super object", tryParsing("
                class Math extends Something { 
                	update() {
                		super.update();
                	}
                }
		") )
	]);
}

test bool desugaringClassDeclarations() {
	return
	describe( "Class declarations", [
		
		\it("is desugared with an empty body", tryDesugar("class Name { }", [
			
			< "var Name = (function() { function Name() { classCallCheck(this,Name) }; return Name; }", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { _classCallCheck(this,Name); } return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with an empty constructor", tryDesugar("class Name { constructor() {} }", [
			
			< "var Name = (function() { function Name() { \<Statement* _\> } return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { <Statement* _> } return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with an empty constructor", tryDesugar("class Name { \"constructor\"() {} }", [
			
			< "var Name = (function() { function Name() { _classCallCheck(this,Name); \<Statement* _\> } return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { _classCallCheck(this,Name); <Statement* _> } return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with methods", tryDesugar( 
			"class Name { 
			'	constructor() { } 
			'	adder( x, y ) { 
			'		return x + y; 
			'	} 
			'}", [
			
			< "var Name = (function() { function Name() { \<Statement* _\> } Name.prototype.adder = function( x, y ) { return x + y; }; return Name; })();", 
			  bool( pt ) { return /(Statement)`Name.prototype.adder = function( x, y ) { return x + y; };` := pt; } 
			>
			
		]) ),
		
		\it("is desugared with static method(s)", tryDesugar(
			"class Name { 
			'	constructor() { } 
			'	static adder( x, y ) { 
			'		return x + y; 
			'	} 
			'}", [
			
			< "var Name = (function() { function Name() { _classCallCheck(this,Name); } Name.adder = function( x, y ) { return x + y; }; return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { _classCallCheck(this,Name); } Name.adder = function( x, y ) { return x + y; }; return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with super constructor call", tryDesugar(
			"class Name { 
			'	constructor( x ) { 
			'		super( x );
			'	}  
			'}", [
			
			< "var Name = (function() { function Name(x) { _classCallCheck(this,Name); Function.prototype.constructor.call(this,x); } return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name(x) { _classCallCheck(this,Name); Function.prototype.constructor.call(this,x); } return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with super function call", tryDesugar(
			"class Name { 
			'	update() {
			'		super.update();
			'	}  
			'}", [
			
			< "var Name = (function() { function Name() { _classCallCheck(this,Name); } Name.prototype.update = function() { Function.prototype.update.call(this); }; return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { _classCallCheck(this,Name); } Name.prototype.update = function() { Function.prototype.update.call(this); }; return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared as an expression", tryDesugar(
			"f( class Name { constructor() { this.init = true; } } );",
			[<"(function() { function Name() { _classCallCheck(this,Name); this.init = true; } return Name; })()",
			  bool(pt) { return /(Expression)`(function() { function Name() { _classCallCheck(this,Name); this.init = true; } return Name; })()` := pt; }
			  >]
		)),
		
		\it("is desugared with numeric or string method identifiers", tryDesugar(
			"class M {
				\"str\"() { return 10; }
				0() { return 0; }
			}",
			[<"var M = (function() { function M() { _classCallCheck(this,M); } M.prototype[\"str\"] = function() { return 10; }; M.prototype[0] = function() { return 0; }; return M; })();",
			  bool(pt) { return /(Statement)`var M = (function() { function M() { _classCallCheck(this,M); } M.prototype["str"] = function() { return 10; }; M.prototype[0] = function() { return 0; }; return M; })();` := pt; }>]
		)),
		
		\it("is desugared with getter and setter methods", tryDesugar(
			"class M {
				get aap() { return this.aap; }
				set aap(a) { this.aap = a; }
			}",
			[<"var M = (function() { function M() { _classCallCheck(this,M); } _createClass( M, [{ key: \"aap\", get: function() { return this.aap; } }]); _createClass( M, [{ key: \"aap\", set: function( a ) { this.aap = a; } }]); return M; })();",
			  bool(pt) { return /(Statement)`var M = (function() { function M() { _classCallCheck(this,M); } _createClass( M, [{ key: "aap", get: function() { return this.aap; } }]); _createClass( M, [{ key: "aap", set: function( a ) { this.aap = a; } }]); return M; })();` := pt; }>]
		)),
		
		\it("can extend other classes", tryDesugar(
			"class A extend B {
				
			}"
		))
	]);
}
