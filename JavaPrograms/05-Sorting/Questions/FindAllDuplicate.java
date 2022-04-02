package com.SortingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicate {

    // medium level question of leetcode
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        int[] arr = {1};

        int [] ans  = findAllDuplicate(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findAllDuplicate(int[] arr) {

        int i=0;
        while( i< arr.length) {
            int correctIdx = arr[i] -1;
            if( arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<arr.length;j++) {
            if( arr[j]  != j+1) {
                list.add(arr[j]);
            }

        }
        int[] ans = new int[list.size()];
        for(int j=0; j<ans.length; j++) {
            ans[j] = list.get(j);
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
