package by.kursy.vikvik.javalessons.lesson16.model.entity;

public class Student {
    public String name;     //8
    public int age;         //4
    public double mark;     //8
    public char sex;        //2    // 'm' or 'f'
    public boolean alive;   //4

    // default constructor
    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
        sex = 'f';
    }

    // constructor with args (params)
    public Student(String n, int a, double m, char s, boolean al) {
        name = n;
        age = a;
        mark = m;
        sex = s;
        alive = al;
    }

    // constructor with args (params)
    public Student(String n) {
        name = n;
    }

    // constructor with args (params)
    public Student(String n, int a, char s, boolean al) {
        name = n;
        age = a;
        sex = s;
        alive = al;
    }

    // constructor with args (params)
    public Student(boolean al) {
        alive = al;
    }




    public String getInfo() {
        return name + " { age = " + age
                + "; mark = " + mark
                + "; sex = " + (sex == 'm' ? "male" : "female")
                + "; alive = " + (alive ? "yes" : "no") + " }";
    }
}
