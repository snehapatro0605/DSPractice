package com.topic.backTracking;

public class RatInAMaze {
 static int N;
 
 static void solveMaze(int[][] maze) {
	 int[][] sol = new int[N][N];
	 if(solveMazeUtil(maze,0,0,sol)) {
		 print(sol);
	 }
	 else
		 System.out.println("Solution does not exists");
 }
 
 static boolean solveMazeUtil(int[][] maze,int row, int col, int[][] sol) {
	 if(row == N-1 && col == N-1 && maze[row][col]==1) {
		 sol[row][col]=1;
		 return true;
	 }
	 
	 for(int i=0;i<N;i++) {
		 for(int j=0;j<N;j++) {
			 if(isSafe(maze,row,col)) {
				 sol[row][col]=1;
				 
				 if(solveMazeUtil(maze,row+1,col,sol)) {
					 return true;
				 }
				 if(solveMazeUtil(maze,row,col+1,sol)) {
					 return true;
				 }
				 
				 sol[row][col] =0;
			 }
		 }
	 }
	 return false;
 }
 
 static boolean isSafe(int[][] maze, int row, int col) {
	 if(row>=0 && row<N && col>=0 && col<N && maze[row][col] ==1)
		 return true;
	 return false;
 }
 
 static void print(int[][] sol) {
	 for(int i=0;i<N;i++) {
		 for(int j=0;j<N;j++) {
			 System.out.print(sol[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
    public static void main(String args[])
    {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
 
        N = maze.length;
        solveMaze(maze);
    }
}
