module desugar::Desugar

import desugar::Declarations;
import core::Syntax;
import ParseTree;

anno Statement Expression@runtime;
anno Statement Statement@runtime;

Expression setRuntime( Expression e, Statement rt )
	= e[@runtime = rt];
Statement setRuntime( Statement s, Statement rt )
	= s[@runtime = rt];

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;
default Function desugar( Function f ) = f;
default Source desugar( Source src ) = src;

Expression toStringLiteral( str s ) = [Expression]"\"<s>\"";

Statement* scope( Statement* body ) 
	= statementStar( f )
	when
		Statement f := (Statement)`return (function() { <Statement* body> })();`;

bool empty( Statement* stms )
	= (Statement)`{}` := (Statement)`{ <Statement* stms> }`;

default Statement* unscope( Statement s ) = statementStar( s );
Statement* unscope( (Statement)`{ <Statement* res> }` )
	= res;

Statement* statementStar( Statement s ) 
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement s> }`;

Statement* \append( Statement* ss, Statement s )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement* ss> <Statement s> }`;

Statement* prepend( Statement s, Statement* ss )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement s> <Statement* ss> }`;

Statement* concat( Statement* strt, Statement* rest )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement* strt> <Statement* rest> }`;  

Params params( Param p ) = (Params)`<Param p>`;
Params params( {Param ","}* ps ) = (Params)`<{Param ","}* ps>`;

{Param ","}* psEmpty()
	= empty
	when (Function)`function(<{Param ","}* empty>) {}` := (Function)`function() {}`;
		
Statement* stmEmpty()
	= empty
	when (Statement)`{ <Statement* empty> }` := (Statement)`{}`;