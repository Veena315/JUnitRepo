package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before junit");
	}
	
	@Test()
	public void test1() {
		
		int result = Calculator.add(4,5);
		Assertions.assertEquals(9,result);
		
	}
	
	@Test()
	public void test2() {
		
		int result = Calculator.add(5,5);
		Assertions.assertEquals(10,result);
		
	}
	
	@AfterEach
	public void afterjunit() {
		System.out.println("After junit");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}
