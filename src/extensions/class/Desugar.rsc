module extensions::class::Desugar
extend desugar::Desugar;

import util::Maybe;
import IO;
import extensions::class::Syntax;
import extensions::class::Runtime;
import extensions::class::desugar::Super;
import extensions::class::desugar::Method;

Expression desugar( (Expression)`class <ClassTail tail>` )
	= desugar( nothing(), tail );
Expression desugar( (Expression)`class <Id name> <ClassTail tail>` )
	= desugar( just(name), tail );

Expression desugar( Maybe[Id] name, (ClassTail)`{ <Methods ms> }` )
	= desugarClassDeclaration( name, nothing(), (Constructor)`constructor() {}`, ms );
Expression desugar( Maybe[Id] name, (ClassTail)`{ <Constructor ctor> <Methods ms> }` )
	= desugarClassDeclaration( name, nothing(), ctor, ms );

Statement desugar( (Statement)`class <Id name> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), nothing(), (Constructor)`constructor() {}`, ms );

Statement desugar( (Statement)`class <Id name> extends <Id extends> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), just(extends), (Constructor)`constructor() {}`, ms );
	
Statement desugar( (Statement)`class <Id name> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), nothing(), ctor, ms );

Statement desugar( (Statement)`class <Id name> extends <Id extends> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Expression class := desugarClassDeclaration( just(name), just(extends), ctor, ms );

/////////////////////////////////
/////////////////////////////////

default Statement ctor2Function( Id name, Maybe[Id] parent, Params ps, Statement* body ) 
	= setRuntime( res, _classCallCheck )	
	when
		Statement* desugaredBody := desugarSuperConstructorCall( parent, body ),
		Statement* desugaredBody := desugarSuperMemberCall( parent, body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); <Statement* desugaredBody> }`;

Statement ctor2Function( Id name, just( parent ), Params ps, Statement* body )
	= setRuntime( res, _classCallCheck )
	when
		empty( body ),
		Statement* desugaredBody := desugarSuperConstructorCall( just(parent), body ),
		Statement* desugaredBody := desugarSuperMemberCall( just(parent), body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); if( <Id parent> != null ) { <Id parent>.apply(this,arguments); } }`;

Expression desugarClassDeclaration( nothing(), Maybe[Id] extends, Constructor ctor, Methods ms )
	= desugarClassDeclaration( just( [Id]"_class" ), ctor, ms ); 

Expression desugarClassDeclaration( just( Id name ), Maybe[Id] extends, Constructor ctor, Methods ms )
	= makeClassDeclaration( extends, ctorFunction, methods, ret )
	when
		Maybe[Id] parent := nameParent( extends ),
		(Constructor)`constructor(<Params ps>) { <Statement* body> }` := ctor,
		Statement* methods := desugarMethods( name, parent, ms ),
		Statement ctorFunction := ctor2Function( name, parent, ps, body ),
		Statement ret := (Statement)`return <Id name>;`;

default Expression makeClassDeclaration( extends:nothing(), Statement ctor, Statement* methods, Statement ret )
	= (Expression)`(function() { <Statement ctor> <Statement* methods> <Statement ret> })()`;

default Expression makeClassDeclaration( just( Id extends ), Statement ctor, Statement* methods, Statement ret )
	= setRuntime( res, _inherits ) 	
	when
		Id parent := [Id]"_<extends>",
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> <Statement* methods> _inherits(<Id name>,<Id parent>); <Statement ret> })(<Id extends>)`;

Maybe[Id] nameParent( nothing() ) = nothing();
Maybe[Id] nameParent( just( Id extends ) ) = just( nameParent( extends ) );
Id nameParent( Id extends ) = [Id]"_<extends>";

Expression makeClassDeclaration( nothing(), Statement ctor, Statement* methods, Statement ret ) 
	= (Expression)`(function() { <Statement ctor> <Statement ret> })()`
	when
		empty( methods );

Expression makeClassDeclaration( just( Id extends ), Statement ctor, Statement* methods, Statement ret ) 
	= setRuntime( res, _inherits )	
	when
		Id parend := [Id]"_<extends>",
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`,
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> _inherits(<Id name>,<Id parent>); <Statement ret> })(<Id extends>)`;

Statement makeClassDeclarationStm( Id name, Expression class )
	= (Statement)`var <Id name> = <Expression class>;`;

Statement* desugarMethods( Id name, Maybe[Id] parent,(Methods)`` ) = stmEmpty();
Statement* desugarMethods( Id name,Maybe[Id] parent, (Methods)`<Method m><Method* ms>` )
	= prepend( s, ss )
	when
		Statement s := desugarMethod( name,parent, m ),
		Statement* ss := desugarMethods( name,parent, (Methods)`<Method* ms>` );

Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`static <MethodDefinition m>` )
	= desugarStaticMethod( name, parent, m );
default Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`static <ClassElement c>` )
	= desugarStaticMethod( name, parent, c );
Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`<ClassElement c>` )
	= desugarMethod( name, parent, c );
	
