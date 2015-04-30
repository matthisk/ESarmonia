module extensions::spread::Runtime

import extensions::spread::Syntax;

Maybe[Statement] runtime( (Expression)`_toConsumableArray( <Expression _> )` ) = just( toConsumableArray );

private Statement toConsumableArray 
	= (Statement)`var _toConsumableArray = function (arr) { if (Array.isArray(arr)) { for(var i = 0, arr2 = Array(arr.length); i \< arr.length; i++) arr2[i] = arr[i]; return arr2; } else { return Array.from(arr); } };`;
