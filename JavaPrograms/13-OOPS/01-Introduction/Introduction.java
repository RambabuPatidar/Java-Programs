package com.OOPS.Introduction;

public class Introduction {

    public static void main(String[] args) {
        Student stu1 = new Student();  // stu1 is the reference variable of the class Student and
        // it is called as object when all the properties are bind to it when the constructor called

        stu1.marks  = 10.1231f;     // accessing the data of class Student
        System.out.println(stu1.marks);
    }
    static class Student { // class is a template that behave some sort of like data type
        // this are variables this class contain
        int rollNo;
        String name ;
        float marks;
        //This is a default constructor it is called automatically whenever the object is instantiated
        // but when we define constructor with parameter then it is mandatory to define the default constructor
        public Student(){

        }
        // This is the constructor and whenever this is called the object is created actually.
        public Student(int rollNo, String name, float marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
    }
}
