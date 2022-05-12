package com.topic.StackNQueue;

import java.util.Stack;

public class MinEle {
	static Stack<Integer> stack = new Stack<>();
	static int min = Integer.MAX_VALUE;
	static void push(int val) {
		if(stack.isEmpty()) {
			stack.push(val);
			min=val;
			System.out.println("Number Inserted: " + val);
			return;
		}
		if(val<min) {
			stack.push(2*val - min);
			min = val;
		}
		else {
			stack.push(val);
		}	
		System.out.println("Number Inserted: " + val);
	}
	
	static int pop() {
		if(stack.peek()<min) {
			int trueMin = min;
			min = 2*min - stack.pop();
			return trueMin;
		}
		else {
			return stack.pop();
		}
	}
	
	static int getMin() {
		int ans = stack.isEmpty()?-1:min;
		System.out.println("Min ele: " + ans);
		return ans;
	}
	
	static int peek() {
		Integer top = stack.peek();
		
		if(top<min) {
			System.out.println("Top Element: "+min);
			return min;
		}
		else {
			System.out.println("Top Element: "+top);
			return top;
		}
	}
	
    public static void main(String[] args)
    {
    	MinEle s = new MinEle();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.pop();
        s.getMin();
        s.peek();
    }
}
