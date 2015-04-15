module extensions::class::Syntax
extend core::Syntax;

syntax Statement
	= "class" Id name ("extends" Id extend)? "{" Constructor? ctor Methods ms "}"
	;

syntax Methods
	= Method*
	;
	
syntax Constructor
	= "constructor" "(" {Id ","}* params ")" "{" Statement* body "}"
	;

syntax Method
	= Modifier? modifier Id name \ "constructor" "(" {Id ","}* params ")" "{" Statement* body "}"
	;
	
syntax Modifier
	= "static"
	| "get"
	| "set"
	;
	
syntax Expression
	= "super" "(" {Expression ","}* ")"
	| "super" "." Id
	;