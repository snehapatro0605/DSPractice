package com.topic.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int []arr) {
		
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	
	  public static void main(String args[]) {
	      
		    int[] data = { -2, 45, 0, 11, -9 };	   
		    bubbleSort(data);
		    System.out.println("Bubble Sort :"+ Arrays.toString(data));
		  }

}
