@cachedParser{extensions.object.cached.Parser}
module extensions::object::desugar::Shared
import extensions::object::Syntax;

Expression extractKey( (PropertyName)`<String s>` ) = (Expression)`<String s>`;
Expression extractKey( (PropertyName)`<Numeric n>` ) = (Expression)`<Numeric n>`;
Expression extractKey( (PropertyName)`<Id id>` ) = (Expression)`<Id id>`;
Expression extractKey( (PropertyName)`[<Expression computed>]` ) = computed;

Expression extractLHS( Expression name, (PropertyName)`[<Expression computed>]` )
	= (Expression)`<Expression name>[<Expression computed>]`;
	
Expression stringExp( (PropertyName)`[<Expression computed>]` ) = computed;