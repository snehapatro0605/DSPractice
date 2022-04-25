package com.topic.string;

public class ReverseString {

	static String reverse(String s) {
		String[] sArray = s.split("\\.");
		String sRes = "";
		for(int i =sArray.length-1;i>=0;i--) {
			sRes+=sArray[i];
			if(i!=0) {
				sRes=sRes+".";
			}
		}
		return sRes;
	}
	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		System.out.print(reverse(s));
	}
}
