package com.topic.divideNconquer;

public class KthElementSortedArray {
	
	static int kthElement(int[] arr1, int[] arr2, int n, int m, int k) {
		if(n>m) {
			return kthElement(arr2,arr1,m,n,k);
		}
		
		int low = Math.max(0, k-m);
		int high = Math.min(k, n);
		
		while(low<=high) {
			int cut1 = (low+high)/2;
			int cut2 = k-cut1;
			
			int l1 = cut1 == 0 ? Integer.MIN_VALUE  : arr1[cut1-1];
			int l2 = cut2 == 0 ? Integer.MIN_VALUE  : arr2[cut2-1];
			int r1 = cut1 == 0 ? Integer.MAX_VALUE  : arr1[cut1];
			int r2 = cut1 == 0 ? Integer.MAX_VALUE  : arr2[cut2];
			
			if(l1<=r2 && l2<=r1) {
				return Math.max(l1, l2);
			}
			else if(l1>l2) {
				high = cut1-1;
			}
			else {
				low = cut1+1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int arr1[] = {7,12,14,15};
		int arr2[] = {1,2,3,4,9,11};
		int k = 5;
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("kth element-->"+ kthElement(arr1,arr2,n-1,m-1,k));
	}
}