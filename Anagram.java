package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// Declare a String
		String text1 = "stops";
		// Declare another String
		String text2 = "potss";
		// Check length of the strings are same then (Use A Condition)
		if (text1.length() == text2.length()) {
			// Convert both Strings in to characters
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			// Check both the arrays has same value
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are not Anagram");
			}
		}
	}

}
