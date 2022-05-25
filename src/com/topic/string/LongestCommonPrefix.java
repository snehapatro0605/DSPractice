package com.topic.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	static String lcp(String [] str) {
		if(str.length == 0)
			return "";
		Arrays.sort(str,(a,b)->b.length()-a.length());
		String prefix=str[0];
		System.out.println("prefix: "+prefix);
		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		if(prefix.equals("")) {
			return "-1";
		}
		return prefix;
	}
	public static void main(String[] args) {
		//String str[] = {"apple","apps","ape"};
		String str[] = {"hello", "world"};
		System.out.print(lcp(str));
	}
}
