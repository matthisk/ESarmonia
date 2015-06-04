module extensions::generators::Syntax
extend core::Syntax;

syntax Function
	= generator: "function" "*" Id name "(" Params parameters ")" "{" Statement* body "}"
  	| generator: "function" "*" "(" Params parameters ")" "{" Statement* body "}"
	;
	
syntax Expression
	= right assignBinOr: Expression "|=" Expression
	> "yield"
	| "yield" Expression
	| "yield" "*" Expression
	;
	
syntax MethodDefinition
	= "*" PropertyName "(" Params ")" "{" Statement* body "}"
	;