@cachedParser{desugar.cached.Parser}
module extensions::parameters::Desugar
extend desugar::Base;
extend extensions::parameters::Syntax;

import IO;

Function desugar( f:(Function)`function <Id name>( ...<Id rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function <Id name>() { 
				'	<Statement desBody> 
				'}`
	when
		Statement* desBody := spreadParameter( rest, 0, body, generateUId );

Function desugar( f:(Function)`function( ...<Id rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function() { 
				'	<Statement desBody> 
				'}`
	when
		Statement* desBody := spreadParameter( rest, 0, body, generateUId );

Function desugar( f:(Function)`function <Id name>( <{Param ","}* ps>, ...<Id rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function <Id name>( <{Param ","}* ps> ) { 
				'	<Statement* desBody> 
				'}`
	when
		Statement* desBody := spreadParameter( rest, size( (Params)`<{Param ","}* ps>` ), body, generateUId );

Function desugar( f:(Function)`function ( <{Param ","}* ps>, ...<Id rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function( <{Param ","}* ps> ) { 
				'	<Statement* desBody> 
				'}`
	when
		Statement* desBody := spreadParameter( rest, size( (Params)`<{Param ","}* ps>` ), body, generateUId );

Function desugar( f:(Function)`function <Id name>( <{Param ","}* bef>, <Id pr> = <Expression defVal>, <{Param ","}* rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function <Id name>(<{Param ","}* bef>, <Param p>, <{Param ","}* rest>) { 
				'	<Statement* desBody> 
				'}`
	when
		Param p := (Param)`<Id pr>`,
		Statement* desBody := defaultParameter( pr, defVal, size((Params)`<{Param ","}* bef>`), body );

Function desugar( f:(Function)`function ( <{Param ","}* bef>, <Id pr> = <Expression defVal>, <{Param ","}* rest> ) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function(<{Param ","}* bef>, <Param p>, <{Param ","}* rest>) { 
				'	<Statement* desBody> 
				'}`
	when
		Param p := (Param)`<Id pr>`,
		Statement* desBody := defaultParameter( pr, defVal, size((Params)`<{Param ","}* bef>`), body );
	
private int size( (Params)`<{Param ","}* ps>` )
	= ( 0 | it + 1 | _ <- ps );

private Statement* spreadParameter( Id param, int pos, Statement* body, Id(str) generateUId )
	= prepend( restInit, body )
	when
		Id len := generateUId("_len"),
		Expression key := [Expression]"<pos>",
		Statement restInit := (Statement)`for( var <Id len> = arguments.length, <Id param> = Array( <Id len> \> 1 ? <Id len> - 1 : 0 ), _key = <Expression key>; _key \< <Id len>; _key++) { 
										 '	<Id param>[_key - 1] = arguments[_key]; 
										 '}`;

private Statement* defaultParameter( Id param, Expression defVal, int pos, Statement* body )
	= prepend( defInit, body )
	when
		Expression pos := [Expression]"<pos>",
		Statement defInit := (Statement)`var <Id param> = arguments[<Expression pos>] === undefined ? <Expression defVal> : arguments[<Expression pos>];`;