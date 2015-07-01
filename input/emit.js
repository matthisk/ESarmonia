var scopes = [];

for(let [i] in [[1],[2],[3]]) {
	scopes.push(function() { i; });
}
