module extensions::class::Syntax
extend core::Syntax;

syntax Statement
	= "class" Id name ("extends" Id extend)? "{" Constructor ctor Methods ms "}"
	| "class" Id name ("extends" Id extend)? "{" Methods ms "}"
	;

syntax Constructor
	= "constructor" "(" {Id ","}* params ")" "{" Statement* body "}"
	;

syntax Methods
	= Method*
	;

syntax Method
	= Modifier? Id name "(" {Id ","}* params ")" "{" Statement* body "}"
	;
	
syntax Modifier
	= "static"
	;