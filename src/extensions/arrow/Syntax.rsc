module extensions::arrow::Syntax
extend core::Syntax;

syntax Expression
	= "(" { Id "," }* ")" "=\>" "{" Statement* "}"
	| "(" { Id "," }* ")" "=\>" Expression
	| Id "=\>" "{" Statement* "}"
	| Id "=\>" Expression
	;