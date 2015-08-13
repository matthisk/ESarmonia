module \test::compatibility::Util

import \test::rascalspec::Expectation;
import \test::rascalspec::Util;
import ParseTree;
import IO;

import util::ShellExec;
import \test::JavaScript;

public int FULL = 0;
public int BASIC = 1;
public int NONE = 2;

str NODEBIN = "/home/heimense/local/bin/node";
str COREJS = "/home/heimense/Thesis/rascal-sweetjs/src/runtime/core.js";

tuple[bool,str] runNashorn( &T <: Tree dpt, int outputFormat = FULL ) {
	result = false;
	output = eval( "<dpt>" );
	
	if( outputFormat == FULL ) {
		result = expect( output ).toBe( "true" );
	
		if( ! result ) { println( 4, "<dpt>" ); }
	} else if( outputFormat == NONE ) {
		result = output == "true";
	}
	
	return <result,"<output>\n<dpt>">;
}

tuple[bool,str] runNodeProcess( &T <: Tree dpt, int outputFormat = FULL ) = runNodeProcess( "<dpt>", outputFormat=outputFormat );
tuple[bool,str] runNodeProcess( str dpt, int outputFormat = FULL ) {
	result = false;
	runtime = "require(\"<COREJS>\");
			  '<readFile(|project://rascal-sweetjs/src/runtime/runtime.js|)>";
	
	nodeP = createProcess( NODEBIN, args=["--use_strict","-p","<runtime> <dpt>"] );
	output = readEntireStream( nodeP );
	err = readEntireErrStream( nodeP );
	killProcess( nodeP );
	
	if( outputFormat == FULL ) {
		result = expect( output ).toBe( "true\n" );
	
		if( ! result ) { println( 4, "<dpt>" ); }
	} else if( outputFormat == NONE ) {
		result = (output == "true\n" || output == "1\n") && err == "";
	}
	
	return <result,"<output>\n<err>\n<dpt>">;
}