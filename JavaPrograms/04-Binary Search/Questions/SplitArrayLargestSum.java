package com.BinarySearchQuestions;

public class SplitArrayLargestSum {
    public static void main(String [] args) {
        int[] nums = {7, 2, 5, 10, 8};

        System.out.println(findPieces(nums, 18));

    }
    static int findPieces(int[] nums, int mid) {
        int count = 1;
        int sum = 0;
        for (int num : nums) {
            if (sum + num > mid) {
                sum = num;
                count++;
            }
            else {
                sum+= num;
            }
        }
        return count;
    }
}
