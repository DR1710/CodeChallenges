package array.one.dimensions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int delta = target - nums[i];

			if (map.containsKey(delta)) {
				return new int[] { i, map.get(delta) };
			}
			map.put(nums[i], i);
		}

		return new int[] { -1, 1 };
	}

}
