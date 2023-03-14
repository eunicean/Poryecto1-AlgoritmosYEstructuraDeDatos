/**
 * Method that simulates the token that indicates the what kind or type of code is given by the expression
 * @author Eunice Mata - 21231
 * @author Samantha Bhor - 
 * {@link} Documentation https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 * {@link} examples https://www.w3schools.com/java/java_regex.asp
 */

package Interprete;

import java.util.regex.*;

public class Token {
	private String setqStatement = "";
	private String additionStatement = "";
	private String substractractionStatement = "";
	private String multiplicationStatement = "";
	private String divitionStatement = "";
	private String quoteStatement = "";
	private String defunStatement = "";
	private String atomStatement = "";
	private String listStatement = "";
	private String equalStatement = "";
	private String smallerThanStatement = "";
	private String greaterThanStatement = "";
	private String condStatement = "";
	private String combStatement = "";
	private String functionStatement = "";
	private String defund2Statement = "";
	
	
	public boolean validatePattern(String ToCompare, String code) {
		Pattern pattern = Pattern.compile(ToCompare, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(code);
		boolean matchFound = matcher.find();
		return matchFound;
	}

}
