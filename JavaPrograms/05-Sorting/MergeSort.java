package com.Sorting;

import java.util.Arrays;
// Note: In this program the original array is getting modified.
// Think how we can do without modifying the original array.
public class MergeSort {
    public static void main(String[] args ){
        int[] arr = {4, 3, 2, 1, 4, 3, 0, -1, -12, -9};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e) {
        if( s >= e ) {
            return ;
        }
        int mid = (s +  e ) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        merge(arr, s , mid , e);
    }

    static void merge(int[] arr, int s, int mid, int e) {
//        we can directly
        int[] mix = new int[e - s  + 1];
        int i = s;
        int j = mid +1;
        int k = 0;

        while( i <= mid  && j <= e) {
            if( arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;

            }
            k++;
        }

        while( i <= mid ) {
            mix[k] = arr[i];
            k++; i++;
        }

        while( j <= e) {
            mix[k] = arr[j];
            k++; j++;
        }
        i = s;
        for(k = 0; k <=mix.length - 1 ; k++ ) {
            arr[i++] = mix[k];
        }

    }
}
