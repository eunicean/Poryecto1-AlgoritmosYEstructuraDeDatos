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
import java.util.regex.*;

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
		case 0:
			return additionProcessAssignment(code).maketheoperations();
		case 1:
			return substractionProcessAssignment(code).maketheoperations();
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
		default:
			break;
		}
		
		return null;
	}
	
	/**
	 * Method that assigns the process of addition
	 * @param code String with the code that contains the numbers or variables to do the addition
	 * @return object type IOperationsfile that has the information of the process
	 */
	public IOperationsfile additionProcessAssignment(String code) {
		int total = 0;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
	    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
	    	
	    	if(matcherNum.lookingAt()) {
	    		
	    		total += Integer.parseInt(matcher.group().trim());
	    		
	    	}
	    	else if(matcherVar.lookingAt()) {
	    		if(Variables.containsKey(matcher.group())){
		    		int valor = Variables.get(matcher.group());
		    		total += valor;
		    	}
	    		else {
		    		ErrorProcess error = new ErrorProcess();
					error.Results("VARIABLE", "Invalid variable");
					return error;
		    	}
	    	}
	    }
		
		IOperationsfile result = new ArithmeticProcess();
		result.Results("Suma", String.valueOf(total));
	    return result;
	}
	/**
	 * Method that assigns the process of subtraction
	 * @param code String with the code that contains the numbers or variables to do the subtraction
	 * @return object type IOperationsfile that has the information of the process
	 */
	public IOperationsfile substractionProcessAssignment(String code) {
		int total = 0, counter = 0;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	if(counter == 0) {
	    		Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
		    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
		    	
		    	if(matcherNum.lookingAt()) {
		    		
		    		total = Integer.parseInt(matcher.group().trim());
		    		
		    	}
		    	else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
			    		int valor = Variables.get(matcher.group());
			    		total = valor;
			    	}
		    		else {
		    			IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
						return error;
			    	}
		    	}
	    	}
	    	else {	    		
	    		Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
		    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
		    	
		    	if(matcherNum.lookingAt()) {
		    		
		    		total -= Integer.parseInt(matcher.group().trim());
		    		
		    	}
		    	else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
			    		int valor = Variables.get(matcher.group());
			    		total -= valor;
			    	}
		    		else {
		    			IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
						return error;
			    	}
		    	}
	    	}
	    	counter ++;
	    }
		IOperationsfile result = new ArithmeticProcess();
		result.Results("Resta", String.valueOf(total));
	    return result;
	}
	
	/**
	 * Method that assigns the process of multiplication
	 * @param code String with the code that contains the numbers or variables to do the multiplication
	 * @return object type IOperationsfile that has the information of the process
	 */
	public IOperationsfile multiplicationProcessAssignment(String code) {
		int total = 1;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
	    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
	    	
	    	if(matcherNum.lookingAt()) {
	    		
	    		total = total * Integer.parseInt(matcher.group().trim());
	    		
	    	}
	    	else if(matcherVar.lookingAt()) {
	    		if(Variables.containsKey(matcher.group())){
		    		int valor = Variables.get(matcher.group());
		    		total = total * valor;
		    	}
	    		else {
	    			IOperationsfile error = new ErrorProcess();
		    		error.Results("VARIABLE", "Invalid variable");
					return error;
		    	}
	    	}
	    }
		IOperationsfile result = new ArithmeticProcess();
		result.Results("Multiplicacion", String.valueOf(total));
	    return result;
	}
	
	/**
	 * Method that assigns the process of division
	 * @param code String with the code that contains the numbers or variables to do the division
	 * @return object type IOperationsfile that has the information of the process
	 */
	public IOperationsfile divitionProcessAssignment(String code) {
		int total = 1, counter = 0;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	if (counter == 0) {
	    		Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
		    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
		    	
		    	if(matcherNum.lookingAt()) {
		    		
		    		total = Integer.parseInt(matcher.group().trim());
		    		
		    	}else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
			    		int valor = Variables.get(matcher.group());
			    		total = valor;
			    	}else {
			    		IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
						return error;
			    	}
		    	}
	    	}else {	    		
	    		Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
		    	Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
		    	
		    	if(matcherNum.lookingAt()) {
		    		
		    		total = total / Integer.parseInt(matcher.group().trim());
		    		
		    	}else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
			    		int valor = Variables.get(matcher.group());
			    		total = total / valor;
			    	}else {
			    		IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
						return error;
			    	}
		    	}
	    	}
	    	counter ++;
	    }

		IOperationsfile result = new ArithmeticProcess();
		result.Results("Division", String.valueOf(total));
	    return result;
	}
	
	public IOperationsfile variableAssignmentProcess(String code) {
		return null;
	}
	
	public IOperationsfile equalProcessAssignment(String code) {
		return null;
	}
	
	public IOperationsfile greaterThanAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile lesserThanAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile listAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile atomAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile quoteAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile combAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile combAssignmentProcessResult(String code) {
		return null;
	}
	public IOperationsfile defunAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile functionAssignmentProcess(String code) {
		return null;
	}
	public IOperationsfile condAssignmentProcess(String code) {
		return null;
	}
}
