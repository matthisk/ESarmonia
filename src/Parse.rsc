module Parse

extend extensions::arrow::Syntax;
extend extensions::class::Syntax;
extend extensions::destructuring::Syntax;
extend extensions::object::Syntax;
extend extensions::parameters::Syntax;
extend extensions::spread::Syntax;
extend extensions::forof::Syntax;
extend extensions::letconst::Syntax;

start[Source] parse( str source, loc l ) = parse( #start[Source], source, l );
start[Source] parse( str source ) = parse( #start[Source], source );
start[Source] parse( loc l ) = parse( #start[Source], l );