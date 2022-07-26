package by.kursy.vikvik.javalessons.lesson30.controller;

import by.kursy.vikvik.javalessons.lesson30.model.Serializer;
import by.kursy.vikvik.javalessons.lesson30.model.User;

public class Test {
    public static void main(String[] args) {
//        User user = new User("User", "123", "user", 20, true);
//        Serializer.serialize(user);

        System.out.println(Serializer.deserialize());
    }
}
