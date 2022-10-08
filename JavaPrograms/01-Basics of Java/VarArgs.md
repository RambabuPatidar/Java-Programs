
# Taking Variable Arguement

## Aim : 

Learn how to take variable arguement in Java.

## Resource to Learn:

[YouTube Video](https://www.youtube.com/watch?v=vvanI8NRlSI&t=4013)
[Text](https://www.javatpoint.com/varargs)

## Code:

```Java
package com.BasicsOfJava;
 import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {

        multiple(12, 24, 'R' ,"Rambabu", "KunalKushwaha");
        int c = sum(25, 25);

    }
    // this will take all the integer values after first integer.
    static void sum (int a, int ... v){
        System.out.println("the variable argument function got called");
    }

    static int sum(int a, int b) {
        return a+b;
    }
    static void multiple(int a, int b, char c, String ... s){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(s));
    }
}
```

<table>
    <tr>
        <th>
            <a href="./Factorial.md">&lt;&lt; Find Factorial</a>
        </th>
        <th>
            <a href="./FunctionOverloading.md">Overloading Functions &gt;&gt;</a>
        </th>
    </tr>
<table>
