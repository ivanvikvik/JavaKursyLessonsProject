package by.kursy.vikvik.javalessons.lesson34.controller;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Market;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Consumer;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();

        String[] strings = {"first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < 3; i++) {
            new Producer(market, strings[i]);
        }


        for (int i = 0; i < strings.length; i++) {
            new Consumer(market, strings[i]);
        }

    }
}
