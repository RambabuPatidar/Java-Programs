package com.OOPS.Interfaces.Introduction;
// # a class can implements many interfaces;
// # a class  and abstract class can extends only one class
// # a interface can extend many interfaces
// # an interface cannot extend to class (does not make sense
//   because class can contain a method with body but the interface
//   doesn't allow to have body. that is it keeps only the abstract
//   classes)

public class Car implements  Engine, Brake, Media{


    int a;
    @Override
    public void brake() {
        System.out.println("I brake like normal cars");
    }

    @Override
    public void start() {
        System.out.println("I start engine like normal cars");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal cars");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal cars");
    }

}
