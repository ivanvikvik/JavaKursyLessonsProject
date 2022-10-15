package by.kursy.vikvik.javalessons.lesson34.controller;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Marker;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Consumer;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Marker marker = new Marker();
        new Producer(marker);
        TimeUnit.MILLISECONDS.sleep(10);
        new Consumer(marker);

        Object o = new Object();

    }
}
