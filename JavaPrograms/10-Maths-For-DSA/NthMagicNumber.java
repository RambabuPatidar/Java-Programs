package com.MathsForDSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(magicNumber(n));
    }
    static int magicNumber(int n ) {
        int magic = 0;
        int count = 1;
        while( n != 0) {
            magic += ((n&1)*Math.pow(5,count++));
            n >>= 1;
        }

        return magic;
    }
}
