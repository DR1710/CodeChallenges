package array.one.dimensions;

public class CountSubarrays {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 0 };

		System.out.println(countSubarrays(nums));
	}

	/**
	 * Here's how the algorithm works:
	 * 
	 * Initialize a counter count to 0. Iterate over the elements of the input array
	 * nums. If the current element is 0, find the length of the subarray filled
	 * with 0s starting at the current index by iterating over the array until a
	 * non-zero element is found. Let the length of the subarray be length. Add
	 * (length * (length + 1)) / 2 to the count. This formula counts the number of
	 * subarrays of length 1, 2, ..., length that can be formed from the subarray
	 * filled with 0s. Update the current index to j - 1 to skip over the subarray
	 * filled with 0s. Return count. For example, if we call this method with the
	 * input array [1, 3, 0, 0, 2, 0, 0, 4], it should return 6, as there are 4
	 * occurrences of [0] as a subarray, 2 occurrences of [0,0] as a subarray, and 0
	 * occurrences of subarrays with a size more than 2 filled with 0.
	 * 
	 * @param nums
	 * @return
	 */
	public static int countSubarrays(int[] nums) {
		int n = nums.length;
		int count = 0;
		int i = 0;
		while (i < n) {
			if (nums[i] == 0) {
				int j = i;
				while (j < n && nums[j] == 0) {
					j++;
				}
				int length = j - i;
				count += (length * (length + 1)) / 2;
				i = j;
			} else {
				i++;
			}
		}
		return count;
	}

}
