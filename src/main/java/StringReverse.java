// string reverse 

package main.java;

public class StringReverse {

	public static void main(String[] args) {
		String s = "chandana";
		char[] c = s.toCharArray();
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}

	}

}
