//Array Reversal iterative
package main.java;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayReverse {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6};
	     reverse(n);

	}
	public static void reverse(int[] input) { 
		Scanner in = new Scanner(System.in);
		System.out.println("original array : " + Arrays.toString(input)); // handling null, empty and one element array 
		if(input == null || input.length <= 1) { 
			return; 
			} 
		for (int i = 0; i < input.length / 2; i++) 
		{ 
			int temp = input[i]; // swap numbers 
			input[i] = input[input.length - 1 - i]; 
			input[input.length - 1 - i] = temp; 
		} 
		System.out.println("reversed array : " + Arrays.toString(input)); 
	}
}
