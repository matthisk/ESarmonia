module extensions::letconst::Test
extend \test::Base;

import extensions::letconst::Resolve;
import extensions::letconst::Desugar;

Spec tryResolve( str input, list[tuple[str, bool(start[Source])]] fs ) = trySomething( input, fs, start[Source]( pt ) { return resolve( pt ); } );

test bool resolving() {
	return describe("Let and const",[
		\it("renames simple case", 
			tryResolve("let x = 0;
					   '{
					   '	let x = 1;
					   '}
					   ",[
			<"let x = 0; { let x_0 = 1; }",bool(pt) { return /(Source)`let x = 0; { let x_0 = 1; }` := pt; }>		   
		])),
		
		\it("renames simple case (and use)", 
			tryResolve("let x = 0;
					   '{
					   '	let x = 1;
					   '	x;
					   '}
					   ",[
			<"let x = 0; { let x_0 = 1; x_0 }",bool(pt) { return /(Source)`let x = 0; { let x_0 = 1; x_0; }` := pt; }>		   
		])),
		
		\it("renames sibling", 
			tryResolve("{
					   '	let x = 0;
					   '}
					   '{
					   '	let x = 1;
					   '}
					   ",[
			<"{ let x_1 = 0; }{ let x_0 = 1; }",bool(pt) { return /(Source)`{ let x_1 = 0; }{ let x_0 = 1; }` := pt; }>		   
		])),
		
		\it("renames inside function", 
			tryResolve("{
					   '	let x = 1;
					   '}
					   '{
					   '	let x = 0;
					   '	function() { return x; }
					   '}
					   ",[
			<"{ let x_1 = 1; }{ let x_0 = 0; function() { return x_0; } }",bool(pt) { return /(Source)`{ let x_1 = 1; }{ let x_0 = 0; function() { return x_0; } }` := pt; }>		   
		])),
		
		\it("doesn\'t rename sibling closure", 
			tryResolve("let x = 0;
					   'function() { let x = 1; }
					   ",[
			<"let x = 0; function() { let x = 1; }",bool(pt) { return /(Source)`let x = 0; function() { let x = 1; }` := pt; }>		   
		])),
		
		\it("renames capturing const declarations", 
			tryResolve("{ let x = 0; }
					   '{ const x = 1; }
					   ",[
			<"{ let x_0 = 0; }{ const x_1 = 1; }",bool(pt) { return /(Source)`{ let x_0 = 0; }{ const x_1 = 1; }` := pt; }>		   
		])),
		
		\it("re-assigning constant", 
			tryResolve("const x = 0;
					   'x = 1;
					   ",[
			<"const x = 0; x = console.error(\<Expression _\>);",bool(pt) { return /(Source)`const x = 0; x = console.error(<Expression _>);` := pt; }>		   
		])),
		
		\it("name clash with var declaration", 
			tryResolve("{ let x = 0; }
					   '{ var x = 1; }
					   ",[
			<"{ let x_0 = 0; }{ var x = 1; }",bool(pt) { return /(Source)`{ let x_0 = 0; }{ var x = 1; }` := pt; }>		   
		])),
		
		\it("name clash with var declaration", 
			tryResolve("{ { let x = 0; } }
					   '{ let x = 1; }
					   'x;
					   ",[
			<"{ { let x_0 = 0; } }{ let x_1 = 1; } x;",bool(pt) { return /(Source)`{ { let x_0 = 0; } }{ let x_1 = 1; } x;` := pt; }>		   
		]))
	]);
}