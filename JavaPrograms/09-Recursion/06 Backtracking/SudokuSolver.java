package com.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0,   0, 7, 0,   0, 0, 0},
                {6, 0, 0,   1, 9, 5,   0, 0, 0},
                {0, 9, 8,   0, 0, 0,   0, 6, 0},

                {8, 0, 0,   0, 6, 0,   0, 0, 3},
                {4, 0, 0,   8, 0, 3,   0, 0, 1},
                {7, 0, 0,   0, 2, 0,   0, 0, 6},

                {0, 6, 0,   0, 0, 0,   2, 8, 0},
                {0, 0, 0,   4, 1, 9,   0, 0, 5},
                {0, 0, 0,   0, 8, 0,   0, 7, 9}
        };
        sudoku(board, 0, 0);
        display(board);
    }

    static void sudoku(int[][] board, int row, int col) {
        if( row == board.length -1 && col == board.length ){
            System.out.println("Reaching or not ");
            display(board);
            System.out.println();
            return;
        }

        if( col == board.length ) {
            sudoku(board, row + 1,0);
            return;
        }
         if(board[row][col] != 0) {
             sudoku(board, row, col +1);
             return;
         }
        for(int num= 1; num<= 9; num++) {
            if(isSafe(board, row, col, num)) {
                board[row][col] = num;
                sudoku(board, row , col +1);
            }
        }

    }

    static boolean isSafe(int[][] board, int row ,int col, int num) {
        // checking the row first
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }

        // checking the column now
        for(int i =0;i<board.length; i++) {
            if( board[i][col] == num) {
                return false;
            }
        }
        int startRow;
        int startCol;
        if( row >= 0 && row < 3) {
            startRow = 0;
            if( col >= 0 && col < 3 ){
                startCol = 0;
            }
            else if( col >= 3 && col < 6) {
                startCol = 3;
            }
            else{
                startCol = 6;
            }
        }

        else if( row >= 3 && row < 6) {
            startRow = 3;
            if( col >= 0 && col < 3 ){
                startCol = 0;
            }
            else if( col >= 3 && col < 6) {
                startCol = 3;
            }
            else{
                startCol = 6;
            }
        }

        else {
            startRow = 3;
            if( col >= 0 && col < 3 ){
                startCol = 0;
            }
            else if( col >= 3 && col < 6) {
                startCol = 3;
            }
            else{
                startCol = 6;
            }
        }

        int endRow = startRow + 3;
        int endCol = startCol + 3;
        for(int i = startRow; i<endRow; i++) {
            for (int j =startCol; j < endCol ; j++) {
                if( board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;

    }

    static void display(int[][] board) {
        for(int[] row : board) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
