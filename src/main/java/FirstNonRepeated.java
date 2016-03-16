package main.java;

import java.util.HashMap;

public class FirstNonRepeated {

	public Character nonRepeatedChar(String src) {
		HashMap<Character, Integer> repeatCount = new HashMap<Character, Integer>();
		char[] arr = src.toCharArray();
		
		for (int i=0; i<src.length(); i++) {
			if (repeatCount.containsKey(arr[i])) {
				int currCount = repeatCount.get(arr[i]);
				repeatCount.put(arr[i], currCount+1);
			} else {
				repeatCount.put(arr[i], 1);
			}
		}
		
		for (int i=0; i<src.length(); i++) {
			if (repeatCount.get(arr[i]) == 1) {
				return arr[i];
			}
		}
		return null;
	}
	
	
	class CountIndex {
		int count;
		int index;
	}
	
	public Character nonRepeatedCharObject(String src) {
		
		if (src == null || src.length() == 0) {
			return null;
		}

		HashMap<Character, CountIndex> repeatCount = new HashMap<Character, CountIndex>();
		char[] arr = src.toCharArray();
		
		for (int i=0; i<src.length(); i++) {
			if (repeatCount.containsKey(arr[i])) {
				CountIndex ci = repeatCount.get(arr[i]);
				ci.count = ci.count+1;
				repeatCount.put(arr[i], ci);
			} else {
				CountIndex ci = new CountIndex();
				ci.count = 1;
				ci.index = i;
				repeatCount.put(arr[i], ci);
			}
		}
		for (Character c:repeatCount.keySet()) {
			CountIndex ci = repeatCount.get(c);
			if (ci.count == 1) {
				return arr[ci.index];
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		FirstNonRepeated fr = new FirstNonRepeated();
		String src = "abcxyzab";
		System.out.println(fr.nonRepeatedChar(src));
		System.out.println(fr.nonRepeatedCharObject(src));

	}
	
}
