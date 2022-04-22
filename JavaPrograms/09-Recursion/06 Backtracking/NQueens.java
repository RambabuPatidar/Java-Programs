package com.Backtracking;

// we are just printing the board which are possible for queens.
// Q. How can we get the number of possible ways in which queens can be placed.
public class NQueens {
    public static void main(String[] args) {
        int n = 4; // the size of the chess board
        boolean[][] board = new boolean[n][n];
        nQueens01(board, 0);

    }
    // we can use any one of the function from nQueens01 and nQueens02
    static void nQueens01(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return;
        }

        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                nQueens01(board, row +1);
                board[row][col] = false;
            }
        }
    }

    static void nQueen02(boolean[][] board, int row, int col ) {
        if( row == board.length) {
            display(board);
            System.out.println();
            return;
        }
        if( col == board.length) {
            return;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            nQueen02(board, row + 1,0);
            board[row][col] = false;
        }
        nQueen02(board, row ,  col +1);
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
                    System.out.print("👸 ");
                }
                else{
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
