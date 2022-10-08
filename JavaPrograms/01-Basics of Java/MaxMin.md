# Maximum And Minimum

## Aim :

Find the maximum and minimum of 3 numbers.


```
For Example:

    a = 1; b = 2; c = 3
    Max = 3 
    Min = 1
```
## Code:

```Java
package com.BasicsOfJava;

import java.util.Scanner;

public class MaxMin {
    public static void main(String [] args) {
        System.out.println("Enter three number consecutively");
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(maximum(a, b, c));
        System.out.println(minimum(a, b, c));
    }

    static int maximum(int a, int b, int c) {
        // assuming that a is maximum and then checking that is it really maximum
        // if not update
        int maximum = a;
        if( b > maximum) maximum = b;
        if( c > maximum)
            maximum = c;
        return maximum;
    }

        // same above comment with appropiate meaning.
    static int minimum(int a, int b, int c) {
        int minimum = a;
        if( b < minimum)
            minimum = b;
        if(c < minimum)
            minimum = c;

        return minimum;
    }
}
```

<table>
    <tr>
        <th>
            <a href="./Armstrong.md">&lt;&lt; Find Armstrong Numbers</a>
        </th>
        <th>
            <a href="./Factorial.md">Factorial &gt;&gt;</a>
        </th>
    </tr>
<table>
