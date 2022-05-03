package com.topic.StackNQueue;

import java.util.*;

public class FirstNRC {

	static String ans(String st) {
		String res="";
		Map<Character,Integer> map = new HashMap<>();
		Queue<Character> q = new LinkedList<>();
		for(int i=0;i<st.length();i++) {
			map.put(st.charAt(i), map.getOrDefault(st.charAt(i), 0)+1);
			
			if(map.get(st.charAt(i))==1) {
				q.add(st.charAt(i));
			}
			
			while(!q.isEmpty()) {
				if(map.get(st.charAt(i))==1)
					break;
				else {
					q.remove();
				}
			}
			
			if(q.isEmpty())
				res=res+"#";
			else
				res=res+st.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String A = "aabc";
		System.out.print(ans(A));
	}
}
