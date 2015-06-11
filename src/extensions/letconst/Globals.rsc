module extensions::letconst::Globals

import extensions::letconst::Syntax;
import extensions::letconst::Util;

loc l = |tmp:///|;

public Env globals = (
	// Value properties
	"Infinity":l,
	"NaN":l,
	"undefined":l,
	"null":l,
	
	// Function properties
	"eval":l,
	"uneval":l,
	"isFinite":l,
	"isNaN":l,
	"parseFloat":l,
	"parseInt":l,
	"decodeURI":l,
	"decodeURIComponent":l,
	"encodeURI":l,
	"encodeURIComponent":l,
	"escape":l,
	"unescape":l,
	
	// Fundemental objects
	"Object":l,
	"Function":l,
	"Boolean":l,
	"Symbol":l,
	"Error":l,
	"EvalError":l,
	"InternalError":l,
	"RangeError":l,
	"ReferenceError":l,
	"SyntaxError":l,
	"TypeError":l,
	"URIError":l,
	
	// Numers and dates
	"Number":l,
	"Math":l,
	"Date":l,
	
	// Text processing
	"String":l,
	"RegExp":l,
	
	// Indexed collections
	"Array":l,
	"Int8Array":l,
	"Uint8Array":l,
	"Uint8ClampedArray":l,
	"Int16Array":l,
	"Uint16Array":l,
	"Int32Array":l,
	"Uint32Array":l,
	"Float32Array":l,
	"Float64Array":l,

	// Keyed collections
	"Map":l,
	"Set":l,
	"WeakMap":l,
	"WeakSet":l,
	
	// Vector collections
	"SIMD":l,
	"SIMD.float32x4":l,
	"SIMD.float64x2":l,
	"SIMD.int8x16":l,
	"SIMD.int16x8":l,
	"SIMD.int32x4":l,
	
	// Structured data
	"ArrayBuffer":l,
	"DataView":l,
	"JSON":l,
	
	// Control abstraction objects
	"Promise":l,
	"Generator":l,
	"GeneratorFunction":l,
	
	// Reflection
	"Reflect":l,
	"Proxy":l,
	
	// Internationalization
	"Intl":l,
	"Intl.Collator":l,
	"Intl.DateTimeFormat":l,
	"Intl.NumberFormat":l,
	
	// Other
	"arguments":l
);
