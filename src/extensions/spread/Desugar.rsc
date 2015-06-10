module extensions::spread::Desugar
extend desugar::Base;
extend extensions::spread::Syntax;

import IO;
import extensions::spread::Runtime;

alias RefScope = tuple[ Expression, Expression ];

Expression desugar( (Expression)`<Expression f>( <{ArgExpression ","}* bef>, ...<Expression arr>, <{ArgExpression ","}* rest> )`, Id(str) generateUId )
	= (Expression)`<Expression ref>.apply(<Expression scope>,<Expression arguments>)`
	when
		< Expression ref, Expression scope > := deriveScope( f, generateUId ),
		Expression arguments := desugar( (Expression)`[<{ArgExpression ","}* bef>, ...<Expression arr>, <{ArgExpression ","}* rest>]`, generateUId );

Expression desugar( (Expression)`[ ...<Expression arr> ]`, Id(str) generateUId )
	= desugarToConsumableArray( arr );

Expression desugar( (Expression)`[ <{ArgExpression ","}* bef>, ...<Expression arr>, <{ArgExpression ","}* rest> ]`, Id(str) generateUId )
	= (Expression)`[<{ArgExpression ","}* bef>].concat(<Expression arr>, <{ArgExpression ","}* desRest>)`
	when
		Expression arr := desugarToConsumableArray( arr ),
		(Expression)`[<{ArgExpression ","}* desRest>]` := desugarSpread( (Expression)`[<{ArgExpression ","}* rest>]` );

private Expression desugarToConsumableArray( e:(Expression)`[ <{ArgExpression ","}* _> ]` ) = e;
private Expression desugarToConsumableArray( e:(Expression)`[ <{ArgExpression ","}* _> , ]` ) = e;
private default Expression desugarToConsumableArray( Expression e ) = setRuntime( (Expression)`_toConsumableArray(<Expression e>)`, _toConsumableArray );
private Expression desugarToConsumableArray( (Expression)`<Id name>` ) = setRuntime( (Expression)`_toConsumableArray(<Id name>)`, _toConsumableArray );
private Expression desugarToConsumableArray( (Expression)`<Literal lit>` ) = setRuntime( (Expression)`_toConsumableArray(<Literal lit>)`, _toConsumableArray );

private Expression desugarSpread( e:(Expression)`[]` ) = (Expression)`[]`;
private default Expression desugarSpread( e:(Expression)`[<{ArgExpression ","}* els>]` ) = (Expression)`[<Expression e>]`;		

private Expression desugarSpread( (Expression)`[<{ArgExpression ","}* bef>, ...<Expression arr>]` )
	= (Expression)`[[<{ArgExpression ","}* bef>], <Expression arr>]`
	when
		Expression arr := desugarToConsumableArray( arr );

private Expression desugarSpread( (Expression)`[<{ArgExpression ","}* bef>, ...<Expression arr>, <{ArgExpression ","}* rest>]` )
	= (Expression)`[[<{ArgExpression ","}* bef>], <Expression arr>, [<{ArgExpression ","}* desRest>]]`
	when
		Expression arr := desugarToConsumableArray( arr ),
		(Expression)`[<{ArgExpression ","}* desRest>]` := desugarSpread( (Expression)`[<{ArgExpression ","}* rest>]` );
		
private default RefScope deriveScope( (Expression)`<Expression f>`, Id(str) generateUId ) 
	= < (Expression)`(<Id ref> = <Expression f>)`, (Expression)`<Id ref>` >
	when Id ref := generateUId("_ref");
private default RefScope deriveScope( e:(Expression)`<Expression f>.<Id n>`, Id(str) generateUId )
	= < e, f >;
private RefScope deriveScope( e:(Expression)`<Id n>`, Id(str) generateUId ) 
	= < e, (Expression)`undefined` >;
private RefScope deriveScope( (Expression)`<Expression f>[ <Expression index> ]` ) 
	= < (Expression)`(<Id refName> = <Expression f>)[<Expression index>]`, (Expression)`<Id refName>` >
	when
		Id refName := generateUId("<deriveRefName(f)>");
private RefScope deriveScope( e:(Expression)`<Expression f>( <{ArgExpression ","}* _> )`, Id(str) generateUId ) 
	= < e, (Expression)`undefined` >; 
private RefScope deriveScope( (Expression)`<Expression obj>.<Id n>.<Id n2>`, Id(str) generateUId ) 
	= < (Expression)`(<Id refName> = <Expression f>).<Id n2>`, (Expression)`<Id refName>` >
	when
		Expression f := (Expression)`<Expression obj>.<Id n>`,
		Id refName := generateUId("<deriveRefName(f)>");
	
private default str deriveRefName( Expression e ) = "_";
private str deriveRefName( (Expression)`<Id n>` ) = "_<n>";
private str deriveRefName( (Expression)`<Expression f>[ <Expression index> ]` ) = deriveRefName( f );
private str deriveRefName( (Expression)`<Expression f>( <{ArgExpression ","}* _> )` ) = deriveRefName( f ); 
private str deriveRefName( (Expression)`<Expression f>.<Id n>` ) = deriveRefName(f) + "$<n>";