package com.OOPS.Interfaces.ExtendingInterfaces;
// for class to interface inheritance we use implements keywords.
// since B interface extends A we have to implement the the fun method also
// which is in A interface.
public class Main implements B{

    @Override
    public void fun() {
        System.out.println("Hello I am having fun");
    }

    @Override
    public void greeting() {
        System.out.println("Hello I am Rambabu ");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greeting();
    }
}
