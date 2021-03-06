package by.kursy.vikvik.javalessons.lesson12.task01.controller;

import by.kursy.vikvik.javalessons.lesson12.task01.model.Manager;
import by.kursy.vikvik.javalessons.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input count of students: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        Printer.print("Input student's marks: ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        Printer.print("Student's marks: ");
        Printer.print(java.util.Arrays.toString(marks));

        double avg = Manager.calcAvgMark(marks);

        String result = String.format("\nStudent's average mark = %.2f", avg);
        Printer.print(result);
    }
}
