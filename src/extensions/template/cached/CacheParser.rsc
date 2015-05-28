module extensions::template::cached::CacheParser
import extensions::template::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.template.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/template/cached/Parser.java|;

void saveParserTemplate() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}