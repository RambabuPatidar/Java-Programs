package com.OOPS.Inheritance;

// final classes can't be inherited.
// if a class is final all the methods are final implicitly
public class Box {
    private double l;
    double b;
    double h;

//    double weight;
    // this method can't be overridden by any method in its child classes.
    // because it is static.
    // but static method will get inherited in their child classes.
    static void greeting () {
        System.out.println("Hello!, I am in the Box class.");
    }

    Box () {
        // super keyword call the constructor of the class directly above it.
//        super();// Object class
        l = -1;
        b = -1;
        h = -1;
    }

    Box (double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

     Box (Box box) {
        this.l = box.l;
        this.b = box.b;
        this.h = box.h;
     }

    public void information () {
        System.out.println("Running the Box");
    }
}
