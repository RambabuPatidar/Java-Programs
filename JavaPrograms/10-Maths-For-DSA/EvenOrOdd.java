package com.MathsForDSA;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println("is this even? ");
        System.out.println(evenOdd(n));
    }

    static boolean evenOdd(int n) {
        return (n & 1) != 1;
    }
}
