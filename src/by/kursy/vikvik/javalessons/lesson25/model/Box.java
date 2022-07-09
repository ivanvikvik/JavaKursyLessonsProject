package by.kursy.vikvik.javalessons.lesson25.model;

public class Box {
    private int value;

    public Box() {
    }

    public Box(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
