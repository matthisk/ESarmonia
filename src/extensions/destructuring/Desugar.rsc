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
		/(Expression)`<AssignmentPattern _> = <Expression _>` := src;

private Source desugarExpressionAssignmentPatterns( Source src ) {
	return top-down-break visit( src ) {
		case Function _ : ;
		case (Statement)`<AssignmentPattern pattern> = <Expression ref>;` => (Statement)`{ <Statement* stms> }` 
			when Statement* stms := destructureAssignmentPattern( ref, pattern )
	}
}

private Statement* desugarBody( AssignmentPattern pattern, Id ref, Statement* body )
	= concat( destructure, body )
	when
		Statement* destructure := destructureAssignmentPattern( ref, pattern );
		
private default int nameRef( (Params)`` ) = 0;
private default int nameRef( (Params)`<Param p>,<{Param ","}* ps>` ) = nameRef( params( ps ) );
private int nameRef( (Params)`<AssignmentPattern _>,<{Param ","}* ps>` ) = 1 + nameRef( params( ps ) );

private Statement* destructureAssignmentPattern( Id ref, (AssignmentPattern)`<ObjectDestructure des>` )
	= initializeArrayDestructure( ref, [Id]"<ref>2", 1, pattern );
	
private Statement* destructureAssignmentPattern( Id ref, (AssignmentPattern)`<ArrayDestructure pattern>` )
	= initializeArrayDestructure( ref, [Id]"<ref>2", 1, pattern );
private Statement* destructureAssignmentPattern( Expression val, (AssignmentPattern)`<ArrayDestructure pattern>` )
	= initializeArrayDestructure( val, [Id]"ref", 1, pattern );

private default int sizeArrayDestructure( (ArrayDestructure)`[]` ) = 0;
private int sizeArrayDestructure( (ArrayDestructure)`[ <AssignmentElement _>, <{AssignmentElement ","}* ps> ]` ) 
	= 1 + sizeArrayDestructure( (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );

// Destructure Array
private Statement* initializeArrayDestructure( arr:(Expression)`[ <{ArgExpression ","}* args> ]`, Id ref, int nesting, ArrayDestructure destructure )
	= result
	when
		Statement* destructure := arrayDestructure( ref, ref, nesting, 0, destructure ),
		(Statement)`{ <Statement* result> }` := (Statement)`{ var <Id ref> = <Expression arr>; <Statement* destructure> }`;
private Statement* initializeArrayDestructure( Expression original, Id ref, int nesting, ArrayDestructure destructure )
	= result
	when
		Expression size := [Expression]"<sizeArrayDestructure( destructure )>",
		Statement* destructure := arrayDestructure( ref, ref, nesting, 0, destructure ),
		(Statement)`{ <Statement* result> }` := (Statement)`{ var <Id ref> = _slicedToArray( <Expression original>, <Expression size> ); <Statement* destructure> }`;
private Statement* initializeArrayDestructure( Id originalRef, Id ref, int nesting, ArrayDestructure destructure )
	= result
	when
		Expression size := [Expression]"<sizeArrayDestructure( destructure )>",
		Statement* destructure := arrayDestructure( originalRef, ref, nesting, 0, destructure ),
		(Statement)`{ <Statement* result> }` := (Statement)`{ var <Id ref> = _slicedToArray( <Id originalRef>, <Expression size>); <Statement* destructure> }`;

private Statement* arrayDestructure( _, _, _, _, (ArrayDestructure)`[]` ) = stmEmpty();
private Statement* arrayDestructure( Id originalRef, Id ref, int nesting, int index, (ArrayDestructure)`[ <AssignmentElement p>, <{AssignmentElement ","}* ps> ]` )
	= concat( stms, rest )
	when
		Expression i := [Expression]"<index>",
		Statement* stms := arrayElementDestructure( originalRef, ref, nesting, i, p ),
		Statement* rest := arrayDestructure( originalRef, ref, nesting, index + 1, (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );

// Destructure Array Element
private Statement* arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName>` )
	= statementStar( (Statement)`var <Id pName> = <Id ref>[<Expression index>];` );
private Statement* arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName> = <Expression defaultValue>` )
	= statementStar( (Statement)`var <Id pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>;` )
	when
		Expression refAtIndex := (Expression)`<Id ref>[<Expression index>]`;
private Statement* arrayElementDestructure( Id originalRef, Id ref, int nesting, Expression index, (AssignmentElement)`<ArrayDestructure des>` )
	= initializeArrayDestructure( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<ref>$<nesting>", nesting + 1, des );
