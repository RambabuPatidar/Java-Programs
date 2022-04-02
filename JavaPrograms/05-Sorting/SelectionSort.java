package com.Sorting;
import java.util.Arrays;
public class SelectionSort {

    // time complexity of selection sort is always O(n^2)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        selectionSort3(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void selectionSort3(int[] arr){
        // sorting form the end

        for(int i=0; i<arr.length; i++) {
            int maximum = arr[0];
            int maxIdx = 0;
            for(int j = 0; j< arr.length -i; j++) {
                if(arr[j] > maximum) {
                    maximum = arr[j];
                    maxIdx = j;
                }
            }
            swap(arr, maxIdx, arr.length - 1 - i);
        }
    }
    static void selectionSort2(int[] arr) {
        // sorting from the starting
        // first find the minimum element and then place it in correct position
        for(int i=0; i<arr.length; i++) {
            int mini  = arr[i];
            int miniIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if( arr[j] < mini) {
                    mini = arr[j];
                    miniIdx = j;
                }
            }
            swap(arr, miniIdx, i);

        }
    }

    static void selectionSort1(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if( arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
