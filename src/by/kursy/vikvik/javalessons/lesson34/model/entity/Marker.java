package by.kursy.vikvik.javalessons.lesson34.model.entity;

public class Marker {
    private int product;
    private boolean empty;

    public Marker() {
        empty = true;
    }

    public synchronized void send(int product) {
        if (empty) {
            this.product = product;
            System.out.println("Producer sends --> " + product); // debug
            empty = false;
        }
    }

    public synchronized int get() {
        if (!empty) {
            System.out.println("Consumer gets <-- " + product); // debug
            empty = true;
        }
        return product;
    }
}
