package com.OOPS.Interfaces.Introduction;

public interface Engine {
    // members of interface are public access , final variables, static types;
    public final static int PRICE = 78000;

    // interfaces can only contain abstract methods, concrete methods are not allowed.
    // like commented one
//    void greeting() {
//        System.out.println();
//    }
    void start();
    void stop();
    void acc();
}
