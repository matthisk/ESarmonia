module extensions::parameters::Syntax
extend core::Syntax;

syntax Params
	= {Param ","}* "," "..."Id
	| "..."Id
	;

syntax Param
	= defaultParam: Id "=" Expression
	;