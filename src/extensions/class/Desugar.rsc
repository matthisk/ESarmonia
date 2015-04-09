module extensions::class::Desugar
extend desugar::Desugar;

import IO;
import extensions::class::Syntax;

Statement desugar( s:(Statement)`class <Id name> { <Methods ms> }` )
	= desugarClassDeclaration( name, ctor, ms )
	when 
		<Method ctor,Methods methods> := extractCtor( < (Method)`constructor() {}`, (Methods)`` >, ms );

private tuple[Method,Methods] extractCtor( tuple[Method,Methods] result, (Methods)`` ) = result;
private default tuple[Method,Methods] extractCtor( <ctor, restMs>, (Methods)`<Method m><Method* ms>` )
	= extractCtor( <ctor, methods>, (Methods)`<Method* ms>` )
	when
		str s := printlnExp( "non constructor method" ),
		Methods methods := (Methods)`<Method* restMs><Method m>`;
private tuple[Method,Methods] extractCtor( <ctor, restMs>, (Methods)`<Method m><Method* ms>` )
	= <m,methods>
	when
		(Method)`constructor(<{Id ","}* _>) { <Statement* _> }` := m,
		Methods methods := (Methods)`<Method* restMs><Method* ms>`;

private Function ctorFunction( Id name, {Id ","}* ps, Statement* body ) 
	= (Function)
	`function <Id name>(<{Id ","}* ps>) { 
		'_classCallCheck(this,<Expression name>); 
		'<Statement* body> 
	'}`;

private Statement desugarClassDeclaration( Id name, Method ctor, Methods ms )
	= (Statement)`var <Id name> = (function() { 
				 '<Statement ctorFunction> 
				 '<Statement* methods> 
				 'return <Expression name>; 
				 '})();`
	when
		(Method)`constructor(<{Id ","}* ps>) { <Statement* body> }` := ctor,
		Statement* desugaredBody := desugarSuperConstructorCall( name, body ),
		Statement* methods := desugarMethods( name, ms ),
		Function ctorFunction := ctorFunction( name, ps, desugaredBody );

private Statement* desugarMethods( Id name, (Methods)`` ) = stmEmpty();
private Statement* desugarMethods( Id name, (Methods)`<Method m><Method* ms>` )
	= result
	when
		Statement s := desugarMethod( name, m ),
		Statement* ss := desugarMethods( name, (Methods)`<Method* ms>` ),
		(Statement)`{<Statement* result>}` := (Statement)`{<Statement s><Statement* ss>}`;

private Statement desugarMethod( Id name, (Method)`static <Id methodName>(<{Id ","}* ps>) { <Statement* body> }` )
	= (Statement)`<Expression name>.<Id methodName> = function(<{Id ","}* ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );
private Statement desugarMethod( Id name, (Method)`<Id methodName>(<{Id ","}* ps>) { <Statement* body> }` )
	= (Statement)`<Expression name>.prototype.<Id methodName> = function(<{Id ","}* ps>) { <Statement* desugaredBody> };`
	when
		desugaredBody := desugarSuper( name, body );

private Statement* desugarSuperConstructorCall( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{Expression ","}* args>)` 
			=> 
			(Expression)`_get(Object.getPrototypeOf(<Expression name>.prototype), "constructor", this).call(this, <{Expression ","}* args>)`
	}
}

private Statement* desugarSuper( Id name, Statement* stms ) {
	return top-down-break visit( stms ) {
		case
			(Expression)`super.<Id call>(<{Expression ","}* args>)`
			=>
			(Expression)`_get(Object.getPrototypeOf(<Expression name>.prototype), <Expression call>, this).call(this, <{Expression ","}* args>)`
	}
}