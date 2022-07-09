package by.kursy.vikvik.javalessons.lesson19.controller;

import by.kursy.vikvik.javalessons.lesson20.model.entity.abstracts.Figure;
import by.kursy.vikvik.javalessons.lesson20.model.entity.figures.Point;
import by.kursy.vikvik.javalessons.lesson20.model.entity.figures.Rectangle;
import by.kursy.vikvik.javalessons.lesson20.model.entity.figures.Triangle;

public class Main extends Object {

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(1, 1, 3, 5),
                new Point(),
                new Triangle(1, 2, 6, 7, 8)
        };

        for (Figure figure : figures) {
            figure.draw();
        }

//        System.out.println(figure1.hashCode());
//        System.out.println(figure2.hashCode());

//        System.out.println(figure1.equals(new Point()));
//        System.out.println(figure1.equals(new Triangle()));
//        System.out.println(figure1.equals(new String()));
//        System.out.println(figure1.equals(null));
//        System.out.println(figure1.equals(figure1));

    }
}
