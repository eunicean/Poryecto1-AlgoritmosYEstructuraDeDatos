/**
 * Object that simulates the assignment of the procees given by the token :D
 * @author Eunice Mata - 21231
 * @author Samantha Bhor - 22545
 * This mf doesn't want to f wooooooork
 */
package Interprete;

import java.util.regex.*;

import Operations.IOperationsfile;

public class ProcessAsignment {
	public IOperationsfile additionProcessAssignment(String code) {
		int total = 0;
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternNum = Pattern.compile("([0-9]+)", Pattern.CASE_INSENSITIVE); //
		Pattern patternVar = Pattern.compile("([a-z]+)", Pattern.CASE_INSENSITIVE); //
		Matcher matcher = pattern.matcher(code);
		return null;
	}
	
	public IOperationsfile substractionProcessAssignment(String code) {
		return null;
	}
	
	public IOperationsfile multiplicationProcessAssignment(String code) {
		return null;
	}
	
	public IOperationsfile divitionProcessAssignment(String code) {
		return null;
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
