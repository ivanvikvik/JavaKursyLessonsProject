package by.kursy.vikvik.javalessons.lesson24.controller;

import by.kursy.vikvik.javalessons.lesson24.model.WeekDay;

public class Main {
    public static void main(String[] args) {
        WeekDay day1 = WeekDay.MONDAY;
        WeekDay day21 = WeekDay.MONDAY;
        WeekDay day31 = WeekDay.MONDAY;
        WeekDay day41 = WeekDay.MONDAY;
        WeekDay day51 = WeekDay.MONDAY;
        WeekDay day5 = WeekDay.FRIDAY;

        //WeekDay day10 = new WeekDay("Mars", 10);

        System.out.println(day1);
        System.out.println(day5);

        justDoIt(WeekDay.FRIDAY);

    }

    public static void justDoIt(WeekDay day) {
        switch(day.getNumber()) {
            case 1: // just do it for monday
            case 2: //

        }
    }
}
