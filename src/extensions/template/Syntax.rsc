module extensions::template::Syntax
extend core::Syntax;

syntax Literal
	= TemplateLiteral
	;

syntax TemplateLiteral
	= [`] TemplateSpans [`]
	;

syntax TemplateSpans
	= {TemplateChars Template}*
	;

syntax Template
	= "${" Expression "}"
	;

lexical TemplateChars = TemplateChar*;

lexical TemplateChar
	= [$] !>> [{]
	| [\\] EscapeSequence
	| LineTerminator
	| ![`\\$\n]
	;
	
lexical LineTerminator
	= [\n]
	;