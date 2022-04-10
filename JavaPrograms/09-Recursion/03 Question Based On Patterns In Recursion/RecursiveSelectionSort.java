package com.PatternUsingRecursion;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String [] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2 ,-3};

//        selectionSort(arr, arr.length - 1, 0  );
        selectionSort02(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    // This is the simple method that compare the last element with each element
    // of the inner loop and whenever you find the element that is larger than the
    // last one replace it.

    //Point to Ponder  : How can I do it something like finding the maximum element
    // and at the last of end of first loop I will swap that element with the last one
    // so the array will get start sorting from the last. For this look below method
    static void selectionSort(int[] arr, int i, int j) {
        if( i == 0 ) {
            return ;
        }
        if( j < i ) {
            if( arr[j] > arr[i] ) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            selectionSort(arr, i, j + 1);
        }
        else{
            selectionSort(arr, i - 1, 0);
        }
    }

    static void selectionSort02(int[] arr, int i, int j , int maxIdx){
        if( i == 0 ) {
            return ;
        }
        if( j < i ) {

            if( arr[j] > arr[maxIdx]){
                selectionSort02(arr, i, j + 1, j);
            }
            else{
                selectionSort02(arr, i, j + 1, maxIdx);
            }
        }
        else {
            int temp = arr[i - 1];
            arr[i -1] = arr[maxIdx];
            arr[maxIdx] = temp;
            selectionSort02(arr, i - 1, 0 , 0);
        }
    }
}
