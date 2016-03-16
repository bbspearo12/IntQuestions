package main.java;
import java.util.HashSet;

public class CharUnique {

	public static boolean isUnique(String str) {
		char[] c = str.toCharArray();
		HashSet<Character> hs = new HashSet();
		for(int i=0; i<=str.length()-1; i++) {
			if(hs.contains(c[i]) != true)
			{
				hs.add(c[i]);
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		String s = "sreekanth";
		System.out.println(isUnique(s));
	}

}
