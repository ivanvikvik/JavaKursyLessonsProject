package by.kursy.vikvik.javalessons.lesson23.ooptask.entity;

public class Chamomile extends Flower {
    private int petalCount;

    // default constructor
    public Chamomile() {
    }

    // constructor with params #1
    public Chamomile(String name, String color, double price, double weight, int length, int petalCount) {
        super(name, color, price, weight, length);
        this.petalCount = petalCount;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        if (petalCount > 0) {
            this.petalCount = petalCount;
        }
    }

    @Override
    public String toString() {
        return "Chamomile: " + super.toString() + ", petalCount = " + petalCount;
    }
}
