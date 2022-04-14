package com.StringsWithRecursion;

import java.util.ArrayList;



public class PossibleSubsetInArrayIterative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));


    }

    static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // creating the outer list
        list.add(new ArrayList<>());// Adding an empty list in it
        for (int num : arr) {   // now for every number we are creating a copy of the list and adding that number in list and then adding that list in original list;
            int n = list.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> eachInnerList = new ArrayList<>(list.get(j));
                eachInnerList.add(num);
                list.add(eachInnerList);
            }
        }
        return list;
    }
}
