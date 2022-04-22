package com.Backtracking;
//Backtracking 02
public class CountAndPrintPathInMazeRDD {
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
        printPath("", 3, 3);
    }
    // P - denote the diagonal path
    static void printPath(String p , int row , int col) {
        if( row == 1 && col == 1) {
            System.out.println(p);
            return ;
        }

        if( row > 1) {
            printPath( p + 'D', row - 1 , col);
        }
        if( col > 1) {
            printPath(p + 'R', row , col -1);
        }
        if( row > 1 && col > 1) {
            printPath(p +'P', row -1, col -1);
        }

    }

    static int countPath(int row, int col ) {

        if( row == 1 || col == 1) {
            return 1;
        }
        return countPath(row -1, col) +countPath(row, col-1) + countPath(row -1, col -1);
    }
}
