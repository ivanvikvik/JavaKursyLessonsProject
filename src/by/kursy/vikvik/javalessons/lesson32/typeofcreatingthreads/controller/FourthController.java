package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads.controller;

import by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads.model.SecondThread;

public class FourthController {
    public static void main(String[] args) {
        System.out.println("The main thread started.");

        int count = 5;

        SecondThread threadFunction = new SecondThread();

        Thread[] threads = new Thread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadFunction);
            threads[i].start();
        }

        try {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }

        System.out.println("The main thread finished.");
    }
}
