package array.one.dimensions;

import java.util.Arrays;

public class RunningSumArray {

	private static final int MAX_SIZE = 10;

	public static void main(String[] args) {
		int[] numArray = new int[MAX_SIZE];

		populateNumArray(numArray);

		runningSum(numArray);

	}

	private static void populateNumArray(int[] numArray) {
		for (int i = 0; i < MAX_SIZE; i++) {
			numArray[i] = i;
		}
		System.out.println("numArray:" + Arrays.toString(numArray));
	}

	// Time Complexity = O(n)
	// Space Complexity = O(1)
	public static int[] runningSum(int[] nums) {
		int[] results = new int[nums.length];
		results[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			results[i] = nums[i] + results[i - 1];
		}

		System.out.println("runningSum:" + Arrays.toString(results));

		return results;
	}

}
