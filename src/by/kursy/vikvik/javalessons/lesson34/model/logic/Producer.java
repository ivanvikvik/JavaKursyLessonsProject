package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Marker;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private boolean running;
    private Marker marker;

    public Producer(Marker marker){
        this.marker = marker;
        running = true;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int product = 0;
        while(running){
            if (marker.isEmpty()) {
                product++;
                marker.send(product);
                marker.setEmpty(false);
            }
        }

    }

    public void stop(){
        running = false;
    }
}
