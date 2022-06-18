package by.kursy.vikvik.javalessons.lesson21.example01;

public class Student implements Eatable{
    private String name;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.printf("\nStudent %s is being eaten...", name);
    }

    public void run(){

    }
}
