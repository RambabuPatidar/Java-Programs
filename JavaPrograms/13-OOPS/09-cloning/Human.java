package com.OOPS.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 1, 0, 9, 1};
    }

    public Human() {
        super();
    }

//    this is not required now
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

//    public Object clone() throws CloneNotSupportedException {
//        // This will make shallow copy of the object. what is shallow copy see Notes.
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        // Deep copy:

        Human twin = (Human)super.clone(); // this is actually a shallow copy

        // make deep copy;

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
