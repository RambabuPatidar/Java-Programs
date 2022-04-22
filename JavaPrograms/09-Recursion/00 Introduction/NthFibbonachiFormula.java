package com.Recursion;

public class NthFibbonachiFormula {
    public static void main(String[] args) {

        System.out.println(nthFibo(4));
    }

    // we get this formula by solving the recurrence relation
    // F(N) = F(N-1) + F(N-2)
    // using linear recurrence method

    static int nthFibo(int n ) {
        return (int)((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }
}
