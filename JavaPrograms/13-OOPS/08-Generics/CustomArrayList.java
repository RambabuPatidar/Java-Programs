package com.OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    int size = 0;

    public CustomArrayList() {
        this.data =  new int[DEFAULT_SIZE];
    }

    public void add(int num ) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int[data.length * 2];

        // now we want to put all the items of data into temp;

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public int remove() {
        int value = data[--size];
        data[size] = 0;
        return value;
    }
    public void set(int index, int val) {
        data[index] = val;
    }

    public int get(int index ) {
        return data[index];
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
        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 12; i++) {
            list.add(i+1);
        }

        System.out.println(list);

    }
}
