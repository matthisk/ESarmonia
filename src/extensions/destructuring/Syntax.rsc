module extensions::destructuring::Syntax
extend core::Syntax;

syntax Param
	= AssignmentPattern
	;

syntax VariableDeclaration 
  = init: AssignmentPattern "=" Expression exp
  ;

syntax VariableDeclarationNoIn
  = init: AssignmentPattern "=" Expression!inn exp
  ;

syntax AssignmentPattern
	= ArrayDestructure
	| ObjectDestructure
	;
	
syntax ArrayDestructure
	= "[" {AssignmentElement ","}* ","? "]"
	| "[" {AssignmentElement ","}* "," "..."Id "]"
	;

syntax ObjectDestructure
	= "{" {AssignmentProperty ","}* ","? "}"
	;

syntax AssignmentProperty
	= Id
	| Id ":" Id
	| Id ":" AssignmentPattern
	;	

syntax AssignmentElement
	= Id
	| Id "=" Expression
	| AssignmentPattern
	;