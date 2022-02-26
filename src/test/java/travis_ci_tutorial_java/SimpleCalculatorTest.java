package travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(5,3), 2);
	}
	
	@Test
	public void testMult() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(7,6), 42);
	}
	
	@Test
	public void testDiv() {
		SimpleCalculator clac = new SimpleCalculator();
		assertEquals(calc.div(25,5), 5);
	}
}
