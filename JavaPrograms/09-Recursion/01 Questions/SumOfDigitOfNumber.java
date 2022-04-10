package com.RecursionQuestion;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        int n = -189;
        if( n < 0 ) {
            n *= -1;
        }
        System.out.println(sumOfDigit(n));
    }

    static int sumOfDigit(int n ) {

        if( n / 10 == 0 ) {
            return n;
        }

        return n % 10 + sumOfDigit(n / 10);
    }
}
