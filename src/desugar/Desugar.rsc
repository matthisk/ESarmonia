module desugar::Desugar

import core::Syntax;
import ParseTree;

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;
default Function desugar( Function f ) = f;
default Source desugar( Source src ) = src;

private {Id ","}* psEmpty()
	= empty
	when (Function)`function(<{Id ","}* empty>) {}` := (Function)`function() {}`;
		
private Statement* stmEmpty()
	= empty
	when (Statement)`{ <Statement* empty> }` := (Statement)`{}`;