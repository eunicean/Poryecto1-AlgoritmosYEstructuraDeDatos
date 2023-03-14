/**
 * Object that simulates the interpreter of the language LISP 
 * @author Eunice Mata - 21231
 * @author Samantha Bhor - 
 */

package Interprete;

import java.util.*;

public class Interpreter {
	private HashMap<String, Integer> Variables;
	private HashMap<String, String> Functions;
	
	public Interpreter() {
		Variables = new HashMap<String, Integer>();
		Functions = new HashMap<String, String>();
	}
}
