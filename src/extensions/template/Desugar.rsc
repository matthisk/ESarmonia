
module extensions::template::Desugar
extend desugar::Base;
extend extensions::template::Syntax;

import ParseTree;
import String;
import IO;

import extensions::template::Runtime;

data TemplatePart
	= string( Expression e )
	| expr( Expression e )
	;

Expression toExpression( list[TemplatePart] parts ) {
	<p,parts> = pop( parts );	
	pe = p.e;
	Expression result = (Expression)`<Expression pe>`;
	for( TemplatePart p <- parts ) {
		pe = p.e;
		result = (Expression)`<Expression result> + <Expression pe>`;
	}
	return result;
}

@doc {
 dirty hack to create a concrete syntax js list and list of args from the TemplateParts list, but it works.
 Unparsing the stuff to a rascal array which in turn is converted to a str which is then parsed as a js list (or list of args).
}
Expression extractStrings( list[TemplatePart] parts )
	= [Expression]"<[ unparse(e)[1..-1] | string( Expression e ) <- parts ]>";
Expression extractExpressions( list[TemplatePart] parts )
	= [Expression]s
	when s := ( "call(" | it + unparse(e) + "," | expr( Expression e ) <- parts )[0..-1] + ")";

Expression desugar( (Expression)`<TemplateLiteral template>` )
	= toExpression( desugarTemplateLiteral( template ) );
	
Expression desugar( (Expression)`<Id f><TemplateLiteral template>` )
= setRuntime( res, _taggedTemplateLiteral ) 
	when
		list[TemplatePart] parts := desugarTemplateLiteral( template ),
		Expression strings := extractStrings( parts ),
		(Expression)`call(<{ArgExpression ","}* templateArgs>)` := extractExpressions( parts ),
		Expression res := (Expression)`<Id f>(_taggedTemplateLiteral(<Expression strings>, <Expression strings>), <{ArgExpression ","}* templateArgs> )`;	

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`\`<TemplateChars cs>\`` )
	= [string( toStringLiteral( desugarLineTerminators( cs ) ) )];

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`<TemplateHead head><Expression e><TemplateSpans spans>` )
	= [string( desugarLex( head ) ), expr( e ), *desugarSpans( spans )];

list[TemplatePart] desugarSpans( (TemplateSpans)`}<TemplateChars cs>\`` )
	= [string( toStringLiteral( desugarLineTerminators( cs ) ) )];
list[TemplatePart] desugarSpans( (TemplateSpans)`<TemplateMiddleList lst><Expression e><TemplateTail tail>` )
	= [*desugarMiddle( lst ), expr(e), string( desugarLex( tail ) )];

list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle>` )
	= [string(desugarLex( middle ))];
list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle><Expression e><{TemplateMiddle Expression}+ rest>` )
	= [string( desugarLex( middle ) ), expr( e ) ] + desugarMiddle( rest );

Expression desugarLex( TemplateHead h )
	= toStringLiteral( desugarLineTerminators( h.cs ) );
Expression desugarLex( TemplateTail t )
	= toStringLiteral( desugarLineTerminators( t.cs ) );
Expression desugarLex( TemplateMiddle m )
	= toStringLiteral( desugarLineTerminators( m.cs ) );

str desugarLineTerminators( TemplateChars cs )
	= replaceAll( "<cs>", "\n", "\\n" );