module extensions::template::Test
extend \test::Base;
extend desugar::Visitor;

import extensions::template::Desugar;

test bool parsingStringTemplate() {	
	return
	describe( "String templates (parsing)", [
	
		\it( "can be empty", tryParsing("
                var t = ``;
		") ),
		
		\it( "can have only characters", tryParsing("
				var t = `aap`;
		") ),
		
		\it( "can have a variable interpolated", tryParsing("
				var t = `aap ${A} noot`;
		") ),
		
		\it( "can have multiple variable interpolated", tryParsing("
				var t = `aap ${A} noot ${B} mies`;
		") ),
		
		\it( "can be interpolated with any valid expression", tryParsing("
				var t = `aap ${ a = b = function() { return noot; } } noot`;
		") ),
		
		\it( "can continue on new lines", tryParsing("
				var t = `aap 
						 ${A} 
						 noot 
						 ${B} 
						 mies`;
		") )
	]);
}

test bool desugaringStringTemplates() {
	return
	describe( "String templates (desugaring)", [
		\it("with a newline character", tryDesugar(
			"var t = `aap
			'noot`;",
			[<"var t = \"aap\nnoot\";",
			  bool(pt) { return /(Statement)`var t = "aap\\nnoot";` := pt; }>]
		)),
		
		\it("with interpolated variable", tryDesugar(
			"var t = `aap${A}noot`;",
			[<"var t = \"aap\" + A + \"noot\";",
			  bool(pt) { return /(Statement)`var t = "aap" + A + "noot";` := pt; }>]
		)),
		
		\it("with tagged template strings", tryDesugar(
			"tag`aap${A}no
			'ot${B}mies`;",
			[<"tag(_taggedTemplateLiteral([\"aap\",\"noot\",\"mies\"],[\"aap\",\"noot\",\"mies\"]),A,B);",
			  bool(pt) { return /(Statement)`tag(_taggedTemplateLiteral(["aap","noot","mies"],["aap","noot","mies"]),A,B);` := pt; }>]
		))
	]);
}