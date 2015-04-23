module extensions::destructuring::desugar::Util

import extensions::destructuring::Syntax;

Expression size( ArrayDestructure pattern ) = [Expression]"<sizeArrayDestructure(pattern)>";

default int sizeArrayDestructure( (ArrayDestructure)`[]` ) = 0;
int sizeArrayDestructure( (ArrayDestructure)`[ <AssignmentElement _>, <{AssignmentElement ","}* ps> ]` ) 
	= 1 + sizeArrayDestructure( (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );
