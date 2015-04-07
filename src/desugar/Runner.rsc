module desugar::Runner

import lang::javascript::saner::Syntax;

start[Source] desugar( start[Source] pt ) {
	return solve( pt ) {
		pt = visit( pt ) {
			case Source src => desugar( src )
			case Function fun => desugar( fun )
			case Expression exp => desugar( exp )
			case Statement stm => desugar( stm )
		}
	};
}