module extensions::destructuring::desugar::Array
extend desugar::Desugar;

import IO;
import extensions::destructuring::Syntax;
import extensions::destructuring::desugar::Util;

list[Expression] destructureArray( &T <: Tree original, Id name, int nesting, ArrayDestructure pattern )
	= destructurePattern( assignment( name, original, pattern ), name, name, nesting, pattern );

// assignment
private Expression assignment( Id name, arr:(Expression)`[ <{ArgExpression ","}* args> ]`, _ )
	= (Expression)`<Id name> = <Expression arr>`;
private default Expression assignment( Id name, Expression val, ArrayDestructure pattern )
	= (Expression)`<Id name> = _slicedToArray( <Expression val>, <Expression size> )`
	when Expression size := size( pattern );
private default Expression assignment( Id name, Id original, ArrayDestructure pattern )
	= (Expression)`<Id name> = _slicedToArray( <Id original>, <Expression size> )`
	when Expression size := size( pattern ); 
private Expression assignment( Id name, Id original, (ArrayDestructure)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` )
	= (Expression)`<Id name> = _toArray( <Id original> )`;
private Expression assignment( Id name, Expression val, (ArrayDestructure)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` )
	= (Expression)`<Id name> = _slicedToArray( <Expression val> )`;
	
// destructurePattern
private default list[Expression] destructurePattern( Expression assignment, Id original, Id name, int nesting, ArrayDestructure pattern )
	= assignment + destructure
	when list[Expression] destructure := destructuring( original, name, nesting, 0, pattern );
private list[Expression] destructurePattern( Expression assignment, Id original, Id name, int nesting, pattern:(ArrayDestructure)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` )
	= assignment + destructure + remainder
	when
		ArrayDestructure strippedPattern := (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]`, 
		Expression size := [Expression]"<sizeArrayDestructure(strippedPattern)>",
		Expression remainder := (Expression)`<Id rest> = <Id name>.slice(<Expression size>)`,
		list[Expression] destructure := destructuring( original, name, nesting, 0, strippedPattern );

// destructuring
private list[Expression] destructuring( _, _, _, _, (ArrayDestructure)`[]` ) = [];
private list[Expression] destructuring( Id originalRef, Id ref, int nesting, int index, (ArrayDestructure)`[ <AssignmentElement p>, <{AssignmentElement ","}* ps> ]` )
	= elem + rest 
	when
		Expression i := [Expression]"<index>",
		list[Expression] elem := arrayElementDestructure( originalRef, ref, nesting, i, p ),
		list[Expression] rest := destructuring( originalRef, ref, nesting, index + 1, (ArrayDestructure)`[ <{AssignmentElement ","}* ps> ]` );

// arrayElementDestructure
private list[Expression] arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName>` )
	= [ (Expression)`<Id pName> = <Id ref>[<Expression index>]` ];
private list[Expression] arrayElementDestructure( _, Id ref, _, Expression index, (AssignmentElement)`<Id pName> = <Expression defaultValue>` )
	= [ (Expression)`<Id pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>` ]
	when
		Expression refAtIndex := (Expression)`<Id ref>[<Expression index>]`;
private list[Expression] arrayElementDestructure( Id originalRef, Id ref, int nesting, Expression index, (AssignmentElement)`<ArrayDestructure pattern>` )
	= destructureArray( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<ref>$<nesting>", nesting + 1, pattern );