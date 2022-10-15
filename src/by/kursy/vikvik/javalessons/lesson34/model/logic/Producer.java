package by.kursy.vikvik.javalessons.lesson34.model.logic;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Market;

public class Producer implements Runnable {
    private boolean running;
    private Market marker;
    private String name;

    public Producer(Market marker, String name) {
        this.marker = marker;
        running = true;
        this.name = name;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        int product = 0;
        while (running) {
            product++;
            marker.send(product, name);
        }
    }


    public void stop() {
        running = false;
    }
}
