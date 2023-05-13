package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.Calculator;

public class CalculatorTest {
	
	//@Disabled
	@Tag("Regression")
	@DisplayName("Two positive num test")
	@Test()
	public void test1() {
		
		int result = Calculator.add(4,5);
		Assertions.assertEquals(9,result);
		
	}
	
	@Tag("Sanity")
	@DisplayName("One positive num and One negative num test")
	@Test
	public void tes2() {
		
		int result = Calculator.add(-4,5);
		Assertions.assertEquals(1,result);
		
	}
	
	@RepeatedTest(3)
	@DisplayName("Two positive num test where result is not matching")
	
	public void test3() {
		
		int result = Calculator.add(4,5);
		Assertions.assertNotEquals(10,result);
		
	}
	
	@CustomAnnotation
	public void test4() {
		
		int result = Calculator.add(4,5);
		Assertions.assertNotEquals(10,result);
		
	}
}
