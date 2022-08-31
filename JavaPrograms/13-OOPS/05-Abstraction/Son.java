package com.OOPS.Abstraction;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
        System.out.println("overriding the Parent methode like normal overriding.");
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " she is " + age );
    }
}
