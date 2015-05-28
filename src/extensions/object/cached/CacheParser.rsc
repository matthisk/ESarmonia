module extensions::object::cached::CacheParser
import extensions::object::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.object.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/object/cached/Parser.java|;

void saveParserObject() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}