@cachedParser{desugar.cached.Parser}
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
extend extensions::letconst::Desugar;

start[Source] desugarAll(start[Source] src) {
	//return desugarVisitor( src );
	return runtimeVisitor( desugarVisitor( src ) );
}