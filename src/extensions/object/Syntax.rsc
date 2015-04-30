module extensions::object::Syntax
extend core::Syntax;

syntax PropertyAssignment
	= shorthand: Id
	| ObjectMethod
	;

syntax ObjectMethod
	= PropertyName name "(" Params ")" "{" Statement* body "}"
	; 
	
syntax PropertyName
	= computed: "[" Expression key "]"
	;