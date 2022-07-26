package by.kursy.vikvik.javalessons.lesson26.studentcomparators.lesson28.controller;

import by.kursy.vikvik.javalessons.lesson26.studentcomparators.lesson28.model.CharWorker;

public class Main {
    public static void main(String[] args) {
        //        String fileName = "c:/test/test.bin";
        String fileName = "c:/test/test.txt";
        //BinaryWorker.write(fileName);
//        System.out.println(BinaryWorker.read(fileName));

        CharWorker.write(fileName);
        System.out.println(CharWorker.read(fileName));

        // & | ^ ~ << >> >>>
    }
}
