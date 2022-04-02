package com.SortingQuestions;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};

        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
    static int firstMissingPositive(int[] arr) {
            int i = 0;
            while( i < arr.length) {
                int correctIdx = arr[i] -1;
                if( arr[i] <= arr.length && arr[i] >0 && arr[i] != arr[correctIdx]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIdx];
                    arr[correctIdx] = temp;
                }
                else{
                    i++;
                }
            }
            int j;
            for( j=0; j<arr.length; j++) {
                if( arr[j] != j+1) {
                    return j+1;
                }
            }
            return j+1;
    }
}
