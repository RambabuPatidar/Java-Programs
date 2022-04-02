package com.BasicsOfJava;

import java.util.Scanner;

public class MaxMin {
    public static void main(String [] args) {
        System.out.println("Enter three number consecutively");
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(maximum(a, b, c));
        System.out.println(minimum(a, b, c));
    }

    static int maximum(int a, int b, int c) {
        int maximum = a;
        if( b > maximum) maximum = b;
        if( c > maximum)
            maximum = c;
        return maximum;
    }

    static int minimum(int a, int b, int c) {
        int minimum = a;
        if( b < minimum)
            minimum = b;
        if(c < minimum)
            minimum = c;

        return minimum;
    }
}
