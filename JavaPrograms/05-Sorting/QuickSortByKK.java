package com.Sorting;

import java.util.Arrays;

public class QuickSortByKK {
    public static void main(String[] args) {
        int[] arr = {4, 5, 16, 7, 8};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int hi) {
        if(low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s <= e) {

            while( arr[s] < pivot) {
                s++;
            }

            while( arr[e] > pivot) {
                e--;
            }

            if( s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }

        }

        quickSort(arr, low, e);
        quickSort(arr, s, hi);

    }

    // we are choosing the mid-element as the pivot element in the array
    // then we are taking two pointer from the start and also from end
    // then we check by these two pointer that the condition of having smaller element in the LHS
    // and the larger element in the RHS is getting followed or not
    // when this condition is not followed in both the side of the pivot element
    // we swap these two pointer value. and again keep checking the same thing until
    // we start pointer become greater than the end pointer. And following the same thing in the remaining sub-parts of the arrays
}
