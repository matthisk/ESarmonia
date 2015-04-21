module \test::rascalspec::Test

import Prelude;
import \test::rascalspec::RascalSpec;
import \test::rascalspec::Expectation;
import \test::rascalspec::Util;

alias Panda = tuple[ int size, str mood ];

void testSomething() {
	
	describe("Panda", list[Spec]() {
		Panda panda = < 100, "happy" >;
		
		return [
		\it( "is happy", bool() {
			return expect( panda.mood ).toBe( "happy" );
		}),

		\it( "is big", bool() {
			return expect( panda.size ).toBe( 100 );
		})];
	});
	
	describe("Included matchers:", list[Spec]() {
		message = "foo bar baz";
		
		return [
		\it("The \'toMatch\' matcher is for regular expressions", bool() {
			
			return and([
				expect(message).toMatch("/bar/", bool(input) { return /bar/ := input; }),
				expect(message).not().toMatch("bar", bool(input) { return "bar" := input; }),
				expect(message).not().toMatch("/quux/", bool(input) { return /quux/ := input; })
			]);
		}),
		
		\it("The \'toContain\' matcher is for finding an item in a list or key in a map", bool() {
			l = ["foo", "bar", "baz"];
			m = ( "foo" : "bar" );
			s = {"foo", "bar", "baz" };
			r = {<"foo","bar">};
		
			return and([	
				expect( l ).toContain( "foo" ),
				expect( m ).toContain( "foo" ),
				expect( s ).toContain( "foo" ),
				expect( r ).toContain( <"foo","bar"> )
			]);
		}),
		
		\it("The \'toBeLessThan\' matcher is for mathematical comparisons", bool() { 
			pi = 3.1415926;
			e = 2.78;
			
			return and([
				expect( e ).toBeLessThan( pi ),
				expect( pi ).not().toBeLessThan( e )
			]);			
		}),
		
		\it("The \'toBeGreaterThan\' matcher is for mathematical comparisons", bool() {
			pi = 3.1415926;
			e = 2.78;
			
			return and([	
				expect( pi ).toBeGreaterThan( e ),
				expect( e ).not().toBeGreaterThan( pi )
			]);
		}),
		
		\it("The \'toThrow\' matcher is for testing if a function throws an exception", bool() {
			int foo(int x, int y) { return x + y; }
			int bar() { return head([]); }
		
			return and([	
				expect( void() { foo(1,1); } ).not().toThrow(),
				expect( bar ).toThrow()
			]);
		}),
		
		\it("The \'toDeepMatch\' matcher is for matching on something and then mathing on the matched result", bool() {
			list[list[int]] xs = [ [1,2,3], [4,5,6] ];
			
			return
			expect( xs ).toDeepMatch( #list[int], deepMatchList ).toBe([1,2,3]);
		}),
		
		\it("The \'toDeepMatch\' matcher is for matching on something and then mathing on the matched result", bool() {
			list[int] xs = [ 1,2,3,4,5,6 ];
			
			return
			expect( xs ).not().toDeepMatch( #list[int], deepMatchList ).toBe([1,2,3]);
		})
		
		];
	});
	
}

default Maybe[list[int]] deepMatchList( _ ) = nothing();
Maybe[list[int]] deepMatchList( [ list[int] x, list[int] y ] ) = just( x );