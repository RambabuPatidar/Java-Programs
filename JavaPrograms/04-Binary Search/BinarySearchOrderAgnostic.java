package com.BinarySearch;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {

        int[] arr= {1, 2, 3, 5, 8, 9, 10, 12, 45, 58, 98, 199,299};
        int[] arr2 = {88, 75, 65, 55, 48, 39, 20, 10, 6, 2, -1, -12, -122, -200};
        int target = 39;

        System.out.println(binarySearchOrderAgnostic(arr2, target));
    }

    static int binarySearchOrderAgnostic(int[] arr , int target) {
        int size = arr.length;
        if( arr[0] > arr[size-1]) {
            return BinarySearchDecreasing.binarySearch(arr,target);
        }
        else if( arr[0] < arr[size-1]) {
            return BinarySearchIncreasing.binarySearch(arr, target);
        }
        else {
            return 0;
        }
    }
}
