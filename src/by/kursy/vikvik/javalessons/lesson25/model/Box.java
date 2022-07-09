package by.kursy.vikvik.javalessons.lesson25.model;

public class Box {
    private Object value;

    public Box() {
    }

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
