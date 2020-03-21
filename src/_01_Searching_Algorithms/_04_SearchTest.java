package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = new String[] {"hey", "hello", "hi", "wassup", "how", "are", "you"};
		assertEquals(3, _00_LinearSearch.linearSearch(words, "wassup"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] nums = new int[] {0, 5, 6, 7, 10, 15};
		assertEquals(2, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 6));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] nums = new int[] {0, 5, 6, 7, 10, 15};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(nums, 6));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] nums = new int[] {0, 5, 6, 7, 10, 15};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(nums, 6));
	}
}
