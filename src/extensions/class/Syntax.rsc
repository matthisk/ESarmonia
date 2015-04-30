module extensions::class::Syntax
extend core::Syntax;

syntax Statement
	= "class" Id name ClassTail
	;

syntax Expression
	= class: "class" Id? name ClassTail
	;

syntax ClassTail
	= ("extends" Id extend)? "{" Constructor? ctor Methods ms "}"
	;

syntax Methods
	= Method*
	;
	
syntax Constructor
	= "constructor" "(" Params ")" "{" Statement* body "}"
	;

syntax Method
	= ClassElement
	| "static" ClassElement 
	;

syntax ClassElement
	= MethodDefinition
	| PropertyName name \ "constructor" "(" Params ")" "{" Statement* body "}"
	;

syntax Expression
	= "super" "(" {ArgExpression ","}* ")"
	| "super" "." Id
	;