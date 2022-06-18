package by.kursy.vikvik.javalessons.lesson21.example02;

import by.kursy.vikvik.javalessons.lesson21.example01.Student;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ToothBrush toothBrush = new ToothBrush();
        TVSet tvSet = new TVSet();
        consult(toothBrush);
        consult(tvSet);
        user(tvSet);
    }

    public static void consult(SwitchComponent component) throws InterruptedException {
        component.on();
        Thread.sleep(2000);
        component.off();
    }

    public static void user(Showable showable) throws InterruptedException {
        showable.show();
        Thread.sleep(2000);
        showable.show();
        Thread.sleep(2000);
        showable.show();
        Thread.sleep(2000);
    }
}
