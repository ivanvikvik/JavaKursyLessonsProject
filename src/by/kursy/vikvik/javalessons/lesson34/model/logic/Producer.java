package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Market;

public class Producer implements Runnable {
    private boolean running;
    private Market marker;

    public Producer(Market marker) {
        this.marker = marker;
        running = true;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int product = 0;
        while (running) {
            product++;
            marker.send(product);
        }
    }


    public void stop() {
        running = false;
    }
}
