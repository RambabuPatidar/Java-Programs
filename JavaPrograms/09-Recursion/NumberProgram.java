package com.Recursion;

public class NumberProgram {
    public static void main(String[] args) {
//        Q. Write a program to print number from 1 to 5
//          using recursion ?
        print(1);

//        Q. Write a program to print number from 5 to 1 using recursion

        printReverse1(1);
        printReverse2(1);
    }

    static void print(int n ) {

        // this is called the base condition where the special case occurs
        if( n== 5) {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n+1);

    }
    // simply we can do something to pass the end value as a parameter and use the above approach
    static void printReverse1(int n ) {
        if( n == 1) {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printReverse1(n+1);
    }

    static void printReverse2(int n) {
        if( n == 5 ) {
            System.out.println(n);
            return ;
        }
        printReverse2(n+1);
        System.out.println(n);
    }
}
