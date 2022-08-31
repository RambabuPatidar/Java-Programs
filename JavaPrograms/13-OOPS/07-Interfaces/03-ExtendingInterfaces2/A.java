package com.OOPS.Interfaces.ExtendingInterfaces2;

public interface A {
    // we can have default methods in interfaces and this are provided
    // so that every time we are implements interface in different classes we have not
    // to implement override method.
    default void fun(){
        System.out.println("Hey I am in A");
    }

//    let us see about the static method in interfaces
//    we know that the static method cannot be inherited because if we inherit we have to override
//    that and overriding depends on obect and static doesnot depends on object
//    hence we cannot inherit static method.
//    static interface method should always have a body as static can't be inherited, and if they cannot be inherited they cannot
    // be overridden and they cannot be overridden then we have to provide them body here in interface only.

    static void greet() {
        System.out.println("Hey I am in static method");
    }


}

