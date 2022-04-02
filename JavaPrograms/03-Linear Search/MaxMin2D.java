package com.LinearSearchAndQuestions;

import java.util.Arrays;

public class MaxMin2D {
    public static void main(String [] args) {
        int[][] mat  = {
                {1, 2, 3, 4},
                {2, 34, 190},
                {88, 23},
                {1, 2, 0, 9, 10}
        };
        int target = 90;
        int[] ans = searchIn2D(mat, target);

        System.out.println(Arrays.toString(ans));

        System.out.println("The maximum value in the matrix is :" + maximumIn2D(mat));
        System.out.print("The minimum value in the matrix is :" + minimumIn2D(mat));
    }

    static int[] searchIn2D(int[][]mat, int target) {

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maximumIn2D(int[][] mat) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : mat) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    static int minimumIn2D(int[][] mat) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : mat) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
