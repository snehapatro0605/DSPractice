package com.topic.StackNQueue;

import java.util.Stack;

public class ParenthesisChecker {

	static boolean checker(String expr) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expr.length();i++) {
			char br = expr.charAt(i);
			
			if(br == '(' || br == '{' || br == '[') {
				stack.push(br);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			switch(br) {
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[') 
					return false;
				break;
				
			case '}':
				check = stack.pop();
				if(check == '(' || check == '[') 
					return false;
				break;
			case ']':
				check = stack.pop();
				if(check == '{' || check == '(') 
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String expr = "([{}])";
		System.out.print(checker(expr));
	}
}
