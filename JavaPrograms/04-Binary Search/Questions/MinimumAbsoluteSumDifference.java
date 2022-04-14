package com.BinarySearchQuestions;
// not able to handle all the cases

public class MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};

        System.out.println(minimumAbs(nums1, nums2));
    }
    static int minimumAbs(int[] nums1, int[] nums2) {
        int maxDiff = 0;
        int  sumDiff = 0;
        int maxDiffIdx = 0;

        for(int i=0; i<nums1.length ;i++) {
            int num = Math.abs(nums1[i]-nums2[i]);
            if(num > maxDiff) {
                maxDiff = num;
                maxDiffIdx = i;
            }
            sumDiff += num;

        }

        int miniDiff = maxDiff;
        for (int i = 0; i < nums1.length; i++) {
            if( i == maxDiffIdx) {
                continue;
            }
            int num = Math.abs(nums1[i] - nums2[maxDiffIdx]);
            if( num < miniDiff) {
                miniDiff = num;

            }
        }

        return sumDiff - maxDiff + miniDiff;
    }
}
