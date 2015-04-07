module Plugin

import ParseTree;

import lang::javascript::saner::Syntax;

void main() {

	registerLanguage("SweetRJS", "swrjs", start[Source] (str src, loc l) {
		return parse(#start[Source], src, l);
	});

}