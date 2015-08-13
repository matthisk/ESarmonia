module desugar::Declarations

import extensions::arrow::Syntax;
import extensions::letconst::Syntax;
import desugar::Tools;

import ParseTree;
import Set;
import IO;

data Declaration
	= decl( Id name )
	| decl( Id name, Expression val )
	;

Expression setDeclaration( Expression e, decl( Id name ) ) 
	= (Expression)`(<Id name> =\> <Expression e>)()`;
Expression setDeclaration( Expression e, decl( Id name, Expression val ) )
	= (Expression)`(<Id name> =\> <Expression e>)(<Expression val>)`;
Expression setDeclarations( Expression e, {} ) = e;
Expression setDeclarations( Expression e, set[Declaration] decls )
	= (Expression)`((<Params ps>) =\> <Expression e>)(<{ArgExpression ","}* args>)`
	when
		<Params ps,{ArgExpression ","}* args> := extractParams( decls );

Params extractParams( set[Declaration] decls ) {
	params = (Params)``;
	args = (ArgExpressions)``;
	
	for( decl( Id name, Expression val ) <- decls, {Param ","}* ps := params.lst, {ArgExpression ","}* ar := args.lst ) {
		params = (Params)`<{Param ","}* ps>,<Id name>`;
		args = (ArgExpressions)`<{ArgExpression ","}* ar>,<Expression val>`;
	}
	
	for( decl( Id name ) <- decls, {Param ","}* ps := params.lst ) {
		params = (Params)`<{Param ","}* ps>,<Id name>`;
	}
	
	return <params,args.lst>;
}

Statement setDeclaration( Statement s, Declaration d )
	= (Statement)
				`{
				'<Statement declaration>
				'<Statement s>
				'}`
	when
		VariableDeclaration vd := extract( d ),
		Statement declaration := (Statement)`let <VariableDeclaration vd>;`;

Statement setDeclarations( Statement s, {} ) = s;
Statement setDeclarations( Statement s, set[Declaration] decls )
	= (Statement)
				`{
				'<Statement declaration>
				'<Statement s>
				'}`
	when
		Statement declaration := makeDeclaration( decls );

Statement* setDeclarations( Statement* ss, {} ) = ss;
Statement* setDeclarations( Statement* ss, set[Declaration] decls ) {
	Statement declaration = makeDeclaration( decls );
	return prepend( declaration, ss );
}

private Statement makeDeclaration( set[Declaration] variables ) {
	<var,variables> = takeOneFrom( variables );
	VariableDeclaration decl = extract( var );
	VarDecl result = (VarDecl)`let <VariableDeclaration decl>;`;
	
	for( Declaration var <- variables, (VarDecl)`let <{VariableDeclaration ","}+ decls>;` := result ) {
		VariableDeclaration decl = extract( var );
		result = (VarDecl)`let <{VariableDeclaration ","}+ decls>, <VariableDeclaration decl>;`;
	}
	
	return (Statement)`<VarDecl result>`;
}

private VariableDeclaration extract( decl( Id var ) ) = (VariableDeclaration)`<Id var>`;
private VariableDeclaration extract( decl( Id var, Expression exp ) ) = (VariableDeclaration)`<Id var> = <Expression exp>`;
