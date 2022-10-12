package by.kursy.vikvik.javalessons.lesson34.model.entity;

public class Marker {
    private int product;

    public synchronized void send(int product) {
        this.product = product;
        System.out.println("Producer sends --> " + product);       // debug
    }

    public synchronized int get(){
        System.out.println("Consumer gets <-- " + product);       // debug
        return product;
    }
}
