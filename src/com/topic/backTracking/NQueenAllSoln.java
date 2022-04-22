package com.topic.backTracking;

import java.util.*;
public class NQueenAllSoln {

	static ArrayList<ArrayList<Integer>> printAll(int n){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int[][] arr = new int[n][n];
		solve(arr,0,n,res);
		return res;
	}
	static void solve(int[][] arr, int row, int n, ArrayList<ArrayList<Integer>> res) {
		if(row==n) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j]==1) 
						list.add(j+1);
				}
			}
			res.add(list);
			arr = new int[n][n];
			return;
		}
			
			for(int col=0;col<n;col++) {
				if(isSafe(arr,row,col)) {
					arr[row][col]=1;
					solve(arr,row+1,n,res);
					arr[row][col]=0;
				}
			}
	}
	
	static boolean isSafe(int[][] arr, int row, int col) {
		for(int i=row-1;i>=0;i--) {
			if(arr[i][col] == 1)
				return false;
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(arr[i][j] == 1)
				return false;
		}
		for(int i=row-1,j=col+1;i>=0 && j<arr[0].length;j++,i--) {
			if(arr[i][j] == 1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 4;		
		System.out.print(printAll(n));
	}
}
