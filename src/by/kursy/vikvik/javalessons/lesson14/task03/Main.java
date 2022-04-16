package by.kursy.vikvik.javalessons.lesson14.task03;

import by.kursy.vikvik.javalessons.lesson14.ArraySorter;
import by.kursy.vikvik.javalessons.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 8, 6, 9, 5, 3, 10, 7};
//        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array = {10, 2, 3, 3, 5, 6, 7, 8, 9, 1};

        Printer.print("Before sorting: ");
        Printer.print(Arrays.toString(array));

        ArraySorter.selectedSortAsc(array);

        Printer.print("After sorting: ");
        Printer.print(Arrays.toString(array));


    }
}
