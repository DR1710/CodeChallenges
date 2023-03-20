package array.one.dimensions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private static final int MAX_SIZE = 150;

	public static void main(String[] args) {
		
		List<String> fizzBuzzList = fizzBuzz(MAX_SIZE);
		
		System.out.println(fizzBuzzList);

	}

	// Time Complexity = O(n)
	// Space Complexity = O(1)
	public static List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>();

		for (int i = 1; i <= MAX_SIZE; i++) {
			boolean divisibleBy3 = i % 3 == 0;
			boolean divisibleBy5 = i % 5 == 0;

			if (divisibleBy3 && divisibleBy5) {
				answer.add("FizzBuzz");
			} else if (divisibleBy3) {
				answer.add("Fizz");
			} else if (divisibleBy5) {
				answer.add("Buzz");
			} else {
				answer.add(String.valueOf(i));
			}

		}

		return answer;

	}

}
