package com.ArraysRecursionQuestion;

public class RecursiveBinarySearchRotated {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};

        int target = 12;

        System.out.println( binarySearchRotated(arr, target, 0, arr.length -1 ));
    }
    static int binarySearchRotated(int[] arr, int target, int start, int end) {
        if( start > end ) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if( arr[mid] == target) {
            return mid;
        }
        else if( arr[mid] > arr[start]) {
            if( target < arr[mid] && target >= arr[start]) {
                return binarySearchRotated(arr, target, start, mid -1);
            }
            else{
                return binarySearchRotated(arr, target, mid + 1 , end  );
            }
        }
            if( target <= arr[end] && target > arr[mid] ) {
                return binarySearchRotated(arr, target, mid +1 , end);
            }
            else{
                return binarySearchRotated(arr, target, start, mid -1);
            }

    }
}
