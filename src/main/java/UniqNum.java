// find a number in array and print the number
package main.java;

public class UniqNum {

	public static boolean uniqNum(int[] num, int n) {
		for(int i=0; i<num.length; i++) {
			if(num[i] != n) {
				return false;
			}
		}
	//	return false;
		return n;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] numbers = {1,3,5,6,7,9};
  int n = 3;
  System.out.println(uniqNum(numbers, n));
  
	}

}
