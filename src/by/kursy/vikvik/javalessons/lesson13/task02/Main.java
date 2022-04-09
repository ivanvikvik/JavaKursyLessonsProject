package by.kursy.vikvik.javalessons.lesson13.task02;

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

        int firstIndex = LinearSearching.findFirstIndex(array, value);
        int lastIndex = LinearSearching.findLastIndex(array, value);

        Printer.print("\nArray: " + Convertor.convertFromArrayToString(array));
        String msg = String.format("First index of value %d = %d, last index = %d", value, firstIndex, lastIndex);

        Printer.print("\n" + msg);
    }
}
