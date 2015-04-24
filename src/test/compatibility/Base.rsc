module \test::compatibility::Base
extend \test::Base;
extend runtime::Visitor;

import Desugar;
import Parse;
import ParseTree;

import util::ShellExec;

private bool runNodeProcess( &T <: Tree dpt ) {
        nodeP = createProcess( "/home/heimense/local/bin/node", args=["-p","<dpt>"] );
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
                        dpt = runtimeVisitor( desugar( parse( #start[Source], input ) ) );
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