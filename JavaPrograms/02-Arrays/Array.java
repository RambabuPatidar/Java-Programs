package com.Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n;
        System.out.print("Enter the length of array :");

        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        for(int num: arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));

    }
}
