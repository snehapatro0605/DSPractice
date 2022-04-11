package com.topic.divideNconquer;

public class BinarySearch {
	
	static int binarySearch(int arr[],int key) {
		int i = binarySearchUtil(arr,0,arr.length-1,key);
		return i;
	}
	
	static int binarySearchUtil(int arr[],int low, int high, int key) {
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		
		if(arr[mid] == key)
			return mid;
		else if(key > arr[mid])
			return binarySearchUtil(arr,mid+1,high,key);
		
		return binarySearchUtil(arr,low,mid-1,key);
	}

	public static void main(String[] args) {
		int arr[] = {-4,-1,3,7,10,11};
		int key = 7;
		int index = binarySearch(arr,key);
		System.out.println("Index of the given key is:"+ index);
	}
	
	//Iterative approach
	static int bsIterative(int arr[], int key) {
		 int low = 0;
		 int high = arr.length-1;
		 while(low<=high) {
			 int mid = (low+high)/2;
			 if(arr[mid]==key)
				 return mid;
			 else if(key>arr[mid])
				 low = mid+1;
			 else
				 high = mid-1;
		 }
		 return -1;
	}
}



