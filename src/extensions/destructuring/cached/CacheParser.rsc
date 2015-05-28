module extensions::destructuring::cached::CacheParser
import extensions::destructuring::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.destructuring.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/destructuring/cached/Parser.java|;

void saveParserDestructuring() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}