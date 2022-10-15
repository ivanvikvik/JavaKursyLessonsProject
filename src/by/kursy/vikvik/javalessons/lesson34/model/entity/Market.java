package by.kursy.vikvik.javalessons.lesson34.model.entity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Market extends Object {
    private BlockingQueue<Integer> queue;

    public Market() {
        queue = new ArrayBlockingQueue<>(2);
    }

    public void send(int product, String name) {
        try {
            queue.put(product);
            System.out.printf("Producer %s sends --> %d\n", name, product); // debug
        } catch (InterruptedException exception) {
            System.err.println(exception);
        }
    }

    public int get(String name) {
        int product = 0;
        try {
            product = queue.take();
            System.out.printf("Consumer %s gets <-- %d\n", name, product); // debug
        } catch (InterruptedException exception) {
            System.err.println(exception);
        }
        return product;
    }
}
