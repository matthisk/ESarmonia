module Parse

extend extensions::arrow::Syntax;
extend extensions::class::Syntax;
extend extensions::destructuring::Syntax;
extend extensions::object::Syntax;
extend extensions::parameters::Syntax;
extend extensions::spread::Syntax;

start[Source] parse( str source ) = parse( #start[Source], source );
start[Source] parse( loc l ) = parse( #start[Source], l );