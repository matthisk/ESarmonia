module extensions::parameters::cached::CacheParser
extend desugar::cached::CacheParserBase;

import extensions::parameters::Syntax;

str dir = "extensions.parameters.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/parameters/cached/Parser.java|;
