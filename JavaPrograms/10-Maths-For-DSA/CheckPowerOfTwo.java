package com.MathsForDSA;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(checkPowerTwo(n));
        System.out.println(checkPowerTwo2(n));
    }

    static boolean checkPowerTwo2(int n) {
        if(n == 0) {
            return false;
        }
        return (n & (n-1)) ==0;
    }

    static boolean checkPowerTwo(int n) {
        if( n == 0) {
            return false;
        }
        while( n != 1) {
            if( (n & 1) == 1 ) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }
}
