module desugar::Desugar

import core::Syntax;
import ParseTree;

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;
default Function desugar( Function f ) = f;
default Source desugar( Source src ) = src;


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

private Params params( {Param ","}* ps ) = (Params)`<{Param ","}* ps>`;

private {Param ","}* psEmpty()
	= empty
	when (Function)`function(<{Param ","}* empty>) {}` := (Function)`function() {}`;
		
private Statement* stmEmpty()
	= empty
	when (Statement)`{ <Statement* empty> }` := (Statement)`{}`;