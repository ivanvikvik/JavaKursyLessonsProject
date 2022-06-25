package by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.TheStrategyPattern;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public interface FlowersComparable {
    boolean compare(Flower flower1, Flower flower2);
}
