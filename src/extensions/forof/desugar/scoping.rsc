module extensions::forof::desugar::scoping
extend desugar::Base;
extend extensions::forof::Syntax;

import desugar::Declarations;


Statement declaration( false, Id arrId, Expression arr, _, _ )
	= (Statement)`let <Id arrId> = <Expression arr>;`;
Statement declaration( true, Id arrId, Expression arr, Expression loopClosure, Id loopClosureId )
	= (Statement)
				`let <Id arrId> = <Expression arr>,
				'	 <Id loopClosureId> = <Expression loopClosure>;`;

Expression loopClosure( Statement* body ) 
	= (Expression)
				`function() {
				'	<Statement* closureBody>
				'}`
	when Statement* closureBody := controlFlowAnalysis(body);

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

Statement closureLoopBody( Id loopLabel ) {
return
(Statement)
`{
'let _ret = _loop();
'
'switch(result) {
'	case "break" : break <Id loopLabel>;
'	case "continue" : continue;
'	
'	default:
'		if(typeof result !== 'object') return _ret.v;
'}
'}`;
}
