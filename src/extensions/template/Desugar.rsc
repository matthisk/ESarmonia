module extensions::template::Desugar
extend desugar::Base;
extend extensions::template::Syntax;

import ParseTree;
import String;
import IO;

import extensions::template::Runtime;

data TemplatePart
	= string( str s )
	| expr( Expression e )
	;

Expression toExpression( list[TemplatePart] parts ) {
	Expression result;
	<p,parts> = pop( parts );	

	void initResult( string(s) ) { result = toStringLiteral( escapeStr( s ) ); }
	void initResult( expression(e) ) { result = e; }

	initResult(p);
	
	for( TemplatePart p <- parts ) {
		result = app( result, p );
	}
	
	return result;
}

Expression app( Expression result, expr( Expression e ) )
	= (Expression)`<Expression result> + (<Expression e>)`;
	
Expression app( Expression result, string( str s ) )
	= (Expression)`<Expression result> + <Expression e>`
	when Expression e := toStringLiteral( escapeStr( s ) );

@doc {
 dirty hack to create a concrete syntax js list and list of args from the TemplateParts list, but it works.
 Unparsing the stuff to a rascal array which in turn is converted to a str which is then parsed as a js list (or list of args).
}
/*tuple[Expression,Expression] extractStrings( list[TemplatePart] parts )
	= <[Expression]escp,[Expression]escp>
	when 
		str escp := "<[ escapeStr(s) | string( str s ) <- parts ]>",
		str unescp := "<[ s | string(s) <- parts ]>",
		_ := printlnExp(unescp),
		_ := [printlnExp(escapeStr(s)) | string(s) <- parts];
*/
tuple[Expression,Expression] extractStrings( list[TemplatePart] parts ) {
	Expression strings = (Expression)`[]`;
	Expression raw = (Expression)`[]`;
	
	for( string(s) <- parts, (Expression)`[<{ArgExpression ","}* strs>]` := strings, 
							 (Expression)`[<{ArgExpression ","}* rws>]` := raw ) {
		s = escapeStr( s );
		r = escape( s, ( "\\" : "\\\\" ) );
		
		es = toStringLiteral( s );
		er = toStringLiteral( r );
		strings = (Expression)`[<{ArgExpression ","}* strs>,<Expression es>]`;
		raw = (Expression)`[<{ArgExpression ","}* rws>,<Expression er>]`;
	}
	
	return <strings,raw>;
}
		
Expression extractExpressions( list[TemplatePart] parts )
	= [Expression]s
	when s := ( "call(" | it + unparse(e) + "," | expr( Expression e ) <- parts )[0..-1] + ")";

Expression desugar( (Expression)`<TemplateLiteral template>` )
	= toExpression( desugarTemplateLiteral( template ) );
	
Expression desugar( (Expression)`<Id f><TemplateLiteral template>` )
= setRuntime( res, _taggedTemplateLiteral ) 
	when
		list[TemplatePart] parts := desugarTemplateLiteral( template ),
		<strings,raw> := extractStrings( parts ),
		(Expression)`call(<{ArgExpression ","}* templateArgs>)` := extractExpressions( parts ),
		Expression res := (Expression)`<Id f>(_taggedTemplateLiteral(<Expression strings>, <Expression raw>), <{ArgExpression ","}* templateArgs> )`;	

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`\`<TemplateChars cs>\`` )
	= [string( "<cs>" )];

list[TemplatePart] desugarTemplateLiteral( (TemplateLiteral)`<TemplateHead head><Expression e><TemplateSpans spans>` )
	= [string( desugarLex( head ) ), expr( e ), *desugarSpans( spans )];

list[TemplatePart] desugarSpans( (TemplateSpans)`}<TemplateChars cs>\`` )
	= [string( "<cs>" )];
list[TemplatePart] desugarSpans( (TemplateSpans)`<TemplateMiddleList lst><Expression e><TemplateTail tail>` )
	= [*desugarMiddle( lst ), expr(e), string( desugarLex( tail ) )];

list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle>` )
	= [string(desugarLex( middle ))];
list[TemplatePart] desugarMiddle( (TemplateMiddleList)`<TemplateMiddle middle><Expression e><{TemplateMiddle Expression}+ rest>` )
	= [string( desugarLex( middle ) ), expr( e ) ] + desugarMiddle( rest );

str desugarLex( TemplateHead h )
	= "<h.cs>";
str desugarLex( TemplateTail t )
	= "<t.cs>";
str desugarLex( TemplateMiddle m )
	= "<m.cs>";

map[str,str] escapes = (
	"\n" : "\\n",
	"\t" : "\\t"
	//"\/" : "\\/",
	//"\r" : "\\r",
	//"\b" : "\\b",
	//"\f" : "\\f",
	//"\v" : "\\v",
	//"\0" : "\\0"
);

str escapeStr( str s ) = escape( s, escapes );

str escapeLineTerminators( str cs )
	= replaceAll( cs, "\n", "\\n" );

str unescapeLineTerminators( str cs )
	= replaceAll( cs, "\\n", "\n" );