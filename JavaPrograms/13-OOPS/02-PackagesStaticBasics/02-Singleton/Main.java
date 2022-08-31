package com.OOPS.PackagesStaticBasics.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // now as many times we will call the getInstance() it will return the
        // same object which is created inside the class definition i.e. instance
        System.out.println(obj + "\n" + obj2 + "\n" + obj3);
    }
}
