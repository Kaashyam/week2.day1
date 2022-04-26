package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		// Check number of occurrences of 'e' in the String
		// declare and initialize a variable count to store the number of occurrences
		String str = "welcome to chennai";
		int count = 0;
		char occ = 'e';
		// convert the string into char array
		char[] charArray = str.toCharArray();
		// get the length of the array
		// traverse from 0 till the array length
		for (int i = 0; i < str.length(); i++) {
			// Check the char array has the particular char in it
			if (charArray[i] == occ) {
				// if is has increment the count
				count++;
			}
		}
		// print the count out of the loop
		System.out.println("The number of occurences of e is " + count);
	}
}
