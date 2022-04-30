package by.kursy.vikvik.javalessons.lesson16.controller;

import by.kursy.vikvik.javalessons.lesson16.model.entity.Student;

// Object Initialization
// 1) JVM (default values)
// 2) manual
// 3) constructors (default, with args, ...)
// 4)
// 5)

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 'm', true);
        System.out.println(student.getInfo());
    }
}
