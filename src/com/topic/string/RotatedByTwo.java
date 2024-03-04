package com.topic.string;

public class RotatedByTwo {

	static boolean isRotated(String a, String b) {
		
		if(a.length() <2 || b.length()<2) {
			return (a==b);
		}
		String temp1 = a.substring(2)+a.substring(0,2);
		String temp2 = a.substring(a.length()-2)+a.substring(0,a.length()-2);
		
		System.out.println(temp1);
		System.out.println(temp2);
		
		if(temp1.equals(b) || temp2.equals(b))
			return true;
		return false;
	}
	public static void main(String[] args) {
		String a = "amazon";
		String b = "azonam";
		System.out.print(isRotated(a,b));
		
	}
}
