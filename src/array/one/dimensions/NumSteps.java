package array.one.dimensions;

/*
 *  Number of steps to reduce to zero
 */
public class NumSteps {

	private static final int MAX_SIZE = 4;

	public static void main(String[] args) {
		System.out.println(numberOfSteps(MAX_SIZE));
	}

	// Time Complexity = O(logn)
	// Space Complexity = O(1)
	public static int numberOfSteps(int num) {

		int steps = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num--;
			}

			steps++;
		}

		return steps;
	}

}
