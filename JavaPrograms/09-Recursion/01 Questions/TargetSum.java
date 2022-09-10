package com.MoreRecursionQuestions;
// Q. https://leetcode.com/problems/target-sum/
public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {4, 4, 8, 4, 4, 4};
        int target = 4;
        System.out.println(ways(nums, target, 0, 0));
    }
//    is it really a medium level question ?
//    so simple...
    // but this will take fair amount of time as it is calculating
    // the same thing again and again.
    // And this can be reduced by Dynamic programming. make the recursion tree for it
    // and you will see that many things are getting calculate repeatedly
    static int ways(int[] nums, int target, int idx, int sum) {
        if(idx == nums.length) {
            if( target == sum ) {
               return 1;
            }
            return 0;
        }
        return ways(nums, target, idx + 1, sum + nums[idx]) +
                ways(nums, target, idx + 1, sum - nums[idx]);
    }
}
