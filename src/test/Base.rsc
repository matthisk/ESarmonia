module \test::Base

import IO;
import ParseTree;
import \test::rascalspec::RascalSpec;
import \test::rascalspec::Expectation;

bool and( list[bool] l ) = ( true | it && elm | elm <- l );

Spec tryParsing( str input ) {
	return bool() {
		parsing = void() { parse( #start[Source], input ); };
		return expect( parsing ).not().toThrow();
	};
}

Spec tryDesugar( str input, list[tuple[str, bool(start[Source])]] fs ) {
	return bool() {
		pt = desugar( parse( #start[Source], input ) );
		return and([ expect( pt ).toMatch(s, f) | <s,f> <- fs ]);
	};
}