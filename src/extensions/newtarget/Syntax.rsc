module extensions::newtarget::Syntax
extend core::Syntax;

syntax Expression
	= new: "new" Expression
  	| newDotTarget: "new" "." "target"
  	;