package junit;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
	
	@Tag("Regression")
	@Test
	public void test1() {
		
		String st1 = "Simplilearn";
		String st2 = "Simplilearn";
		String st3 = "Simplilearnn";
		String st4 = null;
		
		boolean flag = true;
		boolean flag1 = false;
		
		int i=5;
		int j=10;
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Shiva");
		list1.add("Navi");
		list1.add("Shiveena");
		System.out.println(list1.size());

		Assertions.assertEquals(st1, st2);
		Assertions.assertNotEquals(st1, st3);
		Assertions.assertNull(st4);
		Assertions.assertNotNull(st1);
		
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);
		
		Assertions.assertTrue(i<j);
		Assertions.assertFalse(i>j);
		
		Assertions.assertArrayEquals(expectedArray, resultArray);
		Assertions.assertFalse(list1.contains("Naveena"));
		Assertions.assertTrue(list1.contains("Navi"));
		Assertions.assertEquals(3, list1.size());
	}

}
