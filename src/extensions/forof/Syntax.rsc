module extensions::forof::Syntax
extend core::Syntax;

import extensions::letconst::Syntax;

syntax Statement
	= "for" "(" Declarator ForBinding "of" Expression ")" Statement
	;
