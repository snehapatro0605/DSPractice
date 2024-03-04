package com.topic.string;

public class RemoveAdjDuplicates {

	static String remove(String str) {
		char[] charArray = new char[str.length()];
		int i=0;
		
		for(int j=0;j<str.length();j++) {
			char curr = str.charAt(j);
			if(i>0 && charArray[i-1] == curr) {
				i--;
			}
			else {
				charArray[i]=curr;
				i++;
			}
		}
		return new String(charArray,0,i);
	}
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		System.out.print(remove(a));
	}
}
