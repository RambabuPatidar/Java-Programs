# Find Factorial

## Aim :

To calculate the factorial of given number.


## Important Definition:

**Factorial** : A number multiplied with all the numbers from 1 to N(for which we want to calculate Factorial).

**Representation** : !

**0!** = 1

> Factorial only exist for the positive numbers.

```
For Example:

    n = 5
    factorial(5) = 5 * 4 * 3 * 2 * 1
```
## Code:

```Java
package com.BasicsOfJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.print("Enter a number : ");
        n = in.nextInt();

        System.out.println(factorial(n));

    }

    static long factorial(int n ){
        if( n == 0) {
            return 1;
        }
        int ans = 1;
        while( n >= 1) {
            ans = ans*n;
            n--;
        }
        return ans;
    }
}
```
### [<< Maimum And Minimum](./MaxMin.md) | [Variable Arguement >>](./VarArgs.md)