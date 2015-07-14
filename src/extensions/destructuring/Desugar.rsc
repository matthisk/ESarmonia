module extensions::destructuring::Desugar
extend desugar::Base;
extend extensions::destructuring::Syntax;
extend extensions::destructuring::desugar::Shared;

extend extensions::destructuring::desugar::AssignmentPattern;

import extensions::arrow::Syntax;
import desugar::Declarations;
import List;
import IO;

@doc{
 for in loops can also have destructuring patterns these need to be put in a variable declaration
 to be desugared by the destructuring extensions
}
Statement desugar( (Statement)`for( <Declarator d> <AssignmentPattern pt> in <Expression x> ) <Statement body>`, Id(str) generateUId )
	= (Statement)`for( <Declarator d> <Id i> in <Expression x> ) { 
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

Statement desugar( s:(Statement)`<Declarator d> <{VariableDeclaration ","}+ vds>;`, Id(str) generateUId ) 
	= desugarVds( s, generateUId )
	when /AssignmentPattern _ := s;

Statement desugarVds( (Statement)`<Declarator d> <{VariableDeclaration ","}+ vds>;`, Id(str) generateUId ) {
	list[Statement*] result = [ desugarDecl( d, vd, generateUId ) | vd <- vds ];
	Statement* body = ( stmEmpty() | concat( it, stmts ) | stmts <- result );
	
	return (Statement)
					`{
					'<Statement* body>
					'}`;
}

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
	= setDeclaration( result, decl( ref ) )
	when
		Id ref := generateUId("_ref"),
		AssignmentPattern pattern := (AssignmentPattern)`<ArrayDestructure arrPattern>`,
		list[Expression] destructure := destructure( val, ref, 1, pattern ),
		Expression result := convertToCSFunction( destructure );
		
Expression desugar( (Expression)`<ObjectDestructure pattern> = <Expression val>`, Id(str) generateUId )
	= setDeclaration( result, decl( ref ) )
	when
		Id ref := generateUId("_ref"),
		AssignmentPattern pattern := (AssignmentPattern)`<ObjectDestructure pattern>`,
		list[Expression] destructure := destructure( val, ref, 1, pattern ),
		Expression result := convertToCSFunction( destructure );

default Statement* desugarDecl( Declarator d, VariableDeclaration d, Id(str) generateUId ) = statementStar( (Statement)`var <VariableDeclaration d>;` );
Statement* desugarDecl( Declarator d, (VariableDeclaration)`<AssignmentPattern pattern> = <Expression val>`, Id(str) generateUId )
	= result
	when
		Id ref := generateUId("_ref"),
		list[Expression] destructure := destructureNoRef( val, ref, 1, pattern ),
		Statement* result := convertToStatementStar( d, destructure );

private Expression convertToCSFunction( list[Expression] es ) {
	<e1,es> = takeOneFrom(es);
	list[Statement] stats =
        [ (Statement)`var result = <Expression e1>;`,
          *[ (Statement)`<Expression e>;` | e <- es ],
          (Statement)`return result;`
        ];
    Statement* body = statementStar(stats);     
     
	return (Expression)`(() =\> { <Statement* body> })()`;
}

private Expression convertToCSArray( list[Expression] es ) {
	Expression result = toArray(es);
	return (Expression)`<Expression result>.shift()`;
}

private Statement* convertToStatementStar( Declarator d, list[Expression] es ) {
	Statement* result = stmEmpty();
	
	for( Expression e <- es ) {
		Statement variable;
		if( (Expression)`<Id var> = <Expression val>` := e ) {
			variable = (Statement)`<Declarator d> <Id var> = <Expression val>;`;
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
		list[Expression] destructure := destructureNoRef( (Expression)`<Id ref>`, ref, 1, pattern ),
		Statement* result := convertToStatementStar( (Declarator)`var`, destructure );

private default Statement* checkForDefaultFunctionValue( AssignmentPattern _, Statement* body )
	= body;
private Statement* checkForDefaultFunctionValue( AssignmentPattern pattern, Statement* body )
	= scope( body )
	when 
		   /(Function)`function(<{Param ","}* _>) { <Statement* _> }` := pattern 
		|| /(Function)`function <Id _>(<{Param ","}* _>) { <Statement* _> }` := pattern;