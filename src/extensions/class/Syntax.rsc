module extensions::class::Syntax
extend core::Syntax;

syntax Statement
	= "class" Id name ("extends" Id extend)? "{" Methods ms "}"
	;

syntax Methods
	= Method*
	;

syntax Method
	= Modifier? modifier Id name "(" {Id ","}* params ")" "{" Statement* body "}"
	;
	
syntax Modifier
	= "static"
	| "get"
	| "set"
	;