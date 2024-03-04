package com.topic.sorting;


public class MergeSort {

	static void mergeSort(int []arr, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			
			merge(arr,low,mid,high);
		}
	}
	
	static void merge(int []arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			R[j]=arr[m+1+j];
		
		int i,j,k;
		i=0;j=0;k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		
	}
	  static void printArray(int arr[]) {
		    int n = arr.length;
		    for (int i = 0; i < n; ++i)
		      System.out.print(arr[i] + " ");
		    System.out.println();
		  }

		  public static void main(String args[]) {
		    int arr[] = { 6, 5, 12, 10, 9, 1 };
		    mergeSort(arr, 0, arr.length - 1);

		    System.out.println("Sorted array:");
		    printArray(arr);
		  }
		  
}
