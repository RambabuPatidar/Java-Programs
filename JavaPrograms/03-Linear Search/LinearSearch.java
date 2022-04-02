package com.LinearSearchAndQuestions;

public class LinearSearch {
    public static void main(String [] args) {
        int[] nums = {1 , 3, 34, 67, 87, 2, 1, 56, 72, 9};
        int target = 200;

        int ans = linearSearch(nums, target);
        System.out.println(ans);


    }

    // method for linear search in the number array
     static int linearSearch(int[] nums, int target) {

        //base condition if the array is empty
        if( nums.length == 1) {
            return -1;
        }

        // if the array is not empty then search via a for loop
         for (int index = 0; index < nums.length; index++) {
             //check that is the element at the index i is
             //equal to the target or not

             int element = nums[index];
             if(element == target) {
                 return index;
             }
         }

         // if the return statement not hit than return false;
         return -1;
    }


}
