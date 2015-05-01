module desugar::Desugar

import desugar::Declarations;
import core::Syntax;
import ParseTree;

anno Statement Expression@runtime;
anno Statement Statement@runtime;

private Expression setRuntime( Expression e, Statement rt )
	= e[@runtime = rt];
private Statement setRuntime( Statement s, Statement rt )
	= s[@runtime = rt];

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;
default Function desugar( Function f ) = f;
default Source desugar( Source src ) = src;

private Statement* scope( Statement* body ) 
	= statementStar( f )
	when
		Statement f := (Statement)`return (function() { <Statement* body> })();`;

bool empty( Statement* stms )
	= (Statement)`{}` := (Statement)`{ <Statement* stms> }`;

private default Statement* unscope( Statement s ) = statementStar( s );
private Statement* unscope( (Statement)`{ <Statement* res> }` )
	= res;

private Statement* statementStar( Statement s ) 
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement s> }`;

private Statement* \append( Statement* ss, Statement s )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement* ss> <Statement s> }`;

private Statement* prepend( Statement s, Statement* ss )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement s> <Statement* ss> }`;

private Statement* concat( Statement* strt, Statement* rest )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement* strt> <Statement* rest> }`;  

private Params params( Param p ) = (Params)`<Param p>`;
private Params params( {Param ","}* ps ) = (Params)`<{Param ","}* ps>`;

private {Param ","}* psEmpty()
	= empty
	when (Function)`function(<{Param ","}* empty>) {}` := (Function)`function() {}`;
		
private Statement* stmEmpty()
	= empty
	when (Statement)`{ <Statement* empty> }` := (Statement)`{}`;