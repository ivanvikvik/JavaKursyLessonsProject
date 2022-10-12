package by.kursy.vikvik.javalessons.lesson34.controller;

import by.kursy.vikvik.javalessons.lesson34.model.entity.Marker;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Consumer;
import by.kursy.vikvik.javalessons.lesson34.model.logic.Producer;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker();
        new Producer(marker);
        new Consumer(marker);
    }
}
