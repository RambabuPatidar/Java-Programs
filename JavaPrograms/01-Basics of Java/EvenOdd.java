package com.BasicsOfJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.println("Enter the number ");
        a = in.nextInt();
        if( checkEvenOdd(a)) {
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd Number");
        }

    }

    static boolean checkEvenOdd(int n) {
        return n % 2 == 0;
    }
}

