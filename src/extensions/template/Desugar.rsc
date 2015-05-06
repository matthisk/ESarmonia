module extensions::template::Desugar
extend desugar::Base;

import String;
import IO;

import extensions::template::Syntax;

Expression desugar( (Expression)`<TemplateLiteral template>` )
	= desugarTemplateLiteral( template );
	
Expression desugarTemplateLiteral( (TemplateLiteral)`\`<TemplateChars cs>\`` )
	= toStringLiteral( desugarLineTerminators( cs ) );

Expression desugarTemplateLiteral( (TemplateLiteral)`\`<TemplateSpans spans>\`` )
	= desugarSpans( spans );

Expression desugarSpans( (TemplateSpans)`<TemplateChars cs>` )
	= (Expression)`<Expression s>`
	when s := toStringLiteral( desugarLineTerminators( cs ) );
Expression desugarSpans( (TemplateSpans)`<TemplateChars cs><Template sep>` )
	= (Expression)`<Expression s> + <Expression exp>`
	when
		(Template)`${<Expression exp>}` := sep,
		_ := printlnExp( exp ),
		Expression s := toStringLiteral( desugarLineTerminators( cs ) );
Expression desugarSpans( (TemplateSpans)`<TemplateChars cs>${<Expression sep>}<{TemplateChars Template}* rest>` )
	= (Expression)`<Expression s> + <Expression sep> + <Expression rest>`
	when
		Expression s := toStringLiteral( desugarLineTerminators( cs ) ),
		Expression rest := desugarSpans( (TemplateSpans)`<{TemplateChars Template}* rest>` );

str desugarLineTerminators( TemplateChars cs )
	= result
	when
		str result := replaceAll( "<cs>", "\n", "\\n" );