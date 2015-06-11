module desugar::Desugar
extend desugar::Visitor;
extend runtime::Visitor;

extend extensions::arrow::Desugar;
extend extensions::classes::Desugar;
extend extensions::object::Desugar;
extend extensions::parameters::Desugar;
extend extensions::spread::Desugar;
extend extensions::forof::Desugar;
extend extensions::destructuring::Desugar;
extend extensions::template::Desugar;
extend extensions::literal::Desugar;
//extend extensions::generators::Desugar;

import ParseTree;
import extensions::letconst::Resolve;

&T <: Tree desugarAll(&T <: Tree src, bool runtime = true, bool throwReferenceErrors = false) {
	pt = desugarVisitor( src );
	pt = resolve( pt );
	
	if( runtime ) pt = runtimeVisitor(pt);
	if( throwReferenceErrors && pt@messages? ) pt = throwErrors(pt, pt@messages);
	
	return pt;
}

void compile(str input) {
	pt = parse(#start[Source], input);
	dpt = resolve( desugarVisitor( pt ) );
	print(dpt);
}

&T <: Tree throwErrors(&T <: Tree src, set[Message] messages ) {
	errs = ( err.at : err.msg | err:error(_,_) <- messages ); 
	
	return visit(src) {
		case Expression e => (Expression)`(function() { throw ReferenceError(<Expression msg>); })()`
			when e@\loc in errs, Expression msg := [Expression]"\"<errs[e@\loc]>\""
	}
}