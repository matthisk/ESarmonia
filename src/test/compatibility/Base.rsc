module \test::compatibility::Base
extend \test::Base;
extend runtime::Visitor;

import desugar::Desugar;
import ParseTree;

import util::ShellExec;

private str createIterableObject = "function __createIterableObject(a, b, c) {if (typeof Symbol === \"function\" && Symbol.iterator) {var arr = [a, b, c, ,];var iterable = {next: function() {return { value: arr.shift(), done: arr.length \<= 0 };},}; iterable[Symbol.iterator] = function(){ return iterable; }; return iterable; } else {return eval(\"(function*() { yield a; yield b; yield c; }())\");}}";

private bool runNodeProcess( &T <: Tree dpt ) {
        nodeP = createProcess( "/home/heimense/local/bin/node", args=["--use_strict","-p","<createIterableObject> <dpt>"] );
        output = readEntireStream( nodeP );
        err = readEntireErrStream( nodeP );
        killProcess( nodeP );

        res = and([ expect( output[0..-1] ).toBe( "true" ), expect( err ).toBe("") ]);

        if( ! res ) { println( 4, "<dpt>" ); }

        return res;
}

Spec tryRunning( str input ) {
        return bool() {
                try {
                        dpt = desugarAll( parse( #start[Source], input ) );										
                        return runNodeProcess( dpt );
                } catch exception : {
                        println( 4, "failed with error: <exception>" );
                        return false;
                }
        };
}

Spec tryRunning( &T <: Tree src ) {
        return bool() {
                try {
                        dpt = runtimeVisitor( desugarVisitor( src ) );
                        return runNodeProcess( dpt );
                } catch exception : {
                        println( 4, "failed with error: <excpetion>" );
                        return false;
                }
        };
}