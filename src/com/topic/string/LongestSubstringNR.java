package com.topic.string;
import java.util.HashSet;

public class LongestSubstringNR {

	//Longest substring without repeating character
	static int longSubStrNonRep(String str) {
		int max = 0;
		int ap=0;
		int bp=0;
		HashSet<Character> hs = new HashSet<>();
		
		while(bp<str.length()) {
			if(!hs.contains(str.charAt(bp))) {
				hs.add(str.charAt(bp));
				bp++;
				max=Math.max(hs.size(), max);
			}
			else {
				hs.remove(str.charAt(ap));
				ap++;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		String str="abcabcbb";
		System.out.print(longSubStrNonRep(str));
	}

}
