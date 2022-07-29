package by.kursy.vikvik.javalessons.lesson31.controller;

import by.kursy.vikvik.javalessons.lesson31.model.A;
import by.kursy.vikvik.javalessons.lesson31.model.B;
import by.kursy.vikvik.javalessons.lesson31.model.Serializer;

public class Test {
    public static void main(String[] args) {
        B b = new B(10);

        b.id = 10;
        b.name = "B";
        b.value = 1.5;
        b.field = 20;
        b.flag = true;

       //Serializer.serialize(b);

       System.out.println(Serializer.deserialize());
    }
}
