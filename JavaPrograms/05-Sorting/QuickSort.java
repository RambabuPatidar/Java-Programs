package com.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, -3, 9, -8, 1, 2, 0, -4, 5, 7};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int s, int e) {
        if( s >= e ) {
            return;
        }

        int pivot = partition(arr, s, e);

        quickSort(arr, s , pivot - 1);
        quickSort(arr, pivot + 1, e);
    }

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];  // taking ends as the pivot  are not so much efficient
        int i = s - 1;  // this s - 1 can be replaced with s only
                        // as we are swapping the values incrementing i we can do like
                        // swap the value first and then increase the value of i;
                        // so when for loop will over the i will be at the pivot element and we have not to increase the value of i as we are doing in line no 39

        for(int j = s; j < e; j++) { // The adjacent element are compared and placed on the right side of the pivot element
            if( arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, e);
        return i;
    }

    static void swap(int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
