package by.kursy.vikvik.javalessons.lesson24.controller;

import by.kursy.vikvik.javalessons.lesson24.model.WeekDay;
import by.kursy.vikvik.javalessons.lesson24.model.WeekDayEnum;

enum Color {
    RED, BLACK, BLUE, GREEN;
}

public class Main {
    public static void main(String[] args) {
//        Color color = Color.valueOf("RED");
//        System.out.println(color);

        for (Color color: Color.values()) {
            System.out.println(color);
        }


//        System.out.println(Color.RED.ordinal());
//
//        System.out.println(Color.GREEN.name());
//        System.out.println(Color.GREEN.ordinal());
//
//        System.out.println(Color.RED.compareTo(Color.RED));
//        System.out.println(Color.RED);

        WeekDayEnum day1 = WeekDayEnum.SUNDAY;
        System.out.println(day1);
//        WeekDay day21 = WeekDay.MONDAY;
//        WeekDay day31 = WeekDay.MONDAY;
//        WeekDay day41 = WeekDay.MONDAY;
//        WeekDay day51 = WeekDay.MONDAY;
//        WeekDay day5 = WeekDay.FRIDAY;
//
//        //WeekDay day10 = new WeekDay("Mars", 10);
//
//        System.out.println(day1);
//        System.out.println(day5);
//
//        justDoIt(WeekDay.FRIDAY);

    }

    public static void justDoIt(Color color) {
        String s = "no color";

        switch(color) {
            case BLACK: s = "black"; break;
            case RED: s = "red"; break;
            case BLUE: s = "blue"; break;
            case GREEN: s = "green"; break;
        }

        System.out.println(s);
    }
}
