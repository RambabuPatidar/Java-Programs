package com.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();

        //overriding is happens when the variable type is of the super class and the object instance is of the child class.
        // Parent variable = new Child();
        // and as we know that the variable is the one who determine that what properties it can access and yes it is true
        // and in this example we know that Shape square can access the members of the Shape class only
        //i.e. the area() method since we have many method named area() which method should it call is dependent on the object in right-hand side.
        Shapes square = new Square();
        square.area();

        //one main point is also that overriding happens when we have methods have all the thing i.e. order, return type, number of parameter are same.
        // only the body part of the method is different.
        // overriding happens at the runtime that's why we call it as a runtime / Dynamic polymorphism

    }
}
