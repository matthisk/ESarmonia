module \test::RascalSpec

import Prelude;

public alias Spec = bool();
public alias Expectation = tuple[ 
	bool( &T v) toBe, 
	bool( str, bool( &T ) ) toMatch,
	bool( &Y match ) toContain,
	bool( num i ) toBeLessThan,
	bool( num i ) toBeGreaterThan,
	bool() toThrow
];

public bool id( bool i ) = i;
public bool not( bool i ) = !i;

private str indentString( int indent, str s ) = intercalate( "\n", mapper( split( "\n", s ), str(str l) { return left( "", indent ) + l; } ) );

private void print( int indent, str s ) = print( indentString( indent, s ) );
private void println( int indent, str s ) = println( indentString( indent, s ) );

private str checkMark = "\u2713";
private str ballot = "\u2717";

public Expectation expect( &T input, bool(bool i) modifier = id ) {
	
	bool toBe( &T match ) {
		if( modifier( input != match ) ) {
			println(4,"Expected \'<input>\' <modifier == not ? "not " : "">to be \'<match>\'");	
		}
		
		return ! modifier( input != match );
	}
	
	bool toMatch( str pattern, bool( &T ) matcher ) {
		result = modifier( ! matcher( input ) );
		
		if( result ) {
			s = "<input>";
			
			print(4,"Expected \'<pattern>\' <modifier == not ? "not " : "">to be matched in: ");
			if( /\n/ := s ) {
				println();
				println(6,s);
			} else {
				println(s);
			}
			
		}
		
		return ! result;
	}
	
	bool toContain( &Y match ) {
		default bool contains( _ ) = false;
		bool contains( list[&Y] l )      { return modifier( !(match in l) ); }
		bool contains( map[&Y,value] m ) { return modifier( !(match in m) ); }
		bool contains( set[&Y] s )       { return modifier( !(match in s) ); }
		bool contains( rel[&Y,value] r ) { return modifier( !(match in r) ); }
		
		if( contains( input ) ) {
			println(4,"Expected \'<match>\' <modifier == not ? "not " : "">to be in \'<input>\'");	
		}
		
		return ! contains( input );
	}
	
	bool toBeLessThan( num i ) {
		if( modifier( input > i ) ) {
			println(4,"Expected \'<input>\', <modifier == not ? "not " : "">to be less than \'<i>\'");
		}
		
		return ! modifier( input > i );
	}
	
	bool toBeGreaterThan( num i ) {
		if( modifier( input < i ) ) {
			println(4,"Expected \'<input>\', <modifier == not ? "not " : "">to be greater than \'<i>\'");
		}
		
		return ! modifier( input < i );
	}
	
	bool toThrow() {
		bool call( &R() fun ) {
			thrw = true;
			try fun();
			catch exception: {
				thrw = false;
				println(4,"<exception>");
			}
			
			if( modifier( thrw ) ) {
				println(4,"Expected \'<fun>\' <modifier == not ? "not " : "">to throw an exception");
			}
			
			return ! modifier( thrw );
		}
		
		return call( input ); 
	}
	
	return < 
		toBe, 
		toMatch, 
		toContain, 
		toBeLessThan, 
		toBeGreaterThan,
		toThrow
	>;
}

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

public bool describe( str description, list[Spec] suite ) {
	println( description );
	results = [ spec() | spec <- suite ];
	fails = size([ r | r <- results, !r ]);
	success = size([ r | r <- results, r ]);
	println( "<fails> failed, <success> succeeded" );
	return ( true | it && x | x <- results );
}
