package by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Bouquet;
import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

public class FlowerSorter {
    public static void bubbleSortByPriceAsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getPrice() > bouquet.get(j + 1).getPrice()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }

    public static void bubbleSortByPriceDesc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getPrice() < bouquet.get(j + 1).getPrice()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }
    public static void bubbleSortByLengthAsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getLength() > bouquet.get(j + 1).getLength()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }

    public static void bubbleSortByLengthDesc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getLength() < bouquet.get(j + 1).getLength()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }
}
