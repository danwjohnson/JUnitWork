package com.junit.chap02;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.chap01.Calculator;

@RunWith(value=Parameterized.class)
public class ParametizedCalculatorTest {

	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		
		return Arrays.asList(new Integer[][] {
			{2, 1, 1},		// expected, valueOne, valueTwo
			{3, 2, 1},		// expected, valueOne, valueTwo
			{4, 3, 1},		// expected, valueOne, valueTwo
		});
		
	}
	
	
	public ParametizedCalculatorTest(double expected,
			double valueOne, double valueTwo) {
		
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
		
	}  // end constructor
	
	
	@Test
	public void sum() {
		Calculator calc = new Calculator();
		assertEquals(expected, calc.add(valueOne, valueTwo), 0);
		
	} // end sum()
	
}