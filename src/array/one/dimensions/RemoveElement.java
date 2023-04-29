package array.one.dimensions;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };

		int target = 3;

		System.out.println(removeElement(nums, target));
	}

	/**
	 * To remove all occurrences of val in the array nums, we can use a two-pointer
	 * approach where one pointer iterates through the array to find elements to
	 * remove, and the other pointer points to the position where the next element
	 * will be placed. Here's the algorithm:
	 * 
	 * Initialize a pointer i to 0, which will iterate through the array. Initialize
	 * a pointer k to 0, which will point to the position where the next element
	 * will be placed. Iterate through the array with the pointer i from 0 to n-1:
	 * a. If the current element nums[i] is not equal to val, then set nums[k] to
	 * nums[i], and increment k. Return k. This code takes an integer array nums and
	 * an integer val as input, and returns an integer k which represents the number
	 * of elements remaining in the array after removing all occurrences of val.
	 * 
	 * The time complexity of the removeElement method is O(n), where n is the
	 * length of the input array nums. This is because the method iterates through
	 * the entire array once to remove all occurrences of val. The time complexity
	 * of this algorithm is optimal since we must inspect each element in the
	 * worst-case scenario to determine whether to remove it or not.
	 * 
	 * The space complexity of the algorithm is O(1), which is constant, because the
	 * algorithm only uses a constant amount of extra memory to store the variables
	 * i, k, and val. The input array nums is modified in place, so no additional
	 * space is required. Therefore, the algorithm satisfies the requirement of
	 * using O(1) extra memory.
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

}
