package com.OOPS.Generics.ComparingObj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ram = new Student(67, 83.54f);
        Student kunal = new Student(34, 89.98f);
        Student abhishek = new Student(32, 84.98f);
        Student balram = new Student(30, 85.98f);
        Student deepak = new Student(2, 88.98f);


//        int diff = ram.compareTo(kunal);
//        if(diff < 0) {
//            System.out.println("Kunal has more marks.");
//        } else if( diff == 0) {
//            System.out.println("Ram and Kunal has same marks");
//        } else{
//            System.out.println("Ram has more marks");
//        }


        Student[] listOfStudent = {ram, kunal, abhishek, balram , deepak};
        System.out.println(Arrays.toString(listOfStudent));

        Arrays.sort(listOfStudent, new Comparator<Student>() {// it is giving me suggestion to replace it with lambda expression.
            // so let's study lambda expressions.
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollNo - o2.rollNo;
            }
        });

        System.out.println(Arrays.toString(listOfStudent));

    }
}
