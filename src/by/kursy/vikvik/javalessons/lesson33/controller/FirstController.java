package by.kursy.vikvik.javalessons.lesson33.controller;

import by.kursy.vikvik.javalessons.lesson33.model.ThirdThread;

import java.util.concurrent.TimeUnit;

public class FirstController {
    public static void main(String[] args) {
        ThirdThread thread = new ThirdThread();

        //thread.setPriority(Thread.NORM_PRIORITY);   // 1 .. 10

        Thread main = Thread.currentThread();
       // main.setPriority(Thread.MAX_PRIORITY);

        while (true) {
            System.out.println("Main thread %s is running...");

//            try {
//                //Thread.sleep(1000);
//                TimeUnit.MILLISECONDS.sleep(100);
//            } catch (InterruptedException exception) {
//                System.out.println(exception);
//            }
        }
    }
}
