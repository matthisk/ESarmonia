module desugar::Visitor

import ParseTree;
import core::Syntax;
import desugar::Declarations;

start[Source] desugar( start[Source] pt ) = desugarVisitor( pt );

&T <: Tree desugarVisitor( &T <: Tree pt ) {
	pt = solve( pt ) {
		pt = visit( pt ) {
			case Source src => desugar( src )
			case Function fun => desugar( fun )
			case Expression exp => desugar( exp )
			case Statement stm => desugar( stm )
		}
	};
	
	return declareVariables( pt );
}