@doc{
	This is a port of the regenerator module Emitter.js
	https://github.com/facebook/regenerator/blob/master/lib/emit.js
}
module extensions::generators::Emitter
import extensions::generators::Syntax;

import extensions::generators::Marker;
import extensions::generators::Meta;
import util::Maybe;
import List;

map[str,bool] volatileContextPropertyNames = (
	"prev": true,
	"next": true,
	"sent": true,
	"rval": true
);

default bool isSwitchCaseEnder( Statement _ ) = false;
bool isSwitchCaseEnder( (Statement)`break;` ) = true;
bool isSwitchCaseEnder( (Statement)`continue;` ) = true;
bool isSwitchCaseEnder( (Statement)`continue <Id _>;` ) = true;
bool isSwitchCaseEnder( (Statement)`return;` ) = true;
bool isSwitchCaseEnder( (Statement)`return <Expression _>;` ) = true;
bool isSwitchCaseEnder( (Statement)`throw;` ) = true;
bool isSwitchCaseEnder( (Statement)`throw <Expression _>;` ) = true;

CaseClause* toCaseClauses( list[CaseClause] cases ) {
	Statement swtch = (Statement)`switch(emp) { }`;
	
	for( CaseClause c <- cases ) {
		swtch.clauses += c;
	}        
        
    return swtch.cases; 
}

alias Future[&T] = &T();
Future[&T] now( &T a ) = &T() { return a; };

Future[Expression] toFuture(Marker m) {
	return Expression() {
		Literal l = m.toLiteral();
		return (Expression)`<Literal m>`;
	};
}

alias Explode = void(Statement*);
alias GetContextFunction = Statement(Id id);
alias GetTryLocList = Maybe[Expression]();

alias Emitter = tuple[
	Explode explode,
	GetContextFunction getContextFunction,
	GetTryLocList getTryLocList
];

