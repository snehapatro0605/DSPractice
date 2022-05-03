package com.topic.StackNQueue;

import java.util.*;

public class SlidingWindow {

	static ArrayList<Integer> maximum(int [] arr,int n, int k){
		ArrayList<Integer> list = new ArrayList<>();
		Deque<Integer> q = new LinkedList<>();
		if(n==0||k<=0||k>n) {
			return list;
		}
		
		int i;
		
		for(i=0;i<k;i++) {
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		
		for(;i<n;i++) {
			list.add(arr[q.peek()]);
			
			while(!q.isEmpty() && i-k>=q.peek()) {
				q.removeFirst();
			}
			
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		list.add(arr[q.peek()]);
		return list;
}
		
	
	public static void main(String[] args) {
		int N = 9, K = 3;
		int arr[] = {1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};
		System.out.print(maximum(arr,N,K));
	}
}
