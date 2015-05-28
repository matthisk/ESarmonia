module extensions::parameters::cached::CacheParser
import extensions::parameters::Syntax;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

str dir = "extensions.parameters.cached";
str parserName = "Parser";
loc file = |project://rascal-sweetjs/src/extensions/parameters/cached/Parser.java|;

void saveParserParameters() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}
