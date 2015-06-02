module extensions::literal::Desugar
extend extensions::literal::Syntax;

import String;
import util::Math;
import IO;

Numeric desugar( Numeric n ) 
	= [Numeric]"<convertFromBase(2,"<n>"[2..])>"
	when /BinaryInteger bin := n;

Numeric desugar( Numeric n ) 
	= [Numeric]"<convertFromBase(8,"<n>"[2..])>"
	when /OctalInteger oct := n;

int convertFromBase( int base, str input ) {
	int s = 0; 
	int n = size(input);
	
	for( str d <- split("",input) ) {
		n -= 1;
		s += toInt(d) * floor( pow(base,n) );
	}
	
	return s;
}
