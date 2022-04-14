package com.topic.divideNconquer;

public class SumOfTwoSortedArray {

	static int sum(int[] a, int[] b, int n) {
		int i=0,j=0;
		int m1=-1,m2=-1;
		int count;
		
		for(count=0;count<=n;count++) {
			if(a[i]<b[j]) {
				m1=m2;
				m2=a[i];
				i++;
			}
			else {
				m1=m2;
				m2=b[j];
				j++;
			}
			if(i==n) {
				m1=m2;
				m2=b[0];
				break;
			}
			else if(j==n) {
				m1=m2;
				m2=a[0];
				break;
			}
		}
		return (m1+m2);
	}
	public static void main(String[] args) {
		int arr1[] = {1,12,15,26,38};
		int arr2[] = {2,13,17,30,45};
		int n = arr1.length;
		System.out.println("sum-->"+ sum(arr1,arr2,n));
		System.out.println("median-->"+sum(arr1,arr2,n)/2);
	}
}
