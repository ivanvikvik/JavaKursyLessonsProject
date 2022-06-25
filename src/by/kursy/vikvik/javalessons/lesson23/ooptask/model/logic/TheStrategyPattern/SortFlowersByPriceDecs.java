package by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.TheStrategyPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public class SortFlowersByPriceDecs implements FlowersComparable {
    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getPrice() < flower2.getPrice();
    }
}
