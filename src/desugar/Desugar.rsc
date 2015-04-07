module desugar::Desugar

import lang::javascript::saner::Syntax;
import ParseTree;

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;