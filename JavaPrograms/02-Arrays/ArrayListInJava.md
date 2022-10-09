
# Intro to ArrayList In Java

## Aim :

To understand what ArrrayList in java is? what are different methods available And starts using them.


## Important Definition:

**ArrayList** : This is very similar to array but this had dynamic nature. It can increase its size when it is full. 

```
For Example:

Example here
```
## Code:

```Java
package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInJava {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
```
### [<< Question (Odd Element After Operation)](./OddElementAfterOperation.md) | [Multi Dimensional ArrayList in Java >>](./MultiArrayList.md)
