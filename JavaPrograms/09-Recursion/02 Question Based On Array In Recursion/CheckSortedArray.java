package com.ArraysRecursionQuestion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8 ,9};
//        System.out.println(sorted(arr, 0));
        System.out.println(modifiedSorted(arr, 0));
    }
    // simplified
    static boolean modifiedSorted(int[] arr, int i) {
        if(i == arr.length - 1) {
            return true;
        }
        return (arr[i] <= arr[i+1]) && modifiedSorted(arr, i+1);
    }
    // my real approach
    static boolean sorted(int[] arr, int i) {
        if(i == arr.length - 1) return true;
        if( arr[i] >= arr[i+1]) {
            return false;
        }
        return sorted(arr, i+1);
    }
}
