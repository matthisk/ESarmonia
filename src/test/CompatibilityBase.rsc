module \test::CompatibilityBase
extend \test::Base;

import Desugar;
import Parse;
import ParseTree;

import util::ShellExec;

private bool runNodeProcess( &T <: Tree dpt ) {
        nodeP = createProcess( "/usr/local/bin/node", ["-p","<dpt>"] );
        output = readEntireStream( nodeP );
        err = readEntireErrStream( nodeP );
        killProcess( nodeP );

        res = and([ expect( output ).toBe( "true" ), expect( err ).toBe("") ]);

        if( ! res ) { println( dpt ); }

        return res;
}

Spec tryRunning( str input ) {
        return bool() {
                try {
                        dpt = desugar( parse( #start[Source], input ) );
                        return runNodeProcess( dpt );
                } catch exception : {
                        println( "failed with error: <exception>" );
                        return false;
                }
        };
}

Spec tryRunning( &T <: Tree src ) {
        return bool() {
                try {
                        dpt = desugarVisitor( src );
                        return runNodeProcess( dpt );
                } catch exception : {
                        println( "failed with error: <excpetion>" );
                        return false;
                }
        };
}