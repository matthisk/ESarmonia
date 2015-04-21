module extensions::object::Syntax
extend core::Syntax;

syntax PropertyAssignment
	= shorthand: Id
	| method: Id name "(" Params ")" "{" Statement* body "}"
	| computed: "[" Expression key "]" ":" Expression value
	;