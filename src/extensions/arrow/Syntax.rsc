module extensions::arrow::Syntax
extend lang::javascript::saner::Syntax;

syntax Expression
	= "(" { Id "," }* ")" "=\>" "{" Statement* "}"
	| "(" { Id "," }* ")" "=\>" Expression
	| Id "=\>" "{" Statement* "}"
	| Id "=\>" Expression
	;