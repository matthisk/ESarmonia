module extensions::object::Syntax
extend core::Syntax;

syntax PropertyAssignment
	= shorthand: Id
	;

syntax MethodDefinition
	= PropertyName name "(" Params ")" "{" Statement* body "}"
	; 
	
syntax PropertyName
	= computed: "[" Expression key "]"
	;