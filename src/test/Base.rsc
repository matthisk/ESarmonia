module \test::Base

import Prelude;
import \test::RascalSpec;

alias Panda = tuple[ int size, str mood ];

void testSomething() {
	
	describe("Panda", void() {
		Panda panda = < 100, "happy" >;
		
		\it( "is happy", void() {
			expect( panda.mood ).toBe( "happy" );
		});

		\it( "is big", void() {
			expect( panda.size ).toBe( 100 );
		});

	});
	
	describe("Included matchers:", void() {
		message = "foo bar baz";
		
		\it("The \'toMatch\' matcher is for regular expressions", void() {
			
			expect(message).toMatch("/bar/", bool(input) { return /bar/ := input; });
			expect(message, modifier=not).toMatch("bar", bool(input) { return "bar" := input; });
			expect(message).toMatch("/quux/", bool(input) { return /quux/ := input; });
		});
		
		\it("The \'toContain\' matcher is for finding an item in a list or key in a map", void() {
			l = ["foo", "bar", "baz"];
			m = ( "foo" : "bar" );
			s = {"foo", "bar", "baz" };
			r = {<"foo","bar">};
			
			expect( l ).toContain( "foo" );
			expect( m ).toContain( "foo" );
			expect( s ).toContain( "foo" );
			expect( r ).toContain( <"foo","bar"> );
		});
		
		\it("The \'toBeLessThan\' matcher is for mathematical comparisons", void() { 
			pi = 3.1415926;
			e = 2.78;
			
			expect( e ).toBeLessThan( pi );
			expect( pi, modifier = not ).toBeLessThan( e );			
		});
		
		\it("The \'toBeGreaterThan\' matcher is for mathematical comparisons", void() {
			pi = 3.1415926;
			e = 2.78;
			
			expect( pi ).toBeGreaterThan( e );
			expect( e, modifier = not ).toBeGreaterThan( pi );
		});
		
		\it("The \'toThrow\' matcher is for testing if a function throws an exception", void() {
			int foo(int x, int y) { return x + y; }
			int bar() { return head([]); }
			
			expect( void() { foo(); }, modifier = not ).toThrow();
			expect( bar ).toThrow();
		});
	});
	
}