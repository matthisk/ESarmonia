@cachedParser{extensions.classes.cached.Parser}
module extensions::classes::desugar::Super

import util::Maybe;
import ParseTree;
import extensions::classes::Syntax;

Statement* desugarSuperConstructorCall( just(Id parent), Statement* stms ) {
	return top-down-break visit( stms ) {
		case 
			(Expression)`super(<{ArgExpression ","}* args>)` 
			=> 
			(Expression)`<Id parent>.call(this,<{ArgExpression ","}* args>)`
	}
}

Statement* desugarSuperConstructorCall( nothing(), Statement* stms ) {
	return stms;
}

Statement* desugarSuperReference( Expression funName, Maybe[Id] parent, Statement* stms ) {
	return top-down-break visit( stms ) {	
		case
			(Expression)`super.<Id call>(<{ArgExpression ","}* args>)`
			=>
			superMemberCall( parent, call, args )
		case
			(Expression)`super.<Id member>`
			=>
			superMember( parent, member )
		case
			(Expression)`super[<Expression member>]`
			=>
			superMember( parent, member )
		case
			e:(Expression)`super(<{ArgExpression ","}* args>)`
			=>
			superCall( funName, args, parent, stms )
	}
}

Expression superMember( just(Id parent), Id member )
	= (Expression)`<Id parent>.prototype.<Id member>`;
Expression superMember( nothing(), Id member )
	= (Expression)`Function.prototype.<Id member>`;

Expression superMember( just(Id parent), Expression m )
	= (Expression)`<Id parent>.prototype[<Expression m>]`;
Expression superMember( nothing(), Expression m )
	= (Expression)`Function.prototype[<Expression m>]`;

Expression superMemberCall( just(Id parent), Id call, {ArgExpression ","}* args )
	= (Expression)`<Id parent>.prototype.<Id call>.call(this,<{ArgExpression ","}* args>)`;
Expression superMemberCall( nothing(), Id call, {ArgExpression ","}* args )
	= (Expression)`Function.prototype.<Id call>.call(this,<{ArgExpression ","}* args>)`;
	
Expression superCall( (Expression)`<Id funName>`, {ArgExpression ","}* args, just(Id parent), Statement* stms )
	= (Expression)`<Id parent>.prototype.<Id funName>.call(this,<{ArgExpression ","}* args>)`;
default Expression superCall( Expression funName, {ArgExpression ","}* args, just(Id parent), Statement* stms )
	= (Expression)`<Id parent>.prototype[<Expression funName>].call(this,<{ArgExpression ","}* args>)`;
default Expression superCall( Expression funName, {ArgExpression ","}* args, nothing(), Statement* stms )
	= (Expression)`Function.prototype[<Expression funName>].call(this,<{ArgExpression ","}* args>)`;
Expression superCall( (Expression)`<Id funName>`, {ArgExpression ","}* args, nothing(), Statement* stms )
	= (Expression)`Function.prototype.<Id funName>.call(this,<{ArgExpression ","}* args>)`;