package com.Recursion;

public class NthFibbonachiNumber {
    public static void main(String[] args) {

        fibbonachiSeries(4, 0, 1);
        System.out.println();
        System.out.println(fibbonachi(4,0,0,1));
    }

    // we are assuming like this
//    fibbonachi sequence = 0,  1,  1,  2,   3
//    nth number =          0th 1st 2nd 3rd 4th
    static void fibbonachiSeries(int n, int first, int second ) {
        if( n == 0) {
            return ;
        }
        System.out.print(first + " ");
        fibbonachiSeries(n-1, second , first +second);

    }

    static int fibbonachi(int n ,int i, int first , int second) {
        if( i == n) {
            return first;
        }
        return fibbonachi(n, i+1, second, first+second);
    }

    /*

    static int fibo(int n) {
    if(n< 2) {
    return n;
    }
    return fibo(n-1) + fibo(n-2);
    }
     */
}
