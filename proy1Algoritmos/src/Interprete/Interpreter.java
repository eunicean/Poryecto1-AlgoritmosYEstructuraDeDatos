/**
 * Object that simulates the interpreter of the language LISP 
 * @author Eunice Mata - 21231
 * @author Samantha Bhor - 22545
 * 
 * {@link} Documentation https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 * {@link} examples https://www.w3schools.com/java/java_regex.asp
 */

package Interprete;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public IOperationsfile additionProcessAssignment(String code) {
		int total = 0;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNum = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVar = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	Matcher matcherNum = patternNum.matcher(matcher.group().trim());
	    	Matcher matcherVar = patternVar.matcher(matcher.group().trim());
	    	
	    	if(matcherNum.lookingAt()) {
	    		
	    		total += Integer.parseInt(matcher.group().trim());
	    		
	    	}else if(matcherVar.lookingAt()) {
	    		if(Variables.containsKey(matcher.group())){
		    		int valor = Variables.get(matcher.group());
		    		total += valor;
		    	}else {
		    		ErrorProcess errorResult = new ErrorProcess();
					errorResult.Results("VARIABLE ERROR", "Variable invalida.");
					return errorResult;
		    	}
	    	}
	    }
		
		ArithmeticProcess miResult = new ArithmeticProcess();
	    miResult.Results(" suma ", "" + total);
	    return miResult;
	}
}
