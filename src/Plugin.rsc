module Plugin

import IO;
import ParseTree;
import util::IDE;

import lang::javascript::saner::Syntax;
import Desugar;
import Parse;

private str LANG = "SweetrJS";
private str EXT = "swjs";

void main() {

	registerLanguage(LANG, EXT, createLanguage );

	registerContributions(LANG, {
		popup(
			menu("ES6", [ action("Transform to ES5", transform)] )
		)
	});

}

start[Source] createLanguage( str src, loc l ) = parse( src, l );

void transform( start[Source] pt ) = transform( pt, |tmp:///| );
void transform( start[Source] pt, loc selection ) {
	println( desugar( pt ) );
}