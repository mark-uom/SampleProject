package test.com.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sample.Calculator;

public class CalculatorTests {

	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(7, calc.add(5, 2));
	}

}
