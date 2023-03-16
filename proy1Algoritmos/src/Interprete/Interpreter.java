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
		    		
		    		total = total / Integer.parseInt(matcher.group().trim());
		    		
		    	}
		    	else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
			    		int valor = Variables.get(matcher.group());
			    		total = total / valor;
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
		result.Results("Division", String.valueOf(total));
	    return result;
	}
	/**
	 * Method that assigns the process for variable assignment
	 * @param code String with the code that contains the variable and the value of the varible
	 * @return object type IOperationsfile that has the information of the process
	 */
	public IOperationsfile variableAssignmentProcess(String code) {
		Pattern pattern = Pattern.compile("[ ]+[a-z]+[ ]+", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(code);
	    String variableName = "";
	    Integer variableValue = 0;
	    
	    if (matcher.find()) {
	    	variableName = matcher.group().trim();
	    }
	    pattern = Pattern.compile("[ ]+[0-9]+[ ]*", Pattern.CASE_INSENSITIVE); //
	    matcher = pattern.matcher(code);
	    if (matcher.find()) {
	    	variableValue = Integer.parseInt(matcher.group().trim());
	    }
	    
	    Variables.put(variableName, variableValue);//inserting the variable to the map for variables
	    IOperationsfile result = new AssigmentProcess();
		result.Results(variableName, String.valueOf(variableValue));
	    return result;
	}
	
	public IOperationsfile equalProcessAssignment(String code) {
		int firstVariable = 0,secondVariable = 0, counter = 1;
		String r = "";
		Pattern pattern =  Pattern.compile("([0-9]+)",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(code);
		
		while(matcher.find()) {
			if(counter == 1) {	    		
	    		firstVariable = Integer.parseInt(matcher.group().trim());
	    	}
			else {
	    		secondVariable = Integer.parseInt(matcher.group().trim());
	    	}
	    	counter ++;
		}
		
		if(firstVariable == secondVariable) {
	    	r = "True";
	    }
		else {
	    	r = "NIL";
	    }
		
		IOperationsfile result = new PredicatesProcess();
		result.Results("Equal", r);
		return result;
	}
	
	public IOperationsfile greaterThanAssignmentProcess(String code) {
		int firstVariable = 0,secondVariable = 0, counter = 1;
		String r = "";
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNum = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVar = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		 while (matcher.find()) {
		    	Matcher matcherNum = patternNum.matcher(matcher.group().trim());
		    	Matcher matcherVar = patternVar.matcher(matcher.group().trim());
		    	
		    	if(counter == 1) {	    	
		    		if(matcherNum.lookingAt()) {		    		
		    			firstVariable = Integer.parseInt(matcher.group().trim());
			    	}else if(matcherVar.lookingAt()) {
			    		if(Variables.containsKey(matcher.group())){
			    			firstVariable = Variables.get(matcher.group());
				    	}else {
				    		IOperationsfile error = new ErrorProcess();
				    		error.Results("VARIABLE", "Invalid variable");
							return error;
				    	}
			    	}
		    	}else {
		    		if(matcherNum.lookingAt()) {		    		
		    			secondVariable = Integer.parseInt(matcher.group().trim());
			    	}else if(matcherVar.lookingAt()) {
			    		if(Variables.containsKey(matcher.group())){
			    			secondVariable = Variables.get(matcher.group());
				    	}else {
				    		IOperationsfile error = new ErrorProcess();
				    		error.Results("VARIABLE", "Invalid variable");
							return error;
				    	}
			    	}
		    	}
		    	counter ++;
		    }
		    
		    if(firstVariable > secondVariable) {
		    	r = "TRUE";
		    }else {
		    	r = "NIL";
		    }
		IOperationsfile result = new PredicatesProcess();
		result.Results("Mayor que", r);
		return result;
	}
	public IOperationsfile lesserThanAssignmentProcess(String code) {
		int firstVariable = 0,secondVariable = 0, counter = 1;
		String r = "";
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNum = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVar = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
	    	Matcher matcherNum = patternNum.matcher(matcher.group().trim());
	    	Matcher matcherVar = patternVar.matcher(matcher.group().trim());
	    	
	    	if(counter == 1) {	    	
	    		if(matcherNum.lookingAt()) {		    		
	    			firstVariable = Integer.parseInt(matcher.group().trim());
		    	}else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
		    			firstVariable = Variables.get(matcher.group());
			    	}else {
			    		IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
			    		return error;
			    	}
		    	}
	    	}else {
	    		if(matcherNum.lookingAt()) {		    		
	    			secondVariable = Integer.parseInt(matcher.group().trim());
		    	}else if(matcherVar.lookingAt()) {
		    		if(Variables.containsKey(matcher.group())){
		    			secondVariable = Variables.get(matcher.group());
			    	}else {
			    		IOperationsfile error = new ErrorProcess();
			    		error.Results("VARIABLE", "Invalid variable");
			    		return error;
			    	}
		    	}
	    	}
	    	counter ++;
	    }
	    
	    if(firstVariable < secondVariable) {
	    	r = "TRUE";
	    }else {
	    	r = "NIL";
	    }
		
		IOperationsfile result = new PredicatesProcess();
		result.Results("Menor que", r);
		return result;
	}
	public IOperationsfile listAssignmentProcess(String code) {
		String r="(";
		int cont = 0;
		Pattern pattern = Pattern.compile("(('[a-z]')+|[0-9]+|(NIL)+|([ ]+T)+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while(matcher.find()) {
			
			if(cont==0) {
				r += String.valueOf(matcher.group().trim());
			}else {
				r += " "+String.valueOf(matcher.group().trim());
			}

			cont++;
		}
		
		if(cont == 0) {
			r = "NIL";
		}else {
			r += ")";
		}
		
		IOperationsfile result = new PredicatesProcess();
		result.Results("list", r);
		return result;
		
	}
	public IOperationsfile atomAssignmentProcess(String code) {
		String r="";
		boolean atom = true;
		Pattern patternAtom = Pattern.compile("^[(][ ]*atom[ ]+(((\"[a-z]\")+|[0-9]+|(NIL)+|(T)+|('[0-9]+))[ ]*)[)]$", Pattern.CASE_INSENSITIVE); //
		Pattern patternConsp = Pattern.compile("^[(][ ]*atom[ ]+[']([(]+[ ]*(((\"[a-z]\")+|[0-9]+|(NIL)+|(T)+)[ ]*)+[)])[)]$", Pattern.CASE_INSENSITIVE); //
		Matcher matcherAtom = patternAtom.matcher(code);
		Matcher matcherConsp = patternConsp.matcher(code);
		
		while(matcherAtom.find()) {
			atom = true;
		}
		while(matcherConsp.find()) {
			atom = false;
		}
		if(atom) {
			r = "TRUE"; }
		else {
			r = "NIL"; }
		
		IOperationsfile result = new PredicatesProcess();
		result.Results("atom", r);
		return result;
	}
	public IOperationsfile quoteAssignmentProcess(String code) {
	    String ToReplace = "", r = "";
		Pattern pattern = Pattern.compile("(quote |')+", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(code);
	    
	    if(matcher.find())
	    	ToReplace = matcher.group().trim();
	    r = code.replace(ToReplace, "");
	    r = r.substring(1, r.length()-1);
	    IOperationsfile result = new PredicatesProcess();
		result.Results("de quote", r);
		return result;
	}
	public String combVerifyingProcess(String code) {
		
		code = code.substring(1,code.length()-1);
		
		int countSubs = 0, countDiv = 0, total = 0;
		String operator = null;
		Pattern pattern = Pattern.compile("(([a-z,0-9]+)+|(([ ][(]).*[)])+|([+]+|[-]+|[*]+|[/]+)+)", Pattern.CASE_INSENSITIVE);
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE);
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternParentesis = Pattern.compile("(([(]).*[)])", Pattern.CASE_INSENSITIVE);
		Pattern patternOperation = Pattern.compile("([+]+|[-]+|[*]+|[/]+)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find()) {
			
	    	Matcher matcherOp = patternOperation.matcher(matcher.group().trim());

	    	if(matcherOp.lookingAt()) {
	    		operator = matcherOp.group();
	    		if(operator.equals("*") || operator.equals("/")) {
	    			total = 1;
	    		}
	    	}else{
	    		switch (operator) {
		    		case "+":
		    			Matcher matcherNum = patternNumber.matcher(matcher.group().trim());
		    			Matcher matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    			Matcher matcherVar = patternVariable.matcher(matcher.group().trim());
		    	    	if(matcherNum.lookingAt()) {	
		    	    		total += Integer.parseInt(matcher.group().trim());
		    	    	}else if(matcherVar.lookingAt()){
		    	    		if(Variables.containsKey(matcher.group())){
		    		    		int valor = Variables.get(matcher.group());
		    		    		total += valor;
		    		    	}else {
		    		    		return "ERROR";
		    		    	}
		    	    	}else if(matcherParentesis.lookingAt()) {
		    	    		try {
		    	    			total += Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
		    	    		}catch(Exception e) {
		    	    			return "ERROR";
		    	    		}
		    	    	}
		    			break;
		    		case "-":
		    			matcherNum = patternNumber.matcher(matcher.group().trim());
		    			matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    			matcherVar = patternVariable.matcher(matcher.group().trim());
		    			if(countSubs == 0) {
		    				if(matcherNum.lookingAt()) {
		    		    		total = Integer.parseInt(matcher.group().trim());
		    		    	}else if(matcherVar.lookingAt()){
			    	    		if(Variables.containsKey(matcher.group())){
			    		    		int valor = Variables.get(matcher.group());
			    		    		total = valor;
			    		    	}else {
			    					return "ERROR";
			    		    	}
			    	    	}else if(matcherParentesis.lookingAt()) {
			    	    		try {
			    	    			total = Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
			    	    		}catch(Exception e) {
			    	    			return "ERROR";
			    	    		}
			    	    	}
		    				countSubs ++;
		    			}else {
		    				matcherNum = patternNumber.matcher(matcher.group().trim());
		    				matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    				matcherVar = patternVariable.matcher(matcher.group().trim());
		    		    	
		    		    	if(matcherNum.lookingAt()) {
		    		    		total -= Integer.parseInt(matcher.group().trim());
		    		    	}else if(matcherVar.lookingAt()){
			    	    		if(Variables.containsKey(matcher.group())){
			    		    		int valor = Variables.get(matcher.group());
			    		    		total -= valor;
			    		    	}else {
			    					return "ERROR";
			    		    	}
			    	    	}else if(matcherParentesis.lookingAt()) {
			    	    		try {
			    	    			total -= Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
			    	    		}catch(Exception e) {
			    	    			return "ERROR";
			    	    		}
			    	    	}
		    			}
		    			break;
		    		case "*":
		    			matcherNum = patternNumber.matcher(matcher.group().trim());
		    			matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    			matcherVar = patternVariable.matcher(matcher.group().trim());
		    	    	if(matcherNum.lookingAt()) {	
		    	    		total *= Integer.parseInt(matcher.group().trim());
		    	    	}else if(matcherVar.lookingAt()){
		    	    		if(Variables.containsKey(matcher.group())){
		    		    		int valor = Variables.get(matcher.group());
		    		    		total *= valor;
		    		    	}else {
		    					return "ERROR";
		    		    	}
		    	    	}else if(matcherParentesis.lookingAt()) {
		    	    		try {
		    	    			total *= Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
		    	    		}catch(Exception e) {
		    	    			return "ERROR";
		    	    		}
		    	    	}
		    			break;
		    		case "/":
		    			matcherNum = patternNumber.matcher(matcher.group().trim());
		    			matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    			matcherVar = patternVariable.matcher(matcher.group().trim());
		    			
		    			if(countDiv == 0) {
		    				if(matcherNum.lookingAt()) {
		    		    		total = Integer.parseInt(matcher.group().trim());
		    		    	}else if(matcherVar.lookingAt()){
			    	    		if(Variables.containsKey(matcher.group())){
			    		    		int valor = Variables.get(matcher.group());
			    		    		total = valor;
			    		    	}else {
			    					return "ERROR";
			    		    	}
			    	    	}else if(matcherParentesis.lookingAt()) {
			    	    		try {
			    	    			total = Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
			    	    		}catch(Exception e) {
			    	    			return "ERROR";
			    	    		}
			    	    	}
		    				countDiv ++;
		    			}else {
		    				matcherNum = patternNumber.matcher(matcher.group().trim());
		    				matcherParentesis = patternParentesis.matcher(matcher.group().trim());
		    				matcherVar = patternVariable.matcher(matcher.group().trim());
		    		    	
		    		    	if(matcherNum.lookingAt()) {
		    		    		total /= Integer.parseInt(matcher.group().trim());
		    		    	}else if(matcherVar.lookingAt()){
			    	    		if(Variables.containsKey(matcher.group())){
			    		    		int valor = Variables.get(matcher.group());
			    		    		total /= valor;
			    		    	}else {
			    					return "ERROR";
			    		    	}
			    	    	}else if(matcherParentesis.lookingAt()) {
			    	    		try {
			    	    			total /= Integer.parseInt(combVerifyingProcess(matcherParentesis.group()));
			    	    		}catch(Exception e) {
			    	    			return "ERROR";
			    	    		}
			    	    	}
		    			}
		    		break;
		    	}
	    	}
		}
		return String.valueOf(total);
	}
	public IOperationsfile combAssignmentProcessResult(String code) {
		//it needs a process to verify to simplify the process
		String total = combVerifyingProcess(code);
		if(total.equals("ERROR")) {
			IOperationsfile error = new ErrorProcess();
			error.Results("VARIABLE", "Invalid variable");
			return error;
		}else {			
			IOperationsfile Result = new ArithmeticProcess();
			Result.Results("comb", total);
			return Result;	
		}
	}
	public IOperationsfile defunAssignmentProcess(String code) {
	    String functionName = "",functionValue = "";
		Pattern pattern = Pattern.compile("(defun[ ]+([a-z]|[a-z,0-9])+)", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(code);

	    if (matcher.find()) {
	    	functionName = matcher.group().replaceFirst("defun", " ").trim();
	    }
	    
	    Pattern patternValue = Pattern.compile("([(]([a-z,0-9][ ]*)+[)][ ]*([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+(([a-z]+[ ]([(].*[)])+)|([0-9]+[ ]([(].*[)])+)|([(].*[)])+|(([(].*[)])+[ ][0-9]+)|(([(].*[)])+[ ][a-z]+)|([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*))[ ]*[)]))", Pattern.CASE_INSENSITIVE); 
	    matcher = patternValue.matcher(code.substring(0, code.length()-1));
	    Pattern patternValue2 = Pattern.compile("([(]([a-z,0-9][ ]*)+[)][ ]*([(]cond.*[)]))", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher2 = patternValue2.matcher(code.substring(0, code.length()-1));
	     
	    if (matcher.find()) {
	    	functionValue = matcher.group();
	    }else if(matcher2.find()) {
	    	functionValue = matcher2.group();
	    }
	    Functions.put(functionName, functionValue); //adding the function to the map for functions

	    IOperationsfile Result = new DefunProcess();
		Result.Results(functionName, functionValue);
		return Result;	
	}
	public IOperationsfile condAssignmentProcess(String code) {
		String total="";
		boolean resultCond = false;
		code = code.substring(6, code.length()-1);
		
		Pattern pattern = Pattern.compile("[(][(]([=]+|[<]+|[>]+)[ ]([a-z]+|[0-9]+)+[ ]([a-z]+|[0-9]+)+[)][ ][(]([a-z]+|[0-9]+|[ ]+|[(]+|[)]+|[+]+|[-]+|[*]+|[*]+)+[)][)]", Pattern.CASE_INSENSITIVE);
		Pattern patternNumber = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE);
		Pattern patternVariable = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNumberVariable = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		
		while (matcher.find() && !resultCond) {
			Pattern patternCond = Pattern.compile("((([(]([=]+|[<]+|[>]+)[ ]([a-z]+|[0-9]+)+[ ]([a-z]+|[0-9]+)+[)])|([t])))", Pattern.CASE_INSENSITIVE);
			Pattern patternCont = Pattern.compile("([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)])|([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+(([a-z]+[ ]([(].*[)])+)|([0-9]+[ ]([(].*[)])+)|([(].*[)])+|(([(].*[)])+[ ][0-9]+)|(([(].*[)])+[ ][a-z]+))[ ]*[)])", Pattern.CASE_INSENSITIVE);
			Matcher matcherCond = patternCond.matcher(matcher.group().trim());
			Matcher matcherCont = patternCont.matcher(matcher.group().trim());
			
			while(matcherCond.find() && !resultCond) {
				
				if(matcherCont.find() && !resultCond) {
					
					Matcher matcherVarNum = patternNumberVariable.matcher(matcherCond.group());
					
					char operator;
					
					if(!matcherCond.group().equals("t")) {
						operator = matcherCond.group().trim().charAt(1);
					}else {
						operator = matcherCond.group().trim().charAt(0);
					}
				
					int cont = 1;
					int operand1 = 0, operand2 = 0;
					
				    while (matcherVarNum.find() && !matcherVarNum.group().equals("t")) {
				    	
				    	Matcher matcherNum = patternNumber.matcher(matcherVarNum.group().trim());
				    	Matcher matcherVar = patternVariable.matcher(matcherVarNum.group().trim());
				    	
				    	
						if(matcherNum.lookingAt()) {
							if(cont == 1) {	    		
					    		operand1 = Integer.parseInt(matcherNum.group().trim());
					    	}else {
					    		operand2 = Integer.parseInt(matcherNum.group().trim());
					    	}
						}else if(matcherVar.lookingAt()) {
							if(Variables.containsKey(matcherVar.group())){
								if(cont == 1) {	    		
						    		operand1 = Variables.get(matcherVar.group().trim());
						    	}else {
						    		operand2 = Variables.get(matcherVar.group().trim());
						    	}
					    	}else {
					    		IOperationsfile error = new ErrorProcess();
					    		error.Results("VARIABLE", "Invalid variable");
					    		return error;
					    	}
						}
				    	cont ++;
				    }
					
					switch(operator) {
						case '=':
							resultCond = (operand1 == operand2);
							break;
						
						case '<':
							resultCond = (operand1 < operand2);
							break;
							
						case '>':
							resultCond = (operand1 > operand2);
							break;
							
						case 't':
							resultCond = true;
							break;
							
					}
					
					if(resultCond) {
						Pattern patternFunc = Pattern.compile("([(][a-z]+[ ][(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)][)])");
				    	Matcher matcherFunc = patternFunc.matcher(matcherCont.group());
				    	
				    	if(matcherFunc.find()) {
				    		Pattern patternArithmetic = Pattern.compile("[(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)]");
				    		Matcher matcherArithmetic = patternArithmetic.matcher(matcherFunc.group());
				    		
				    		if(matcherArithmetic.find()) {
				    			String parcial = combVerifyingProcess(matcherArithmetic.group());
					    		
				    			Pattern patternName = Pattern.compile("[a-z]+[ ]");
					    		Matcher matcherVar = patternName.matcher(matcherFunc.group());
				    			
				    			if(matcherVar.find()) {
				    				String exp = "("+matcherVar.group()+" "+parcial+")";	
								    String funcionResult = functionAssignmentProcess(exp).getResult();
								 
								    
								    Pattern patternOperacion = Pattern.compile("[(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+([a-z]+|[0-9]+)[ ]");
							    	Matcher matcherOperacion = patternOperacion.matcher(matcherCont.group());
							    	
								    if(matcherOperacion.find()) {
								    	Pattern patternGlobalVar = Pattern.compile("([a-z]+)");
								    	Matcher matcherGlobalVar = patternGlobalVar.matcher(matcherCont.group());
								    	
								    	if(matcherGlobalVar.find()) {
								    		int value = Variables.get(matcherGlobalVar.group());
										    Variables.put(matcherGlobalVar.group(), value+1);
									    	
									    	String operacion = matcherOperacion.group()+funcionResult+")";
										    total = combVerifyingProcess(operacion);
								    	}
								    }
								    
				    			}
				    		}
				    	}else{
				    		total = combVerifyingProcess(matcherCont.group());
				    	}
					}
				}
				
			}
			
		}
		if(total.equals("")) {
			total = "NIL";
		}
		IOperationsfile Result = new DefunProcess();
		Result.Results("cond", total);
		return Result;	
	}
	public IOperationsfile functionAssignmentProcess(String code) {
	    String functionName = "",total = "";
	    int cont = 0;
		Pattern pattern = Pattern.compile("(([a-z]+[ ]*|[0-9]+[ ]*))", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
	    ArrayList<String> Parameters = new ArrayList<String>();
	    ArrayList<String> Arguments = new ArrayList<String>();
	    
	    while(matcher.find()) {
	    	if(cont==0) {
	    		functionName = matcher.group().trim();
	    	}else {
	    		Parameters.add(matcher.group().trim());
	    	}
	    	
	    	cont++;
	    }
	    
	    if(Functions.containsKey(functionName)){
	    	String funcExpresion = Functions.get(functionName);
	    	Pattern patternArguments = Pattern.compile("([(]([a-z][ ]*)+[)])");
	    	Matcher matcherArguments = patternArguments.matcher(funcExpresion);
	    	
	    	if(matcherArguments.find()) {
	    		Pattern patternArgument = Pattern.compile("(([a-z])+)");
	    		Matcher matcherArgument = patternArgument.matcher(matcherArguments.group());
	    		
	    		while(matcherArgument.find()) {
	    			Arguments.add(matcherArgument.group().trim());
	    		}
	    	}
	    	
	    	if(Parameters.size()!=Arguments.size()) {
	    		IOperationsfile error = new ErrorProcess();
	    		error.Results("VARIABLE", "Invalid variable");
	    		return error;
	    	}else {
	    		for(int i=0; i<Arguments.size(); i++) {
	    			Variables.put(Arguments.get(i), Integer.parseInt(Parameters.get(i)));
	    		}
	    	}
	    	
	    	Pattern patternBody = Pattern.compile("([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)])|([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+(([a-z]+[ ]([(].*[)])+)|([0-9]+[ ]([(].*[)])+)|([(].*[)])+|(([(].*[)])+[ ][0-9]+)|(([(].*[)])+[ ][a-z]+))[ ]*[)])");
	    	Matcher matcherBody = patternBody.matcher(funcExpresion);
	    	Pattern patternCond = Pattern.compile("([(]cond.*[)])");
	    	Matcher matcherCond = patternCond.matcher(funcExpresion);
	    	
	    	if(matcherBody.find() && !matcherCond.find()) {
	    		total = combVerifyingProcess(matcherBody.group());
	    	}else {
	    		total = condAssignmentProcess(matcherCond.group()).getResult();
	    	}
	    	
    	}else {
    		IOperationsfile error = new ErrorProcess();
    		error.Results("VARIABLE", "Invalid variable");
    		return error;
    	}
	    
	    IOperationsfile Result = new DefunProcess();
		Result.Results(functionName, total);
		return Result;
	}
}
