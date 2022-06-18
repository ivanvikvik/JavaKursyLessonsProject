package by.kursy.vikvik.javalessons.lesson20.model.entity.figures;

import by.kursy.vikvik.javalessons.lesson20.model.entity.abstracts.Figure;

public class Point extends Figure {
    public Point(){
    }

    public Point(int x, int y){
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Point is being drawn...");
    }

    @Override
    public String toString(){
        return "Point: " + super.toString();
    }
}
