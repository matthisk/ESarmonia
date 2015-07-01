module desugar::Base

import ParseTree;
import core::Syntax;
import desugar::Tools;

anno Statement Expression@runtime;
anno Statement Statement@runtime;

Expression setRuntime( Expression e, Statement rt )
	= e[@runtime = rt];
Statement setRuntime( Statement s, Statement rt )
	= s[@runtime = rt];

default Statement desugar( Statement s, _ ) = s;
default Expression desugar( Expression e, _ ) = e;
default Function desugar( Function f, _ ) = f;
default Source desugar( Source src, _ ) = src;