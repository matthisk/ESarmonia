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

private void print( int indent, str s ) = print( left("", indent ) + s );
private void println( int indent, str s ) = println( left("", indent ) + s );

public Expectation expect( &T input, bool(bool i) modifier = id ) {
	
	bool toBe( &T match ) {
		if( modifier( input != match ) ) {
			println(4,"Expected \'<input>\' to be \'<match>\'");	
		}
		
		return ! modifier( input != match );
	}
	
	bool toMatch( str pattern, bool( &T ) matcher ) {
		result = modifier( ! matcher( input ) );
		
		if( result ) {
			s = "<input>";
			
			print(4,"Expected \'<pattern>\' to be matched in: ");
			if( /\n/ := s ) {
				println();
				println(4,s);
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
			println(4,"Expected \'<match>\' to be in \'<input>\'");	
		}
		
		return ! contains( input );
	}
	
	bool toBeLessThan( num i ) {
		if( modifier( input > i ) ) {
			println(4,"Expected \'<input>\', to be less than \'<i>\'");
		}
		
		return ! modifier( input > i );
	}
	
	bool toBeGreaterThan( num i ) {
		if( modifier( input < i ) ) {
			println(4,"Expected \'<input>\', to be greater than \'<i>\'");
		}
		
		return ! modifier( input < i );
	}
	
	bool toThrow() {
		bool call( &R() fun ) {
			thrw = true;
			try fun();
			catch : thrw = false;
			
			if( modifier( thrw ) ) {
				println(4,"Expected \'<fun>\' to throw an exception");
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

public Spec xit( _, _ ) { return () { return true; }; }
public bool xdescribe( _, _ ) { return true; }

public Spec \it( str description, Spec spec ) {
	return bool() { 
		println(2,"<description>");
		return spec();
	};
}

public bool describe( str description, list[Spec] suite ) {
	println( description );
	results = [ spec() | spec <- suite ];
	return ( true | it && x | x <- results );
}
