package com.Arrays;

import java.util.Arrays;

public class SwapIndexes {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        Reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void Reverse(int[] arr) {
//         for (int i = 0; i < arr.length / 2; i++) {
//             swap(arr, i, arr.length-1-i);
//         }
         int s =0;
         int e = arr.length-1;
         while( s < e) {
             swap(arr, s, e);
             s++; e--;
         }
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1] ;
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}
