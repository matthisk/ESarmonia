module extensions::class::Test
extend desugar::Visitor;
extend \test::Base;

import extensions::class::Syntax;
import extensions::class::Desugar;

test bool parsingClassDeclarations() {	
	return
	describe( "Class declaration", [
	
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
		
		\it("is desugared with methods", tryDesugar( 
			"class Name { 
			'	constructor() { } 
			'	adder( x, y ) { 
			'		return x + y; 
			'	} 
			'}", [
			
			< "var Name = (function() { function Name() { \<Statement* _\> } Name.prototype.adder = function( x, y ) { return x + y; }; return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { <Statement* _> } Name.prototype.adder = function( x, y ) { return x + y; }; return Name; })();` := pt; } 
			>
			
		]) ),
		
		\it("is desugared with static method(s)", tryDesugar(
			"class Name { 
			'	constructor() { } 
			'	static adder( x, y ) { 
			'		return x + y; 
			'	} 
			'}", [
			
			< "/(Statement)`var Name = (function() { function Name() { \<Statement* _\> } Name.prototype.adder = function( x, y ) { return x + y; }; return Name; })();` := pt;", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name() { <Statement* _> } Name.adder = function( x, y ) { return x + y; }; return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with super constructor call", tryDesugar(
			"class Name { 
			'	constructor( x ) { 
			'		super( x );
			'	}  
			'}", [
			
			< "var Name = (function() { function Name(x) { \<Statement* _\> _get(Object.getPrototypeOf(Name.prototype), \"constructor\", this).call(this, x); \<Statement* _\> } return Name; })();", 
			  bool( pt ) { return /(Statement)`var Name = (function() { function Name(x) { <Statement* _> _get(Object.getPrototypeOf(Name.prototype), "constructor", this).call(this, x); <Statement* _> } return Name; })();` := pt; } >
			
		]) ),
		
		\it("is desugared with super function call", tryDesugar(
			"class Name { 
			'	update() {
			'		super.update();
			'	}  
			'}", [
			
			< "Name.prototype.update = function() { _get(Object.getPrototypeOf(Name.prototype), \"update\", this).call(this); };", 
			  bool( pt ) { return /(Statement)`Name.prototype.update = function() { _get(Object.getPrototypeOf(Name.prototype), "update", this).call(this); };` := pt; } >
			
		]) )
		
	]);
}