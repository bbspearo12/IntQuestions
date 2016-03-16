package main.java;

import java.util.HashSet;

public class IntUnique {
	public static boolean isUnique(int[] num) { 
	 	HashSet<Integer> hs = new HashSet();
		for(int i=0; i<=num.length-1; i++) {
			if(hs.contains(num[i]) != true) 
			{
				hs.add(num[i]);
			}
			else {
				return false;
			}
		}	
		return true;
		
	}
	public static void main(String[] args) {
		int[] numbers= {1,4,5,6,7,8,9};
		System.out.println(isUnique(numbers));
		
	}

}
