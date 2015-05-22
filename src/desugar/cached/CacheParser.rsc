module desugar::cached::CacheParser
extend desugar::cached::CacheParserBase;

extend desugar::Desugar;

loc file = |project://rascal-sweetjs/src/desugar/cached/Parser.java|;
str dir = "desugar.cached";
str parserName = "Parser";