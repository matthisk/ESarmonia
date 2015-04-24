module runtime::Visitor

import IO;
import util::Maybe;
import core::Syntax;

start[Source] runtimeVisitor( start[Source] pt ) {
	set[Statement] runtime = {};
	
	visit( pt ) {
		case Expression e : {
			if( e@runtime? ) {
				runtime = runtime + e@runtime;
			}
		}
	}
	
	return fillRuntime( pt, runtime );
}

start[Source] fillRuntime( start[Source] pt, {} ) = pt;
start[Source] fillRuntime( start[Source] pt, { Statement s, *rest } )
	= fillRuntime( (start[Source])`<Statement s> <Statement* pt>`, rest );