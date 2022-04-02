package com.Recursion;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int ans = binarySearch(arr,11,0,arr.length-1);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target, int start , int end) {
        int mid = start + (end - start)/2;
        // base condition
        if( start > end ) {
            return -1;
        }
        if( arr[mid] == target) {
            return mid;
        }
        else if( arr[mid] > target) {
            return binarySearch(arr, target, start, mid -1);
        }
        else{
            return binarySearch(arr,target, mid +1, end);
        }

    }
}
