module desugar::Declarations
import core::Syntax;

import ParseTree;
import Set;
import IO;

anno set[Declaration] node@declarations;

alias Node = &T <: Tree;

data Declaration
	= decl( Id name )
	| decl( Id name, Expression val )
	;

public Node setDeclaration( Node e, Id d )
	= e[@declarations = { decl( d ) }]
	when ! e@declarations?;

public Node setDeclaration( Node e, Id d )
	= e[@declarations = e@declarations + decl( d )]
	when e@declarations?;

public Node setDeclaration( Node e, Declaration d )
	= e[@declarations= { d }]
	when ! e@declarations?;
	
public Node setDeclaration( Node e, Declaration d )
	= e[@declarations = e@declarations + d]
	when e@declarations?; 

public Node setDeclarations( Node e, set[Declaration] decl )
	= e[@declarations = decl]
	when ! e@declarations?;
	
public Node setDeclarations( Node e, set[Declaration] decl )
	= e[@declarations = e@declarations + decl]
	when e@declarations?;

public Node declareVariables( Node src ) {
	set[Declaration] variables = {};
	
	return visit( src ) {
		case &Y <: Tree e : {
			<variables,e> = getOrSet( e, variables );
			insert e;	
		}
	}
}

private default tuple[set[Declaration],Node] getOrSet( Node n, set[Declaration] variables )
	= <variables + n@declarations,n>
	when n@declarations?;
private default tuple[set[Declaration],Node] getOrSet( Node n, set[Declaration] variables )
	= <variables,n>;
private tuple[set[Declaration],Statement*] getOrSet( Statement* stms, set[Declaration] variables )
	= < {}, declareVariables( stms, variables ) >
	when
		size(variables) > 0;

private Statement* declareVariables( Statement* stms, set[Declaration] variables )
	= result
	when
		Statement decl := makeDeclaration( variables ),
		(Statement)`{ <Statement* result> }` := (Statement)`{ <Statement decl> <Statement* stms> }`;

private Statement makeDeclaration( set[Declaration] variables ) {
	<var,variables> = takeOneFrom( variables );
	VariableDeclaration decl = extract( var );
	VarDecl result = (VarDecl)`var <VariableDeclaration decl>;`;
	
	for( Declaration var <- variables, (VarDecl)`var <{VariableDeclaration ","}+ decls>;` := result ) {
		VariableDeclaration decl = extract( var );
		result = (VarDecl)`var <{VariableDeclaration ","}+ decls>, <VariableDeclaration decl>;`;
	}
	
	return (Statement)`<VarDecl result>`;
}

private VariableDeclaration extract( decl( Id var ) ) = (VariableDeclaration)`<Id var>`;
private VariableDeclaration extract( decl( Id var, Expression exp ) ) = (VariableDeclaration)`<Id var> = <Expression exp>`;
