package com.StringsAndStringBuilder;

import java.sql.SQLOutput;
// what is string
// how comparator is different than .equals() method
// see the video for the memory management of the string
public class Strings {
    public static void main(String[] args) {
        int a = 20;
        int[] arr = {1, 2, 3, 4, 5, 6,7};
//        "Rambabu Patidar"

        String name = "Rambabu Patidar";
        String name2 = "Rambabu Patidar";
        System.out.println(name2);
        System.out.println(name);
        // this will compare the reference and values both
        // if we want to compare the values than use .equal() method
        System.out.println(name == name2);
//        name2 = "rambabu Patidar";
        System.out.println(name2);

        System.out.println(name.equals(name2));

        String a1 = new String("Rambabu");
        String a2 = new String("Rambabu");
        System.out.println(a1.equals(a2));
    }
}
