@cachedParser{desugar.cached.Parser}
module extensions::destructuring::desugar::Shared

import extensions::destructuring::Syntax;

VariableDeclaration declareBinding( (ForBinding)`<AssignmentPattern p>`, Expression exp ) 
	= (VariableDeclaration)`<AssignmentPattern p> = <Expression exp>`;