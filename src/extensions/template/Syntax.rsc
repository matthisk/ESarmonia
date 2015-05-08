module extensions::template::Syntax
extend core::Syntax;

syntax Literal
	= template: TemplateLiteral template
	| taggedTemplate: Id tag TemplateLiteral template
	;

syntax TemplateLiteral
	= NoSubstitutionTemplate
	| TemplateHead Expression TemplateSpans
	;

syntax TemplateSpans
	= TemplateTail
	| TemplateMiddleList Expression TemplateTail 
	;

syntax TemplateMiddleList
	= {TemplateMiddle Expression}+
	;

lexical NoSubstitutionTemplate
	= [`] TemplateChars [`]
	;

lexical TemplateHead
	= [`] TemplateChars cs "${"
	;

lexical TemplateMiddle
	= "}" TemplateChars cs "${"
	;

lexical TemplateTail
	= "}" TemplateChars cs [`]
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