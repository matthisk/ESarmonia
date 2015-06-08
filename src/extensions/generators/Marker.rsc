module extensions::generators::Marker
import extensions::generators::Syntax;

alias Update = void(int);
alias Marker = tuple[Update update,Literal() toLiteral,int() get];

Marker marker(int initVal) {
	int val = initVal;
	
	void update(int v) { val = v; }
	Literal toLiteral() { return [Literal]"<val>"; }
	int get() { return val; }
	
	return <update,toLiteral,get>;
}