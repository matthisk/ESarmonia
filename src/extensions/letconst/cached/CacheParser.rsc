module extensions::letconst::cached::CacheParser
import extensions::letconst::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.letconst.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/letconst/cached/Parser.java|;

void saveParserLetConst() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}