module Plugin

import IO;
import ParseTree;
import util::IDE;
import Message;
import vis::Figure;
import String;

import core::resolve::Resolve;
import core::resolve::Util;

import \test::Compatibility;

import desugar::Desugar;

anno rel[loc,loc,str] Tree@hyperlinks;

void main() {
	makeRegistrar( "Sweetr JS", "sjs" )();
}

void() makeRegistrar(str lang, str ext) {
	start[Source] js;
	Refs xrefs;
	map[loc,str] renaming;
	
	return void() {
		registerLanguage(lang, ext, Tree(str src, loc l) {
			return parse( #start[Source], src, l);
		});
		
		registerContributions(lang, {
			annotator(Tree(Tree pt) {
				if(start[Source] s := pt) {
					<js, xref, renaming> = desugarAndResolve(s);
					if( isCompatibilityTest(pt@\loc) ) {
						println("Annotating compatibility test file: <s.top@\loc.file>");
						int successes = 0; int failures = 0;
						
						set[Message] messages = {};
						top-down-break visit(js) {
							case Function f : {
								<success,msg> = testRunFunction(f);
								if(!success) {
									messages += error("Test failed: <msg>",f@\loc);
									failures += 1;
								} else {
									successes += 1;
								}
							}
						}
					
						println(" rate: <successes>/<failures + successes>");
						
						return s[@messages=messages];
					} else {
						s = addHoverDocs(s, renaming);
						xref2 = { <u, d, x> | <u, d, x> <- xref, u.path == pt@\loc.path, d.path == pt@\loc.path }; 
			  			s = s[@hyperlinks=xref2];
			  			if( js@messages? ) s = s[@messages = js@messages];
			  			return s;
					}
				}
				return pt[@messages={error("BUG: not JS", pt@\loc)}];
			}),
			
			builder(set[Message](Tree tree) {
				if( isCompatibilityTest( tree@\loc ) ) return {};
				
				fixed = rename(js, renaming);
				out = tree@\loc.top[extension="js"];
				writeFile(out, unparse(fixed));
				return  {};
			}),
			
			categories(
				("TemplateString":{foregroundColor(rgb(255, 85, 0)), backgroundColor(color("white"))},
				 "String":{foregroundColor(rgb(161,1,0)), backgroundColor(color("white"))})
			)
		});
	};
}

bool isCompatibilityTest( loc l ) = contains("<l>","/compatibility") && l.extension == "sjs";

start[Source] addHoverDocs(start[Source] s, map[loc, str] renaming) {
  return visit (s) {
    case Statement stm: {
      stm2 = desugar(stm);
      if (stm2 != stm) {
        insert stm[@doc="<stm2>"];
      }
    }
    case Expression exp: {
      exp2 = desugar(exp);
      if (exp2 != exp) {
        insert exp[@doc="<exp2>"];
      }
    }
    case Id x =>x[@doc=renaming[x@\loc]]
      when x@\loc in renaming
  }
}

tuple[start[Source], Refs, map[loc, str]] desugarAndResolve(start[Source] src) {
	js = desugarAll(src,runtime=false);
	js = uniqueify(js);
	<lookup, getRenaming> = makeResolver();
	xref = resolve(js.top, lookup);
	renaming = getRenaming(xref);
	return <js, xref, renaming>;
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}