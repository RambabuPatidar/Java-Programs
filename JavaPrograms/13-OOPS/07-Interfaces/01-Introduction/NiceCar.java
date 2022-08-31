package com.OOPS.Interfaces.Introduction;

public class NiceCar {
    private Engine engine;
    private Media player = new MediaPlayer();

    public NiceCar ( ) {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void playSong() {
        player.start();
    }

    public void stopSong() {
        player.stop();
    }

    public void accelerateEngine( ) {
        engine.acc();
    }

    public void upgradeEngine( ) {
        System.out.println("Engine changed");
        this.engine = new ElectricEngine();
    }

}
