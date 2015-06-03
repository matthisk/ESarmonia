module extensions::literal::Desugar
extend extensions::literal::Syntax;

import String;
import util::Math;
import IO;

Expression desugar( (Expression)`<Numeric n>` ) 
	= (Expression)`<Numeric n>` 
	when /BinaryInteger bin := n,
		Numeric n := [Numeric]"<convertFromBase(2,"<n>"[2..])>";

Expression desugar( (Expression)`<Numeric n>` ) 
	= (Expression)`<Numeric n>`
	when /OctalInteger oct := n,
		 Numeric n := [Numeric]"<convertFromBase(8,"<n>"[2..])>";

int convertFromBase( int base, str input ) {
	int s = 0; 
	int n = size(input);
	
	for( str d <- split("",input) ) {
		n -= 1;
		s += toInt(d) * floor( pow(base,n) );
	}
	
	return s;
}
