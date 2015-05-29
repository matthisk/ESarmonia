module \test::compatibility::Base
extend \test::Base;
extend runtime::Visitor;

import desugar::Desugar;
import ParseTree;

import \test::compatibility::Util;

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