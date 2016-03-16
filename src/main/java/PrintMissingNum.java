package main.java;

public class PrintMissingNum {

	private static int getMissingNumber(int[] n, int totalCount) { 
		int expectedSum = totalCount * ((totalCount + 1) / 2); 
		int sum = 0; 
		for (int i=0; i<n.length; i++) { 
			sum = sum + n[i]; 
			} 
		return expectedSum - sum; 
		}
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num = {1,2,4,5,7,6};
     System.out.println(getMissingNumber(num,7));
	}
 
}

//how many numbers are missing 
//sum of n numbers is n(n+1)/2 - 
