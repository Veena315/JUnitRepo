package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.PalindromeFunction;

public class ParametersExample {
	
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","dad","radar"})
	public void tet1(String value) {
		
		Assertions.assertTrue(PalindromeFunction.isPalindrome(value));
	}
	
	@Tag("Sanity")
	@ParameterizedTest
	@ValueSource(ints = {2,4,6})
	public void test2(int num) {
		Assertions.assertTrue(num%2==0);
		
	}
}
