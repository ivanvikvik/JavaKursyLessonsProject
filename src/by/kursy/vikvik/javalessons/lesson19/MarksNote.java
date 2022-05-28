package by.kursy.vikvik.javalessons.lesson19;

public class MarksNote {
    private double mark;

    public MarksNote() {
        mark = 4;
    }

    public MarksNote(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark + "";
    }
}
