package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.PalindromeFunction;

public class PalindromeFunctionTest {

	@Test
	public void test1() {
		
		Assertions.assertTrue(PalindromeFunction.isPalindrome("madam"));
		
	}
	
	@Test
	public void test2() {
		
		Assertions.assertTrue(PalindromeFunction.isPalindrome("Shiva"));
		
	}
}
