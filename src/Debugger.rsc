module Debugger

extend Plugin;

public loc basic = |project://rascal-sweetjs/input/basic.js|;

Tree parse( loc location ) = parse( #start[Source], location );