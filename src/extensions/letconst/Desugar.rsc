@cachedParser{extensions.letconst.cached.Parser}
module extensions::letconst::Desugar
import extensions::letconst::Syntax;

Declarator desugar( (Declarator)`<LetOrConst _>` ) = (Declarator)`var`;