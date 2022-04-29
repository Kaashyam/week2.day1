package week2.day1;

public class LearnString {
	public static void main(String[] args) {

		// 1. String - "testleaf" - Print the number of e in the string e=2
		// 2. String - "Testleaf is situated in twin towers teynampet", print the words
		// that starts 't' or 'T'

		int count = 0;
		String text = "testleaf";
		int length = text.length();
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e = " + count);
		System.out.println("----------------------------");
		String text1 = "Testleaf is situated in twin towers teynampet";
		String[] split = text1.split(" ");
		System.out.println("Words starts with 'T' or 't'");
		for (int i = 0; i < split.length; i++) {
			if (split[i].startsWith("T") || split[i].startsWith("t")) {
				System.out.println(split[i]);

			}
		}
	}
}
