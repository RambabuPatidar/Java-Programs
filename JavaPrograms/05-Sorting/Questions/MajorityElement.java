package com.SortingQuestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3};

        int ans = majorityElement(arr);
        System.out.println(ans );
    }
    static int majorityElement(int[] arr) {
        int i=0;
        int count =0;

        int maximum = Integer.MIN_VALUE;
        while( i < arr.length) {
            if(i+1 != arr.length &&  arr[i] == arr[i+1]) {
                count++;
            }
            else{
                maximum = Math.max(maximum, count);

                count =0;
            }
            i++;
        }

        return maximum +1;
    }
}
