package com.BinarySearch;

public class BinarySearchIncreasing {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 19};

        int target = 8;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1;
        while(s <= e) {
            int mid = (s+e) / 2;
            if( arr[mid] == target) {
                return mid;
            }
            else if( arr[mid] > target) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
