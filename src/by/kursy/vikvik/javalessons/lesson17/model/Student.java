package by.kursy.vikvik.javalessons.lesson17.model;

public class Student {
    protected String name;

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
}
