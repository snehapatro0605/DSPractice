package com.topic.StackNQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	static boolean isPeekDelimiter(Coordinate ele) {
		return ele.x == -1 && ele.y == -1;
	}
	
	static boolean freshOrange(int[][] mat,int x,int y) {
		return x>=0 && x< mat.length && y>=0 && y<mat[0].length  && mat[x][y]==1;
	}
	
	static boolean isAnyLeft(int[][] mat,int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(mat[i][j] == 1)
					return true;
			}
		}
		return false;
	}
	static int rotOranges(int[][] mat) {
		int row =mat.length;
		int col =mat[0].length;
		Queue<Coordinate> q = new LinkedList<>();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(mat[i][j] == 2)
					q.add(new Coordinate(i,j));
			}
		}
		
		q.add(new Coordinate(-1,-1));// delimiter
		
		int count = 0; //returns time
		boolean flag = false;
		
		while(!q.isEmpty()) {
			
			while(!isPeekDelimiter(q.peek())) {
				Coordinate ele = q.remove();
				
				if(freshOrange(mat,ele.x+1,ele.y)) {
					mat[ele.x+1][ele.y]=2;
					q.add(new Coordinate(ele.x+1,ele.y));
					
					if(!flag) {
						flag = true;
						count++;
					}
				}
				
				if(freshOrange(mat,ele.x-1,ele.y)) {
					mat[ele.x-1][ele.y]=2;
					q.add(new Coordinate(ele.x-1,ele.y));
					
					if(!flag) {
						flag = true;
						count++;
					}
				}
				
				if(freshOrange(mat,ele.x,ele.y+1)) {
					mat[ele.x][ele.y+1]=2;
					q.add(new Coordinate(ele.x,ele.y+1));
					
					if(!flag) {
						flag = true;
						count++;
					}
				}
				
				if(freshOrange(mat,ele.x,ele.y-1)) {
					mat[ele.x][ele.y-1]=2;
					q.add(new Coordinate(ele.x,ele.y-1));
					
					if(!flag) {
						flag = true;
						count++;
					}
				}						
			} // end of inner while loop
			
			q.remove();// remove delimiter
			flag = false;// for next iteration
			if(!q.isEmpty()) {
			q.add(new Coordinate(-1,-1));// adding new delimiter
			}
		}
		return isAnyLeft(mat,row,col)?-1:count;
	}
	
	public static void main(String[] args)
	{
	    int v[][] = { { 2, 1, 0, 2, 1 },
	                  { 1, 0, 1, 2, 1 },
	                  { 1, 0, 0, 2, 1 } };
	  
	    System.out.println("Max time incurred: " +
	                       rotOranges(v));
	}

}

class Coordinate{
	int x;
	int y;
	Coordinate(int x,int y){
		this.x=x;
		this.y=y;
	}
}
