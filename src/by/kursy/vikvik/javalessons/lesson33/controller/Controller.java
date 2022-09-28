package by.kursy.vikvik.javalessons.lesson33.controller;

import by.kursy.vikvik.javalessons.lesson33.model.Printer;
import by.kursy.vikvik.javalessons.lesson33.model.Writer;

public class Controller {
    public static void main(String[] args) {
        Printer printer = new Printer();

        int count = 5;
        Writer[] writers = new Writer[count];
        String[] texts = {"first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < writers.length; i++) {
//            writers[i] = new Writer(texts[i], printer);
            writers[i] = new Writer(texts[i]);
        }

        try {
            for (int i = 0; i < writers.length; i++) {
                writers[i].getThread().join();
            }
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }

    }
}
