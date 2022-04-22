package com.RecursionQuestion;

//Q. Find the minimum and maximum value of array by divide and conquer algorithm

public class MinMaxInArrayDivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4,5};
        int maximum = findMax(arr, arr[0], 0, arr.length -1);
        System.out.println( "Maximum = " + maximum);

//        int minimum = findMin(arr, arr[0], 0, arr.length -1);
//        System.out.println("Minimum = " + minimum );
    }

    static int findMax(int[] arr, int max, int start, int end) {
        if( start == end ) {
            return arr[start];
        }

        int mid = start + (end - start ) /2;

        int leftMax = findMax(arr, max, start , mid);
        int rightMax = findMax(arr, max, mid +1, end);

        return Math.max(leftMax, rightMax);
    }

    static int findMin(int[] arr, int min, int start, int end) {
        if( start == end ) {
            return arr[start];
        }

        int mid = start + (end - start ) /2;

        int leftMin = findMin(arr, min, start , mid);
        int rightMin = findMin(arr, min, mid +1, end);

        return Math.min(leftMin, rightMin);
    }
}
