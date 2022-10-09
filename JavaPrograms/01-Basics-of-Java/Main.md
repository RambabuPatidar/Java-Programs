# First Program in Java

## Aim:
To understand the structure of the Java [Boilerplate](https://en.wikipedia.org/wiki/Boilerplate_code) Code and Initialisation of the Primitive data type.

## Code:

```Java
package com.BasicsOfJava;

import java.util.Arrays;

public class Main {
    static int a = 100;

    public static void main(String[] args) {

        System.out.println("inside the main method block :" +a);


        {
            int a = 999;  // scope will begin when the value is initialised
            System.out.println("inside the void block :" + a);
            int b;
            b = 123;

            int c = a+b;
            System.out.println("the sum of " + a + " and " +  b + " is " + c);
            sum(1, 2, 3, 4, 5, 7, 6, 8, 9 , 10);
        }
    }

    static void sum(int ... v) {
        int sum = 0;
         Arrays.sort(v);
        System.out.println(Arrays.toString(v));

    }
}
```
### [<< Question Serial According to Increasing Level](./00StartHere.md) | [Check Even Odd >>](./EvenOdd.md)