package by.kursy.vikvik.javalessons.lesson16.controller;

import by.kursy.vikvik.javalessons.lesson16.model.entity.Student;

// Object Initialization
// 1) JVM (default values)
// 2) manual
// 3) constructors (default, with args, ...)
// 4) fields definition !!!
// 5) init blocks

public class Main {

    public static void main(String[] args) {
        //Student st2 = new Student("Alex", 20, 'm', true);
        //st2.name = "Alex";
        Student st1 = new Student();
        Student st2 = new Student("Alex", 20, 10, 'm', true);

        System.out.println(st1.hashCode());
        st1.testing(); //--> Student.testing(this = st1);
        System.out.println();
        System.out.println(st2.hashCode());
        st2.testing();
    }
}
