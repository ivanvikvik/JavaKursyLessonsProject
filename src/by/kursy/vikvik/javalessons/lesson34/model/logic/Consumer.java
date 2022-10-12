package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Marker;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private boolean running;
    private Marker marker;

    public Consumer(Marker marker) {
        this.marker = marker;
        running = true;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (running) {
            marker.get();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }

    public void stop() {
        running = false;
    }
}
