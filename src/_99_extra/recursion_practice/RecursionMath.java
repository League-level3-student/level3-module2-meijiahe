package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
			//3. return number 
		if (times==1) {
			return number;
		}
		//4. else return number + recursionMultiplication(number, times-1)
		
		return number + recursiveMultiplication(number, times-1);
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	
	
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if (number-numberToDevideBy<=0) {
			return 1;
		}
		// divide(a - b, b) + 1
		return recursiveDivision(number-numberToDevideBy, numberToDevideBy)+1;
		
	}
	
	//8. Try this one on your own!

	public static int recursivePower(int number, int power) {
		if (power==0) {
			return 1;
		}
		if (power==1) {
			return number;
		}
		if(power<0) {
			return 1/recursivePower(number,-power);
		}
		else {
			int results = number * recursivePower(number,power-1);
			return results;
		}
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(6, recursiveMultiplication(2, 3));
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(2, recursiveDivision(12, 6));
		assertEquals(3, recursiveDivision(15, 5));
	}
	
	
	@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(9, recursivePower(3, 2));
		assertEquals(16, recursivePower(4, 2));
	}
	
}
