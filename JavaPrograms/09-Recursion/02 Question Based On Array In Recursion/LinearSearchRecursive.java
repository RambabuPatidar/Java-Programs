package com.ArraysRecursionQuestion;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 67, 9, 8, 10, 34};
        int target = 34;
        System.out.println(linearSearchBoolean(arr, target, 0));
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linearSearchFromLast(arr, target, arr.length -1));

    }

    static boolean linearSearchBoolean(int[] arr, int target , int index) {
        if( index == arr.length) {
            return false;
        }

        return arr[index] == target || linearSearchBoolean(arr, target, index +1);

    }

    static int linearSearchFromLast(int[] arr, int target, int index) {
        if( index == -1) {
            return -1;
        }
        return arr[index] == target ? index : linearSearchFromLast(arr, target, index -1);
    }

    static int linearSearch(int[] arr, int target,  int index) {
        if(index == arr.length ) {
            return -1;
        }
//        if( arr[index] == target ) {    // This commented code also works fine
//            return index;               // just the way of writing code is different
//        }
//        return linearSearch(arr, target, index+1);
        return arr[index] == target? index: linearSearch(arr, target, index+1);
    }
}
