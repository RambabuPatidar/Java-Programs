package com.OOPS.Interfaces.Introduction;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.brake();

        Engine car2 = new Car();
//        car2.a; // this is not accessible  because read below:
        // this also works fine with interfaces also
        // same rule applies here that what is can accesss are determined
        // by the left-hand side and which version of that property it will access will
        // depends on the type of object we have. already covered.



        // lets make an reference type of Media and stops out media player

//        Media carMedia = new Car();
//        carMedia.stop();
        // here is the problem we want our engine to be stopped but it is stoping our engine. hahha.
        // so to solve this problem we can make different classes for individual interfaces.

        NiceCar car = new NiceCar();
        car.start();
        car.playSong();
        car.stop();
        car.accelerateEngine();
        car.upgradeEngine();
        car.stop();
        car.stopSong();

    }
}
