module extensions::generators::Marker
import extensions::generators::Syntax;

alias Update = void(int);
alias Marker = tuple[Update update,Literal() toLiteral];

Marker marker(int initVal) {
	int val = initVal;
	
	void update(int v) { val = v; }
	Literal toLiteral() { return [Literal]"<val>"; }
	
	return <update,toLiteral>;
}