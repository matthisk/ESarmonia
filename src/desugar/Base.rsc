module desugar::Base

import ParseTree;
import core::Syntax;

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

public Expression undefined = (Expression)`undefined`;
public Expression this = (Expression)`this`;
public Expression arguments = (Expression)`arguments`;

Expression toStringLiteral( str s ) = [Expression]"\"<s>\"";

Statement* scope( Statement* body ) 
	= statementStar( f )
	when
		Statement f := (Statement)`return (function() { <Statement* body> })();`;

default bool empty( Statement s ) = false;
bool empty( (Statement)`;` ) = true;
bool empty( Statement* stms )
	= (Statement)`{}` := (Statement)`{ <Statement* stms> }`;

default Statement* unscope( Statement s ) = statementStar( s );
Statement* unscope( (Statement)`{ <Statement* res> }` )
	= res;

Statement* statementStar( Statement s ) 
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement s> }`;
		
Statement* statementStar( list[Statement] stmts ) {
	if( (Statement)`{<Statement* result>}` := (Statement)`{}` ) {
		for( Statement s <- stmts ) {
			result = \append( result, s );
		}
	
		return result;
	}
}

Statement* statementStar( list[Expression] exps ) {
	list[Statement] stmts = [ (Statement)`<Expression e>;` | e <- exps ];
	return statementStar(stms);
}

Statement* \append( Statement* ss, Statement s )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)
														`{ 
														'<Statement* ss> 
														'<Statement s> 
														'}`;

Statement* prepend( Statement s, Statement* ss )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)
														`{ 
														'<Statement s> 
														'<Statement* ss> 
														'}`;

Statement* concat( Statement* strt, Statement* rest )
	= result
	when
		(Statement)`{ <Statement* result> }` := (Statement)
														`{ 
														'<Statement* strt> 
														'<Statement* rest> 
														'}`;  

Expression toArray( list[Expression] exps ) {
	Expression arr = (Expression)`[]`;
	for( e <- exps, (Expression)`[<{ArgExpression ","}* args>]` := arr ) {
		arr = (Expression)`[<{ArgExpression ","}* args>,<Expression e>]`;
	}
	return arr;
}

Params params( Param p ) = (Params)`<Param p>`;
Params params( {Param ","}* ps ) = (Params)`<{Param ","}* ps>`;

{Param ","}* psEmpty()
	= empty
	when (Function)`function(<{Param ","}* empty>) {}` := (Function)`function() {}`;
		
Statement* stmEmpty()
	= empty
	when (Statement)`{ <Statement* empty> }` := (Statement)`{}`;