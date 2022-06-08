package com.topic.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

	static String convert(int num) {
		StringBuilder sb = new StringBuilder();
		
		Map<String,Integer> map = new LinkedHashMap();
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV",4);
		map.put("I", 1);
		

		for(Map.Entry<String,Integer> m : map.entrySet()) {
			while(num>=m.getValue()) {
				num=num-m.getValue();
				sb.append(m.getKey());
			}			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int num = 990;
		System.out.print(convert(num));
	}
}
