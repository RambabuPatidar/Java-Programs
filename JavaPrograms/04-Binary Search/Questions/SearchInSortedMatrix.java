package com.BinarySearchQuestions;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String [] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        int target = 20;

        int[] ans = searchInSortedMatrix(matrix, target);

        System.out.println(Arrays.toString(ans));

    }
        // this will search in given row from given column start to column end in the matrix
    static int[] binarySearch(int[][] matrix ,int row, int colStart, int colEnd, int target ) {

        while( colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart)/2;
            if( matrix[row][mid] == target ) {
                return new int[]{row, mid};
            }
            if(matrix[row][mid]  > target) {
                colEnd = mid-1;

            }
            else{
                colStart = mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] searchInSortedMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            // check if the matrix is only one dimension
            if( cols ==0 ) {
                return new int[]{-1,-1};
            }
            if( rows == 1) {
                return binarySearch(matrix, 0, 0, cols-1,target);
            }

            int rowStart  = 0;
            int rowEnd = rows-1;
            int colMid = (cols)/2;
            // runs the loop until we are not left with two rows
            while( rowStart < (rowEnd -1)) {
                int rowMid = rowStart + (rowEnd - rowStart)/2;

                if(matrix[rowMid][colMid] == target) {
                    return new int[]{rowMid,colMid};
                }
                 if( matrix[rowMid][colMid] > target) {
                    rowEnd = rowMid;
                }
                else{
                    rowStart = rowMid;
                }
            }

            // now we are left  with 2 rows
        // check that this middle column contain the target
        if( matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        if( matrix[rowStart +1][colMid] == target) {
            return new int[]{rowStart+1, colMid};
        }
            //now we  will see the four cases

        //search in the 1st part
        if (target <= matrix[rowStart][colMid-1]  )
            return binarySearch(matrix,rowStart,0,colMid-1,target);

        //search in the 2nd part
        if (  target >= matrix[rowStart][colMid+1]   && target<= matrix[rowStart][cols-1]  )
            return binarySearch(matrix,rowStart,colMid+1,colMid-1,target);
        //search in the 3rd part
        if ( target <= matrix[rowStart+1][colMid-1]  )
            return binarySearch(matrix,rowStart+1,0,colMid-1,target);
        //search in the 4th part
        else
            return binarySearch(matrix,rowStart+1,colMid+1,cols-1,target);

    }
//
}
