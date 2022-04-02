package com.MathsForDSA;

import java.util.Scanner;

public class IthBitOfNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(findiThBit1(n,3));
//        System.out.println(setIthBit(n, 3));

        System.out.println(resetBit(n, 2));
    }

    static int resetBit(int n ,int i) {
        return (n & (~(1 << i-1)));
    }

    static int setIthBit(int n, int i) {
        // 1 << i - 1 is called the masking

        return (n | (1<< i-1));
    }


    static int findiThBit1(int n, int i) {
        return ((n>>(i-1)) & 1);
    }
}
