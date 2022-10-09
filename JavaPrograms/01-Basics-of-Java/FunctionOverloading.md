
# Overloading Functions

## Aim : 

To learn how to overload a function, when does the methods get overload and when not.


## Important Definition:

**Overloading** : In very simple words using the same function name for more than one times for different tasks, when some condition are applied. 

## Resource:

[Text](https://www.geeksforgeeks.org/method-overloading-in-java/)

## Code:

```Java
package com.BasicsOfJava;

import java.util.Scanner;

public class FunctionOverloading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of a ");
        a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        System.out.println("The sum of a and b is :" + sum(a,b));
        System.out.println("enter the value of d");
        int d = in.nextInt();

        System.out.println("this is now the function overloading is ");
        System.out.println( "the value of sum is " + sum(a, b, d));
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sum(int a, int b ,int d) {
        return a+b+d;
    }
}
```
### [<< Taking Variable Arguement](./VarArgs.md) | [Check Prime Number >>](./CheckPrime.md)
