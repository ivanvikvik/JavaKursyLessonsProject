package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Marker;

public class Consumer implements Runnable {
    private boolean running;
    private Marker marker;

    public Consumer(Marker marker){
        this.marker = marker;
        running = true;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(running){
            marker.get();
        }
    }

    public void stop(){
        running = false;
    }
}
