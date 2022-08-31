package com.OOPS.Interfaces.ExtendingInterfaces2;

public class Main implements A, B {

//    since interface A method is default it will not generate error if we will skip this method here
    // but if this method is defined here then the obvious this method will be give priority
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
        obj.fun(); // this class method is givem more priority than the default in the interface A

        A.greet(); // we can access it directly with interface.

    }
}
