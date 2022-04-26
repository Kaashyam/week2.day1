package week2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// Declare the input as Follow
		String test = "I am a software tester";
		// split the words and have it in an array
		String[] words = test.split(" ");
		String rev = "";
		int odd = 0;
		// Traverse through each word (using loop)
		for (int i = 0; i < words.length; i++) {
			// find the odd index within the loop (use mod operator)
			odd = i % 2;
			if (odd == 0) {
				System.out.print(words[i] + " ");

			} else if (odd != 0) {
				char[] reverse = words[i].toCharArray();
				// print the even position words in reverse order using another loop (nested
				// loop)
				for (int j = reverse.length - 1; j >= 0; j--) {

					rev = rev + reverse[j];
				}
				System.out.print(rev + " ");
				rev = "";
			}
		}

	}

}
