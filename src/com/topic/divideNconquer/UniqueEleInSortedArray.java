package com.topic.divideNconquer;

public class UniqueEleInSortedArray {

	static int binarySearch(int []arr, int low, int high) {
		
		//Boundary Cases
		if(high == 0)
			return arr[0];
		else if(arr[0] != arr[1])
			return arr[0];
		else if(arr[high] != arr[high-1])
			return arr[high];
		
		while(low<=high) {
			int mid =low+(high-low)/2;
			
			if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1])
				return arr[mid];
			
			if((mid%2==0 && arr[mid] == arr[mid+1]) ||
					(mid%2==1 && arr[mid] == arr[mid-1]))
				low = mid+1;
			else
				high = mid-1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,5,5};
		int n = arr.length;
		System.out.println("binary search-->"+binarySearch(arr,0,n-1));
		
	}
}
