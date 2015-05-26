@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Syntax
extend core::Syntax;

syntax LetOrConst
	= "let"
	| "const"
	;

syntax Declarator
	= LetOrConst
	;