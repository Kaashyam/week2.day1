package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		// Convert the String to character array
		//char[] charArray = test.toCharArray();
		// Traverse through each character (using loop)
		for (int i = 0; i < test.length(); i++) {
			char a = test.charAt(i);
			// Find if the given character is what type using (if)
			// Character.isLetter
			if (Character.isAlphabetic(a)) {
				// System.out.println("The character "+a+"is Alphabet");
				letter++;
			}
			// Character.isDigit
			else if (Character.isDigit(a)) {
				// System.out.println("The character "+a+"is Digit");
				num++;
			}
			// Character.isSpaceChar
			else if (Character.isSpaceChar(a)) {
				// System.out.println("The character "+a+" is Space");
				space++;
			}
			// else -> consider as special character
			else {
				// System.out.println("The character "+a+" special character");
				specialChar++;
			}

		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
