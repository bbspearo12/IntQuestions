// program to find a number in a array.

package main.java;

public class FindNum {

	public static boolean find(int[] num, int n) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 9;
		System.out.println(find(numbers, n));
	}

}
