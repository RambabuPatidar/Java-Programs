package com.RecursionQuestion;

import java.util.Arrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 13;
        int row = mat.length-1;
        int col = mat[0].length -1;
        int[] ans = searchRecursive(mat, target, 0, col );

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRecursive(int[][] mat, int target,int row , int col) {

        if( row >= mat.length || col < 0 ) {
            return new int[]{-1,-1};
        }

        if( mat[row][col] == target) {
            return new int[]{row,col};
        }

        if( mat[row][col] > target) {
            return searchRecursive(mat, target, row , col-1);
        }
        return searchRecursive(mat, target, row +1, col);
    }
}
