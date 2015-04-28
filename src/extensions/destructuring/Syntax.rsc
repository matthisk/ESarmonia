module extensions::destructuring::Syntax
//extend core::Syntax;
extend extensions::object::Syntax;

syntax Param
	= AssignmentPattern
	; 

syntax LHSExpression
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
	| rest: "[" {AssignmentElement ","}* "," "..."LHSExpression ","? "]"
	;

syntax ObjectDestructure
	= "{" {AssignmentProperty ","}* ","? "}"
	;

syntax AssignmentProperty
	= Id Initializer?
	| PropertyName ":" AssignmentElement
	;

syntax AssignmentElement
	= LHSExpression Initializer? 
	| AssignmentPattern
	;