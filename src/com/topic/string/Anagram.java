package com.topic.string;

import java.util.Arrays;

public class Anagram {

	static boolean anagram(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		char[] ac = s1.toCharArray();
		char[] bc = s2.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		for(int i=0;i<ac.length;i++) {
			if(ac[i] != bc[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		System.out.print(anagram(a,b));
	}
}
