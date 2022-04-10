package com.ArraysRecursionQuestion;

import java.util.ArrayList;

public class FindAllIndexOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 7};
        int target = 5;
//        findAllIndex(arr, target, 0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.print(findAllIndex02(arr, target, 0, list));
        System.out.println(findAllIndex03(arr, target, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if( index == arr.length ) {
            return;
        }

        if(arr[index] == target ) {
            list.add(index);
        }
        findAllIndex(arr, target, index +1);
    }

    // what if we want to return the arraylist from the method
    // And in this case no list is getting created again and again
    // just the reference to value of object are created , they all are pointing
    // to the same object. That is why if any of the reference variable of function call
    // is making changes it is getting reflected in the original list.

    static ArrayList<Integer> findAllIndex02(int[] arr, int target, int index , ArrayList<Integer> list) {
        if( index == arr.length ) {
            return list;
        }

        if( arr[index] == target) {
            list.add(index);
        }

        return findAllIndex02(arr, target, index + 1, list);
    }

    // now if we don't want to pass the list in the parameter of function call and
    // want to write it inside the function call?
    // yes we can do it but we should remember that the object will get created every time when the
    // function call is called so this is not an good way because it is creating a new list object
    // every time.
    // even though we will create it because this will make learn a very-very important concept
    static ArrayList<Integer> findAllIndex03(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if( index == arr.length) {
            return list;
        }

        if( arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex03(arr, target, index +1) ;

        list.addAll(ansFromBelowCalls);

        return list;

    }
}
