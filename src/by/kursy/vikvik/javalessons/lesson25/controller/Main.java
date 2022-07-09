package by.kursy.vikvik.javalessons.lesson25.controller;

import by.kursy.vikvik.javalessons.lesson25.model.*;

class A {

}


class B {

}

public class Main {
//
//    public static int sum(A a, A b){
//        return a + b;
//    }

    public static void main(String[] args) {
//        int s = sum(6, 5);
//        FloatBox floatBox = new FloatBox();
//        floatBox.setValue("This is string object");
//
//        Box box1 = new Box();
//        box1.setValue(10);
//        int n = (int)box1.getValue();
//        System.out.println(box1);
//
//        Box box = new Box();
//        box.setValue(new Student("Alex", 20, true));
//        box.setValue("This is string object");
//        box.setValue(new Object());
//        box.setValue(10);
//
//        Object obj = box.getValue();
//
//        if (obj instanceof Student) {
//            Student student = (Student) obj;
//            //...
//        } else if (obj instanceof String) {
//            String str = (String)obj;
//        } else if (obj instanceof Integer) {
//            Integer integer = (Integer)obj;
//        } else {
//            // object....
//        }
//
//        System.out.println(box);

        GBox<Integer> ibox = new GBox<>();
        ibox.setValue("This is string");

        GBox<String> sbox = new GBox<>();
        sbox.setValue(10);


    }
}
