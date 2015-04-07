module \test::RascalSpec

import Prelude;

public alias Expectation = tuple[ 
	void( &T v) toBe, 
	void( str, bool( &T ) ) toMatch,
	void( &Y match ) toContain,
	void( num i ) toBeLessThan,
	void( num i ) toBeGreaterThan,
	void() toThrow
];

public bool id( bool i ) = i;
public bool not( bool i ) = !i;

private void println( int indent, str s ) = println( left("", indent ) + s );

public Expectation expect( &T input, bool(bool i) modifier = id ) {
	
	void toBe( &T match ) {
		if( modifier( input != match ) ) {
			println(4,"Expected \'<input>\' to be \'<match>\'");	
		}
	}
	
	void toMatch( str pattern, bool( &T ) matcher ) {
		if( modifier( matcher( input ) ) ) {
			println(4,"Expected \'<input>\' to match \'<pattern>\'");
		}
	}
	
	void toContain( &Y match ) {
		default bool contains( _ ) = false;
		bool contains( list[&Y] l )      { return modifier( !(match in l) ); }
		bool contains( map[&Y,value] m ) { return modifier( !(match in m) ); }
		bool contains( set[&Y] s )       { return modifier( !(match in s) ); }
		bool contains( rel[&Y,value] r ) { return modifier( !(match in r) ); }
		
		if( contains( input ) ) {
			println(4,"Expected \'<match>\' to be in \'<input>\'");	
		}
	}
	
	void toBeLessThan( num i ) {
		if( modifier( input > i ) ) {
			println(4,"Expected \'<input>\', to be less than \'<i>\'");
		}
	}
	
	void toBeGreaterThan( num i ) {
		if( modifier( input < i ) ) {
			println(4,"Expected \'<input>\', to be greater than \'<i>\'");
		}
	}
	
	void toThrow() {
		void call( &R() fun ) {
			thrw = false;
			try fun();
			catch : thrw = true;
			
			if( modifier( thrw ) ) {
				println(4,"Expected \'<fun>\' to throw an exception");
			}
		}
		
		call( input ); 
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

public void xit( _, _ ) {}
public void xdescribe( _, _ ) {}

public void \it( str description, void() spec ) {
	println(2,"<description>");
	spec();
}

public void describe( str description, void() suite ) {
	println( description );
	suite();
}
