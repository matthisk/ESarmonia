module extensions::destructuring::desugar::AssignmentPattern

import desugar::Declarations;
import IO;
import extensions::destructuring::Syntax;
import extensions::destructuring::desugar::Util;
import extensions::destructuring::Runtime;

alias State = tuple[ Id original, Id name, int nesting, int index ];
alias Destructuring = list[Part];

data Part = expr( Expression e ) | id( Id id );

default Destructuring destructureNoRef( Expression original, Id name, int nesting, AssignmentPattern pattern )
	= destructure( original, name, nesting, pattern );
Destructuring destructureNoRef( (Expression)`<Id _>`, Id name, int nesting, pattern:(AssignmentPattern)`<ObjectDestructure _>` )
	= destructurePattern( name, name, nesting, pattern ); 

default Destructuring destructure( Expression original, Id name, int nesting, AssignmentPattern pattern )
	= [expr( assignment( name, original, pattern ) )] + destructurePattern( name, name, nesting, pattern );

// assignment
Expression assignment( Id name, Expression original, (AssignmentPattern)`<ObjectDestructure _>` )
	= (Expression)`<Id name> = <Expression original>`;
Expression assignment( Id name, arr:(Expression)`[ <{ArgExpression ","}* args> ]`, _ )
	= (Expression)`<Id name> = <Expression arr>`;
Expression assignment( Id name, arr:(Expression)`[ <{ArgExpression ","}* args>, ]`, _ )
	= (Expression)`<Id name> = <Expression arr>`;
default Expression assignment( Id name, Expression original, AssignmentPattern pattern )
	= setRuntime( e, _slicedToArray )
	when 
		Expression size := size( pattern ),
		Expression e := (Expression)`<Id name> = _slicedToArray( <Expression original>, <Expression size> )`;
Expression assignment( Id name, Expression original, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<LHSExpression _> ]` )
	= setRuntime( e, _toArray )
	when
		Expression e := (Expression)`<Id name> = _toArray( <Expression original> )`;
Expression assignment( Id name, Expression original, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<LHSExpression _>, ]` )
	= setRuntime( e, _toArray )
	when
		Expression e := (Expression)`<Id name> = _toArray( <Expression original> )`;
	
// destructurePattern
default Destructuring destructurePattern( Id original, Id name, int nesting, AssignmentPattern pattern )
	= destructuring( <original, name, nesting, 0>, pattern );
Destructuring destructurePattern( Id original, Id name, int nesting, pattern:(AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<LHSExpression rest> ]` )
	= destructure + remainder
	when
		AssignmentPattern strippedPattern := (AssignmentPattern)`[ <{AssignmentElement ","}* ps> ]`, 
		Expression size := [Expression]"<sizeArrayDestructure(strippedPattern)>",
		Destructuring remainder := toRemainder( original, name, nesting, size, rest ),
		Destructuring destructure := destructuring( <original, name, nesting, 0>, strippedPattern );
Destructuring destructurePattern( Id original, Id name, int nesting, pattern:(AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<LHSExpression rest>, ]` )
	= destructurePattern( original, name, nesting, (AssignmentPattern)`[ <{AssignmentElement ","}* ps>, ...<LHSExpression rest> ]` );

Destructuring toRemainder( Id original, Id name, int nesting, Expression size, (LHSExpression)`<AssignmentPattern rest>` )
	= [id( ref )] + r 
	when
		Id ref := [Id]"<name>$slice",
		Destructuring r := destructure( (Expression)`<Id name>.slice(<Expression size>)`, ref, nesting + 1, rest );
		
Destructuring toRemainder( Id _, Id name, int _, Expression size, (LHSExpression)`<Expression rest>` )
	= [ expr( (Expression)`<Expression rest> = <Id name>.slice(<Expression size>)` ) ];

// destructuring
Destructuring destructuring( State s, AssignmentPattern pattern )
	= destructuringHelper( s, pop( pattern ) );

default Destructuring destructuringHelper( _, false ) = [];
Destructuring destructuringHelper( State s, <p,ps> )
	= elem + rest
	when
		AssignmentPattern restPattern := createPattern( ps ),
		Destructuring elem := assignmentDestructure( s, p ),
		Destructuring rest := destructuring( s[index=s.index+1], restPattern );

// AssignmentDestructure
Destructuring assignmentDestructure( State s, (AssignmentElement)`<Expression pName>` )
	= [ expr( (Expression)`<Expression pName> = <Id name>[<Expression index>]` ) ]
	when
		Expression index := [Expression]"<s.index>",
		Id name := s.name;

Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id pName>` )
	= [ expr( (Expression)`<Id pName> = <Id name>.<Id pName>` ) ]
	when
		Id name := s.name;
		
Destructuring assignmentDestructure( State s, (AssignmentElement)`<Expression pName> = <Expression defaultValue>` )
	= [ expr( (Expression)`<Expression pName> = <Expression refAtIndex> === undefined ? <Expression defaultValue> : <Expression refAtIndex>` ) ]
	when
		Expression index := [Expression]"<s.index>",
		Id name := s.name,
		Expression refAtIndex := (Expression)`<Id name>[<Expression index>]`;

Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id pName> = <Expression defaultValue>` )
	= [ expr( (Expression)`<Id pName> = <Expression ref> === undefined ? <Expression defaultValue> : <Expression ref>` ) ]
	when
		Id name := s.name,
		Expression ref := (Expression)`<Id name>.<Id pName>`;
		
Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id kName> : <Id vName>` )
	= [ expr( (Expression)`<Id vName> = <Id name>.<Id kName>` ) ]
	when
		Id name := s.name;

Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id kName> : <Id vName> = <Expression def>` )
	= [ expr( (Expression)`<Id vName> = <Id name>.<Id kName> === undefined ? <Expression def> : <Id name>.<Id kName>` ) ]
	when
		Id name := s.name;

Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id vName> = <Expression def>` )
	= [ expr( (Expression)`<Id vName> = <Id name>.<Id vName> === undefined ? <Expression def> : <Id name>.<Id vName>` ) ]
	when
		Id name := s.name;

default Destructuring assignmentDestructure( State s, (AssignmentProperty)`<PropertyName propertyName> : <AssignmentElement val>` )
	= [ expr( (Expression)`<Id vName> = <Expression init>` ) ]
	when
		Id name := s.name,
		Id vName := extractName( val ),
		Expression key := extractKey( propertyName ),
		Expression init := extractInit( val, name, key );
		
Destructuring assignmentDestructure( State s, (AssignmentProperty)`<Id pName> : <AssignmentElement element>` )
	= destructure( (Expression)`<Id originalRef>.<Id pName>`, pName, s.nesting + 1, pattern )
	when
		(AssignmentElement)`<AssignmentPattern pattern>` := element,
		Id originalRef := s.original;
	
Destructuring assignmentDestructure( State s, (AssignmentElement)`<AssignmentPattern pattern>` )
	= destructure( (Expression)`<Id originalRef>[<Expression index>]`, [Id]"<s.name>$<s.nesting>", s.nesting + 1, pattern )
	when
		Id originalRef := s.original,
		Expression index := [Expression]"<s.index>";