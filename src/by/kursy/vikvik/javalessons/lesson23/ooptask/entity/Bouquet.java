package by.kursy.vikvik.javalessons.lesson23.ooptask.entity;

import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.Container;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.DynamicArray;

public class Bouquet {
    private Container flowers;

    public Bouquet() {
        flowers = new DynamicArray();
    }

    public Bouquet(Flower[] flowers) {
        this();
        if (flowers != null) {
            for (int i = 0; i < flowers.length; i++) {
                this.flowers.add(flowers[i]);
            }
        }
    }

    public Bouquet(Container flowers) {
        this.flowers = flowers;
    }

    public int size() {
        return flowers.size();
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        }
        return null;
    }

    public void set(int index, Flower flower) {
        flowers.set(index, flower);
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(int index) {
        flowers.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of flowers:");

        for (int i = 0; i < flowers.size(); i++) {
            builder.append("\n").append(flowers.get(i));
        }
        return builder + "";
    }
}