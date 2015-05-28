module extensions::classes::cached::CacheParser
import extensions::classes::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.classes.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/classes/cached/Parser.java|;

void saveParserClasses() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}