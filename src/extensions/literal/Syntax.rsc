module extensions::literal::Syntax
extend core::Syntax;

syntax Numeric
	= [a-zA-Z$_0-9] !<< OctalInteger
	| [a-zA-Z$_0-9] !<< BinaryInteger;

lexical OctalInteger
  = [0] [Oo] [0-8]+ !>> [0-8]
  ;
  
lexical BinaryInteger
  = [0] [Bb] [0 1]+ !>> [01]
  ;