package com.topic.divideNconquer;

public class QuickSort {

	public static void quickSort(int arr[],int l, int h) {
		if(l<h) {
			int pivot = partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr,pivot+1,h);
		}
	}
	
	static int partition(int arr[],int l,int h) {
		int i =l;
		int j = h;
		int pivot = arr[l];
		
		while(i<j) {
			
			while(arr[i] <= pivot && i<j) { //imp - i<j ; otherwise IndexOutOfBoundException
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,l,j);
		return j;
	}
	static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]= temp;
	}
	public static void main(String[] args) {
		int arr[] = {4 ,1 ,3 ,9 ,7};
		int n = arr.length;
		quickSort(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
