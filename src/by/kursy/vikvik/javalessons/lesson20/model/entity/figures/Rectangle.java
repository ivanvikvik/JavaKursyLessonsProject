package by.kursy.vikvik.javalessons.lesson20.model.entity.figures;

import by.kursy.vikvik.javalessons.lesson20.model.entity.abstracts.Figure;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle() {
        a = b = 1;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is being drawn.");
    }

    public Rectangle(int x, int y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        }
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + ", sides: " + a + ", " + b;
    }
}
