module extensions::destructuring::desugar::Util

import extensions::destructuring::Syntax;

Expression size( AssignmentPattern pattern ) = [Expression]"<sizeArrayDestructure(pattern)>";

default int sizeArrayDestructure( (AssignmentPattern)`[]` ) = 0;
int sizeArrayDestructure( (AssignmentPattern)`[ <AssignmentElement _>, <{AssignmentElement ","}* ps> ]` ) 
	= 1 + sizeArrayDestructure( (AssignmentPattern)`[ <{AssignmentElement ","}* ps> ]` );

default bool pop( _ ) = false;
tuple[AssignmentElement,{AssignmentElement ","}*] pop( (AssignmentPattern)`[ <AssignmentElement p>,<{AssignmentElement ","}* ps> ]` ) = <p,ps>;
tuple[AssignmentElement,{AssignmentElement ","}*] pop( (AssignmentPattern)`[ <AssignmentElement p>,<{AssignmentElement ","}* ps>, ]` ) = <p,ps>;
tuple[AssignmentProperty,{AssignmentProperty ","}*] pop( (AssignmentPattern)`{ <AssignmentProperty p>,<{AssignmentProperty ","}* ps> }` ) = <p,ps>;
tuple[AssignmentProperty,{AssignmentProperty ","}*] pop( (AssignmentPattern)`{ <AssignmentProperty p>,<{AssignmentProperty ","}* ps>, }` ) = <p,ps>;

AssignmentPattern createPattern( {AssignmentElement ","}* ps ) = (AssignmentPattern)`[ <{AssignmentElement ","}* ps> ]`;
AssignmentPattern createPattern( {AssignmentProperty ","}* ps ) = (AssignmentPattern)`{ <{AssignmentProperty ","}* ps> }`;