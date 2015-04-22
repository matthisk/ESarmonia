module extensions::destructuring::Desugar
extend desugar::Desugar;

import IO;
import extensions::destructuring::Syntax;

Function desugar( (Function)`function( <{Param ","}* bef>, <AssignmentPattern pattern>, <{Param ","}* rest> ) { <Statement* body> }` )
	= (Function)`function( <{Param ","}* bef>, <Id ref>, <{Param ","}* rest> ) { <Statement* desBody> }`
	when
		int refs := nameRef( params( rest ) ),
		Id ref := [Id]"_ref<refs>",
		Statement* desBody := desugarBody( pattern, ref, body );

Statement desugar( (Statement)`var <AssignmentPattern pattern> = <Expression val>;` )
	= (Statement)`{ <Statement* result> }`
	when
		Statement* result := destructureAssignmentPattern( val, pattern ); 

Source desugar( Source src ) 
	= desugarExpressionAssignmentPatterns( src )
	when 
		/(Expression)`[<{ArgExpression ","}* _>] = <Expression _>` := src;

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
	return bottom-up visit( src ) {
		case (Expression)`[<{ArgExpression ","}* args>] = <Expression val>`
			=>
			(Expression)`<Expression e>.shift()`
		when
			str pattern := "<(Expression)`[<{ArgExpression ","}* args>]`>",
			AssignmentPattern pattern := [AssignmentPattern]"<pattern>",
			list[Expression] destructure := destructureAssignmentPattern( val, pattern ),
			(Expression) e := convertToCSArray( destructure )
	}
}

Expression convertToCSArray( list[Expression] es ) {
	Expression result = (Expression)`[]`; 
	
	for( e <- es ) {
		if( (Expression)`[ <{ArgExpression ","}* done> ]` := result ) {
			result = (Expression)`[<{ArgExpression ","}* done>, <Expression e> ]`;
		}
	}
	
	return result;
}

private Statement* desugarBody( AssignmentPattern pattern, Id ref, Statement* body )
	= concat( destructure, body )
	when
		Statement* destructure := destructureAssignmentPattern( ref, pattern );
		
private default int nameRef( (Params)`` ) = 0;
private default int nameRef( (Params)`<Param p>,<{Param ","}* ps>` ) = nameRef( params( ps ) );
private int nameRef( (Params)`<AssignmentPattern _>,<{Param ","}* ps>` ) = 1 + nameRef( params( ps ) );

