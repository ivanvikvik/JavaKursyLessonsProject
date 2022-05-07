package by.kursy.vikvik.javalessons.lesson16.controller;

import by.kursy.vikvik.javalessons.lesson16.model.entity.Student;

// Object Initialization
// 1) JVM (default values)
// 2) manual
// 3) constructors (default, with args, ..., copy-constructor)
// 4) fields definition !!!
// 5) init blocks

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Alex", 20, 10, 'm', true);
        Student st2 = new Student(st1);
        Student st3 = new Student();

        System.out.println(st1.getInfo());
        System.out.println(st2.getInfo());
        System.out.println(st3.getInfo());

    }
}
