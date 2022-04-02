package com.BinarySearch;

public class BinarySearchDecreasing {
    public static void main(String [] args) {
        int[] arr = {88, 75, 65, 55, 48, 39, 20, 10, 6, 2, -1, -12, -122, -200};
        int target = -2000;

        System.out.println(binarySearch( arr,  target));

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while( start <= end) {

            // if the range of the start +end exceed the max value
            // than it will give error
            // so this is the modified way
            int mid = start + (end -start )/2;
            if( arr[mid] > target) {
                start = mid+1;
            }
            else if (arr[mid] < target) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
