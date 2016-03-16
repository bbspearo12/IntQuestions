//program to check if array contains a number
package main.java;

public class ArrayValue {

	public static boolean arrayVal(int[] num) {
		int n = 25;
		for (int i = 0; i < num.length; i++) {

			if (num[i] == n) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 4, 23, 45, 61, 25, 11 };
		System.out.println(arrayVal(numbers));

	}

}
