module \test::compatibility::Util

import \test::rascalspec::Expectation;
import \test::rascalspec::Util;
import ParseTree;
import IO;

import \test::JavaScript;

public int FULL = 0;
public int BASIC = 1;
public int NONE = 2;

str createIterableObject = "var global = { __createIterableObject : __createIterableObject }; function __createIterableObject(a, b, c) {if (typeof Symbol === \"function\" && Symbol.iterator) {var arr = [a, b, c, ,];var iterable = {next: function() {return { value: arr.shift(), done: arr.length \<= 0 };},}; iterable[Symbol.iterator] = function(){ return iterable; }; return iterable; } else {return eval(\"(function*() { yield a; yield b; yield c; }())\");}}";

tuple[bool,str] runNodeProcess( &T <: Tree dpt, int outputFormat = FULL ) {
	result = false;
	eval(createIterableObject);
	output = eval( "<dpt>" );
	
	if( outputFormat == FULL ) {
		result = expect( output ).toBe( "true" );
	
		if( ! result ) { println( 4, "<dpt>" ); }
	} else if( outputFormat == NONE ) {
		result = output == "true";
	}
	
	return <result,"<output>\n<dpt>">;
}