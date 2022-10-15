package by.kursy.vikvik.javalessons.lesson34.model.entity;

public class Market extends Object {
    private int product;
    private boolean empty;

    public Market() {
        empty = true;
    }

    public synchronized boolean isEmpty() {
        return empty;
    }

    public synchronized void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public synchronized void send(int product) {
        if (!empty) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.err.println(exception);
            }
        }

        this.product = product;
        System.out.println("Producer sends --> " + product); // debug
        empty = false;
        notify();
    }

    public synchronized int get() {
        if (empty){
            try {
                wait();
            } catch (InterruptedException exception) {
                System.err.println(exception);
            }
        }

        System.out.println("Consumer gets <-- " + product); // debug
        empty = true;
        notify();
        return product;
    }
}
