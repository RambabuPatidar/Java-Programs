package com.BinarySearchQuestions;
import java.util.Arrays;
public class SearchInSortedRowColumnMatrix {

    public static void main(String [] args) {
        int[][] mat = {
                {1,  3,   6,  11, 34},
                {7,  12,  15, 23, 35},
                {8,  16,  18, 25, 39},
                {10, 17,  20, 29, 46}
        };

        int target = 20;

        int[] ans = searchMatrix(mat, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchMatrix(int[][] mat, int target) {

        int col = mat[0].length-1;
        int row = 0;

        while ( col >= 0 && row < mat.length) {
            if ( mat[row][col] == target) {
                return new int[]{row, col};
            }
            else if (mat[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}
