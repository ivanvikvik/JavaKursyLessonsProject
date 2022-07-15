package by.kursy.vikvik.javalessons.lesson26.studentcomparators;

import by.kursy.vikvik.javalessons.lesson26.Student;

import java.util.Comparator;

public class SortStudentByMarkDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o2.getMark() - o1.getMark();

        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getAge() - o2.getAge();
            }
        }
        return result;
    }
}