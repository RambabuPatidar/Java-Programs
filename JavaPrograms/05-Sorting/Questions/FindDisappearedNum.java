package com.SortingQuestions;
import java.util.ArrayList;
import java.util.Arrays;

public class FindDisappearedNum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

       int[] ans =  findDisappearNum(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findDisappearNum(int[] arr) {
        int i=0;
        while( i <arr.length) {
            int correctIdx = arr[i] -1;
            if( arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if( arr[j] != j+1){
                list.add(j+1);
            }
        }

        int[] ans = new int[list.size()];
        for(int j=0; j<ans.length ;j++) {
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
