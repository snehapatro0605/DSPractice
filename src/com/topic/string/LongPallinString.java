package com.topic.string;

public class LongPallinString {
	static String longPallin(String str) {
		
		if(str == null || str.length() <1)
			return str;
		int start=0;
		int end =0;
		for (int i=0;i<str.length();i++) {
			int len1 = expand(str,i,i);
			int len2 = expand(str,i,i+1);
			int len = Math.max(len1, len2);
			if(len>end-start) {
				start= i-(len-1)/2;
				end = i+(len/2);
				System.out.println(i+ " ;start: "+start+" end: "+end);
			}			
		}
		
		return str.substring(start,end+1);
	}
	
	static int expand(String str,int left, int right) {
		if(str == null || left > right)
			return 0;
		while(left >=0 && right <str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		System.out.println(right-left-1+" ;");
		return right-left-1;	
	}
	public static void main(String[] args) {
		String str = "racecar";
		//String str = "ccaabbabd";
		System.out.print(longPallin(str));
	}

}
