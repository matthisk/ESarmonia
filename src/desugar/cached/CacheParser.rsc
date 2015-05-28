module desugar::cached::CacheParser
import desugar::Desugar;

import core::cached::CacheParser;
import extensions::arrow::cached::CacheParser;
import extensions::classes::cached::CacheParser;
import extensions::destructuring::cached::CacheParser;
import extensions::forof::cached::CacheParser;
import extensions::letconst::cached::CacheParser;
import extensions::object::cached::CacheParser;
import extensions::parameters::cached::CacheParser;
import extensions::spread::cached::CacheParser;
import extensions::template::cached::CacheParser;

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

loc file = |project://rascal-sweetjs/src/desugar/cached/Parser.java|;
str dir = "desugar.cached";
str parserName = "Parser";

void saveParserAll() {
	p = newGenerate(dir, parserName, grammar(#start[Source]));
	writeFile(file,p);
}

void saveAllParsers() {
	saveParserCore();
	println("Core parser saved");
	saveParserArrow();
	println("Arrow parser saved");
	saveParserClasses();
	println("Classes parser saved");
	saveParserDestructuring();
	println("Destructuring parser saved");
	saveParserForOf();
	println("For Of parser saved");
	saveParserLetConst();
	println("Let Const parser saved");
	saveParserObject();
	println("Object parser saved");
	saveParserParameters();
	println("Parameters parser saved");
	saveParserSpread();
	println("Spread parser saved");
	saveParserTemplate();
	println("Template parser saved");
	saveParserAll();
	println("All parsers saved");
}