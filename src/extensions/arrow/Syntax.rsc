module extensions::arrow::Syntax
extend core::Syntax;

syntax Expression
  = "(" Params ")" "=\>" "{" Statement* "}"
	| Param "=\>" "{" Statement* "}"
  	|right assignBinOr: Expression "|=" Expression
  	> "(" Params ")" "=\>" Expression
	| Param "=\>" Expression
	;