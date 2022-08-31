package com.OOPS.Generics.ComparingObj;
// we have to implement Comparable interface to compare objects because when
// object will have more than one member than it will get confused with which data
//you want me to compare like in our example should we want to compare it with rollNo or
// with marks. since
// and since the Comparable is an interface it contain an compareTo() abstract method
// so we should implement this here.

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return rollNo + "";
    }
}
