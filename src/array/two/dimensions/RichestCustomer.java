package array.two.dimensions;

import java.util.Arrays;

public class RichestCustomer {

	public static void main(String[] args) {
		int[][] accounts = { { 1, 2, 3 }, { 3, 4, 2 } };

		System.out.println(Arrays.deepToString(accounts));

		System.out.println("MaxWealthSoFar: " + calculateRichestCustomer(accounts));
	}
	
	// Time Complexity: O(n x m)
	// Space Complexity: O(1)
	private static int calculateRichestCustomer(int[][] accounts) {
		int maxWealth = 0;

		for (int[] customer : accounts) {
			int currentCustomerWealth = 0;

			for (int bankBalance : customer) {
				currentCustomerWealth += bankBalance;
			}

			maxWealth = Math.max(maxWealth, currentCustomerWealth);
		}

		return maxWealth;
	}

}
