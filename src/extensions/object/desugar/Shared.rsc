module extensions::object::desugar::Shared
import extensions::object::Syntax;

Expression extractKey( (PropertyName)`[<Expression computed>]` ) = computed;

Expression extractLHS( Expression name, (PropertyName)`[<Expression computed>]` )
	= (Expression)`<Expression name>[<Expression computed>]`;
	
Expression stringExp( (PropertyName)`[<Expression computed>]` ) = computed;