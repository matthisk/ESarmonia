@cachedParser{desugar.cached.Parser}
module extensions::destructuring::Desugar
extend desugar::Base;
extend extensions::destructuring::Syntax;
extend extensions::destructuring::desugar::Shared;

extend extensions::destructuring::desugar::AssignmentPattern;

import IO;

@doc{
 for in loops can also have destructuring patterns these need to be put in a variable declaration
 to be desugared by the destructuring extensions
}
Statement desugar( (Statement)`for( <Declarator d> <AssignmentPattern pt> in <Expression x> ) <Statement body>`, Id(str) generateUId )
	= (Statement)`for( var <Id i> in <Expression x> ) { 
				 '	<Declarator d> <AssignmentPattern pt> = <Id i>; 
				 '	<Statement* body> 
				 '}`
	when
		Id i := generateUId("_i"), 
		Statement* body := unscope( body );

Function desugar( (Function)`function <Id funName>( <{Param ","}* bef>, <AssignmentPattern pattern>, <{Param ","}* rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function <Id funName>( <{Param ","}* bef>, <Id ref>, <{Param ","}* rest> ) { 
				'	<Statement* desBody> 
				'}`
	when
		Id ref := generateUId("_arg"),
		Statement* desBody := desugarBody( pattern, ref, body, generateUId );

Function desugar( (Function)`function( <{Param ","}* bef>, <AssignmentPattern pattern>, <{Param ","}* rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function( <{Param ","}* bef>, <Id ref>, <{Param ","}* rest> ) { 
				'	<Statement* desBody> 
				'}`
	when
		Id ref := generateUId("_arg"),
		Statement* desBody := desugarBody( pattern, ref, body, generateUId );

Statement desugar( (Statement)`var <VariableDeclaration d>;`, Id(str) generateUId )
	= desugarDecl( d, generateUId )
	when
		/AssignmentPattern _ := d;
Statement desugar( s:(Statement)`var <VariableDeclaration d>,<{VariableDeclaration ","}+ ds>;`, Id(str) generateUId )
	= (Statement)`{ <Statement* result> }`
	when
		/AssignmentPattern := s,
		(Statement)`{ <Statement* desD> }` := desugarDecl( d, generateUId ),
		(Statement)`{ <Statement* desRest> }` := desugar( (Statement)`var <{VariableDeclaration ","}+ ds>;`, generateUId ),
		Statement* result := concat( desD, desRest );

Statement desugar( (Statement)`var <VariableDeclaration d>;`, Id(str) generateUId )
	= desugarDecl( d, generateUId );
	
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
Expression desugar( (Expression)`<ArrayDestructure arrPattern> = <Expression val>`, Id(str) generateUId )
	= setDeclaration( result, ref )
	when
		Id ref := generateUId("_ref"),
		AssignmentPattern pattern := (AssignmentPattern)`<ArrayDestructure arrPattern>`,
		list[Expression] destructure := destructure( val, ref, 1, pattern ),
		(Expression) e := convertToCSArray( destructure ),
		Expression result := (Expression)`<Expression e>.shift()`;
		
Expression desugar( (Expression)`<ObjectDestructure pattern> = <Expression val>`, Id(str) generateUId )
	= setDeclaration( result, ref )
	when
		Id ref := generateUId("_ref"),
		AssignmentPattern pattern := (AssignmentPattern)`<ObjectDestructure pattern>`,
		list[Expression] destructure := destructure( val, ref, 1, pattern ),
		Expression e := convertToCSArray( destructure ),
		Expression result := (Expression)`<Expression e>.shift()`;

default Statement desugarDecl( VariableDeclaration d, Id(str) generateUId ) = (Statement)`var <VariableDeclaration d>;`;
Statement desugarDecl( (VariableDeclaration)`<AssignmentPattern pattern> = <Expression val>`, Id(str) generateUId )
	= (Statement)`{ <Statement* result> }`
	when
		Id ref := generateUId("_ref"),
		list[Expression] destructure := destructureNoRef( val, ref, 1, pattern ),
		Statement* result := convertToStatementStar( destructure );

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

private Statement* desugarBody( AssignmentPattern pattern, Id ref, Statement* body, Id(str) generateUId )
	= concat( result, checkForDefaultFunctionValue( pattern, body ) )
	when
		Id ref := generateUId("_ref"),
		list[Expression] destructure := destructureNoRef( (Expression)`<Id ref>`, ref, 1, pattern ),
		Statement* result := convertToStatementStar( destructure );

private default Statement* checkForDefaultFunctionValue( AssignmentPattern _, Statement* body )
	= body;
private Statement* checkForDefaultFunctionValue( AssignmentPattern pattern, Statement* body )
	= scope( body )
	when 
		   /(Function)`function(<{Param ","}* _>) { <Statement* _> }` := pattern 
		|| /(Function)`function <Id _>(<{Param ","}* _>) { <Statement* _> }` := pattern;