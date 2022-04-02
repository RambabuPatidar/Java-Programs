package com.MathsForDSA;

public class FindFirstSetBit {
    public static void main(String[] args) {
        int n = 32;

        System.out.println(findFirstBit(n));

    }

    static int findFirstBit(int n) {
        int count = 1;
        while((n & 1) != 1) {
            n = n >> 1;
            count++;
        }
        return count;
    }
}
