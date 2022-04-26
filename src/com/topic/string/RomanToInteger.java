package com.topic.string;

import java.util.*;
public class RomanToInteger {

	static int convert(String str) {
		if(str.length() == 0 || str == null) {
			return 0;
		}
		int res = 0;
		
		Map<Character,Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i=0;i<str.length()-1;i++) {
			if(map.get(str.charAt(i))>=map.get(str.charAt(i+1))) {
				res+=map.get(str.charAt(i));
			}
			else
				res-=map.get(str.charAt(i));
		}
		res+=map.get(str.charAt(str.length()-1));
		return res;
	}
	public static void main(String[] args) {
		String str = "CMXC";
		System.out.print(convert(str));
	}
}
