function ff() {
    var called = false;
    function fn(parts, a, b) {
      called = true;
      return parts instanceof Array &&
        parts[0]     === "foo"      &&
        parts[1]     === "bar\n"    &&
        parts.raw[0] === "foo"      &&
        parts.raw[1] === "bar\\n"   &&
        a === 123                   &&
        b === 456;
    }
    return fn(_taggedTemplateLiteral(["foo","b\n\tar",""], ["foo","b\\n\\tar",""]), 123,456 ) && called;
}
