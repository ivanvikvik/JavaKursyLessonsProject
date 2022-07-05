package by.kursy.vikvik.javalessons.lesson23.ooptask.controller;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Bouquet;
import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Chamomile;
import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;
import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Rose;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.FixedArray;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.SingleList;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.FlowerSorter;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.ShopAssistance;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.TheStrategyPattern.SortFlowersByPriceAcs;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.logic.TheStrategyPattern.SortFlowersByPriceDecs;

import java.util.Random;


public class Main {
    public static final double MIN_PRICE = 1.0;
    public static final double MAX_PRICE = 10.0;


    public static void main(String[] args) {

        Flower[] flowers = new Flower[10];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE;
            price = Double.parseDouble(String.format("%.2f", price));
            flowers[i] = new Rose("Pink Panther", "Pink", price, 78, 200, 1.5);
        }

        for (int i = 5; i < flowers.length; i++) {
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE;
            price = Double.parseDouble(String.format("%.2f", price));
            flowers[i] = new Chamomile("Pink Panther", "Pink", price, 78, 70, 11);
        }

        Bouquet bouquet = new Bouquet(flowers);
        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet);
        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet);

        System.out.println(bouquet);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total weight: " + totalWeight);

        System.out.println("After sorting:");
        FlowerSorter.bubbleSort(bouquet, new SortFlowersByPriceAcs());
        System.out.println(bouquet);

        System.out.println("After sorting:");
        FlowerSorter.bubbleSort(bouquet, new SortFlowersByPriceDecs());
        System.out.println(bouquet);

    }
}
