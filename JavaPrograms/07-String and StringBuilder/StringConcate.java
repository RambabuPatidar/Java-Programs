package com.StringsAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class StringConcate {
    public static void main(String[] args) {

        // The idea is that:
        // if one of the argument of the println method is string then take whatever to add and
        //  print it in the form of string
        // but when we have all the non-primitive data types in the argument
        // then the + can't be overloaded to add
        System.out.println("rambabu" + 12);
        System.out.println("Rambabu " +"Patidar");
        System.out.println('a' + 12);
        System.out.println("num" + 54.233);
        System.out.println("Rambab" + 'u');
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(123);
        System.out.println("List" + list);
        System.out.println(Arrays.toString(new int[]{1,2,3,4}) + "" + list);

    }
}
