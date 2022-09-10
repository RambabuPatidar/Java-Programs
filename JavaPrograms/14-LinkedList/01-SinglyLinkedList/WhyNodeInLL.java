package com.Practise;

public class WhyNodeInLL {

    static class Student{
        int age;
        String name;

        public Student() {
        }

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    static class Parent{
        String name;
        int age;
        Student stu; // this.
        public Parent() {
        }

        public Parent(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Student st = new Student();

        Parent parent = new Parent();
        parent.age  = 55;
        parent.name = "KailashChandra Ji";
        // task : we want to connect the Parent to the student object.
        // in simple words we want to store the object of student type in to the
        // parent variable type.
//        something like this as given below
//        parent = st;
//       but you  can not do this because this is not valid to
//      store the student type of object in to the reference variable of
//      type parent

        // To solve the problem we have to introduce the variable of type Student
        // in the template or blueprint of the Parent class. so that the Parent class can
        // actually store the student type object.

//        Student stu; // in the Parent class

//        similarly we want to connect the same type of object in linked list
        // with each other. so to that one node(object of this class) can have some sort of property
        // which it can link to the another node(of the object of same class).
        // To do this we will need the reference variable of same class type in the
        // template or the blueprint of the class. that is why we use Node property in the
        // same class in Linked List.

        // In binary tree we want to connect two nodes to each node so we will use two
        // reference variable of the same class type inside the same class


    }
    // so the node structure will look something like this.
    class Node{
        int data;
        Node next;

        public Node() {
        }
    }
}
