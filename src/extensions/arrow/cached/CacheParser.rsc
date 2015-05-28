module extensions::arrow::cached::CacheParser
import extensions::arrow::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.arrow.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/arrow/cached/Parser.java|;

void saveParserArrow() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}

