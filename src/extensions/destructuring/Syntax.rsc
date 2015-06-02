module extensions::destructuring::Syntax
extend core::Syntax;
//extend extensions::object::Syntax;

syntax Param
	= AssignmentPattern
	; 

syntax LHSExpression
	= AssignmentPattern
	;

syntax ForBinding
	= AssignmentPattern
	;

syntax Expression
	= cond: Expression!cond "?" Expression!cond ":" Expression
	> right (
      	  assign: Expression!objectDefinition!array "=" !>> ([=][=]?) Expression
	  	| assignArrayDes: ArrayDestructure "=" !>> ([=][=]?) Expression
		| assignObjDes: ObjectDestructure "=" !>> ([=][=]?) Expression 
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
	;