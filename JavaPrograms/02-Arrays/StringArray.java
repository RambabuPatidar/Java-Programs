package com.Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class StringArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the length of string array : ");
        n = in.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        str[1] = "Balram" ;
        System.out.println("the string array item are : " + Arrays.toString(str));

    }
}
