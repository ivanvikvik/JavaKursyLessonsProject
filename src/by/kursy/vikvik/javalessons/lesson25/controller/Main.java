package by.kursy.vikvik.javalessons.lesson25.controller;

import by.kursy.vikvik.javalessons.lesson25.model.Box;
import by.kursy.vikvik.javalessons.lesson25.model.Student;
import by.kursy.vikvik.javalessons.lesson25.model.StudentBox;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setValue(10);
        int n = box1.getValue();
        System.out.println(box1);

        StudentBox box = new StudentBox();
        box.setValue(new Student("Alex", 20, true));
        Student student = box.getValue();
        System.out.println(box);
    }
}
