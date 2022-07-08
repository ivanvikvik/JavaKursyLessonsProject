package by.kursy.vikvik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.FixedArray;

public class FixedArrayIterator implements Iterator{
    private FixedArray array;
    private int current = 0;

    public FixedArrayIterator(FixedArray fixedArray){
        array = fixedArray;
    }

    @Override
    public Flower next() {
        return array.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
        if (!flag) {
            current = 0;
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
