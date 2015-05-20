@cachedParser{extensions.destructuring.cached.Parser}
module extensions::destructuring::Desugar
extend desugar::Base;

extend extensions::destructuring::desugar::Shared;

import extensions::destructuring::desugar::AssignmentPattern;
import extensions::destructuring::Syntax;

import IO;

@doc{
 for in loops can also have destructuring patterns these need to be put in a variable declaration
 to be desugared by the destructuring extensions
}
Statement desugar( (Statement)`for( <Declarator d> <AssignmentPattern pt> in <Expression x> ) <Statement body>` )
	= (Statement)`for( var _i in <Expression x> ) { <Declarator d> <AssignmentPattern pt> = _i; <Statement body> }`
	when Statement body := unscope( body );

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

private Id refName( (AssignmentPattern)`<ObjectDestructure _>`, Id ref ) = ref;
private default Id refName( AssignmentPattern _, Id ref ) = [Id]"<ref>2";

private Id refName( (AssignmentPattern)`<ObjectDestructure _>`, (Expression)`<Id ref>`, _ ) = ref;
private Id refName( AssignmentPattern _, _, Id ref ) = ref;

private Statement* desugarBody( AssignmentPattern pattern, Id ref, Statement* body )
	= concat( result, checkForDefaultFunctionValue( pattern, body ) )
	when
		list[Expression] destructure := destructureNoRef( (Expression)`<Id ref>`, refName( pattern, ref ), 1, pattern ),
		Statement* result := convertToStatementStar( destructure );

private default Statement* checkForDefaultFunctionValue( AssignmentPattern _, Statement* body )
	= body;
private Statement* checkForDefaultFunctionValue( AssignmentPattern pattern, Statement* body )
	= scope( body )
	when 
		   /(Function)`function(<{Param ","}* _>) { <Statement* _> }` := pattern 
		|| /(Function)`function <Id _>(<{Param ","}* _>) { <Statement* _> }` := pattern;

private default int nameRef( (Params)`` ) = 0;
private default int nameRef( (Params)`<Param p>,<{Param ","}* ps>` ) = nameRef( params( ps ) );
private int nameRef( (Params)`<AssignmentPattern _>,<{Param ","}* ps>` ) = 1 + nameRef( params( ps ) );

Statement desugar( (Statement)`var <VariableDeclaration d>;` )
	= desugarDecl( d )
	when
		/AssignmentPattern _ := d;
Statement desugar( s:(Statement)`var <VariableDeclaration d>,<{VariableDeclaration ","}+ ds>;` )
	= (Statement)`{ <Statement* result> }`
	when
		/AssignmentPattern := s,
		(Statement)`{ <Statement* desD> }` := desugarDecl( d ),
		(Statement)`{ <Statement* desRest> }` := desugar( (Statement)`var <{VariableDeclaration ","}+ ds>;` ),
		Statement* result := concat( desD, desRest );

Statement desugar( (Statement)`var <VariableDeclaration d>;` )
	= desugarDecl( d );
	
default Statement desugarDecl( VariableDeclaration d ) = (Statement)`var <VariableDeclaration d>;`;
Statement desugarDecl( (VariableDeclaration)`<AssignmentPattern pattern> = <Expression val>` )
	= (Statement)`{ <Statement* result> }`
	when
		list[Expression] destructure := destructureNoRef( val, refName( pattern, val, [Id]"_ref" ), 1, pattern ),
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
			list[Expression] destructure := destructure( val, ref, 1, pattern ),
			(Expression) e := convertToCSArray( destructure ),
			Expression result := (Expression)`<Expression e>.shift()`
		// Case with rest value
		case (Expression)`<ArrayDestructure arrPattern> = <Expression val>`
			=>
			setDeclaration( result, ref )
		when
			AssignmentPattern pattern := (AssignmentPattern)`<ArrayDestructure arrPattern>`,
			list[Expression] destructure := destructure( val, ref, 1, pattern ),
			(Expression) e := convertToCSArray( destructure ),
			Expression result := (Expression)`<Expression e>.shift()`
		// Case with object destructure
		case (Expression)`<ObjectDestructure pattern> = <Expression val>`
			=>
			setDeclaration( result, ref )
		when
			AssignmentPattern pattern := (AssignmentPattern)`<ObjectDestructure pattern>`,
			list[Expression] destructure := destructure( val, ref, 1, pattern ),
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
	
	for( Expression e <- es ) {
		Statement variable;
		if( (Expression)`<Id var> = <Expression val>` := e ) {
			variable = (Statement)`var <Id var> = <Expression val>;`;
		} else {
			variable = (Statement)`<Expression e>;`;
		}
		result = \append( result, variable );
	}
	
	return result;
}