module core::FlowChecker

import IO;
import ParseTree;
import Message;
import Map;
import Node;
import String;
import Set;
import util::ShellExec;
import util::Math;

import lang::json::ast::JSON;
import lang::json::IO;

alias JSONObject = map[ str, JSON ];

private default list[Message] extractMessages( loc at, input ) { return []; }
private list[Message] extractMessages( loc at, JSON obj:object(_) ) = extractMessages( at, obj.properties );
private list[Message] extractMessages( loc at, JSONObject properties ) = "errors" in properties ? extractMessages( at, properties["errors"] ) : [];
private list[Message] extractMessages( loc at, [ JSON obj:object(_) ] ) = "message" in obj.properties ? extractMessages( at, obj.properties["message"] ) : [];
private list[Message] extractMessages( loc at, JSON arr:array(_) ) { return extractMessages( at, arr.values ); }
private list[Message] extractMessages( loc at, list[JSON] messageObjects ) = [ extractMessage( at, properties ) | message <- messageObjects, object( properties ) := message ];

private loc extractLocation( loc at, JSONObject messageObject ) {
	at = at[begin = <toInt(messageObject["line"].n) - 1,toInt(messageObject["start"].n)>];
	at = at[end = <toInt(messageObject["endline"].n) - 1, toInt(messageObject["end"].n)>];

	return at;
}

private Message extractMessage( loc at, JSONObject messageObject ) = error( messageObject["descr"].s, extractLocation( at, messageObject ) );

private map[loc,Message] mapLocationToMessage( list[Message] msgs ) = ( msg.at : msg | msg <- msgs );

private Message(Message) createCalculateLocationOffsetFunction( list[str] codeLines ) {
	Message fun( Message m ) {
		l = m.at;
		l.offset = ( 0 | it + size( codeLines[i] ) | i <- [0..(l.begin.line - 1)] ) + l.begin.column;

		int remainingLengthStartLine = l.begin.column;
		int remainingLengthEndLine = (size(codeLines[l.end.line-1]) - l.end.column);

		l.length = ( 0 | it + size( codeLines[i] ) | i <- [(l.begin.line-1)..(l.end.line-1)] + [(l.end.line-1)] );
		l.length = l.length - ( remainingLengthStartLine + remainingLengthEndLine );

		return m[at = l];
	}

	return fun;
}

Tree runFlowTypeChecker( Tree pt ) {
	< code, json > = runFlow( pt );
	list[str] codeLines = split( "\n", code );
	messages = extractMessages( pt@\loc, json );

	pt@messages = toSet( mapper( messages, createCalculateLocationOffsetFunction( codeLines ) ) );

	return pt;
}

void printErrors( start[Source] m ) {
	visit( m ) {
		case Tree t : {
			if( t@messages? ) {
				iprintln( t@messages );
			}
		}
	}
}

tuple[str, JSON] runFlow( Tree pt ) {
	str code = unparse( pt );
	str flowCode = "/* @flow */\n" + code;
	str outputJSON = runFlow( flowCode );

	return < code, fromJSON( #JSON, outputJSON ) >;
}

/*
This writes to a temporary file and runs flow in the directory of this temp file.
It is better to run flow in check-content mode and supply the code through writeTo.
But the java implementation of writeTo does not close the input stream with EOT (.close() in java),
so this can not be used at the moment.
*/
private str runFlow( str code ) {
	writeFile( |file:///Users/matthisk/.flowchecker/flowcheckerrascal.js|, code );

	flowChecker = createProcess( "/usr/local/bin/flow", [ "check", "--json" ], |file:///Users/matthisk/.flowchecker| );

	str outputJSON = readEntireStream( flowChecker );
	str outputERR = readEntireErrStream( flowChecker );

	if( outputERR != "" ) { println( "ERROR: <outputERR>" ); }

	killProcess( flowChecker );

	return outputJSON;
}