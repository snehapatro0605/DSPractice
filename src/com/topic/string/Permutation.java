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
		if(str.length()==0) {
			pList.add(ans);
			for(String s : pList)
		System.out.println("plist: "+s);
		}
		else {
			for(int i=0;i<str.length();i++) {
				System.out.print("str: "+str);
				char ch = str.charAt(i);
				String rem = str.substring(0,i)+str.substring(i+1);
				System.out.println("; itr: "+i+ "; ch: "+ ch+ "; rem: "+rem);
				permuteSol(rem,ans+ch,pList);
				
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.print(permute(s));
	}
}
