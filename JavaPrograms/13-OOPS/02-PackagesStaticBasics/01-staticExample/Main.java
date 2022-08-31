package com.OOPS.PackagesStaticBasics.staticExample;

public class Main {
    public static void main(String[] args) { // this is the main Method


    }

    static void greeting(){
        System.out.println("Hello! I am Rambabu");
//         fun(); // An static method cannot reference to the non-static context method.
        // In simple words a method who does not require an object instance to run
        // can not call a method who require an object instance to be run
    }

    void fun2() {
         // and the non-static can also call the non-static method
        // as it already be known that whenever the outer method will
        // be run it will be having it object instance because it will be called
        // from the main function from where our program start to run
        // and that methode is static method so will definitely 100% require
        // object instance to call this non-method from static context;
        fun();
    }

    void fun() {
        // but a non-static method can call the static methode
        System.out.println("Java is Fun");
        greeting();
    }
}
