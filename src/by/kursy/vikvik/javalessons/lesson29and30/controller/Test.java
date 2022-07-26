package by.kursy.vikvik.javalessons.lesson29and30.controller;

import by.kursy.vikvik.javalessons.lesson29and30.model.Bouquet;
import by.kursy.vikvik.javalessons.lesson29and30.model.Flower;
import by.kursy.vikvik.javalessons.lesson29and30.util.FlowerBinaryParser;
import by.kursy.vikvik.javalessons.lesson29and30.util.FlowerCharParser;

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

//        String fileName = "c:/test/bouquet.bin";
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

        String fileName = "c:/test/bouquet.txt";

       // FlowerCharParser.writeBouquet(fileName, bouquet);

        System.out.println(FlowerCharParser.readBouquet(fileName));

//        FlowerBinaryParser.writeBouquet(fileName, bouquet);

//        System.out.println(FlowerBinaryParser.readBouquet(fileName));

    }
}
