package com.Backtracking;
//Backtracking 03
public class CountAndPrintPathInMazeWithObstacle {
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
//        printPath("", 3,3);
    }

    static void printPath(String p, int row, int col) {
        if( row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if( row == 1 && col == 2) {
            return;
        }

        if( row > 1) {
            printPath(p + 'D', row -1, col);
        }
        if(col > 1) {
            printPath(p + 'R', row , col -1);
        }

    }

    static int countPath(int row, int col) {
        if( row == 1 && col == 1) {
            return 1;
        }
        if(row == 2 && col == 2){  // I am assuming here that we have obstacle at (2,2)
            return 0;
        }
        int left = 0;
        int right = 0;
       if ( row > 1) {
           left = countPath(row-1, col);
       }
       if( col > 1) {
           right = countPath(row , col -1);
       }
       return left + right;
    }
}
