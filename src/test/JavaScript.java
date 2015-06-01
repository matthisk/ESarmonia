package test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.io.FileReader;
import java.io.IOException;

import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.IString;

public class JavaScript {
	private final IValueFactory values;
	private ScriptEngine engine;
	
	public JavaScript(IValueFactory values) throws Throwable {
		this.values = values;
		
		ScriptEngineManager engineManager = new ScriptEngineManager();
		this.engine = engineManager.getEngineByName("nashorn");
		
		this.evalFile( values.string("/ufs/heimense/Thesis/rascal-sweetjs/src/runtime/runtime.js") );
	}
	
	public IString eval(IString input) {
		try {
			return values.string( this.engine.eval( input.getValue() ).toString() );
		} catch (ScriptException e) {
			return values.string("error: " + e.toString());
		} catch (NullPointerException e) {
			return values.string("NullPointerException, probable cause is bug in Nashorn: " + e.toString());
		}
	}
	
	public IString evalFile(IString loc) throws IOException {
		FileReader fr;
		try {
			fr = new FileReader( loc.getValue() );
		} catch (Throwable e) {
			return values.string("error: " + e.toString());
		}
		
		try {
			return values.string( this.engine.eval( fr ).toString() );
		} catch (ScriptException e) {
			return values.string("error: " + e.toString());
		} catch (NullPointerException e) {
			return values.string("NullPointerException, probable cause is bug in Nashorn: " + e.toString());
		} finally {
			fr.close();
		}
	}
}