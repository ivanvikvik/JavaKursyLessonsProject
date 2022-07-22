package by.kursy.vikvik.javalessons.lesson18.ooptask.controller;

import by.kursy.vikvik.javalessons.lesson18.ooptask.model.container.SingleList;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.*;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.exception.TechnicalFlowerException;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.logic.ShopAssistance;

public class Main {
    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.add(new Flower());
//
//        TechnicalFlowerException exception;
//
//        Exception exc1 = exception.getCause();
//        Exception exc2 = exc1.getCause();


        System.out.println(list.get(0));

//        Flower[] flowers = new Flower[10];
//
//        for (int i = 0; i < 5; i++) {
//            flowers[i] = new Rose("Pink Panther", "Pink", 3.5, 78, 200, 1.5);
//        }
//
//        for (int i = 5; i < flowers.length; i++) {
//            flowers[i] = new Chamomile("Pink Panther", "Pink", 3.5, 78, 70, 11);
//        }
//
//        Bouquet4 bouquet = new Bouquet4(flowers);
//        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet);
//        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet);
//
//        System.out.println(bouquet);
//        System.out.println("Total price: " + totalPrice);
//        System.out.println("Total weight: " + totalWeight);
    }
}
