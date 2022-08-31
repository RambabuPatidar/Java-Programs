package com.OOPS.PackagesStaticBasics.Singleton;

public class Singleton {
    // if we want to create only one object of the class then
    // we can do something is that we only allow the constructor of this
    // class to be used only once
    // this we can do by making this constructor private
    private Singleton () {

    }

    private static Singleton instance; // creating an instance variable of class Singleton

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }



}
