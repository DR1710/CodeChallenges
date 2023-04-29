package array.one.dimensions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
//		int length = removeDuplicatesCount(nums);
//		System.out.println("New length: " + length);

		int[] uniqueNums = removeDuplicates(nums);
		System.out.println(Arrays.toString(uniqueNums));
	}

	// Only works with sorted array
	public static int removeDuplicatesCount(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public static int[] removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}
		int i = 0;
		int[] uniqueNums = new int[nums.length];
		uniqueNums[i++] = nums[0];
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {
				uniqueNums[i++] = nums[j];
			}
		}
		int[] result = new int[i];
		System.arraycopy(uniqueNums, 0, result, 0, i);
		return result;
	}

	/**
	 * Create a new empty HashSet to store unique elements. Loop through the input
	 * array and add each element to the HashSet. Create a new array with the size
	 * of the HashSet and copy the unique elements into the new array. Return the
	 * new array without duplicates... The time complexity of the algorithm to
	 * remove duplicates from an array in Java is O(n), where n is the size of the
	 * input array. This is because the algorithm loops through the input array once
	 * to add each element to the HashSet, and then loops through the HashSet to
	 * copy the unique elements into the new array.
	 * 
	 * The space complexity of the algorithm is O(n) in the worst-case scenario,
	 * where all elements in the input array are unique and need to be stored in the
	 * HashSet. However, in the best-case scenario, where all elements in the input
	 * array are duplicates, the space complexity would be O(1), as only one element
	 * needs to be stored in the HashSet.
	 * 
	 * @param num
	 * @return
	 */
	public static int[] removeDuplicatesUsingSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}

		return result;
	}

	public static <T> T[] removeDuplicates2(T[] arr) {
		Set<T> set = new LinkedHashSet<>(Arrays.asList(arr));
		T[] newArr = (T[]) new Object[set.size()];
		set.toArray(newArr);
		return newArr;
	}

}
