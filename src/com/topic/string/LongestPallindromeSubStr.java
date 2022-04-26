package com.topic.string;

public class LongestPallindromeSubStr {

	static int lpSubstring(String str) {
		int n = str.length();
		if(n==0 || str == null)
			return 0;
		boolean table[][] = new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			table[i][i]= true;
		}
		int maxLength = 1;
		int start = 0;
		for(int i=n-2;i>=0;i--) {
			for(int j=i+1;j<n;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					if(table[i][j] || j-i == 1) {
						table[i][j] = true;
						
						if(maxLength<=j-i+1) {
							maxLength = j-i+1;
							start = i;
						}
					}
				}
			}
		}
		System.out.println("Longest Pallindorme SubString: "+str.substring(start,start+maxLength));
		return maxLength;
	}
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		System.out.print("max length: "+lpSubstring(str));
	}
}
