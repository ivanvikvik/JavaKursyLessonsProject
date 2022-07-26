package by.kursy.vikvik.javalessons.lesson29and30.controller;

import by.kursy.vikvik.javalessons.lesson29and30.model.Bouquet;
import by.kursy.vikvik.javalessons.lesson29and30.model.Chamomile;
import by.kursy.vikvik.javalessons.lesson29and30.model.Flower;
import by.kursy.vikvik.javalessons.lesson29and30.model.Rose;
import by.kursy.vikvik.javalessons.lesson29and30.util.BouquetParser;
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

        bouquet.add(new Rose("Rose", "White", 5.5, 0.3, 100, 2.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Rose("Rose", "Red", 3.5, 0.3, 50, 2.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Rose("Rose", "Yellow", 7.0, 0.2, 170, 3.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Rose("Rose", "Blue", 8.5, 0.1, 120, 4.0));
        bouquet.add(new Rose("Rose", "Black", 15.0, 0.4, 150, 5.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));

        String fileName = "c:/test/bouquet.txt";

      // BouquetParser.writeBouquet(fileName, bouquet);

        System.out.println(BouquetParser.readBouquet(fileName));

//         FlowerCharParser.writeBouquet(fileName, bouquet);

//        System.out.println(FlowerCharParser.readBouquet(fileName));

//        FlowerBinaryParser.writeBouquet(fileName, bouquet);

//        System.out.println(FlowerBinaryParser.readBouquet(fileName));

    }
}
