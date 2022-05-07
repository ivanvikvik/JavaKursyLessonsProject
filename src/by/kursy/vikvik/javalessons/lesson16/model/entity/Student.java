package by.kursy.vikvik.javalessons.lesson16.model.entity;

public class Student {
    public static int count = 4;

    {
        this.mark = 4;
        System.out.println("init block 2");
    }


    {
        System.out.println("init block 1");
    }

    public String name;
    public int age;
    public double mark;
    public char sex;
    public boolean alive;

    public Student() {
    }

    public Student(String name, int age, double mark, char sex, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;
    }

    // copy-constructor
    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        sex = student.sex;
        alive = student.alive;
    }

    public void testing(){
        System.out.println(this.hashCode());
    }

    // default constructor
//    public Student() {
//        name = "no name";
//        age = 16;
//        alive = true;
//        sex = 'f';
//    }

    // constructor with args (params)
//    public Student(String name, int age, double mark, char sex, boolean alive) {
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//        this.sex = sex;
//        this.alive = alive;
//    }

//    // constructor with args (params)
//    public Student(String name) {
//        this.name = name;
//    }
//
//    // constructor with args (params)
//    public Student(String name, int age, char sex, boolean alive) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.alive = alive;
//    }
//
//    // constructor with args (params)
//    public Student(boolean alive) {
//        this.alive = alive;
//    }

    public void setName(String name){
        this.name = name;
    }


    public String getInfo() {
        return this.name + " { age = " + this.age
                + "; mark = " + this.mark
                + "; sex = " + (this.sex == 'm' ? "male" : "female")
                + "; alive = " + (this.alive ? "yes" : "no") + " }";
    }
}
