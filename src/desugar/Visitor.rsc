module desugar::Visitor

import ParseTree;
import core::Syntax;

start[Source] desugar( start[Source] pt ) = desugarVisitor( pt );

&T <: Tree desugarVisitor( &T <: Tree pt ) {
	return solve( pt ) {
		pt = visit( pt ) {
			case Source src => desugar( src )
			case Function fun => desugar( fun )
			case Expression exp => desugar( exp )
			case Statement stm => desugar( stm )
		}
	};
}