module extensions::modules::Syntax
extend core::Syntax;

syntax ImportDeclaration
	= "import" ImportClause FromClause ";"
	| "import" ModuleSpecifier ";"
	;
	
syntax ImportClause 
	= Id
	| "*" "as" Id
	| NamedImports
	;

syntax ExportDeclaration
	= "export" "*" FromClause ";"
	| "export" Export Clause FromClause ";" 
	| "export" ExportClause ";"
	| "export" VariableStatement
	| "export" Declaration
	| "export" "default" HoistableDeclaration
	| "export" "default" ClassDeclaration
	| "export" "default" AssignmentExpression ";"
	;
	
syntax ExportClause
	= "{" {ExportSpecifier ","}* lst "}"
	;

syntax NamedImports
	= "{" {ImportSpecifier ","}* lst "}"
	;

syntax ImportSpecifier
	= Id
	| Id "as" Id
	;
	
syntax ExportSpecifier
	= Id
	| Id "as" Id
	;
	
syntax FromClause
	= "from" ModuleSpecifier
	;
