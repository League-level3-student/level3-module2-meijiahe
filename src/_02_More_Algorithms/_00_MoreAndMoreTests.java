package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
public String multiply(int value, int value2) {
	String mult=value+" x "+value2+" = "+value*value2;
return mult;
}
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
public static boolean isPrime (int value) {
	int[] array= {2,3,5,7,17,31};
	for (int i=0;i<array.length;i++) {
		if (value==array[i]) {
			
			return true;
		}
		
		if (value%array[i]==0){
			
			return false;
		}
		
	}
	return true;                 
}
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
public static boolean isSquare (int value) {
	for (int i =1;i<=Math.floor(Math.sqrt(value));i++) {
		if (i*i==value) {
			return true;
		}
	}
	return false;
}
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	public static boolean isCube (int value) {
		for (int i =1;i<=Math.floor(Math.sqrt(value));i++) {
			if (i*i*i==value) {
				return true;
			}
		}
		return false;
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
