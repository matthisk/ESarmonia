module extensions::letconst::cached::CacheParser
extend desugar::cached::CacheParserBase;

import extensions::letconst::Syntax;

str dir = "extensions.letconst.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/letconst/cached/Parser.java|;
