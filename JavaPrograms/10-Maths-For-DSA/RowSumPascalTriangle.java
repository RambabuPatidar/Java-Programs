package com.MathsForDSA;

public class RowSumPascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(rowSum( n));
    }

    static int rowSum(int n) {
//        return (int)(Math.pow(2, n-1));
        return (1<< n-1);
    }
}
