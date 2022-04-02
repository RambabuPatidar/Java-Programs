package com.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {91, 2, 13, 4, -5, 6, 17, 8, -9, 10};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr) {

        // for every index put that index at the correct index
        // in the left-hand side sort array;
        for(int i = 1; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            j++;
            arr[j] = curr;
        }
    }
}
