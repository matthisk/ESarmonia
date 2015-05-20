module parser::cached::CacheParser

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

void saveParser() {
	try file; catch: loc file = |project://rascal-sweetjs/src/parser/cached/SweeterJSCachedParser.java|;
	try dir;  catch: str dir = "parser.cached";
	try parserName; catch: str parserName = "SweeterJSCachedParser";
	
	p = newGenerate( dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}