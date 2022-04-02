package com.BasicsOfJava;

import java.util.Arrays;

public class Main {
    static int a = 100;

    public static void main(String[] args) {

        System.out.println("inside the main method block :" +a);


        {
            int a = 999;  // scope will begin when the value is initialised
            System.out.println("inside the void block :" + a);
            int b;
            b = 123;

            int c = a+b;
            System.out.println("the sum of " + a + " and " +  b + " is " + c);
            sum(1, 2, 3, 4, 5, 7, 6, 8, 9 , 10);
        }
    }

    static void sum(int ... v) {
        int sum = 0;
         Arrays.sort(v);
        System.out.println(Arrays.toString(v));

    }
}