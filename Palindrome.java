package week2.day1;

public class Palindrome {
	public static void main(String[] args) {

		// Declare A String value as"madam"
		String a = "madam";
		// Declare another String rev value as ""
		String b = "";
		int length = a.length();
		// Iterate over the String in reverse order
		for (int i = length - 1; i >= 0; i--) {
			// Add the char into rev
			b = b + a.charAt(i);
		}
		// Compare the original String with the reversed String, if it is same then
		// print palinDrome
		if (b.equalsIgnoreCase(a)) {
			System.out.println("The given string is a palindrome");
		} else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
