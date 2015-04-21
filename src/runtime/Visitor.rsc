module runtime::Visitor

import IO;
import util::Maybe;
import core::Syntax;

start[Source] runtimeVisitor( start[Source] pt ) {
	set[Statement] detectedRuntime = {};
	pt = visit( pt ) {
		case Expression exp : {
			Maybe[Statement] s = runtime( exp );
			detectedRuntime = addToRuntime( detectedRuntime, s );
		}
	}
	
	return fillRuntime( pt, detectedRuntime );
}

set[Statement] addToRuntime( set[Statement] runtime, nothing() ) = runtime;
set[Statement] addToRuntime( set[Statement] runtime, just( Statement s ) ) = runtime + s;

start[Source] fillRuntime( start[Source] pt, {} ) = pt;
start[Source] fillRuntime( start[Source] pt, { Statement s, *rest } )
	= fillRuntime( (start[Source])`<Statement s> <Statement* pt>`, rest );