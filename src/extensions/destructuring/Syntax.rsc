module extensions::destructuring::Syntax
extend core::Syntax;

syntax Param
	= AssignmentPattern
	; 

syntax Expression
	= right( 
	  	  assign: ArrayDestructure!base "=" !>> ([=][=]?) Expression
		| assign: ObjectDestructure "=" !>> ([=][=]?) Expression 
	)
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
	= base: "[" {AssignmentElement ","}* ","? "]"
	| rest: "[" {AssignmentElement ","}* "," "..."Id ","? "]"
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