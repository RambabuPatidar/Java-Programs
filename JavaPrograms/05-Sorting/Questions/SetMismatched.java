package com.SortingQuestions;

import java.util.Arrays;

public class SetMismatched {
    public static void main(String[] args) {
        int[] arr = {1,1};

        int[] ans = setMismatch(arr);

        System.out.println(Arrays.toString(ans));
    }
    static int[] setMismatch(int[] arr) {
        int[] ans = new int[2];

        int i=0;
        while( i < arr.length) {
            int correctIdx= arr[i] -1;
            if( arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<arr.length; j++) {
            if( arr[j] != j+1) {
                ans[0] = arr[j];
                ans[1] = j+1;
                break;
            }
        }
        return ans ;
    }
    static void swap(int[] arr, int first, int second) {

        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
