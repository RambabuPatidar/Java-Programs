package com.OOPS.Generics;

public class Main implements GenericInterfaces<Integer> {
    @Override
    public void getValue(Integer value) {
        System.out.println("implemented generic interfaces.");
    }
}
