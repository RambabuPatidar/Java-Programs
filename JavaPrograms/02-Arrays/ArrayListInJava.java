package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInJava {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
