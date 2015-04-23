module extensions::destructuring::desugar::Util

import extensions::destructuring::Syntax;

Expression size( AssignmentPattern pattern ) = [Expression]"<sizeArrayDestructure(pattern)>";

default int sizeArrayDestructure( (AssignmentPattern)`[]` ) = 0;
int sizeArrayDestructure( (AssignmentPattern)`[ <AssignmentElement _>, <{AssignmentElement ","}* ps> ]` ) 
	= 1 + sizeArrayDestructure( (AssignmentPattern)`[ <{AssignmentElement ","}* ps> ]` );
