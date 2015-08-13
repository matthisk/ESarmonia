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
	
	registerLanguage("JavaScript", "js", Tree(str src,loc l) {
		return parse( #start[Source], src, l );
	});
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
					if( isCompatibilityTest(pt@\loc) ) {
						return compatibilityAnnotator(pt);
					} else {
						<js, xref, renaming> = desugarAndResolve(s);
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
				
				out = tree@\loc.top[extension="js"];
				writeFile(out, unparse(js));
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

start[Source] compatibilityAnnotator(start[Source] s) {
	println("Annotating compatibility test file: <s.top@\loc.file>");
	int successes = 0; int failures = 0;

	throwing = s.top@\loc.file == "const.sjs" || s.top@\loc.file == "let.sjs";
	
	set[Message] messages = {};
	s = top-down-break visit(s) {
		case Function f : {
			fd = desugarAll(f,runtime=false,throwReferenceErrors=throwing);
			
			<success,msg> = testRunFunction(fd);
			if(!success) {
				println("<fd>");
				messages += error("Test failed: <msg>",f@\loc);
				failures += 1;
			} else {
				successes += 1;
			}
			insert f[@doc="<fd>"];
		}
	}

	println(" rate: <successes>/<failures + successes>");
	
	return s[@messages=messages];
}

start[Source] addHoverDocs(start[Source] s, map[loc, str] renaming) {
  generateUId = generateNamer();
  
  return visit (s) {
    case Statement stm: {
      stm2 = desugar(stm, generateUId);
      if (stm2 != stm) {
        insert stm[@doc="<stm2>"];
      }
    }
    case Expression exp: {
      exp2 = desugar(exp, generateUId);
      if (exp2 != exp) {
        insert exp[@doc="<exp2>"];
      }
    }
    case Id x =>x[@doc=renaming[x@\loc]]
      when x@\loc in renaming
  }
}