module desugar::Visitor

import IO;
import ParseTree;
import core::Syntax;
import desugar::Declarations;
import core::resolve::Util;

start[Source] desugar( start[Source] pt ) = desugarVisitor( pt );

Id(str) generateNamer() {
	set[str] names = {};
	
	Id generateUniqueId( str name ) {
		if( name in names ) name = gensym(names, name);
		names += name;
		return [Id]name;
	}
	
	return generateUniqueId;
}

&T <: Tree desugarVisitor( &T <: Tree pt ) {
	Id(str) generateUId = generateNamer();

	return solve( pt ) {
		pt = visit( pt ) {
			case Source src => desugar( src, generateUId )
			case Function fun => desugar( fun, generateUId )
			case Expression exp => desugar( exp, generateUId )
			case Statement stm => desugar( stm, generateUId )
		}
	};
}