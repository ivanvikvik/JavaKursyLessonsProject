package by.kursy.vikvik.javalessons.lesson26;

import java.util.Map;
import java.util.TreeMap;

public class Student extends Object implements Comparable<Student> {

    private String name;
    private int age;
    private int mark;

    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
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
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    //    @Override
    public boolean equals(Object o) {
        System.out.println("equals of Student " + name);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (mark != student.mark) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode of Student " + name);

        return 10;
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        result = 31 * result + mark;
//        return result;
    }

    @Override
    public String toString() {
        return name + ": age = " + age +
                ", mark = " + mark;
    }

    @Override
    public int compareTo(Student o) {
        // 1) sort students by name
        int result = name.compareTo(o.name);

        if (result == 0) {
            result = age - o.age;
            if (result == 0) {
                result = mark - o.mark;
            }
        }

        return result;

        // 2) sort students by mark
//        int result = o.mark - mark;
//
//        if (result == 0) {
//            result = name.compareTo(o.name);
//            if (result == 0) {
//                result = age - o.age;
//            }
//        }
//
//        return result;


//        return age - o.age;

//        int result = 0;
//
//        if (age > o.age){
//            result = 1;
//        } else if (age < o.age) {
//            result = -1;
//        }
//
//        return result;
    }
}