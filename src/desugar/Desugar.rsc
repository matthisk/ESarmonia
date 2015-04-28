module desugar::Desugar

import core::Syntax;
import ParseTree;
import Set;

anno set[Id] Expression@declarations;
anno Statement Expression@runtime;

private Expression setRuntime( Expression e, Statement rt )
	= e[@runtime = rt];

private Expression setDeclaration( Expression e, Id decl )
	= e[@declarations = {decl}]
	when ! e@declarations?;

private Expression setDeclaration( Expression e, Id decl )
	= e[@declarations = e@declarations + decl]
	when e@declarations?;

private Expression setDeclarations( Expression e, set[Id] decl )
	= e[@declarations = decl]
	when ! e@declarations?;
	
private Expression setDeclarations( Expression e, set[Id] decl )
	= e[@declarations = e@declarations + decl]
	when e@declarations?;

&T <: Tree declareVariables( &T <: Tree src ) {
	set[Id] variables = {};
	
	return visit( src ) {
		case Expression e : {
			if( e@declarations? ) { 
				variables = variables + e@declarations;
			}
		}
		case Statement* stms : {
			if( size(variables) > 0 ) {
				declaration = declareVariables( stms, variables );
				variables = {};
				insert declaration;
			}
		}
	}
}

Statement* declareVariables( Statement* stms, set[Id] variables )
	= result
	when
		Statement decl := makeDeclaration( variables ),
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement decl> <Statement* stms> }`;

Statement makeDeclaration( set[Id] variables ) {
	<var,variables> = takeOneFrom( variables );
	VarDecl result = (VarDecl)`var <Id var>;`;
	
	for( Id var <- variables, (VarDecl)`var <{VariableDeclaration ","}+ decls>;` := result ) {
		result = (VarDecl)`var <{VariableDeclaration ","}+ decls>, <Id var>;`;
	}
	
	return (Statement)`<VarDecl result>`;
}

default Statement desugar( Statement s ) = s;
default Expression desugar( Expression e ) = e;
default Function desugar( Function f ) = f;
default Source desugar( Source src ) = src;

private Statement* scope( Statement* body ) 
	= statementStar( f )
	when
		Statement f := (Statement)`return (function() { <Statement* body> })();`;

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