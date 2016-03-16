 	// 2 variations - return true or false / print the duplicate number 
package main.java;

public class ArrayDuplicate {

	public static boolean arrayDup(int[] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {

				if (n[i] == n[j] && i != j) {
				//	System.out.println(n[i]);
					return true;
				}	
			}		
		}
		return false;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(arrayDup(num));
	}
}
