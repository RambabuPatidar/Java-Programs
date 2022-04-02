package com.LinearSearchAndQuestions;

public class MaxMin1D {
    public static void main (String [] args) {

        int[] arr = {1, 2, 3, 4, 5, -16, 7, 8, 9, 10};

        System.out.println("The maximum value is: " + maximum(arr));

        System.out.println("The minimum value is : " + minimum(arr));

    }

     static int maximum(int[] arr) {
        int max = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if( arr[i] > max) {
                 max = arr[i];
             }

         }
         return max;
    }
    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

}
