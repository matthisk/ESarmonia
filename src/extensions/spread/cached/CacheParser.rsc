module extensions::spread::cached::CacheParser
import extensions::spread::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.spread.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/spread/cached/Parser.java|;

void saveParserSpread() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}