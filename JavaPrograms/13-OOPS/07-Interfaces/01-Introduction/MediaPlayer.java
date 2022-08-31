package com.OOPS.Interfaces.Introduction;

public class MediaPlayer implements Media{


    @Override
    public void start() {
        System.out.println("starting Music");
    }

    @Override
    public void stop() {
        System.out.println("stopped Music");
    }
}
