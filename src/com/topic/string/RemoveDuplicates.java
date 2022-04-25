package com.topic.string;

import java.util.*;
public class RemoveDuplicates {

	static String remove(String str) {
		String res="";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character ch: set) {
			res+=ch;
		}
	return res;	
	}
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		System.out.print(remove(a));
	}
}
