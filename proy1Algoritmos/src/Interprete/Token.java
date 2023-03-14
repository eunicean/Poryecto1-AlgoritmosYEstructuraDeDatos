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
	//Arithmetic processes
	private String additionStatement = "^[(][ ]*[+][ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)]$";
	private String substractractionStatement = "^[(][ ]*[-][ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)]$";
	private String multiplicationStatement = "^[(][ ]*[*][ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)]$";
	private String divitionStatement = "^[(][ ]*[/][ ]+([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*)*[)]$";
	//Quote
	private String quoteStatement = "^[(][ ]*(quote |')+([+]|[-]|[*]|[/]|[(]|[)]|[0-9]|[a-z]|[defun]|[ ])*[)]$";
	//Defun
	private String defunStatement = "^[(][ ]*defun[ ]+([a-z]|[a-z,0-9]+)[ ]+([(]([a-z,0-9][ ]*)+[)][ ]*([(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+(([a-z]+[ ]([(].*[)])+)|([0-9]+[ ]([(].*[)])+)|([(].*[)])+|(([(].*[)])+[ ][0-9]+)|(([(].*[)])+[ ][a-z]+)|([a-z]+|[0-9]+)[ ]+(([a-z]+|[0-9]+)[ ]*))[ ]*[)]))[)]$";
	private String defund2Statement = "^[(][ ]*defun[ ]+([a-z]|[a-z,0-9]+)[ ]+([(]([a-z,0-9][ ]*)+[)][ ]*([(]cond.*[)]))[)]$";
	//Setq
	private String setqStatement = "^[(][ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*[)]$";
	//Predicados
	private String atomStatement = "^[(][ ]*atom[ ]+((((\\\"[a-z]\\\")+|[0-9]+|(NIL)+|(T)+|('[0-9]+))[ ]*)|[']([(]+[ ]*(((\\\"[a-z]\\\")+|[0-9]+|(NIL)+|(T)+)[ ]*)+[)]))[)]$";
	private String listStatement = "^[(][ ]*list[ ]*(((\\\"[a-z]\\\")*|[0-9]*|(NIL)*|(T)*)[ ]*)+[)]$";
	private String equalStatement = "^[(][ ]*equal[ ]+[0-9]+[ ]+[0-9]+[ ]*[)]$";
	private String smallerThanStatement = "^[(][ ]*[<][ ]+([a-z]+|[0-9]+)+[ ]+([a-z]+|[0-9]+)+[ ]*[)]$";
	private String greaterThanStatement = "[(][ ]*[>][ ]+([a-z]+|[0-9]+)+[ ]+([a-z]+|[0-9]+)+[ ]*[)]$";
	//Cond
	private String condStatement = "^[(]cond [(]([(].*[)])[)]$";
	//step of parameters
	private String combStatement = "^[(][ ]*([+]+|[-]+|[*]+|[/]+)[ ]+(([a-z]+[ ]([(].*[)])+)|([0-9]+[ ]([(].*[)])+)|([(].*[)])+|(([(].*[)])+[ ][0-9]+)|(([(].*[)])+[ ][a-z]+))[ ]*[)]$";
	private String functionStatement = "^[(][ ]*([a-z]|[a-z,0-9]+)[ ]+([a-z]+|[0-9]+)[ ]*(([a-z]+|[0-9]+)[ ]*)*[)]$";
	
	String[] Tokens = {additionStatement,substractractionStatement,multiplicationStatement,divitionStatement,quoteStatement,defunStatement,defund2Statement,setqStatement,atomStatement,listStatement,equalStatement,smallerThanStatement,greaterThanStatement,condStatement,combStatement,functionStatement};
	
	
	/**
	 * Method that validates if the code inserted match a determinate pattern.
	 * @param ToCompare String that contains the pattern.
	 * @param code String that contains the code that it wants to compare and match.
	 * @return Boolean with true if it matches, false if not.
	 */
	public boolean validatePattern(String ToCompare, String code) {
		Pattern pattern = Pattern.compile(ToCompare, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(code);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	
	public int getToken(String code) {
		for(int i = 0; i < Tokens.length ; i++) {
			if(validatePattern(Tokens[i],code)) {
				return i;
			}
		}
		return -1;
	}
}
