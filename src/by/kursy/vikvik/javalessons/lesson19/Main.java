package by.kursy.vikvik.javalessons.lesson19;

public class Main {
    public static void main(String[] args) {
        MarksNote note1 = new MarksNote();
        Student student1 = new Student("Alex", 20, note1, true);
        Student student2 = new Student("Alex", 20, note1, true);
    }
}
