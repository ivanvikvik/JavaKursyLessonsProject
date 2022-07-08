package by.kursy.vikvik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public interface Iterator {
    Flower next();
    boolean hasNext();
    void reset();
}
