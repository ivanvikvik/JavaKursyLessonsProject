package by.kursy.vikvik.javalessons.lesson13.task03;

import by.kursy.vikvik.javalessons.lesson13.task01.LinearSearching;
import by.kursy.vikvik.javalessons.lesson13.util.ArrayInitializer;
import by.kursy.vikvik.javalessons.lesson13.util.Convertor;
import by.kursy.vikvik.javalessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        ArrayInitializer.randomInit(array, -10, 10);

        Printer.print("Input value for searching: ");
        int value = scanner.nextInt();

        int count = LinearSearching.countValue(array, value);

        Printer.print("\nArray: " + Convertor.convertFromArrayToString(array));
        String msg = String.format("\nCount of value %d = %d", value, count);
        Printer.print(msg);
    }
}
