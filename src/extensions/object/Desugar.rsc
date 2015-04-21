module extensions::object::Desugar
extend desugar::Desugar;

import IO;
import extensions::object::Syntax;

@doc{ Here trailing commas in object literal notation are removed,
it is either this solution, or creating separate functions for
all property desugarings including the trailing comma. }
Expression desugar( (Expression)`{ <{PropertyAssignment ","}* props>, }` )
	= (Expression)`{ <{PropertyAssignment ","}* props> }`;

Expression desugar( (Expression)`{ <{PropertyAssignment ","}* bef>, <Id prop>, <{PropertyAssignment ","}* rest> }` )
	= (Expression)`{ <{PropertyAssignment ","}* bef>, <Id prop> : <Id prop>, <{PropertyAssignment ","}* rest> }`;

Expression desugar( (Expression)`{ <{PropertyAssignment ","}* bef>, <Id name>(<Params ps>) { <Statement* body> }, <{PropertyAssignment ","}* rest> }` )
	= (Expression)`{ <{PropertyAssignment ","}* bef>, <PropertyAssignment prop>, <{PropertyAssignment ","}* rest> }`
	when
		PropertyAssignment prop := (PropertyAssignment)`<Id name> : function(<Params ps>) { <Statement* body> }`;
	
Expression desugar( (Expression)`{ <{PropertyAssignment ","}* bef>, [ <Expression key> ] : <Expression val>, <{PropertyAssignment ","}* rest> }` )
	= (Expression)`_defineProperty(<Expression obj>, <Expression key>, <Expression val>)`
	when
		Expression obj := (Expression)`{ <{PropertyAssignment ","}* bef>, <{PropertyAssignment ","}* rest> }`;