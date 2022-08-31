package com.OOPS.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rahul = new Human(24, "Rahul Patidar");

//        copying one object in another object using constructor
//        but this method is not efficient method so we will do this by cloning of objects


//        Human nitesh = new Human(rahul);
//        System.out.println(nitesh.age + " " + nitesh.name);

        Human nitesh = (Human)rahul.clone();

        System.out.println(nitesh.age + " " + nitesh.name);
        System.out.println(Arrays.toString(nitesh.arr)); // printing original array

        nitesh.arr[0] = 100;
        // the above statement modified the original array in case of shallow copy
        // and doesn't modifies in case of deep copy
        System.out.println(Arrays.toString(rahul.arr));// printing weather the original array changed or not

        nitesh.age = 100;
        //But the primitives will not be modified in both shallow and deep copy.
        System.out.println(rahul.age);

    }

}
