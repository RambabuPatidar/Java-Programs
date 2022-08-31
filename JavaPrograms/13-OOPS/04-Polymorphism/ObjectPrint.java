package com.OOPS.Polymorphism;

public class ObjectPrint {
    int num;
    String name;

    public ObjectPrint(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    // this overriding the method from Object class.(object class is internally the parent class of every class so that we do not have to explicitly inherit the Object class.



    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(1000, "Rambabu Patidar");
        System.out.println(obj);
    }
}
