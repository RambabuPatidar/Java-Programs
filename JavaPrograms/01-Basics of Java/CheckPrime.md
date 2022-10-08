
# Check Prime Number

## Aim :

Check if the given number is prime or not.


## Important Definitation:

**Prime Number** : A number is prime if it is divisible of itself and 1, otherwise not.

>> 1 is not prime number.

```
For Example:

    n = 17 
    It is prime as no any number in set of [2, 16] divides 17 and give reminder 0.

    n = 21 
    It is not prime as 3 divides 21 which is in [2, 20].
```
## Code:

```Java
package com.BasicsOfJava;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :" );
        int n = in.nextInt();

        boolean isPrime = prime( n);

        if( isPrime) {
            System.out.println("Prime " );

        }
        else {
            System.out.println("NotPrime");
        }
    }
    // This are the efficient methods we can also do is check for all the number from 2 to N
    // but after chekcing square root is just waste of time for you and computer too. whala 🤣.
    static boolean prime(int n ) {
        if( n <= 1) {
            return false;
        }

        int  c= 2;
        while( c*c <= n) {
            if( n%c == 0) {
                return  false;
            }
            c++;
        }

        return c * c > n;
    }

    // this is method for prime number checking
//    static boolean prime(int n) {
//        for(int i=2; i*i <=n ; i++) {
//            if( n %i == 0 ) {
//                return false;
//            }
//        }
//        return true;
//    }
}
```

<table>
    <tr>
        <th>
            <a href="./FunctionOverloading.md">&lt;&lt; Overloading Functions</a>
        </th>
        <th>
            <a href="./Revision.md">Some Random Question &gt;&gt;</a>
        </th>
    </tr>
<table>
