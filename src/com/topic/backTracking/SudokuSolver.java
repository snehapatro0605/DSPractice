package com.topic.backTracking;

public class SudokuSolver {

	static boolean solveSudoku(int[][] grid) {
		int row=-1;
		int col=-1;
		boolean isEmpty = true;
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) {
				if(grid[i][j] == 0) {
					row=i;
					col=j;
					isEmpty=false;
					break;
				}
			}
			if(!isEmpty)
				break;
		}
		
		if(isEmpty)
			return true; //terminating condition- when no more 0's are left
		
		for(int num = 1;num<=grid.length;num++) {
			if(isSafe(grid,row,col,num)) {
				grid[row][col]=num;
				if(solveSudoku(grid)) {
					return true;
				}
				else {
					grid[row][col]=0;
				}
			}
		}	
		return false;
	}
	static boolean isSafe(int[][] grid,int row,int col,int num) {
		
		for(int j=0;j<grid.length;j++) {
			if(grid[row][j] == num) {
				return false;
			}
		}
		
		for(int i=0;i<grid.length;i++) {
			if(grid[i][col] == num) {
				return false;
			}
		}
		//for Box
		int sqrt = (int)Math.sqrt(grid.length);
		int rowStart = row-row%sqrt;
		int colStart = col-col%sqrt;
		
		for(int r=rowStart;r<rowStart+sqrt;r++) {
			for(int c=colStart;c<colStart+sqrt;c++) {
				if(grid[r][c]==num)
					return false;
			}
		}
		return true;
	}
	
	static void print(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	
    public static void main(String[] args)
    {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
 
        if (solveSudoku(grid))
            print(grid);
        else
            System.out.println("No Solution exists");
    }
}
