package by.kursy.vikvik.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;

public class Printer {
    public void print(String text) {
        System.out.print("[");

        try {

            TimeUnit.MILLISECONDS.sleep(100);

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                TimeUnit.MILLISECONDS.sleep(100);
            }

            TimeUnit.MILLISECONDS.sleep(100);

        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
        System.out.println("]");
    }
}
