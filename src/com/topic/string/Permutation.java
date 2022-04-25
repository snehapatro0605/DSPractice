package com.topic.string;

import java.util.*;
public class Permutation {
	static List<String> permute(String str){
		List<String> pList = new ArrayList<>();
		permuteSol(str,"",pList);
		Collections.sort(pList);
		return pList;
	}
	static void permuteSol(String str,String ans,List<String> pList) {
		if(str.length()==0)
			pList.add(ans);
		else {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				String rem = str.substring(0,i)+str.substring(i+1);
				permuteSol(rem,ans+ch,pList);
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.print(permute(s));
	}
}
