package integer;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(isPalindrome(121));
	}

	public static int reverse(int x) {
		long num = 0;

		while (x != 0) {

			int digit = x % 10;
			num = (num * 10) + digit;
			x = x / 10;

		}

		if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
			return 0;
		}

		return (int) num;
	}

	public static boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		int reverse = 0;
		int real = x;
		while (real != 0) {
			int remainder = real % 10;
			reverse = reverse * 10 + remainder;
			real = real / 10;
		}

		return x == reverse;
	}
}
