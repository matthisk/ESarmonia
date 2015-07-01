function() {
    var scopes = [];
    {
	var _loop = function(i) {
	scopes.push(function(){ return i; });
};
	_loop$0 : for(var i = 0; i < 2; i++) {
var _ret = _loop(i);

switch(result) {
	case "break" : break _loop$0;
	case "continue" : continue;
	
	default:
		if(typeof result !== 'object') return _ret.v;
}
}
}
    var passed = (scopes[0]() === 0 && scopes[1]() === 1);
}
