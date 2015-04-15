module \test::rascalspec::Util

import Prelude;

private str indentString( int indent, str s ) = intercalate( "\n", mapper( split( "\n", s ), str(str l) { return left( "", indent ) + l; } ) );

public void print( int indent, str s ) = print( indentString( indent, s ) );
public void println( int indent, str s ) = println( indentString( indent, s ) );

public str checkMark = "\u2713";
public str ballot = "\u2717";

public bool and( list[bool] l ) = ( true | it && elm | elm <- l );