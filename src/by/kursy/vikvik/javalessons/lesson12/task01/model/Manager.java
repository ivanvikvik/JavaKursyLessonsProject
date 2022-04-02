package by.kursy.vikvik.javalessons.lesson12.task01.model;

public class Manager {

    public static double calcAvgMark(int[] marks) {
        double sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / marks.length;
    }
}
