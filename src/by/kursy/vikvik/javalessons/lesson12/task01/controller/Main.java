package by.kursy.vikvik.javalessons.lesson12.task01.controller;

import by.kursy.vikvik.javalessons.lesson12.task01.model.Manager;
import by.kursy.vikvik.javalessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input student's marks: ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();
        int mark6 = scanner.nextInt();

        double avg = Manager.calcAvgMark(mark1, mark2, mark3, mark4, mark5, mark6);

        String result = String.format("\nStudent's average mark = %.2f", avg);
        Printer.print(result);
    }
}
