@cachedParser{extensions.destructuring.cached.Parser}
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

Expression extractKey( (PropertyName)`<String s>` ) = (Expression)`<String s>`;
Expression extractKey( (PropertyName)`<Numeric s>` ) = (Expression)`<Numeric s>`;

Id extractName( (AssignmentElement)`<Id name>` ) = name;
Id extractName( (AssignmentElement)`<Id name> = <Expression _>` ) = name;

Expression extractInit( (AssignmentElement)`<Id _>`, Id name, Expression key ) 
	= (Expression)`<Id name>[<Expression key>]`;
Expression extractInit( (AssignmentElement)`<Id _> = <Expression def>`, Id name, Expression key )
	= (Expression)`<Id name>[<Expression key>] === undefined ? <Expression def> : <Id name>[<Expression key>]`;