package com.PatternUsingRecursion;

import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 1, 2, 3, 4, 5};

        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int i , int j) {
        if(i == 0) {
            return;
        }
        if( j < i) {
            if( arr[j] > arr[j+1]) {
                swap(arr, j, j+1);
            }
            bubbleSort(arr, i, j+1);
        }
        else{
            bubbleSort(arr, i - 1, 0);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
