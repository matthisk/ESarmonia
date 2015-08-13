module extensions::letconst::Desugar
extend desugar::Base;
extend extensions::letconst::Syntax;
import IO;

anno bool Statement @ closured;

Statement desugar( loop:(Statement)`for( let <{VariableDeclarationNoIn ","}+ vds>; <{Expression ","}* _>; <{Expression ","}* _> ) <Statement body>`, Id(str) generateUId )
	= desugarLoopWithClosure( loopBindings, loop[@closured=true], generateUId )
	when 
		!loop@closured?,
		list[Id] loopBindings := [ vd.id | vd <- vds ],
		bindingInClosure(body, loopBindings);
	
Statement desugar( loop:(Statement)`for( let <Id b> in <Expression _> ) <Statement body>`, Id(str) generateUId )
	= desugarLoopWithClosure( [b], loop[@closured=true], generateUId )
	when 
		!loop@closured?,
		bindingInClosure(body, [b]);

Expression makeLoopClosure( list[Id] loopBindings, Statement* body ) 
	= (Expression)
				`function(<Params ps>) {
				'	<Statement* closureBody>
				'}`
	when 
		Statement* closureBody := controlFlowAnalysis(body),
		Params ps := toParams(loopBindings);

bool findBinding( Function f, list[Id] bindings ) {
	top-down-break visit(f) {
		case Id id : {
			if(id in bindings) return true;
		}
	}
	return false;
}

bool bindingInClosure( Statement s, list[Id] bindings ) {
	bool result = false;
	top-down-break visit(s) {
		case Function f : result = result || findBinding(f, bindings);
	}
	return result;
}

Statement* controlFlowAnalysis( Statement* body ) {
	body = top-down-break visit(body) {
		case Function _ : ;
		
		case (Statement)`return;` => (Statement)`return { v: undefined };`
		case (Statement)`return <Expression e>;` => (Statement)`return { v: <Expression e> };`
		case (Statement)`continue;` => (Statement)`return "continue";`
	}
	
	body = top-down-break visit(body) {
		case Function _ : ;
		case (Statement)`do <Statement _> while(<Expression _>);` : ;
		case (Statement)`while(<Expression _>) <Statement _>` : ;
		case (Statement)`for(<{Expression ","}* _>;<{Expression ","}* _>;<{Expression ","}* _>) <Statement _>` : ;
		case (Statement)`for(<Declarator _> <{VariableDeclarationNoIn ","}+ _>; <{Expression ","}* _>; <{Expression ","}* _>) <Statement _>`: ;
		case (Statement)`for(<Expression _> in <Expression _>) <Statement _>` : ;
		case (Statement)`for(<Declarator _> <ForBinding _> in <Expression _>) <Statement _>` : ;
	
		case (Statement)`break;` => (Statement)`return "break";`
	}
	
	return body;
}

Statement makeLoopBody( list[Id] loopBindings, Id loopClosureId, Id loopLabel ) {
	{ArgExpression ","}* args = toArgs(loopBindings);	
	return
	(Statement)
	`{
	'let _ret = <Id loopClosureId>(<{ArgExpression ","}* args>);
	'
	'switch(_ret) {
	'	case "break" : break <Id loopLabel>;
	'	case "continue" : continue;
	'	
	'	default:
	'		if(typeof _ret === 'object') return _ret.v;
	'}
	'}`;
}

Statement desugarLoopWithClosure( list[Id] loopBindings, Statement loop, Id(str) generateUId ) {
	Id loopClosureId = generateUId("_loop");
	Id loopLabel = generateUId("_loop");
	Expression loopClosure = makeLoopClosure( loopBindings, unscope( loop.body ) );
	
	Statement body = makeLoopBody( loopBindings, loopClosureId, loopLabel );
	loop.body = body;
	
	return (Statement)
	`{
	'	let <Id loopClosureId> = <Expression loopClosure>;
	'	<Id loopLabel> : <Statement loop>
	'}`;
}
