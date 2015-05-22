module extensions::template::cached::CacheParser
extend desugar::cached::CacheParserBase;

import extensions::template::Syntax;

str dir = "extensions.template.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/template/cached/Parser.java|;
