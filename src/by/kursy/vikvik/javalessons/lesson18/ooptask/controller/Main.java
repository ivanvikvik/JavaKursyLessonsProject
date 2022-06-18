package by.kursy.vikvik.javalessons.lesson18.ooptask.controller;

import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.Flower;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.Rose;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.Chamomile;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower[] flowers = new Flower[10];

        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Rose();
        }
        double total = 0;

        for (int i = 0; i < flowers.length; i++) {
            total += flowers[i].getPrice();
        }
//        Object o = new Flower();
//        Flower flower = (Flower) o;
//        Rose rose = (Rose)o;
        //System.out.println(rose.getLengthOfThorn());

//
//        Flower flower = new Rose();
//        Rose rose = (Rose) flower;
//        System.out.println(rose.getLengthOfThorn());
    }
}
