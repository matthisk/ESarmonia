module \test::rascalspec::RascalSpec

import IO;
import List;

import \test::rascalspec::Util;
import \test::rascalspec::Expectation;

public alias Spec = bool();

public Spec xit( _, _ ) = bool() { return true; };
public bool xdescribe( _, _ ) { return true; }

public Spec \it( str description, Spec spec ) {
	return bool() { 
		println(2,"<description>");
		result = spec();
		
		if( result ) { 
			print(2, checkMark ); 
		} else {
			print(2, ballot );
		}
		
		print("\n");
		return result;
	};
}

public bool describe( str description, list[Spec]() suite ) = describe( description, suite() );
public bool describe( str description, list[Spec] suite ) 
	= ( true | it && x | x <- results )
	when
		_ := printlnExp( description ),
		list[bool] results := [ spec() | spec <- suite ],
		int fails := size([ r | r <- results, !r ]),
		int success := size([ r | r <- results, r ]),
		_ := printlnExp( "<fails> failed, <success> succeeded" );