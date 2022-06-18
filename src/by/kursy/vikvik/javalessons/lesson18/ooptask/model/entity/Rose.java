package by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity;

public class Rose extends Flower {
    private double lengthOfThorn;

    public double getLengthOfThorn() {
        return lengthOfThorn;
    }

    public void setLengthOfThorn(double lengthOfThorn) {
        if (lengthOfThorn > 0) {
            this.lengthOfThorn = lengthOfThorn;
        }
    }
}
