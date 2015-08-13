function() {
    let scopes = [];
    for(let i = 0; i < 2; i++) {
      scopes.push(function(){ return i; });
    }
    let i = 0;
    let passed = (scopes[0]() === 0 && scopes[1]() === 1);
}

