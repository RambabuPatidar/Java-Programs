package com.PatternUsingRecursion;

//Q. will the two functions triangle and triangle02 will give the same result
//if not then explain.?

public class PrintTriangle {
    public static void main(String [] args) {
        int n = 5;
        triangle02Reversed(n, 0);
    }
    static void triangle02(int row, int col ) {
        if(row == 0) {
            return;
        }
        if( col != row ) {
            System.out.print("* ");
            triangle02(row , col +1);
        }
        else{
            System.out.println();
            triangle02(row - 1 , 0);
        }
    }

    static void triangle02Reversed(int row, int col ) {
        if(row == 0) {
            return;
        }
        if( col != row ) {
            triangle02Reversed(row , col +1);
            System.out.print("* ");
        }
        else{
            triangle02Reversed(row - 1 , 0);
            System.out.println();
        }
    }

    static void triangle(int n) {
        if( n == 0 ) {
            return ;
        }

        for(int i = n; i > 0; i--) {
            System.out.print("* ");
        }
        System.out.println();
        triangle(n-1);
    }
}
