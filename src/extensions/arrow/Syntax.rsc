module extensions::arrow::Syntax
extend core::Syntax;

syntax Expression
  = Arrow
	;

syntax Arrow
	= "(" Params ")" "=\>" "{" Statement* "}"
	| "(" Params ")" "=\>" Expression
	| Param "=\>" "{" Statement* "}"
	| Param "=\>" Expression
	;