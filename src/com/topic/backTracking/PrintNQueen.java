package com.topic.backTracking;

public class PrintNQueen {
		
	static boolean solveNQueen(int board[][], int row,int n) {
		   if (row == n)           //when N queens are placed successfully
		      return true;
		   for (int col = 0; col < n; col++) {     //for each row, check placing of queen is possible or not
		      if (isValid(board, row, col) ) {
		         board[row][col] = 1;      //if validate, place the queen at place (i, col)
		         if ( solveNQueen(board, row + 1,n))    //Go for the other columns recursively
		            return true;
		                   
		         board[row][col] = 0;        //When no place is vacant remove that queen
		      }
		   }
		   return false;       //when no possible order is found
		}

	static boolean isValid(int board[][], int row, int col) {
		   for (int i = row; i >=0; i--)    //check whether there is queen in the left or not
		      if (board[i][col] == 1)
		         return false;
		   for (int i=row, j=col; i>=0 && j>=0; i--, j--)
		      if (board[i][j] ==1)       //check whether there is queen in the left upper diagonal or not
		         return false;
		   for (int i=row, j=col; j>=0 && i<board[0].length; i++, j--)
		      if (board[i][j] ==1)      //check whether there is queen in the left lower diagonal or not
		         return false;
		   return true;
		}

	static void printSolution(int [][]arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = {{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		int n = 4;		
		solveNQueen(arr,0,n);
		printSolution(arr,n);
	}
}
