module extensions::class::Test
extend desugar::Runner;
extend \test::Base2;

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
		
		//\it("is desugared with an empty body", tryDesugar("class Name { }", [
		//	
		//	< "var Name = function Name() { classCallCheck(this,Name) };", bool( pt ) { return /(Statement)`var Name = function Name() { classCallCheck(this,Name); };` := pt; } >
		//	
		//]) ),
		//
		//\it("is desugared with an empty constructor", tryDesugar("class Name { constructor() {} }", [
		//	
		//	< "", bool( pt ) { return false; } >
		//	
		//]) ),
		//
		//\it("is desugared with methods", tryDesugar(
		//	"class Name { 
		//	'	constructor() { } 
		//	'	adder( x, y ) { 
		//	'		return x + y; 
		//	'	} 
		//	'}", [
		//	
		//	< "", bool( pt ) { return false; } >
		//	
		//]) ),
		//
		//\it("is desugared with static method(s)", tryDesugar(
		//	"class Name { 
		//	'	constructor() { } 
		//	'	static adder( x, y ) { 
		//	'		return x + y; 
		//	'	} 
		//	'}", [
		//	
		//	< "", bool( pt ) { return false; } >
		//	
		//]) ),
		
		\it("is desugared with super constructor call", tryDesugar(
			"class Name { 
			'	constructor( ) { 
			'	}  
			'}", [
			
			< "", bool( pt ) { return false; } >
			
		]) )
		
	]);
}
