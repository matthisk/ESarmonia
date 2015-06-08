module extensions::generators::Meta
import extensions::generators::Syntax;

import ParseTree;

bool containsLeap( &T <: Tree n ) {
	top-down visit(n) {
		case (Expression)`yield` : return true;
        case (Expression)`yield <Id _>` : return true;
        case (Expression)`yield* <Id _>` : return true;
        case (Statement)`break;` : return true;
        case (Statement)`continue;` : return true;
        case (Statement)`return;` : return true;
        case (Statement)`return <Expression _>;` : return true;
        case (Statement)`throw <Expression _>;` : return true;
	}
	
	return false;
}