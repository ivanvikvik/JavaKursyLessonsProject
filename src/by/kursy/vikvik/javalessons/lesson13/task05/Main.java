package by.kursy.vikvik.javalessons.lesson13.task05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 65, 7, 9, 5, 32};

//        ArrayList list = new ArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(8);
//        list.add(23);
//        list.add(1);
//
//        for (int i = 0; i < list.size(); i++) {
//            int temp = (int)list.get(i);
//        }

        //        for (int i = 0; i < array.length; i++) {
//            int temp = array[i];
//        }

        for (int temp : array) {
            temp *= 2;
        }

        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
