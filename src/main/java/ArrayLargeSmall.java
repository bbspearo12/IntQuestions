//program to find largest and smallest number in  array
package main.java;

public class ArrayLargeSmall {

	public static void main(String[] args)  {
		int[] num = { 111, -12, 34, 56, 333 };
		int large = num[0];
		int small = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > large) {
				large = num[i];
			}
			else if(num[i] < small) {
				small = num[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
	}
     

}
