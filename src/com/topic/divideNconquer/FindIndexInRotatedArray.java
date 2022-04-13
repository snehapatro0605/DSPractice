package com.topic.divideNconquer;

public class FindIndexInRotatedArray {
	
	static int search(int arr[],int l,int h, int key) {
		while(l<=h) {
			int mid = (l+h)/2;
			if(arr[mid] == key)
				return mid;
			if(arr[mid]>arr[l]) { //left side is sorted
				if(key >= arr[l] && key < arr[mid] )
					h = mid-1; //conventional way
				else
					l = mid+1;
			}			
			else { //right side is sorted
				if(key > arr[mid] && key <= arr[h])
					l=mid+1;//conventional way
				else
					h=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {20,30,40,50,60,5,10};
		int n = arr.length;
		int key = 5;
		System.out.print("index of key= "+search(arr,0,n-1,key));
	}
}
