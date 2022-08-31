package com.Backtracking;

public class NQueensCountWays02 {
    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        System.out.println(nQueen(board, 0, 0));

    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // check for above
        for(int i=0; i< row ; i++) {
            if( board[row - i - 1][col]) {
                return false;
            }
        }

        // check for diagonally up right
        int n = Math.min(row, board.length - 1 - col);
        for(int i=0; i < n; i++) {
            if( board[row - i -1][col - i + 1]) {
                return false;
            }
        }

        // check for left diagonally up
        int n2 = Math.min(row, col);
        for(int i = 0 ; i< n2 ; i++) {
            if(board[row - i - 1][col - i - 1]) {
                return false;
            }
        }

        return true;
    }

    static int nQueen(boolean[][] board, int row, int col) {
        if(row == board.length) {
            display(board);
            return 1;
        }
        int ans = 0;
        if(col < board.length) {
            if( isSafe(board, row, col)) {
                board[row][col] = true;
                ans += nQueen(board, row + 1, 0);
                board[row][col] = false;
            }
            ans += nQueen(board, row, col+1);
        }
        return ans;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]) {
                    System.out.print("Q ");
                }
                else{
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
}
