package com.OOPS.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice () {
        super();
        this.price = -1;
        System.out.println(super.b); // why it is directly accessing the properties.
    }

    BoxPrice (BoxPrice other ) {
        super(other);
        this.price = other.price;
    }

}
