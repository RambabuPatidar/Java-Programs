
# Intro To Multi-Dimensional Array

## Aim :

What are multi Dimensional Array && how they are implemented.


## Important Definition:

**Multi-D Arrays** : Array of arrays are basically known as multi dimensional array.
```
For Example:

int[][] numbers = {
    { 1,  2,  3,  4,  5},
    {11, 12, 13, 14, 15},
    {21, 22, 23, 24, 25},
    {31, 32, 33, 34, 35}
};


```
## Code:

```Java
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Arrays;
public class MultiDimensional {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        // Multidimensional array

        int n;
        System.out.println("Enter the value of N");
        n = in.nextInt();
        int[][] mat = new int[n][n];

        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        System.out.println("Enter the element of matrix");

        for (int i = 0; i < n; i++) {
            for(int j = 0; j< n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("the element of the matrix are ");

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));

        }
    }
}
```
### [<< Swap Numbers in Array](./SwapIndexes.md) | [Question (Odd Element After Operation) >>](./OddElementAfterOperation.md)