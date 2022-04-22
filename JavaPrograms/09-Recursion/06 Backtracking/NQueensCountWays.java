package com.Backtracking;

public class NQueensCountWays {
    public static void main(String[] args) {
        int n = 4; // the size of the chess board
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueensCount(board, 0));
    }
    static int nQueensCount(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // this will be only in the scope of this function call so pass the count value to the above
        // function calls when they are getting removed from stack
        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueensCount(board, row +1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the above row is it safe
        for(int i = row; i>=0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        // now check for the left diagonal

        int leftMax = Math.min(row, col);
        for(int i = 1; i<=leftMax; i++) {
            if( board[row - i][col - i] ) {
                return false;
            }
        }

        // now check for the right diagonal

        int rightMax = Math.min((board.length - 1 - col), row);
        for(int i=1; i<=rightMax; i++) {
            if( board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }


    private static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("Q ");
                }
                else{
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
