package com.StringsWithRecursion;
import java.util.ArrayList;
import java.util.List;

public class PossibleSubsetArrayRecursive {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};


    }
    // think ahead don't able to make intuition behind the recursive function calls
//   static List<List<Integer>> subset(int[] arr , List<Integer> inner , int s) {
//        List<List<Integer>> outer = new ArrayList<>();
//        if(arr.length == s) {
//            outer.add(inner);
//            return outer;
//        }
//       inner.add(inner.size() -1,arr[s] );
//        List<List<Integer>> leftSubsets = subset(arr ,inner  , s+1);
//        List<List<Integer>> rightSubsets = subset(arr ,inner  , s+1);
//
//    }
}
