package com.Sorting;

import java.util.Arrays;

public class SelectionSortByKK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum element index
            int last = arr.length - i- 1;
            int maxIdx = findMaxIdx(arr, 0, last);

            swap(arr, maxIdx, last);
        }
    }

    static void swap(int[] arr, int maxIdx, int last) {
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[last];
        arr[last] = temp;
    }

    static int findMaxIdx(int[] arr, int first, int last) {
        int max = first;
        for(int i=first; i<=last; i++){
            if( arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
