package by.kursy.vikvik.javalessons.lesson34.model.entity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Market extends Object {
    private BlockingQueue<Integer> queue;

    public Market() {
        queue = new ArrayBlockingQueue<>(1);
    }

    public void send(int product) {
        try {
            queue.put(product);
            System.out.println("Producer sends --> " + product); // debug
        } catch (InterruptedException exception) {
            System.err.println(exception);
        }
    }

    public int get() {
        int product = 0;
        try {
            product = queue.take();
            System.out.println("Consumer gets <-- " + product); // debug
        } catch (InterruptedException exception) {
            System.err.println(exception);
        }
        return product;
    }
}
