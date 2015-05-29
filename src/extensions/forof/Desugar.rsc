@cachedParser{desugar.cached.Parser}
module extensions::forof::Desugar
extend desugar::Base;
extend extensions::forof::Syntax;

import IO;

Statement desugar( (Statement)`for( <Declarator d> <ForBinding binding> of [ <{ArgExpression ","}* args> ] ) <Statement body>` )
	= setDeclaration( res, decl( [Id]"_arr", (Expression)`[ <{ArgExpression ","}* args> ]` ) )
	when
		Statement* body := unscope( body ),
		VariableDeclaration d := declareBinding( binding, (Expression)`_arr[i]` ),
		Statement res := (Statement)`for (var i = 0; i \< _arr.length; i++) { <Declarator d> <VariableDeclaration d>; <Statement* body> }`;

default Statement desugar( (Statement)`for( <Declarator d> <ForBinding binding> of <Expression exp> ) <Statement body>` )
	= setDeclarations( res, initialization )
	when
		Statement loop := iterableLoop( d, binding, exp, body ),
		(Statement)`{ <Statement* catchBlock> }` := (Statement)`{ _didIteratorError = true; _iteratorError = err; }`,
		Statement finalBlock := iterableFinal(),
		Statement res := (Statement)`try { <Statement loop> } catch(err) { <Statement* catchBlock> } finally { <Statement finalBlock> }`;

Statement iterableLoop( Declarator d, ForBinding binding, Expression arr, Statement body )
	= res
	when
		VariableDeclaration declaration := declareBinding( binding, (Expression)`_step.value` ),
		Statement* body := unscope( body ),
		Statement res := (Statement)`for(var _iterator = <Expression arr>[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true ) { <Declarator d> <VariableDeclaration declaration>; <Statement* body> }`;

Statement iterableFinal()
	= (Statement)`try { <Statement tryBlock> } finally { <Statement finalBlock> }`
	when
		Statement tryBlock := (Statement)`if(!_iteratorNormalCompletion && _iterator["return"]) { _iterator["return"](); }`,
		Statement finalBlock := (Statement)`if(_didIteratorError) { throw _iteratorError; }`;

set[Declaration] initialization = { decl( [Id]"_iteratorNormalCompletion", [Expression]"true" ), decl( [Id]"_didIteratorError", [Expression]"false" ), decl( [Id]"_iteratorError", [Expression]"undefined" ) };

VariableDeclaration declareBinding( (ForBinding)`<Id id>`, Expression exp ) 
	= (VariableDeclaration)`<Id id> = <Expression exp>`;