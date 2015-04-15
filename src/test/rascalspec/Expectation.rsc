module \test::rascalspec::Expectation

import Prelude;

import \test::rascalspec::Util;

public data Expectation
	= expectation(
		bool( &T v) toBe, 
		bool( str, bool( &T ) ) toMatch,
		bool( &Y match ) toContain,
		bool( num i ) toBeLessThan,
		bool( num i ) toBeGreaterThan,
		bool() toThrow,
		
		Expectation( tuple[bool,&T]( &T ) ) toDeepMatch,
		Expectation() not
	);

public bool id( bool i ) = i;
public bool not( bool i ) = !i;

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
	
	Expectation toDeepMatch( tuple[bool,&T]( &T ) matcher ) {
		< success, match > = matcher( input );
		
		if( modifier( ! sucess ) ) {
			println(4,"Expected a match <modifier == not ? "not " : "">to be matched in: <input>");
		}
			
		return expect( match );
	}
	
	Expectation notModifier() { 
		return expect( input, modifier = not ); 
	}

	return expectation(
		toBe, 
		toMatch, 
		toContain, 
		toBeLessThan, 
		toBeGreaterThan,
		toThrow,
		
		toDeepMatch,
		notModifier
	);
}