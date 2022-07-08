package by.kursy.vikvik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.DynamicArray;

public class DynamicArrayIterator implements Iterator {
    private DynamicArray array;
    private int current = 0;

    public DynamicArrayIterator(DynamicArray array) {
        this.array = array;
    }

    @Override
    public Flower next() {
        return array.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
        if (!flag) {
            reset();
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
