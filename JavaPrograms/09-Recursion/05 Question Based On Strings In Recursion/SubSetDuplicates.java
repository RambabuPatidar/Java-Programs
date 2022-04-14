package com.StringsWithRecursion;
import java.util.List;
import java.util.ArrayList;

public class SubSetDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,2,2,2};
        ArrayList<ArrayList<Integer>> list;
        list = subsetsDuplicate(arr);
        for(List<Integer> ans : list) {
            System.out.println(ans);
        }
    }
    // my method BRUTE FORCE
    static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // creating the outer list
        list.add(new ArrayList<>());// Adding an empty list in it
        for (int num : arr) {   // now for every number we are creating a copy of the list and adding that number in list and then adding that list in original list;
            int n = list.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> eachInnerList = new ArrayList<>(list.get(j));
                eachInnerList.add(num);
                boolean found = false; // checking that is the present list already contain the element or not
                for(int i = 0; i < n ; i++) {
                    if(eachInnerList == list.get(i)) {
                        found = true;
                        break;
                    }
                }
                if( found ) {
                    continue;
                }
                list.add(eachInnerList);
            }
        }
        return list;
    }

    // optimized method

    static ArrayList<ArrayList<Integer>> subsetsDuplicate(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // creating the outer list
        list.add(new ArrayList<>());// Adding an empty list in it

        int start = 0;
        int end = 0;
        for (int i= 0 ; i<arr.length; i++) {   // now for every number we are creating a copy of the list and adding that number in list and then adding that list in original list;
            start = 0;
            int n = list.size();
            if( i > 0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = list.size() - 1;
            for (int j = start; j < n; j++) {
                ArrayList<Integer> eachInnerList = new ArrayList<>(list.get(j));
                eachInnerList.add(arr[i]);
                list.add(eachInnerList);
            }
        }
        return list;
    }
}
