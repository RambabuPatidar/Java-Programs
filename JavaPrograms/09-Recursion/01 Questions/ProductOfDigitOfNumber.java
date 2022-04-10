package com.RecursionQuestion;

public class ProductOfDigitOfNumber {
    public static void main(String[] args) {
        int n = 9802;

        System.out.println(productOfDigit(n));

    }
    static int productOfDigit(int n ) {
        if( n / 10 == 0 ) {
            return n;
        }

        return (n % 10 ) * productOfDigit(n / 10);
    }
}
