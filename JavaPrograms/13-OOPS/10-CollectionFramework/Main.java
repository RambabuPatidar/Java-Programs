package com.OOPS.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        List<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(78);
        vector.add(84);
        vector.add(100);

        System.out.println(vector);

    }

}

