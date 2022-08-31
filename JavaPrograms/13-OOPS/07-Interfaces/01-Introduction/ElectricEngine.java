package com.OOPS.Interfaces.Introduction;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Started electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopped electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Power electric accelerated");
    }
}
