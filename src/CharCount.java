//Write a method to count occurrences of  a character in String 

public class CharCount {

	public static void main(String[] args) {
		String s = "sreekanth";
		char[] c = s.toCharArray();
		int counter = 0;
		char ch = 'e';

		for (int i = 0; i <= s.length() - 1; i++) {
			if (c[i] == ch) {
				counter++;
			}
		}
		System.out.println("no of occurrence of character is:" + counter);
	}

}
