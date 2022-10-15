package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Market;

public class Consumer implements Runnable {
    private boolean running;
    private Market marker;
    private String name;

    public Consumer(Market marker, String name) {
        this.marker = marker;
        running = true;
        this.name = name;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        while (running) {
            marker.get(name);
        }
    }

    public void stop() {
        running = false;
    }
}
