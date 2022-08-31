package com.OOPS.Abstraction;

// abstract classes can't be final classes because we want the methods to override
// for that I must need inheritance to be happened, but the final classes can't be inherited.
// final public abstract class Parent{...} // this is wrong.blunder.

public abstract class Parent {

    int age; // we can have normal variable in the abstract class.

    public Parent(int age) {
        this.age = age;
    }

//    abstract public Parent(); // abstract public contructor cannot be in abstract class.

    abstract void career(String name);

    abstract void partner(String name, int age);




    // but we can create static methods because we know that static methods doesn't
    //depends on the object of the class.
    // and abstract class cannot have an objects. Hence,we can directly access static classes with class name
    static void helloWorld() {
        System.out.println("Hello World!");
    }

    // we can also create a normal method in abstract class
    void normal() {
        System.out.println("This is a normal method");
    }

}
