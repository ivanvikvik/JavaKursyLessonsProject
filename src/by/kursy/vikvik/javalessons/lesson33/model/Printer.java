package by.kursy.vikvik.javalessons.lesson33.model;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Printer {

    private Semaphore semaphore;

    public Printer() {
        semaphore = new Semaphore(1, true);
    }

    public void print(String text) {
        try {
            semaphore.acquire();
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
        } catch (InterruptedException exception) {
            System.out.println(exception);
        } finally {
            semaphore.release();
        }
    }
}
