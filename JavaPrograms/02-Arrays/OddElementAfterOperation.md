
# Question (Odd Element After Operation)

## Aim :

write here


## Important Definition:

**Definition01** : write here 

```
For Example:

Example here
```
## Code:

```Java
package com.Arrays

/*
Q. Given an empty array m x n and an array indices of variable rows but column length 2
     first column represent the row of origin array and second column represent the col of the
     original array. for every element in the indices increment either row or column by 1 and
     finally return the number of element which becomes odd after this operation.
 */

public class OddElementAfterOperation{
    public static void main(String[] args) {
        int k = 3;
        int m = 2, n = 3;
        int indices[][] = {{0,1}, {1,1}};
        int ans =  oddCells(m , n , indices);
        System.out.println(ans);
//        allPermutation("", k);
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];

        helper(indices, mat);
        for(int i=0; i<mat.length; i++) {
            for(int j =0; j< mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        return countOdd(mat);
    }

    static int countOdd(int[][] mat ) {
        int count = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j =0; j< mat[i].length; j++) {
                if(( mat[i][j] & 1) == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    static void helper(int[][] indices, int[][] mat) {
        for(int i=0; i<indices.length; i++) {
            for(int j =0 ; j<indices[i].length; j++){
                if( j == 0 ) {
                    // row
                    increamentRow(mat , indices[i][j]);
                }
                else{
                    increamentCol(mat, indices[i][j]);
                }
            }
        }
    }

    static void increamentRow(int[][] mat, int row) {
        for(int i=0;i < mat[0].length; i++ ){
            mat[row][i]++;
        }
    }
    static void increamentCol(int[][] mat, int col) {
        for(int i=0;i < mat.length; i++ ){
            mat[i][col]++;
        }
    }

    static void allPermutation(String p, int k) {
        if( p.length() == k) {
            System.out.println(p);
            return;
        }

       allPermutation(p + '0' , k);
        allPermutation(p + '1', k);

    }
}
```

### [<< Intro To Multi-Dimensional Array](./MultiDimensional.md) | [Intro to ArrayList In Java >>](./ArrayListInJava.md)