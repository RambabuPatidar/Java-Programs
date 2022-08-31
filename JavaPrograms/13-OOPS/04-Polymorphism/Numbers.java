package com.OOPS.Polymorphism;

public class Numbers {
    // this is known as method overloading.
    //and which one is to call is dependent to the number of parameter we passed and at the time of compile time.
    //which is known as static/compile time polymorphism.
    // The type checking and which function to call is done at the time of compilation
    //so this is called compile time polymorphism
    int add(int a, int b) {
        return a + b;
    }

    int add( int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers object = new Numbers();
        System.out.println(object.add(1,2));

        System.out.println(object.add(1, 2, 4));
    }
}
