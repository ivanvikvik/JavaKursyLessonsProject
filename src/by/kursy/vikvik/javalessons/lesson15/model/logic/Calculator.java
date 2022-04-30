package by.kursy.vikvik.javalessons.lesson15.model.logic;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        for (long i = 0; i < 10_000_000_000L; i++);

        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        return sum;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
