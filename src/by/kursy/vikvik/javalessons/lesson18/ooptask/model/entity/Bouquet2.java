package by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity;

import by.kursy.vikvik.javalessons.lesson18.ooptask.model.container.FixedArray;

import java.util.ArrayList;

public class Bouquet2 {
    private FixedArray flowers;

    public Bouquet2() {
        flowers = new FixedArray();
    }

    public Bouquet2(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new FixedArray(flowers);
        } else {
            this.flowers = new FixedArray();
        }
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
