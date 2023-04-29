package array.one.dimensions;

public class ClosestNumberToZero {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(closestNumberToZero(arr));
	}

	/**
	 * The space complexity of the closestNumberToZero method is O(1), which means it uses
	 * a constant amount of memory to find the closest number to zero. This is
	 * because the method only uses a fixed number of variables (closest, i) to keep
	 * track of the state and does not create any additional data structures that
	 * grow with the size of the input.
	 * 
	 * The time complexity of the closestNumberToZero method is O(n), where n is the
	 * length of the input array. This is because the method iterates over each
	 * element in the array exactly once and performs constant-time operations for
	 * each element. The time complexity is dominated by the loop that iterates over
	 * the input array. Therefore, the time complexity of this algorithm scales
	 * linearly with the size of the input array.
	 * 
	 * @param arr
	 * @return
	 */
	public static int closestNumberToZero(int[] arr) {
		int nearest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i]) < Math.abs(nearest) || Math.abs(arr[i]) == Math.abs(nearest) && arr[i] > 0) {
				nearest = arr[i];
			}
		}
		return nearest;
	}
}
