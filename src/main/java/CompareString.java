package main.java;

public class CompareString {

	public static void main(String[] args) {

		String s1 = "javv";
		String s2 = "java";

		int i=0;
		
		if (s1.length() != s2.length()) {
			System.out.println("Strings are not equal");
			return;
		}
		while(i<s1.length()) {
			
			if (s1.charAt(i) > s2.charAt(i)) {
				System.out.println("s1 is greater");
				return;
			} else if (s1.charAt(i) < s2.charAt(i))  {
				System.out.println("s2 is greater");
				return;
			} 
				i++;
			}
			System.out.println("Both strings are equal");		
		}
	}
