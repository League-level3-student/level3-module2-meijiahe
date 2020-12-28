package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array= {"aa","bb","cc","dd"};
		assertEquals(_00_LinearSearch.linearSearch(array,"cc"),2);
		assertEquals(_00_LinearSearch.linearSearch(array,"ee"),-1);
		assertEquals(_00_LinearSearch.linearSearch(array,"aa"),0);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] arrayi = {1,2,3,4,5};
		assertEquals(_01_BinarySearch.binarySearch(arrayi,0,arrayi.length,2),1);
		assertEquals(_01_BinarySearch.binarySearch(arrayi,0,arrayi.length,3),2);
		assertEquals(_01_BinarySearch.binarySearch(arrayi,0,arrayi.length,1),0);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int [] arraye = {2,4,6,8,10};
		assertEquals(_02_InterpolationSearch.interpolationSearch(arraye,2),0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(arraye,4),1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(arraye,6),2);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int []arrayp = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(_03_ExponentialSearch.exponentialSearch(arrayp,7),6);
		assertEquals(_03_ExponentialSearch.exponentialSearch(arrayp,8),7);
		assertEquals(_03_ExponentialSearch.exponentialSearch(arrayp,9),8);
	}
}
