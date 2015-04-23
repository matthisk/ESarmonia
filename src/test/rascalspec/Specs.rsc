module \test::rascalspec::Specs

import ParseTree;
import Ambiguity;

import \test::rascalspec::RascalSpec;
import \test::rascalspec::Expectation;

Spec parserSpec( type[&T <: Tree] begin, str input ) {
	return bool() {
        parsing = void() { pt = parse( begin, input ); };
        
        res = expect( parsing ).not().toThrow();
        
        if( res ) {
                res = res && expect( diagnose( parse( #start[Source], input ) ) ).toBe([]);
        }
        
        return res;
    };
}