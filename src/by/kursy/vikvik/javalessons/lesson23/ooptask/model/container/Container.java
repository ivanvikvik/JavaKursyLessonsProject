package by.kursy.vikvik.javalessons.lesson23.ooptask.model.container;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

//public abstract class Container {
//    public abstract boolean isEmpty();
//}

public interface Container {
    boolean isEmpty();
    int size();
    Flower get(int index);
    void set(int index, Flower flower);
    void add(Flower flower);
    void remove(int index);
}