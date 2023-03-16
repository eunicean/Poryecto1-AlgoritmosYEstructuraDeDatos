package Project;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Interprete.*;
import Operations.*;

public class test {
	Interpreter testInterpreter = new Interpreter();
	
	//arithmethic tests
	@Test
	public void testingAddition() {
		String Code = "(+ 15 65)";
		assertEquals("El resultado de la operación Suma es: 80", testInterpreter.RunCode(Code));
	}
	
	@Test
	public void testingAddition2() {
		String Code = "(+ 15 65 90 100 15)";
		assertEquals("El resultado de la operación Suma es: 285", testInterpreter.RunCode(Code));
	}
	
	@Test
	public void testingsubs() {
		String Code = "(- 100 15)";
		assertEquals("El resultado de la operación Resta es: 85", testInterpreter.RunCode(Code));
	}
	
	@Test
	public void testingsubs2() {
		String Code = "(- 15 90 52)";
		assertEquals("El resultado de la operación Resta es: -127", testInterpreter.RunCode(Code));
	}
	
	@Test
	public void testingmulti() {
		String Code = "(* 5 8)";
		assertEquals("El resultado de la operación Multiplicacion es: 40", testInterpreter.RunCode(Code));
	}
	@Test
	public void testingmulti2() {
		String Code = "(* 15 90 52)";
		assertEquals("El resultado de la operación Multiplicacion es: 70200", testInterpreter.RunCode(Code));
	}
	@Test
	public void testingdivition() {
		String Code = "(/ 80 4)";
		assertEquals("El resultado de la operación Division es: 20", testInterpreter.RunCode(Code));
	}
	@Test
	public void testingdivition2() {
		String Code = "(/ 100 5 4)";
		assertEquals("El resultado de la operación Division es: 5", testInterpreter.RunCode(Code));
	}

	@Test
	public void testingrecursivity() {
		String Code = "(+ 50 (- 20 5))";
		assertEquals("El resultado de la operación comb es: 65", testInterpreter.RunCode(Code));
	}
	//quote tests
	@Test
	public void quote() {
		String Code = "('(1 2))";
		assertEquals("El resultado de la operación final es de quote es: (1 2)", testInterpreter.RunCode(Code));
	}
	//defun tests
	//setq test
	@Test
	public void assigmentVariable() {
		String Code = "(setq num 15)";
		assertEquals("num : 15", testInterpreter.RunCode(Code));
	}
	@Test
	public void assigmentVariable2() {
		String Code = "(setq kk 155)";
		assertEquals("kk : 155", testInterpreter.RunCode(Code));

		Code = "(setq kk 8)";
		assertEquals("kk : 8", testInterpreter.RunCode(Code));
	}
	//predicates tests
	//conditionals cond tests
}
