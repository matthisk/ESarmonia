module extensions::parameters::Desugar
extend desugar::Base;

import IO;
import extensions::parameters::Syntax;

Function desugar( f:(Function)`function <Id name>( ...<Id rest> ) { <Statement* body> }` )
	= (Function)`function <Id name>() { <Statement desBody> }`
	when
		Statement* desBody := spreadParameter( rest, 0, body );

Function desugar( f:(Function)`function( ...<Id rest> ) { <Statement* body> }` )
	= (Function)`function() { <Statement desBody> }`
	when
		Statement* desBody := spreadParameter( rest, 0, body );

Function desugar( f:(Function)`function <Id name>( <{Param ","}* ps>, ...<Id rest> ) { <Statement* body> }` )
	= (Function)`function <Id name>( <{Param ","}* ps> ) { <Statement* desBody> }`
	when
		Statement* desBody := spreadParameter( rest, size( (Params)`<{Param ","}* ps>` ), body );

Function desugar( f:(Function)`function ( <{Param ","}* ps>, ...<Id rest> ) { <Statement* body> }` )
	= (Function)`function( <{Param ","}* ps> ) { <Statement* desBody> }`
	when
		Statement* desBody := spreadParameter( rest, size( (Params)`<{Param ","}* ps>` ), body );

Function desugar( f:(Function)`function <Id name>( <{Param ","}* bef>, <Id pr> = <Expression defVal>, <{Param ","}* rest> ) { <Statement* body> }` )
	= (Function)`function <Id name>(<{Param ","}* bef>, <Param p>, <{Param ","}* rest>) { <Statement* desBody> }`
	when
		Param p := (Param)`<Id pr>`,
		Statement* desBody := defaultParameter( pr, defVal, size((Params)`<{Param ","}* bef>`), body );

Function desugar( f:(Function)`function ( <{Param ","}* bef>, <Id pr> = <Expression defVal>, <{Param ","}* rest> ) { <Statement* body> }` )
	= (Function)`function(<{Param ","}* bef>, <Param p>, <{Param ","}* rest>) { <Statement* desBody> }`
	when
		Param p := (Param)`<Id pr>`,
		Statement* desBody := defaultParameter( pr, defVal, size((Params)`<{Param ","}* bef>`), body );
	
private default int size( (Params)`` ) = 0;
private default int size( (Params)`<Param _>` ) = 1;
private int size( (Params)`<Param _>,<{Param ","}* ps>` ) = 1 + size( params )
	when Params params := (Params)`<{Param ","}* ps>`;

private Statement* spreadParameter( Id param, int pos, Statement* body )
	= prepend( restInit, body )
	when
		Expression key := [Expression]"<pos>",
		Statement restInit := (Statement)`for( var _len = arguments.length, <Id param> = Array( _len \> 1 ? _len - 1 : 0 ), _key = <Expression key>; _key \< _len; _key++) { <Id param>[_key - 1] = arguments[_key]; }`;

private Statement* defaultParameter( Id param, Expression defVal, int pos, Statement* body )
	= prepend( defInit, body )
	when
		Expression pos := [Expression]"<pos>",
		Statement defInit := (Statement)`var <Id param> = arguments[<Expression pos>] === undefined ? <Expression defVal> : arguments[<Expression pos>];`;