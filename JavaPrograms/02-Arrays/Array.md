
# Intro to Arrays

## Aim :

To understand the syntax of array and start implementing them.

## Important Definition:

**Array** : It is a contigious block of memory that can store one type of data type at a time.

> In C++ we can access particular address using the pointers and their inner implementation have contigious block of memory.
> But in Java we can't access the addresses because of its security. Internally array implementation of java may or may not have contigious block.

# Why we Need Array:

We can sotre integer type in `int` and `Integer` wrapper classes but what if we want to store multiple integer at once.
If we not use array then we have to use something like:
```
int a = 10;
int b = 11;
int c = 12;
int d = 13;

```
and what if we want to store thousand numbers?
For that we need arrays, so we can write the above block as 
```
int[] numbers = {10, 11, 12, 13};
```

> Arrays follow 0-based indexing that is the first element will be considerd at 0th position.

numbers[0] is the first element in the Array.
number[size - 1] will be the last element.
## Code:

```Java
package com.Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n;
        System.out.print("Enter the length of array :");

        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        for(int num: arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));

    }
}
```
### [<< 02-Arrays](./00StartHere.md) | [Swap Numbers in Array >>](./SwapIndexes.md)
