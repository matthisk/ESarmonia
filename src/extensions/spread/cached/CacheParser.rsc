module extensions::spread::cached::CacheParser
extend desugar::cached::CacheParserBase;

import extensions::spread::Syntax;

str dir = "extensions.spread.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/spread/cached/Parser.java|;
