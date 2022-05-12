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
		int arr[] = {1,2,3,4};
		System.out.print(nextLEle(arr));
	}

}
