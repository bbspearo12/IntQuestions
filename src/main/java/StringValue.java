//program to check if array contains a string
package main.java;

public class StringValue {

	public static boolean strVal(String[] str) {
		String str1 = "fee";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(str1)) {
				return true;

			}
		}
		return false;
	}

	public static void main(String[] args) {
		String[] st = new String[]{"foo","bar","candy"};
		System.out.println(strVal(st));
	}
}
