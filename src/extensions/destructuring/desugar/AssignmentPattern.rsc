module extensions::destructuring::desugar::AssignmentPattern
extend desugar::Desugar;

import IO;
import extensions::destructuring::Syntax;
import extensions::destructuring::desugar::Util;

alias State = tuple[ Id original, Id name, int nesting, int index ];

list[Expression] destructure( Expression original, Id name, int nesting, AssignmentPattern pattern )
	= assignment( name, original, pattern ) + destructurePattern( name, name, nesting, pattern );

// assignment
private Expression assignment( Id name, Expression original, (AssignmentPattern)`<ObjectDestructure _>` )
	= (Expression)`<Id name> = <Expression original>`;
private Expression assignment( Id name, arr:(Expression)`[ <{ArgExpression ","}* args> ]`, _ )
	= (Expression)`<Id name> = <Expression arr>`;
private Expression assignment( Id name, arr:(Expression)`[ <{ArgExpression ","}* args>, ]`, _ )
	= (Expression)`<Id name> = <Expression arr>`;
private default Expression assignment( Id name, Expression original, AssignmentPattern pattern )
	= (Expression)`<Id name> = _slicedToArray( <Expression original>, <Expression size> )`
	when Expression size := size( pattern );
private Expression assignment( Id name, Expression original, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` )
	= (Expression)`<Id name> = _toArray( <Expression original> )`;
private Expression assignment( Id name, Expression original, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<Id rest>, ]` )
	= (Expression)`<Id name> = _toArray( <Expression original> )`;
	
// destructurePattern
private default list[Expression] destructurePattern( Id original, Id name, int nesting, AssignmentPattern pattern )
	= destructuring( <original, name, nesting, 0>, pattern );
private list[Expression] destructurePattern( Id original, Id name, int nesting, pattern:(AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` )
	= destructure + remainder
	when
		AssignmentPattern strippedPattern := (AssignmentPattern)`[ <{AssignmentElement ","}* ps> ]`, 
		Expression size := [Expression]"<sizeArrayDestructure(strippedPattern)>",
		Expression remainder := (Expression)`<Id rest> = <Id name>.slice(<Expression size>)`,
		list[Expression] destructure := destructuring( <original, name, nesting, 0>, strippedPattern );
private list[Expression] destructurePattern( Id original, Id name, int nesting, pattern:(AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<Id rest>, ]` )
	= destructurePattern( original, name, nesting, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<Id rest> ]` );

// destructuring
private list[Expression] destructuring( State s, AssignmentPattern pattern )
	= destructuringHelper( s, pop( pattern ) );

private default list[Expression] destructuringHelper( _, false ) = [];
private list[Expression] destructuringHelper( State s, <p,ps> )
	= elem + rest
	when
		AssignmentPattern restPattern := createPattern( ps ),
		list[Expression] elem := assignmentDestructure( s, p ),
		list[Expression] rest := destructuring( s[index=s.index+1], restPattern );

// AssignmentDestructure
private list[Expression] assignmentDestructure( State s, (AssignmentElement)`<Id pName>` )
	= [ (Expression)`<Id pName> = <Id name>[<Expression index>]` ]
	when
		Expression index := [Expression]"<s.index>",
		Id name := s.name;
private list[Expression] assignmentDestructure( State s, (AssignmentProperty)`<Id pName>` )
	= [ (Expression)`<Id pName> = <Id name>.<Id pName>` ]
	when
		Id name := s.name;
		
private list[Expression] assignmentDestructure( State s, (AssignmentElement)`<Id pName> = <Expression defaultValue>` )
	= [ (Expression)`<Id pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>` ]
	when
		Expression index := [Expression]"<s.index>",
		Id name := s.name,
		Expression refAtIndex := (Expression)`<Id name>[<Expression index>]`;
private list[Expression] assignmentDestructure( State s, (AssignmentProperty)`<Id pName> = <Expression defaultValue>` )
	= [ (Expression)`<Id pName> = <Expression ref> === undefined ? <Expression defaultValue> : <Expression ref>` ]
	when
		Id name := s.name,
		Expression ref := (Expression)`<Id name>.<Id pName>`;
		
private list[Expression] assignmentDestructure( State s, (AssignmentProperty)`<Id kName> : <Id vName>` )
	= [ (Expression)`<Id vName> = <Id name>.<Id kName>` ]
	when
		Id name := s.name;

private list[Expression] assignmentDestructure( State s, (AssignmentProperty)`<Id pName> : <AssignmentPattern pattern>` )
	= destructure( (Expression)`<Id originalRef>.<Id pName>`, pName, s.nesting + 1, pattern )
	when
		Id originalRef := s.original;
	
private list[Expression] assignmentDestructure( State s, (AssignmentElement)`<AssignmentPattern pattern>` )
	= destructure( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<s.name>$<s.nesting>", s.nesting + 1, pattern )
	when
		Id originalRef := s.original,
		Expression index := [Expression]"<s.index>";