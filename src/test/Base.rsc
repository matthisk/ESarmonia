module \test::Base

import IO;
import ParseTree;
import Ambiguity;
import \test::rascalspec::RascalSpec;
import \test::rascalspec::Expectation;
import \test::rascalspec::Util;

bool and( list[bool] l ) = ( true | it && elm | elm <- l );

Spec tryParsing( str input ) {
	return bool() {
		parsing = void() { pt = parse( #start[Source], input ); };
		
		res = expect( parsing ).not().toThrow();
		
		if( res ) {
			res = res && expect( diagnose( parse( #start[Source], input ) ) ).toBe([]);
		}
		
		return res;
	};
}

Spec failParsing( str input ) {
	return bool() {
		parsing = void() { parse( #start[Source], input ); };
		return expect( parsing ).toThrow();
	};
}

Spec tryDesugar( str input, list[tuple[str, bool(start[Source])]] fs ) = trySomething( input, fs, start[Source]( pt ) { return runtimeVisitor( desugar( pt ) ); } );
Spec tryRuntime( str input, list[tuple[str, bool(start[Source])]] fs ) = trySomething( input, fs, start[Source]( pt ) { return runtimeVisitor( desugar( pt ) ); } );

private Spec trySomething( str input, list[tuple[str,bool(start[Source])]] fs, start[Source](start[Source]) m ) {
	return bool() {
		try {
			pt = m( parse( #start[Source], input ) );
			println( 6, input );
			result = and([ expect( pt ).toMatch(s, f) | <s,f> <- fs]);
			
			if( ! result && and([ "<pt>" == s | <s,f> <- fs]) ) {
				println( 4, "However all strings of the patterns do match!" );
			}
			return result;
		} catch exception : {
			println( 4, "failed with parse error: <exception>" );
			return false;
		}
	};
}