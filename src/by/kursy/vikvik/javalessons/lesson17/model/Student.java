package by.kursy.vikvik.javalessons.lesson17.model;

public class Student {
    private String name;

    public String getName(){
        return name;
    }

    public Student(){
        name = "no name";
    }

    public Student(String name){
        this.name = name;
    }

    public Student(Student student){
        this(student.name);
    }

    public void change(){
        this.name = "Alex";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alex";
    }
}
