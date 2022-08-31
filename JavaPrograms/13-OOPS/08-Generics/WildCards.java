package com.OOPS.Generics;

import java.util.Arrays;
import java.util.List;

// Here T should either be Number itself or it can be its subclass
// we do this to make type more restrict.
// Number is super class of Integer, Float, Double, etc.
// so we can have all this class at place of T but not other than Number class for ex: String will not work.
public class WildCards<T extends Number> { // changed only this line in code.

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    int size = 0;

    public WildCards() {
        this.data =  new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list){
        // here we can only pass Number type, and not the type subclasses of Number type.
        // if we want to do that we can do it via
        // (List<? extends Number> list){...}
    }

    public void add(T num ) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // now we want to put all the items of data into temp;

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public T remove() {
        T value = (T)(data[--size]); // Here we will require the type casting because T is of smaller type than the Object.
        data[size] = null; // if we don't put this line we will still able to see that object what are destroyed in the data array.
        return value;
    }
    public void set(int index, T val) {
        data[index] = val; // here we don't require the type casting because data is of type Object and T is less suprior that Object
        // so we can easily put T in Object data type.

    }

    public T get(int index ) {
        return (T)data[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList();

        // but the built-in arraylist provide us to have different data types in it
        // but what we made below is only of type int we cannot store float, objects, strings and all other things
        // this is where generics come in handy. It provides us parameterized datatype. 
//        CustomGenArrayList list = new CustomGenArrayList();
//        for (int i = 0; i < 12; i++) {
//            list.add(i+1);
//        }
//        System.out.println(list);

        WildCards<Integer> list = new WildCards<>();

        for (int i = 0; i < 14; i++) {
            list.add(i+1);
        }

        list.remove();
        System.out.println(list);
    }
}
