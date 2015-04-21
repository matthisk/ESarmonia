module extensions::class::Syntax
extend core::Syntax;

syntax Statement
	= "class" Id name ("extends" Id extend)? "{" Constructor? ctor Methods ms "}"
	;

syntax Methods
	= Method*
	;
	
syntax Constructor
	= "constructor" "(" Params ")" "{" Statement* body "}"
	;

syntax Method
	= Modifier? modifier Id name \ "constructor" "(" Params ")" "{" Statement* body "}"
	;
	
syntax Modifier
	= "static"
	| "get"
	| "set"
	;
	
syntax Expression
	= "super" "(" {ArgExpression ","}* ")"
	| "super" "." Id
	;