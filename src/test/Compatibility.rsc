module \test::Compatibility

import IO;
import String;
import ParseTree;
import util::Math;

import desugar::Desugar;
import \test::compatibility::Util;

public loc compatDir = |project://rascal-sweetjs/input/compatibility|;

void run() {
	int success = 0; int failed = 0;
	list[str] categories = listEntries(compatDir);
	
	for( category <- categories ) {
		if( category[0] == "." || !(category in ["syntax","bindings","functions"]) ) continue;
		score = 0;
		println("Category: <category>");
		
		for( t <- listEntries(compatDir + category) ) {
			<s,f> = run( compatDir + category + t, t );
			score += s;
			success += s;
			failed += f;
		}
		
		println("Score for <category>: <score>");
	}

	println("==================	
			'SUCCESS: <success>
			'FAILED: <failed>
			'PERCENTAGE: <percent(success,success+failed)>% success
			'==================");
}

tuple[int,int] run(loc file,str fileName) {
	println("Test <fileName>");
	int success = 0; int failed = 0;
	throwing = file.file == "const.sjs" || file.file == "let.sjs";
	start[Source] pt;
	
	try {
		pt = parse(#start[Source], file);
	} catch e: {
		println(" Parsing <fileName> failed: <e>\n");
		return <0,0>;
	}
	
	pt = desugarAll(pt,runtime=false,throwReferenceErrors=throwing);
	
	top-down-break visit(pt) {
		case Function f: {
			<s,m> = testRunFunction(f);
			if(s) success += 1;
			else failed += 1;
		}
	}
	
	println(" Success: <success>");
	println(" Failed: <failed>");
	println("");
	
	return <success,failed>;
}

tuple[bool,str] testRunFunction(Function f)
	= runNodeProcess(s,outputFormat=NONE)
	when
		Statement s := (Statement)`(<Function f>)();`;