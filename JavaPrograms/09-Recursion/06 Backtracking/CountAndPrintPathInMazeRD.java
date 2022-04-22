package com.Backtracking;
// Backtracking 01
import java.util.ArrayList;

/*
Q. Find all the Path in a maze
   Constraints : You can only move right and down
 - Find the number of path available
 - Find and print all the paths available
 - Find all the paths and return them in list

 */
public class CountAndPrintPathInMazeRD {
    private static int row;

    public static void main(String[] args) {
//        System.out.println(countPath(3, 3))
//        printPath("" ,3, 3);

        System.out.println(path("", 3, 3));
    }
    // this is what something we are returning answer in list
    static ArrayList<String> path(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();

        if( row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        // Creating different list and storing returned list give a better understanding
        // otherwise this can be done without creating this left and right arraylist
        /*
        if( row > 1) {
            list.addAll(path('D' + p, row -1, col));
            }
        if( col > 1) {
            list.addAll(Path('R' + p, row, col-1));
            }
         return list;
         */
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if( row > 1) {
            left = path('D' + p, row -1, col);
        }
        if( col > 1) {
            right = path('R' + p, row, col -1);
        }
        list.addAll(left);
        list.addAll(right);
        return list;
    }

    // this will print the string directly
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

    }

    // this function count the number of path we have from one end to diogonally opposite end
    static int countPath(int row, int col ) {
        if( row == 1 || col == 1) {
            return 1;
        }
        return countPath(row -1, col) +countPath(row, col-1);
    }
}
