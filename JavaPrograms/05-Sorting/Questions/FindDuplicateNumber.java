package com.SortingQuestions;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }

    static int findDuplicate(int[] arr) {
        int i=0;
        while( i < arr.length){
            int correctIdx = arr[i] -1;

            if(arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }

        int j ;
        for (j = 0; j < arr.length; j++) {
            if( arr[j] != j+1) {
                break;
            }
        }
        return arr[j];
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
