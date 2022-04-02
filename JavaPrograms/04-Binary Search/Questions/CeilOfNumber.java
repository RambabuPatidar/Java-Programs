package com.BinarySearchQuestions;

public class CeilOfNumber {
    public static void main(String [] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 16;

       int ans =  ceilOfNumber(arr, target);
        System.out.println(ans);

    }

    static int ceilOfNumber(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        int mid =0;
        while( start<=end) {
             mid = start + (end-start)/2;
            if( target == arr[mid]) {
                return arr[mid];
            }
            else if(arr[mid] > target) {
                end = mid-1;
            }
            else{
               start = mid+1;
            }
        }
        return arr[start];
    }
}
