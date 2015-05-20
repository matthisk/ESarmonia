@cachedParser{parser.cached.SweeterJSCachedParser}
module parser::Parse

extend extensions::arrow::Syntax;
extend extensions::classes::Syntax;
extend extensions::destructuring::Syntax;
extend extensions::object::Syntax;
extend extensions::parameters::Syntax;
extend extensions::spread::Syntax;
extend extensions::forof::Syntax;
extend extensions::letconst::Syntax;
extend extensions::template::Syntax;

start[Source] parse( str source, loc l ) = parse( #start[Source], source, l );
start[Source] parse( str source ) = parse( #start[Source], source );
start[Source] parse( loc l ) = parse( #start[Source], l );