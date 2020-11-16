package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static public boolean intArraySorted (int [] integers) {
	int lastThing=Integer.MIN_VALUE; //smallest number 
	for (int i=0;i<integers.length;i++) {
		if (lastThing<=integers[i]) {
			lastThing=integers[i];
		}
		else {
			return false;
		}
	}
	return true;
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static public boolean doubleArraySorted (double [] doubles) {
	double lastt=Double.MIN_VALUE;
	for (int i=0;i<doubles.length;i++) {
		if (lastt<=doubles[i]) {
			lastt=doubles[i];
		}
		else {
			return false;
		}
	}
	return true;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
