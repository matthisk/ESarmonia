module runtime::Visitor

import IO;
import util::Maybe;
import core::Syntax;

start[Source] runtimeVisitor( pt:(start[Source])`<Statement* src>` ) {
	set[Statement] runtime = {};
	
	visit( pt ) {
		case Expression e : {
			if( e@runtime? ) {
				runtime = runtime + e@runtime;
			}
		}
		case Statement s : {
			if( s@runtime? ) {
				runtime = runtime + s@runtime;
			}
		}
	}
	
	Statement* rt = makeRuntime(runtime);
    return pt.top = (Source)`<Statement* rt> <Statement* src>`;
}

Statement* makeRuntime( set[Statement] runtime ) {
	Statement result = (Statement)`{}`;

	for( s <- runtime, (Statement)`{ <Statement* stms> }` := result ) {
		result = (Statement)`{ <Statement s> <Statement* stms> }`;
	}
	
	if( (Statement)`{ <Statement* stms> }` := result ) return stms;
}