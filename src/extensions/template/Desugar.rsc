module extensions::template::Desugar
extend desugar::Base;
extend extensions::template::Syntax;

import ParseTree;
import String;
import IO;

import extensions::template::Runtime;

public str inp1 = "`aap\\nnoot`";
public str inp2 = "`aap
				  'noot`";

data TemplatePart
	= string( TemplateChars cs )
	| exprtp( Expression e )
	;

Expression toStringLiteral( list[DoubleStringChar] cs ) {
	Expression s = (Expression)`""`;
	for(c <- cs, (Expression)`"<DoubleStringChar* chars>"` := s) {
		s = (Expression)`"<DoubleStringChar* chars><DoubleStringChar c>"`;
	}
	return s;
}

Expression toStringRaw( (TemplateChars)`<TemplateChar* cs>` ) 
	= toStringLiteral( ([] | it + toRawChar(c) | c <- cs) );
Expression toString( (TemplateChars)`<TemplateChar* cs>` ) 
	= toStringLiteral( ([] | it + toChar(c) | c <- cs ) );

default DoubleStringChar toRawChar( TemplateChar c ) = [DoubleStringChar]"<c>";
DoubleStringChar toRawChar( (TemplateChar)`<LineTerminator _>` ) = (DoubleStringChar)`\\n`;
list[DoubleStringChar] toRawChar( (TemplateChar)`\\<EscapeSequence c>` )
	= [(DoubleStringChar)`\\\\`,[DoubleStringChar]"<c>"];

default DoubleStringChar toChar( TemplateChar c ) = [DoubleStringChar]"<c>";
DoubleStringChar toChar( (TemplateChar)`<LineTerminator _>` ) = (DoubleStringChar)`\\n`;
DoubleStringChar toChar( (TemplateChar)`\\<EscapeSequence c>` ) = (DoubleStringChar)`\\<EscapeSequence c>`;

Expression toExpression( list[TemplatePart] parts ) {
	Expression result;
	<p,parts> = pop( parts );	

	void initResult( string(cs) ) { result = toString(cs); }
	void initResult( expression(e) ) { result = e; }

	initResult(p);
	
	for( TemplatePart p <- parts ) {
		result = app( result, p );
	}
	
	return result;
}

Expression app( Expression result, exprtp( Expression e ) )
	= (Expression)`<Expression result> + (<Expression e>)`;
	
Expression app( Expression result, string( cs ) )
	= (Expression)`<Expression result> + <Expression e>`
	when 
		Expression e := toString( cs );

@doc {
 dirty hack to create a concrete syntax js list and list of args from the TemplateParts list, but it works.
 Unparsing the stuff to a rascal array which in turn is converted to a str which is then parsed as a js list (or list of args).
}
tuple[Expression,Expression] extractStrings( list[TemplatePart] parts ) {
	Expression strings = (Expression)`[]`;
	Expression raw = (Expression)`[]`;
	
	for( string(cs) <- parts, (Expression)`[<{ArgExpression ","}* strs>]` := strings, 
							 (Expression)`[<{ArgExpression ","}* rws>]` := raw ) {
		s = toString(cs);
		r = toStringRaw(cs);
		
		strings = (Expression)`[<{ArgExpression ","}* strs>,<Expression s>]`;
		raw = (Expression)`[<{ArgExpression ","}* rws>,<Expression r>]`;
	}
	
	return <strings,raw>;
}
		
Expression extractExpressions( list[TemplatePart] parts )
	= [Expression]s
	when s := ( "call(" | it + unparse(e) + "," | exprtp( Expression e ) <- parts )[0..-1] + ")";

Expression desugar( (Expression)`<TemplateLiteral template>`, _ )
	= toExpression( desugarTemplateLiteral( template ) );
	
Expression desugar( (Expression)`<Id f><TemplateLiteral template>`, _ )
= setRuntime( res, _taggedTemplateLiteral ) 
	when
		list[TemplatePart] parts := desugarTemplateLiteral( template ),
		<strings,raw> := extractStrings( parts ),
		(Expression)`call(<{ArgExpression ","}* templateArgs>)` := extractExpressions( parts ),
		Expression res := (Expression)`<Id f>(_taggedTemplateLiteral(<Expression strings>, <Expression raw>), <{ArgExpression ","}* templateArgs> )`;	

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`\`<TemplateChars cs>\`` )
	= [string( cs )];

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`<TemplateHead head><Expression e><TemplateSpans spans>` )
	= [string( head.cs ), exprtp( e ), *desugarSpans( spans )];

list[TemplatePart] desugarSpans( (TemplateSpans)`}<TemplateChars cs>\`` )
	= [string( cs )];
list[TemplatePart] desugarSpans( (TemplateSpans)`<TemplateMiddleList lst><Expression e><TemplateTail tail>` )
	= [*desugarMiddle( lst ), exprtp(e), string( tail.cs )];

list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle>` )
	= [string( middle.cs )];
list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle><Expression e><{TemplateMiddle Expression}+ rest>` )
	= [string( middle.cs ), exprtp( e ) ] + desugarMiddle( rest );
