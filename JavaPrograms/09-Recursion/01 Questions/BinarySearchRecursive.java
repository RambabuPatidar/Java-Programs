package com.RecursionQuestion;



public class BinarySearchRecursive {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4 ,5, 6, 7, 9, 10};

        int target = 31;

        System.out.println(binarySearch(arr, target, 0, arr.length -1));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if( start > end ) { // base condition if target not found
            return -1;
        }
        int mid = start + (end - start ) /2;
        if( arr[mid ]  == target) {
            return mid;
        }
        else if ( arr[mid] > target) {
            return binarySearch(arr, target, start, mid -1);
        }
        return binarySearch(arr, target, mid +1, end);

    }


}
