module extensions::template::Runtime

import extensions::template::Syntax;

public Statement _taggedTemplateLiteral = (Statement)`function _taggedTemplateLiteral(strings, raw) { return Object.freeze(Object.defineProperties(strings, { raw: { value: Object.freeze(raw) } })); }`;