package by.kursy.vikvik.javalessons.lesson25.model;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public class GBox<T> { //GBox<T, K> {
    private T value;
//    private K value2;

    public GBox() {

    }

    public GBox(T value) {
        this.value = value;
    }
//    public GBox(T value, K value2) {
//        this.value = value;
//        this.value2 = value2;
//    }

//    public K getValue2() {
//        return value2;
//    }
//
//    public void setValue2(K value2) {
//        this.value2 = value2;
//    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
//        return value + "\n" + value2;
        return value + "";
    }
}
