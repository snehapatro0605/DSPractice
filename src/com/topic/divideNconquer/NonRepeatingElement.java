package com.topic.divideNconquer;

public class NonRepeatingElement {

	static int search(int arr[],int n) {
		int xor = 0;
		for(int i=0;i<n;i++) {
			xor=xor^arr[i];
		}
		return xor;
	}
	static int linear(int arr[],int n) {
		int ans = -1;
		for(int i=0;i<n;i=i+2) {
			if(arr[i]!=arr[i+1]) {
				ans = arr[i];
				break;
			}
		}
		if(arr[n-2]!=arr[n-1]) { //when length of array is odd.
			ans = arr[n-1];
		}
		return ans;
	}
	static int binarySearch(int arr[],int l,int h) {
		if(l>h)
			return -1;
		if(l==h)
			return arr[l];
		int mid =(l+h)/2;
		if(mid%2==0) {
			if(arr[mid]==arr[mid+1])
				return binarySearch(arr,mid+2,h);
			else
				return binarySearch(arr,l,mid);
		}
		else {
			if(arr[mid]==arr[mid-1])
				return binarySearch(arr,mid+1,h);
			else
				return binarySearch(arr,l,mid-1);
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
		int n = arr.length;
		System.out.println("xor-->"+search(arr,n));
		System.out.println("linear-->"+linear(arr,n));
		System.out.println("binary search-->"+binarySearch(arr,0,n-1));
		
	}
}
