package by.kursy.vikvik.javalessons.lesson29.controller;

import by.kursy.vikvik.javalessons.lesson29.model.Bouquet;
import by.kursy.vikvik.javalessons.lesson29.model.Flower;
import by.kursy.vikvik.javalessons.lesson29.model.NumberParser;
import by.kursy.vikvik.javalessons.lesson29.util.FlowerBinaryParser;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //int number = Integer.MAX_VALUE;
        //NumberParser.writeIntegerNumber(number);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(NumberParser.readIntegerNumber());

//        String fileName = "c:/test/flower.bin";
//
//        Flower flower = new Flower("Rose", "White", 5.5, 0.3, 150);
//
//        FlowerBinaryParser.writeFlower(fileName, flower);
//
//        System.out.println(FlowerBinaryParser.readFlower(fileName));

        String fileName = "c:/test/bouquet.bin";
        Bouquet bouquet = new Bouquet();
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));
        bouquet.add(new Flower("Rose", "White", 5.5, 0.3, 150));

        FlowerBinaryParser.writeBouquet(fileName, bouquet);

//        System.out.println(FlowerBinaryParser.readBouquet(fileName));

    }
}
