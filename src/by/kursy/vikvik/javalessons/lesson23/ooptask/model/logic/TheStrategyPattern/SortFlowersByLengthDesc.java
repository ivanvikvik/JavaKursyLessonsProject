package by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.TheStrategyPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public class SortFlowersByLengthDesc implements FlowersComparable {

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getLength() < flower2.getLength();
    }
}
