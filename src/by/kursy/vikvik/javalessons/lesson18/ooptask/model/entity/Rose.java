package by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity;

public class Rose extends Flower {
    private double lengthOfThorn;

    public Rose() {

    }

    public Rose(String name, String color, double price, double weight, int length, double lengthOfThorn) {
        super(name, color, price, weight, length);
        this.lengthOfThorn = lengthOfThorn;
    }

    public double getLengthOfThorn() {
        return lengthOfThorn;
    }

    public void setLengthOfThorn(double lengthOfThorn) {
        if (lengthOfThorn > 0) {
            this.lengthOfThorn = lengthOfThorn;
        }
    }

    @Override
    public String toString() {
        return "Rose: " + super.toString() + ", lengthOfThorn = " + lengthOfThorn;
    }
}
