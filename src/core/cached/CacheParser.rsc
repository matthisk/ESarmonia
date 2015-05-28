module core::cached::CacheParser
import core::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "core.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/core/cached/Parser.java|;

void saveParserCore() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}