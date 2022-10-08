# Even Odd 

## Aim : 
Check if the number is even or Odd.

## Code:

```Java
package com.BasicsOfJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.println("Enter the number ");
        a = in.nextInt();
        if( checkEvenOdd(a)) {
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd Number");
        }

    }

    static boolean checkEvenOdd(int n) {
        return n % 2 == 0;
    }
}
```
<table>
	<tr>
		<th><a href="./Main.md">&lt;&lt; First Program In Java</a> </th>
		<th><a href="./Armstrong.md">Find Armstrong Numbers &gt;&gt;</a> </th>
   </tr>
<table>