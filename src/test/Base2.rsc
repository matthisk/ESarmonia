module \test::Base2

import IO;
import ParseTree;
import \test::RascalSpec;

bool and( list[bool] l ) = ( true | it && elm | elm <- l );

Spec tryParsing( str input ) {
	return bool() {
		parsing = void() { parse( #start[Source], input ); };
		return expect( parsing, modifier=not ).toThrow();
	};
}

Spec tryDesugar( str input, list[tuple[str, bool(start[Source])]] fs ) {
	pt = desugar( parse( #start[Source], input ) );
	
	return bool() {
		return and([ expect( pt ).toMatch(s, f) | <s,f> <- fs ]);
	};
}