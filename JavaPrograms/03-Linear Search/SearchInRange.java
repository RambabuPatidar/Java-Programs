package com.LinearSearchAndQuestions;

public class SearchInRange {
    public static void main(String[] args){
        int[] nums = {1, 2 , 3,4 ,5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(nums, 110, 2, 6));

    }

    static int linearSearch(int[] nums, int target, int start, int end) {


        if( nums.length == 0) {
            return -1;
        }


        for (int index = start; index <=end; index++) {

            int element = nums[index];
            if(element == target) {
                return index;
            }
        }


        return -1;
    }
}
