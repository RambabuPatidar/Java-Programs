package com.OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;
// this cannot override the method in the super class because the super class method is static
//    @Override
//    static void greeting () {
//        System.out.println("Hello, I am in BoxWeight");
//    }

    BoxWeight () {
//        super(); // This default constructor of the parent class is called automatically even if we don't specify it.
        this.weight = -1;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;

        System.out.println(this.weight); // this line will say does this class has a property named as weight, so yes it has so it will return the weight property of this class.
        // but what if the parent class also has a property named weight then "this.weight" will always refer to the this class weight property.
        // to access the property of the super class we can use:
//        System.out.println(super.weight);
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); // length (l) is private, we can initialise it because super is a parent class constructor.
        this.weight = weight; // but we cannot access it here out of the class.
    }

    public BoxWeight(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other); // as the super constructor of the type Box we can still pass the BoxWeight type. reason is given in Main class NOTE 01
        this.weight = other.weight;
    }
}
