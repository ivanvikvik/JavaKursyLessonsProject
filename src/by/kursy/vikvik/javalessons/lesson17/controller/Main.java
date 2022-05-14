package by.kursy.vikvik.javalessons.lesson17.controller;

import by.kursy.vikvik.javalessons.lesson17.model.Student;

public class Main {
    public static int test(int n)
    {
        n += 10;
        return n;
    }

    public static Student test(Student s)
    {
        s = new Student("Alex", 19, 9, true);
        return s;
    }

    public static void main(String[] args) {
//        int x = 10;
//        System.out.println("Before x = " + x);
//        x = test(x);
//        System.out.println("After x = " + x);

        System.out.println(-17 | 0b10000);
        Student s = new Student();
        s.setName("Kate");
        System.out.println("Before name = " + s.getName());
        s = test(s);
        System.out.println("After name = " + s.getName());

    }
}