private default int sizeArrayDestructure( (ArrayDestructure)`[]` ) = 0;
private int sizeArrayDestructure( (ArrayDestructure)`[ <AssignmentElement _>, <{AssignmentElement ","}* ps> ]` ) 
	= 1 + sizeArrayDestructure( (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );

private list[Expression] destructureAssignmentPattern( Id ref, (AssignmentPattern)`<ObjectDestructure des>` )
	= initializeArrayDestructure( ref, [Id]"<ref>2", 1, pattern );
private list[Expression] destructureAssignmentPattern( Id ref, (AssignmentPattern)`<ArrayDestructure pattern>` )
	= initializeArrayDestructure( ref, [Id]"<ref>2", 1, pattern );
private list[Expression] destructureAssignmentPattern( Expression val, (AssignmentPattern)`<ArrayDestructure pattern>` )
	= initializeArrayDestructure( val, [Id]"ref", 1, pattern );

// initializeArrayDestructure
private list[Expression] initializeArrayDestructure( arr:(Expression)`[ <{ArgExpression ","}* args> ]`, Id ref, int nesting, ArrayDestructure destructure )
	= init( (Expression)`<Id ref> = <Expression arr>`, ref, ref, nesting, destructure );
private list[Expression] initializeArrayDestructure( Expression original, Id ref, int nesting, ArrayDestructure destructure )
	= init( (Expression)`<Id ref> = _slicedToArray( <Expression original>, <Expression size> )`, ref, ref, nesting, destructure )
	when 
		Expression size := [Expression]"<sizeArrayDestructure( destructure )>";
private list[Expression] initializeArrayDestructure( Id originalRef, Id ref, int nesting, ArrayDestructure destructure )
	= init( (Expression)`<Id ref> = _slicedToArray( <Id originalref>, <Expression size> )`, originalRef, ref, nesting, destructure )
	when Expression size := [Expression]"<sizeArrayDestructure( destructure )>";

// init
private list[Expression] init( Expression i, Id originalRef, Id ref, int nesting, ArrayDestructure destructure )
	= i + des
	when list[Expression] des := arrayDestructure( originalRef, ref, nesting, 0, destructure );

// arrayDestructure
private list[Expression] arrayDestructure( _, _, _, _, (ArrayDestructure)`[]` ) = [];
private list[Expression] arrayDestructure( Id originalRef, Id ref, int nesting, int index, (ArrayDestructure)`[ <AssignmentElement p>, <{AssignmentElement ","}* ps> ]` )
	= elem + rest 
	when
		Expression i := [Expression]"<index>",
		list[Expression] elem := arrayElementDestructure( originalRef, ref, nesting, i, p ),
		list[Expression] rest := arrayDestructure( originalRef, ref, nesting, index + 1, (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );

// arrayElementDestructure
private list[Expression] arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName>` )
	= [ (Expression)`<Id pName> = <Id ref>[<Expression index>]` ];
private list[Expression] arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName> = <Expression defaultValue>` )
	= [ (Expression)`<Id pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>` ]
	when
		Expression refAtIndex := (Expression)`<Id ref>[<Expression index>]`;
private list[Expression] arrayElementDestructure( Id originalRef, Id ref, int nesting, Expression index, (AssignmentElement)`<ArrayDestructure des>` )
	= initializeArrayDestructure( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<ref>$<nesting>", nesting + 1, des );

//// Destructure Array
//private Statement* initializeArrayDestructure( arr:(Expression)`[ <{ArgExpression ","}* args> ]`, Id ref, int nesting, ArrayDestructure destructure )
//	= result
//	when
//		Statement* destructure := arrayDestructure( ref, ref, nesting, 0, destructure ),
//		(Statement)`{ <Statement* result> }` := (Statement)`{ <Id ref> = <Expression arr>; <Statement* destructure> }`;
//private Statement* initializeArrayDestructure( Expression original, Id ref, int nesting, ArrayDestructure destructure )
//	= result
//	when
//		Expression size := [Expression]"<sizeArrayDestructure( destructure )>",
//		Statement* destructure := arrayDestructure( ref, ref, nesting, 0, destructure ),
//		(Statement)`{ <Statement* result> }` := (Statement)`{ <Id ref> = _slicedToArray( <Expression original>, <Expression size> ); <Statement* destructure> }`;
//private Statement* initializeArrayDestructure( Id originalRef, Id ref, int nesting, ArrayDestructure destructure )
//	= result
//	when
//		Expression size := [Expression]"<sizeArrayDestructure( destructure )>",
//		Statement* destructure := arrayDestructure( originalRef, ref, nesting, 0, destructure ),
//		(Statement)`{ <Statement* result> }` := (Statement)`{ <Id ref> = _slicedToArray( <Id originalRef>, <Expression size>); <Statement* destructure> }`;
//
//private Statement* arrayDestructure( _, _, _, _, (ArrayDestructure)`[]` ) = stmEmpty();
//private Statement* arrayDestructure( Id originalRef, Id ref, int nesting, int index, (ArrayDestructure)`[ <AssignmentElement p>, <{AssignmentElement ","}* ps> ]` )
//	= concat( stms, rest )
//	when
//		Expression i := [Expression]"<index>",
//		Statement* stms := arrayElementDestructure( originalRef, ref, nesting, i, p ),
//		Statement* rest := arrayDestructure( originalRef, ref, nesting, index + 1, (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );
//
//// Destructure Array Element
//private Statement* arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName>` )
//	= statementStar( (Statement)`<Id pName> = <Id ref>[<Expression index>];` );
//private Statement* arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName> = <Expression defaultValue>` )
//	= statementStar( (Statement)`<Id pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>;` )
//	when
//		Expression refAtIndex := (Expression)`<Id ref>[<Expression index>]`;
//private Statement* arrayElementDestructure( Id originalRef, Id ref, int nesting, Expression index, (AssignmentElement)`<ArrayDestructure des>` )
//	= initializeArrayDestructure( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<ref>$<nesting>", nesting + 1, des );
