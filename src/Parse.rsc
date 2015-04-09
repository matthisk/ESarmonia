module Parse

extend extensions::arrow::Syntax;

start[Source] parse( str source, loc l ) = parse( #start[Source], source, l );
start[Source] parse( loc l ) = parse( #start[Source], l );