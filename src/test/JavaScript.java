package test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;

public class JavaScript {
	private final IValueFactory values;
	private ScriptEngine engine;
	private Invocable invocable;
	
	public JavaScript(IValueFactory values) {
		this.values = values;
		
		ScriptEngineManager engineManager = new ScriptEngineManager();
		this.engine = engineManager.getEngineByName("nashorn");
		this.invocable = (Invocable) this.engine;
	}
	
	public IString eval(IString input) {
		try {
			return values.string( this.engine.eval( input.getValue() ).toString() );
		} catch (ScriptException e) {
			return values.string("error: " + e.toString());
		}
	}
}