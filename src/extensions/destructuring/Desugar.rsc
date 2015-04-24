module extensions::destructuring::Desugar
extend desugar::Desugar;

import IO;
import extensions::destructuring::Syntax;

import extensions::destructuring::desugar::AssignmentPattern;

Function desugar( (Function)`function <Id funName>( <{Param ","}* bef>, <AssignmentPattern pattern>, <{Param ","}* rest> ) { <Statement* body> }` )
	= (Function)`function <Id funName>( <{Param ","}* bef>, <Id ref>, <{Param ","}* rest> ) { <Statement* desBody> }`
	when
		Id ref := [Id]"_arg<nameRef( params( rest ) )>",
		Statement* desBody := desugarBody( pattern, ref, body );

Function desugar( (Function)`function( <{Param ","}* bef>, <AssignmentPattern pattern>, <{Param ","}* rest> ) { <Statement* body> }` )
	= (Function)`function( <{Param ","}* bef>, <Id ref>, <{Param ","}* rest> ) { <Statement* desBody> }`
	when
		Id ref := [Id]"_arg<nameRef( params( rest ) )>",
		Statement* desBody := desugarBody( pattern, ref, body );

private Statement* desugarBody( AssignmentPattern pattern, Id ref, Statement* body )
	= concat( result, body )
	when
		list[Expression] destructure := destructureAssignmentPattern( (Expression)`<Id ref>`,[Id]"<ref>2", pattern ),
		Statement* result := convertToStatementStar( destructure );
		
private default int nameRef( (Params)`` ) = 0;
private default int nameRef( (Params)`<Param p>,<{Param ","}* ps>` ) = nameRef( params( ps ) );
private int nameRef( (Params)`<AssignmentPattern _>,<{Param ","}* ps>` ) = 1 + nameRef( params( ps ) );

Statement desugar( (Statement)`var <AssignmentPattern pattern> = <Expression val>;` )
	= (Statement)`{ <Statement* result> }`
	when
		list[Expression] destructure := destructureAssignmentPattern( val, [Id]"_ref", pattern ), 
		Statement* result := convertToStatementStar( destructure );

Source desugar( Source src ) 
	= desugarExpressionAssignmentPatterns( src )
	when 
		   /(Expression)`[<{ArgExpression ","}* _>] = <Expression _>` := src
		|| /(Expression)`<ArrayDestructure _> = <Expression _>` := src
		|| /(Expression)`<ObjectDestructure _> = <Expression _>` := src;

@doc{
Because our syntax lacks support for comma expression we can not use this to transform destructuring-
assignment expressions to ES5 code. Instead I chose to use array which can behave kind of the same.
We execute some expressions in order inside one expression and in the meantime store the destructured
parts in temporary reference variables. Main difference between using comma expressions and my solutions
is that you need to shift the array before storing it in the temporary reference variable, here by declining
the temporary reference itself:

	( ref = ( ref1 = [1,2], c = ref1[0], d = ref1[1], ref1 ), ..., ref1 )
	
	[ ref = [ ref1 = [1,2], c = ref1[0], d = ref1[1] ].shift(), ... ].shift()

This solution will in the end be somewhat slower when interpreted by your js engine. This is the result
of using the shift function.
}
private Source desugarExpressionAssignmentPatterns( Source src ) {
	Id ref = [Id]"_ref";
	
	return visit( src ) {
		// Case without rest value
		case (Expression)`[<{ArgExpression ","}* args>] = <Expression val>`
			=>
			setDeclaration( result, ref )
		when
			str pattern := "<(Expression)`[<{ArgExpression ","}* args>]`>",
			AssignmentPattern pattern := [AssignmentPattern]"<pattern>",
			list[Expression] destructure := destructureAssignmentPattern( val, ref, pattern ),
			(Expression) e := convertToCSArray( destructure ),
			Expression result := (Expression)`<Expression e>.shift()`
		// Case with rest value
		case (Expression)`<ArrayDestructure arrPattern> = <Expression val>`
			=>
			setDeclaration( result, ref )
		when
			AssignmentPattern pattern := (AssignmentPattern)`<ArrayDestructure arrPattern>`,
			list[Expression] destructure := destructureAssignmentPattern( val, ref, pattern ),
			(Expression) e := convertToCSArray( destructure ),
			Expression result := (Expression)`<Expression e>.shift()`
		// Case with object destructure
		case (Expression)`<ObjectDestructure pattern> = <Expression val>`
			=>
			setDeclaration( result, ref )
		when
			AssignmentPattern pattern := (AssignmentPattern)`<ObjectDestructure pattern>`,
			list[Expression] destructure := destructureAssignmentPattern( val, ref, pattern ),
			Expression e := convertToCSArray( destructure ),
			Expression result := (Expression)`<Expression e>.shift()`
	}
}

private Expression convertToCSArray( list[Expression] es ) {
	Expression result = (Expression)`[]`; 
	
	for( e <- es ) {
		if( (Expression)`[ <{ArgExpression ","}* done> ]` := result ) {
			result = (Expression)`[<{ArgExpression ","}* done>, <Expression e> ]`;
		}
	}
	
	return result;
}

private Statement* convertToStatementStar( list[Expression] es ) {
	Statement* result = stmEmpty();
	
	for( (Expression)`<Id var> = <Expression val>` <- es ) {
		Statement variable = (Statement)`var <Id var> = <Expression val>;`;
		result = \append( result, variable );
	}
	
	return result;
}

private list[Expression] destructureAssignmentPattern( Expression original, Id ref, AssignmentPattern pattern )
	= destructure( original, ref, 1, pattern );
