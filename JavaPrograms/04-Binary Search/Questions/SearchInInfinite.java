package com.BinarySearchQuestions;

import java.util.Scanner;

public class SearchInInfinite {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10, 11, 12, 13};
        int target = 6;

        System.out.println(searchInInfinite(arr, target));
    }

    static int searchInInfinite(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end;
            end = end +(end - start +1)*2;
            start = end+1;
        }
        return  binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
