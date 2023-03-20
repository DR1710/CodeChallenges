package hashmap;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "cb";
		String magazine = "aa";

		System.out.println(optimizedSolution(ransomNote, magazine));

	}

	/**
	 * In this implementation, we first create a HashMap called freq to store the
	 * frequency of each character in the magazine string. We iterate through each
	 * character in magazine and add it to the HashMap, updating its frequency as
	 * necessary.
	 * 
	 * We then iterate through each character in the ransomNote string. For each
	 * character, we check whether it exists in the freq HashMap and whether its
	 * frequency is greater than 0. If either of these conditions is false, we know
	 * that the ransomNote string cannot be constructed from the magazine string, so
	 * we return false. Otherwise, we decrement the frequency of the character in
	 * the freq HashMap to indicate that it has been used.
	 * 
	 * If we successfully iterate through all characters in the ransomNote string,
	 * we know that it can be constructed from the magazine string, so we return
	 * true.
	 * 
	 * // Time Complexity = O(n.m) // Space Complexity = O(m)
	 * 
	 * @param ransomNote
	 * @param magazine
	 * @return boolean
	 */

	public static boolean canConstruct(String ransomNote, String magazine) {
		// Create a HashMap to store the frequency of each letter in the magazine string
		HashMap<Character, Integer> freq = new HashMap<>();
		for (char c : magazine.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		// Iterate through the characters in the ransomNote string
		for (char c : ransomNote.toCharArray()) {
			// If the character is not in the magazine string or its frequency is 0, return
			// false
			if (!freq.containsKey(c) || freq.get(c) == 0) {
				return false;
			}
			// Otherwise, decrement the frequency of the character in the HashMap
			freq.put(c, freq.get(c) - 1);
		}

		// If all characters in ransomNote have been processed successfully, return true
		return true;
	}

	/**
	 * we can optimize the solution by using an integer array of size 26 to store
	 * the frequency of each letter in the magazine string, instead of using a
	 * HashMap. This reduces the space complexity of the solution from O(n) to O(1),
	 * where n is the length of the magazine string. In terms of time complexity,
	 * the solution has to iterate through the magazine string once to calculate the
	 * frequency of each letter, which takes O(n) time, where n is the length of the
	 * magazine string. It then iterates through the ransomNote string once, which
	 * also takes O(n) time. Therefore, the overall time complexity of the solution
	 * is O(n).
	 * 
	 * In terms of space complexity, the optimized solution uses an integer array of
	 * size 26 to store the frequency of each letter in the magazine string, which
	 * is a fixed amount of space and does not depend on the length of the magazine
	 * string. Therefore, the space complexity of the optimized solution is O(1). //
	 * Time Complexity = O(n) // Space Complexity = O(1)
	 * 
	 * @param ransomNote
	 * @param magazine
	 * @return boolean
	 */
	public static boolean optimizedSolution(String ransomNote, String magazine) {
		// Create an array to store the frequency of each letter in the magazine string
		int[] freq = new int[26];
		for (char c : magazine.toCharArray()) {
			freq[c - 'a']++;
		}

		// Iterate through the characters in the ransomNote string
		for (char c : ransomNote.toCharArray()) {
			// If the character is not in the magazine string or its frequency is 0, return
			// false
			if (freq[c - 'a'] == 0) {
				return false;
			}
			// Otherwise, decrement the frequency of the character in the array
			freq[c - 'a']--;
		}

		// If all characters in ransomNote have been processed successfully, return true
		return true;
	}

}
