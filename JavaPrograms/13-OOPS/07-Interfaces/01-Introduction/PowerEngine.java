package com.OOPS.Interfaces.Introduction;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Started Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerated");
    }
}
