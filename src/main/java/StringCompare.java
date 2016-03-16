package main.java;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter string2: ");
		String s2 = sc.nextLine();
		
   /* String s1 = "hello";
    String s2 = "java";*/
		
    	if(s1.compareTo(s2) > 0) {
    		System.out.println("s1 is greater");
    	}
    	else if(s1.compareTo(s2) < 0) {
    		System.out.println("s2 is greater");
    }
    	else {
    		System.out.println("Both are equal");
    	}
	}

}
