/**
 * Object that simulates the interpreter of the language LISP 
 * @author Eunice Mata - 21231
 * @author Samantha Bhor - 22545
 */

package Interprete;

import java.util.*;

import Operations.*;

public class Interpreter {
	private HashMap<String, Integer> Variables;
	private HashMap<String, String> Functions;
	
	
	public Interpreter() {
		Variables = new HashMap<String, Integer>();
		Functions = new HashMap<String, String>();
	}
	
	public String RunCode(String code) {
		int codeToken = Token.getToken(code);
		
		switch (codeToken) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		case 11:
			
			break;
		case 12:
			
			break;
		case 13:
			
			break;
		case 14:
			
			break;
		case 15:
			
			break;
		case 16:
			
			break;

		default:
			break;
		}
		
		return null;
	}
}
