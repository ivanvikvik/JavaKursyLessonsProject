package by.kursy.vikvik.javalessons.lesson19;

public class Student {

    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 16;

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private String name;
    private int age;
    private boolean alive;
    private MarksNote note;

    public Student() {
        name = "no name";
        age = 16;
        note = new MarksNote();
        alive = true;
    }

    public Student(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public Student(String name, int age, double mark, boolean alive) {
        this(name, age, alive);
        note = new MarksNote(mark);
    }

    public Student(String name, int age, MarksNote note, boolean alive) {
        this(name, age, alive);
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
            this.age = age;
        }
    }

    public double getMark() {
        return note.getMark();
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            note.setMark(mark);
        }
    }

    public MarksNote getNote() {
        return note;
    }

    public void setNote(MarksNote note) {
        this.note = note;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return name + ": age = " + age +
                ", mark = " + note.getMark() +
                ", alive = " + alive;
    }
}