package com.RecursionQuestion;

import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        int [] arr = {1, -1, -3, 900, 12, -109, 123};

        System.out.println(Arrays.toString(findMaxMin(arr)));
        System.out.println(findMaxMin02(arr, 0));

    }
    // My methode of doing it.
    static int[] findMaxMin(int[] arr) {
        return new int[]{helper(arr, 1, arr[0], true),
                         helper(arr, 1, arr[0], false ) };
    }

    static int helper(int[] arr, int i, int ans, boolean isMin) {
        if( i >= arr.length) {
            return ans;
        }
        if( isMin) {
            return helper(arr, i + 1, Math.min(arr[i], ans), isMin);
        }
        return helper(arr, i+1, Math.max(arr[i], ans), isMin);

    }
    // This is the standard method
    // The difference between this and my method is that it is not using any
    // extra argument but my code I am using an extra argument that is ans.
    static int  findMaxMin02(int[] arr, int i ) {
        if(i == arr.length - 1 ) {
            return arr[i];
        }
        return Math.max(arr[i], findMaxMin02(arr, i+1));
    }
}

