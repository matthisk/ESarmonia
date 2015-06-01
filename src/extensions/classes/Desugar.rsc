module extensions::classes::Desugar
extend desugar::Base;
extend extensions::classes::Syntax;

import util::Maybe;
import Ambiguity;
import IO;

import extensions::classes::Runtime;
import extensions::classes::desugar::Super;
import extensions::classes::desugar::Method;

Expression desugar( (Expression)`class <ClassTail tail>` )
	= desugar( nothing(), tail );
Expression desugar( (Expression)`class <Id name> <ClassTail tail>` )
	= desugar( just(name), tail );

Expression desugar( Maybe[Id] name, (ClassTail)`<ClassHeritage heritage> { <Methods ms> }` )
	= desugarClassDeclaration( name, extends, (Constructor)`constructor() {}`, ms )
	when
		Maybe[Expression] extends := extendsQ( heritage );
Expression desugar( Maybe[Id] name, (ClassTail)`<ClassHeritage heritage> { <Constructor ctor> <Methods ms> }` )
	= desugarClassDeclaration( name, extends, ctor, methods )
	when
		Maybe[Expression] extends := extendsQ( heritage );

Maybe[Expression] extendsQ( (ClassHeritage)`extends <Expression extends>` ) = just(extends);
Maybe[Expression] extendsQ( (ClassHeritage)`` ) = nothing();
	
Expression desugar( Maybe[Id] name, Maybe[Expression] extends, (ClassTail)`{ <Methods ms> }` )
	= desugarClassDeclaration( name, extends, (Constructor)`constructor() {}`, ms );
Expression desugar( Maybe[Id] name, Maybe[Expression] extends, (ClassTail)`{ <Constructor ctor> <Methods ms> }` )
	= desugarClassDeclaration( name, extends, ctor, ms );

Statement desugar( (Statement)`class <Id name> <ClassHeritage heritage> { <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Maybe[Expression] extends := extendsQ( heritage ),
		Expression class := desugarClassDeclaration( just(name), extends, (Constructor)`constructor() {}`, ms );

Statement desugar( (Statement)`class <Id name> <ClassHeritage heritage> { <Constructor ctor> <Methods ms> }` )
	= makeClassDeclarationStm( name, class )
	when
		Maybe[Expression] extends := extendsQ( heritage ),
		Expression class := desugarClassDeclaration( just(name), extends, ctor, ms );

/////////////////////////////////
/////////////////////////////////

default Statement ctor2Function( Id name, Maybe[Id] parent, Params ps, Statement* body ) 
	= setRuntime( res, _classCallCheck )	
	when
		Statement* desugaredBody := desugarSuperConstructorCall( parent, body ),
		Statement* desugaredBody := desugarSuperReference( [Expression]"constructor", parent, body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); <Statement* desugaredBody> }`;

Statement ctor2Function( Id name, just( Id parent ), Params ps, Statement* body )
	= setRuntime( res, _classCallCheck )
	when
		empty( body ),
		Statement* desugaredBody := desugarSuperConstructorCall( just(parent), body ),
		Statement* desugaredBody := desugarSuperReference( [Expression]"constructor", just(parent), body ),
		Statement res := (Statement)`function <Id name>(<Params ps>) { _classCallCheck(this,<Id name>); if( <Id parent> != null ) { <Id parent>.apply(this,arguments); } }`;

Expression desugarClassDeclaration( nothing(), Maybe[Expression] extends, Constructor ctor, Methods ms )
	= desugarClassDeclaration( just( [Id]"_class" ), extends, ctor, ms ); 

Expression desugarClassDeclaration( just( Id name ), Maybe[Expression] extends, Constructor ctor, Methods ms )
	= makeClassDeclaration( name, extends, ctorFunction, methods, ret )
	when
		Maybe[Id] parent := nameParent( extends ),
		(Constructor)`constructor (<Params ps>) { <Statement* body> }` := ctor,
		Statement* methods := desugarMethods( name, parent, ms ),
		Statement ctorFunction := ctor2Function( name, parent, ps, body ),
		Statement ret := (Statement)`return <Id name>;`;

default Expression makeClassDeclaration( Id name, extends:nothing(), Statement ctor, Statement* methods, Statement ret )
	= (Expression)`(function() { <Statement ctor> <Statement* methods> <Statement ret> })()`;

default Expression makeClassDeclaration( Id name, just( Expression extends ), Statement ctor, Statement* methods, Statement ret )
	= setRuntime( res, _inherits ) 	
	when
		Id parent := nameParent(extends),
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> _inherits(<Id name>,<Id parent>); <Statement* methods> <Statement ret> })(<Id extends>)`;

Expression makeClassDeclaration( _, nothing(), Statement ctor, Statement* methods, Statement ret ) 
	= (Expression)`(function() { <Statement ctor> <Statement ret> })()`
	when
		empty( methods );

Expression makeClassDeclaration( Id name, just( Expression extends ), Statement ctor, Statement* methods, Statement ret ) 
	= setRuntime( res, _inherits )	
	when
		Id parent := nameParent(extends),
		(Statement)`{}` := (Statement)`{ <Statement* methods> }`,
		Expression res := (Expression)`(function(<Id parent>) { <Statement ctor> _inherits(<Id name>,<Id parent>); <Statement ret> })(<Id extends>)`;

Maybe[Id] nameParent( nothing() ) = nothing();
Maybe[Id] nameParent( just( Expression extends ) ) = just( nameParent( extends ) );
Id nameParent( (Expression)`<Id extends>` ) = [Id]"_<extends>";
default Id nameParent( Expression _ ) = [Id]"_ref";

Statement makeClassDeclarationStm( Id name, Expression class )
	= (Statement)`let <Id name> = <Expression class>;`;

Statement* desugarMethods( Id name, Maybe[Id] parent,(Methods)`` ) = stmEmpty();
Statement* desugarMethods( Id name,Maybe[Id] parent, (Methods)`<Method m><Method* ms>` )
	= prepend( s, ss )
	when
		Statement s := desugarMethod( name,parent, m ),
		Statement* ss := desugarMethods( name,parent, (Methods)`<Method* ms>` );

Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`static <ClassElement c>` )
	= desugarStaticMethod( name, parent, c );
Statement desugarMethod( Id name,Maybe[Id] parent, (Method)`<ClassElement c>` )
	= desugarMethod( name, parent, c );