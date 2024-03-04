package com.topic.StackNQueue;

import java.util.Stack;

public class NextLargerElement {
	static int[] nextLEle(int arr[]) {
		int nge[] = new int[arr.length];
		
		Stack<Integer> stack = new Stack<>();
		for(int i =arr.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && arr[i] >stack.peek())
				stack.pop();
			
			if(stack.isEmpty())
				nge[i] = -1;
			
			if(!stack.isEmpty() && arr[i] < stack.peek())
				nge[i] = stack.peek();
			
			stack.push(arr[i]);
		}
		return nge;
	}
	public static void main(String[] args) {
		//int arr[] = {1,2,3,4};
		int arr[] = {1,5,4,3,7,6}; //5,6,6,6,-1
		int arr2[] = nextLEle(arr);
		for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+",");
		}
	}

}
