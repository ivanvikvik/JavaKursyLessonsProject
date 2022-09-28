package by.kursy.vikvik.javalessons.lesson33.controller;

import by.kursy.vikvik.javalessons.lesson33.model.FourthThread;

public class SecondController {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        int count = 5;
        FourthThread[] threads = new FourthThread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new FourthThread();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].getThread().join();
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }

        System.out.println("Main thread finished.");
    }
}