Emitter emitter( Id contextId ) {
	list[Statement] tryEntries = [];
	list[Future[Statement]] listing = [];
	map[int,bool] marked = ();
	Marker finalLoc = marker(-1);
	int nextTempId = 0;
	
	int getNextTempId() {
		nextTempId += 1;
		return nextTempId;
	}
	
	Marker mark( Marker m ) { 
		int index = size( listing );
		if(m.get() == -1)
			m.update(index);
		else
			assert m.get() == index : "strict equals";
		marked[index] = true;
		return m;
	}

	void emit( Statement s ) { 
		listing += now(s); 
	}
	
	void emit( Expression e ) {
		listing += now((Statement)`<Expression e>;`);
	}

	void emit( Future[Statement] fs ) {
		listing += fs;
	}
	
	void emit( Future[Expression] future ) {
		listing = listing + Statement() {
			Expression e = future();
			return (Statement)`<Expression e>;`;
		};
	}
	
	void emitAssign(Expression lhs,Expression rhs) {
		emit( (Statement)`<Expression lhs> = <Expression rhs>;` );
	}

	void emitAssign(Expression lhs,Future[Expression] future) {
		emit( Statement() {
			Expression rhs = future();
			return (Statement)`<Expression lhs> = <Expression rhs>;`;
		} );
	}
	
	Expression contextProperty(Id name) {
		return (Expression)`<Id contextId>.<Id name>`;
	}
	
	Expression contextProperty(Literal name) {
		return (Expression)`<Id contextId>[<Literal name>]`;
	}
	
	Future[Expression] contextProperty(Future[Literal] future) {
		return Expression() {
			Literal name = future();
			return (Expression)`<Id contextId>[<Literal name>]`;
		};
	}

	default bool isVolatileContextProperty( Expression e ) = false;	
	bool isVolatileContextProperty( (Expression)`<Id contextId>.<Id member>`) = "<member>" in volatileContextPropertyNames;
	bool isVolatileContextProperty( (Expression)`<Expression e>[<Expression _>]` ) = true;

	void stop( Expression rval ) { 
		setReturnValue(rval);
		jump(finalLoc);
	}
	
	void setReturnValue( Expression rval ) {
		emitAssign( contextProperty("rval"), explodeExpression(rval) );
	}

	Future[Expression] createCatchCall(Marker tryLoc) {
		Expression \catch = contextProperty( (Literal)`"catch"` );
		
		return Expression() {
			Literal l = tryLoc.toLiteral();
            return (Expression)`<Expression \catch>(<Literal l>)`;
		};
	}
	
	void clearPendingException(Marker tryLoc) {
		emit( createCatchCall( tryLoc ) );
	}
	
	void clearPendingException(Marker tryLoc, Expression assignee) {
		emitAssign(assignee, createCatchCall(tryLoc));
	}

	void jump(Marker toLoc) {
		emitAssign(contextProperty([Id]"next"), toFuture(toLoc));
		emit( (Statement)`break;` ); 
	}
	
	void jumpIf(Expression \test, Marker toLoc) {
		Expression e = contextProperty("next");
		Future[Expression] future = toFuture(toLoc);
		Expression assign = (Expression)`<Expression e> = <Expression l>`;
		
		emit(Statement() {
			Expression l = future();
			return (Statement)
				`if( <Expression \test> ) {
				'	<Expression e> = <Expression l>;
				'	break;
				'}`;
		});
	}
	
	void jumpIfNot(Expression \test, Marker toLoc) {
		Expression negatedTest = (Expression)`! <Expression \test>`;
		jumpIf( negatedTest, toLoc );
	}
	
	Expression makeTempVar() {
		str name = "t" + getNextTempId();
		return contextProperty([Id]name);
	}
	
	Statement getContextFunction( Id id ) {
		Statement* dispatchLoop = getDispatchLoop();
		return (Statement)`function <Id id>(<Id contextId>) {
						   '	<Statement* dispatchLoop>
						   '}`;
	}
	
	Statement getDispatchLoop() {
		int i = 0;
		bool alreadyEnded = false;
		list[CaseClause] cases = [];
		list[Statement] current = [];
	
		/*
			Instead of saving normal concrete syntax, listings contains future concrete syntax.
			The syntax is only to be constructed when all markers have been marked throughout
			the parse tree.
		*/	
		for( Future[Statement] stmt <- listing ) {
			if( i in marked ) {
				Literal iLit = [Literal]i;
				Statement* body = statementStar( current );
				current = [];
				cases += (CaseClause)`case <Literal iLit> : <Statement* body>`;
				alreadyEnded = false;	
			}
			
			if( !alreadyEnded ) {
				current += stmt();		
				if( isSwitchCaseEnder( current[size(current)-1] ) )
					alreadyEnded = true;
			}
			
			i += 1;	
		}
		
		finalLoc = marker(size(listing));
		
		Expression stop = contextProperty((Literal)`"stop"`);
		finalLocLit = finalLoc.toLiteral();
		cases += (CaseClause)`case <Literal finalLocLit> : `;
		cases += (CaseClause)`case "end": return <Expression stop>();`;
		
		Expression cPrev = contextProperty((Literal)`"prev"`);
		Expression cNext = contextProeprty((Literal)`"next"`);
		CaseClause* caseClauses = toCaseClauses( cases );
		return (Statement)
			`while(1) 
			'	switch( <Expression cPrev> = <Expression cNext> ) {
			'		<CaseClause* cases>
			'	}`;
	}	
	
	Maybe[Expression] getTryLocList() {
		if( size( tryEntries ) == 0 ) return nothing();
		
		int lastLocValue = 0;
		
		arr = for( TryEntry tryEntry <- tryEntries ) {
			int thisLocValue = tryEntry.firstLoc.\value;	
			assert thisLocValue <= lastLocValue : "try entries out of order";
			lastLocValue = thisLocValue;
			
			mce = tryEntry.catchEntry;
			mfe = tryEntry.finallyEntry;
			
			locs = [
				tryEntry.firsLoc,
				just(ce) := mce ? ce.firstLoc : nothing()
			];
			
			if( just(fe) := mfe ) {
				locs[2] = fe.firstLoc;
				locs[3] = fe.afterLoc;
			}
			
			// TODO : convert locs to comma separated ArgExpression
			insert (Expression)`[<{ArgExpression ","}* locs>]`;
		}
		// TODO : convert arr to comma separated ArgExpression
		return just((Expression)`[<{ArgExpression ","}* arr>]`);	
	}

	void explodeBody( Statement* body ) {
		for( s <- body ) explode(s);
	}
	
	default void explode( Statement s ) {
		throw "unkown statement <s>";
	}
	
	void explode( (Statement)`;` ) {
		;
	}

	void explode( (Statement)`{ <Statement* ss> }` ) {
		for( s <- ss ) explode(s);
	}
	
	void explode( (Statement)`<Expression e>;` ) {
		explode( e );
	}
	
	void explode( (Statement)`<Id label> : <Statement s>` ) {
		Marker after = marker(-1);
		mark(after);
	}

	void explode( (Statement)`for(<{Expression ","}* init>;<{Expression ","}* conds>;<{Expression ","}* ops>) <Statement b>` ) {
		Marker head = marker(-1);
		Marker update = marker(-1);
		Marker after = marker(-1);
		
		for( e <- init ) explode(e);
		
		mark(head);
		
		hasConds = false;
		for( _ <- conds ) hasConds = true;
		if( hasConds ) {
			jumpIfNot( explode(conds), after );
		}
	
		mark(update);
		
		for( e <- ops ) explode(e,true);
		
		jump(head);
		
		mark(after);
	}
	
	void explode( (Statement)`return <Expression e>;` ) {
		emitAbruptCompletion(\type="return",val=explode(e));
	}
	
	void emitAbruptCompletion(str \type,Expression val) {
		Expression abrpt = contextProperty("abrupt");
		emit( (Statement)
				`return <Expression abrpt>();` 
		);
	}
	
	Maybe[Expression] explode( Expression e, bool ignoreResult=false ) {
		Maybe[Expression] finish(Expression expr) {
			if(ignoreResult) {
				emit(expr);
				return nothing();
			} else { 
				return just(expr);
			}
		}

		default Maybe[Expression] explodeExpression( Expression e ) {
			throw "Unkown Expression <e>";
		}

		Maybe[Expression] explodeExpression( e:(Expression)`<Expression lhs> = <Expression rhs>` ) {
			Expression lhs = explode(lhs);
			Expression rhs = explode(rhs);
			
			return finish((Expression)`<Expression lhs> = <Expression rhs>`);
		}
	
		Maybe[Expression] explodeExpression( (Expression)`yield <Expression y>` ) {
			Marker after = marker(-1);
			Maybe[Expression] arg = explode(y);
			
			emitAssign(contextProperty("next"), after);
		
			if( arg.val? ) {
				Expression argument = arg.val;
				emit((Statement)`return <Expression arg>;`);
			} else {
				emit((Statement)`return;`);
			}
		
			mark(after);
			
			return just(contextProperty("sent"));
		}
		
		if( ! containsLeap(e) ) {
			return finish(e);
		}
		
		return explodeExpression( e );	
	}
	
	return <explodeBody,getContextFunction,getTryLocList>;
}