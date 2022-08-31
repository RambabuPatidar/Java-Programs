package com.OOPS.Generics.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

//        System.out.println(list);

//        list.forEach((num)-> System.out.print(num*2 + " "));

//        Consumer<Integer> fun = (num)-> System.out.print(num*2 + " ");

//        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;

        Main myCalculator = new Main();
        System.out.println(myCalculator.operate(3, 4, sum)+ " "
                + myCalculator.operate(3, 4, prod) + " "
                + myCalculator.operate(3, 4, sub));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    //Normally we write a function definition as follows :
    static int addition(int a, int b) {
        return a + b;
    }
}


