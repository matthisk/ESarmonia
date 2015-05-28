module extensions::forof::cached::CacheParser
import extensions::forof::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.forof.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/forof/cached/Parser.java|;

void saveParserForOf() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}
