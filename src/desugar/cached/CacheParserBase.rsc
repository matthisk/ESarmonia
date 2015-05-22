module desugar::cached::CacheParserBase

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

void saveParser() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}