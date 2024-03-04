package com.topic.sorting;

public class QuickSort {

	static void quickSort(int arr[], int low, int high) {
		
		if(low<high) {
			int piv = partition(arr,low,high);
			quickSort(arr,low,piv-1);
			quickSort(arr,piv+1,high);
		}
	}
	static int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i<j) {
			while(arr[i]<=pivot && i<j) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,j,low);	
		return j;
	}
	
	static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]= temp;
	}
	public static void main(String[] args) {
		int arr[] = {24 ,18 ,38 ,43 ,14 ,40 ,1 ,54};
		int n = arr.length;
		quickSort(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
