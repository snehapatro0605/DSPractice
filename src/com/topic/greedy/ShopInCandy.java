package com.topic.greedy;

import java.util.Arrays;

public class ShopInCandy {
	
	static void shopInCandy(int []arr, int n, int k) {
		int max=0;
		int min=0;
		int minRange=n-1;
		int maxRange=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i<=minRange) {
				min=min+arr[i];
				minRange=minRange-k;
			}
			if(n-1-i>=maxRange) {
				max=max+arr[n-1-i];
				maxRange=maxRange+k;
			}
		}
		System.out.println("Min cost: "+min);
		System.out.println("Max cost: "+max);
	}
	public static void main(String[] args) {	
	int arr[] = {3,2,1,4};
	int n = arr.length;
	int k = 2;
	shopInCandy(arr,n,k);
	}
}
