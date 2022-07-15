package by.kursy.vikvik.javalessons.lesson26;

import by.kursy.vikvik.javalessons.lesson26.studentcomparators.SortIntegerDesc;
import by.kursy.vikvik.javalessons.lesson26.studentcomparators.SortStudentByAgeAsc;

import java.util.*;

public class Test {
    public static void main(String[] args) {



        Random random = new Random();
        int size = 20;
        int bound = 20;

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//

//        Queue queue = new LinkedList();
        Queue<Integer> queue = new PriorityQueue<>(new SortIntegerDesc());

        for (int i = 0; i < size; i++) {
            int number = random.nextInt(bound);
            queue.offer(number);
            System.out.print(number + " ");
        }

        System.out.println();
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

//        System.out.println();
//        System.out.println(queue);

//        Set<Student> set = new HashSet<>();

//        Set<Student> set = new TreeSet<>(new SortStudentByAgeAsc());
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();
//        Student student4 = new Student();
//        Student student5 = new Student();
//
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student3.hashCode());
//        System.out.println(student4.hashCode());
//        System.out.println(student5.hashCode());

//        set.add(student1);
//        set.add(student1);
//        set.add(student1);
//        set.add(student1);
//        set.add(student1);
//        set.add(student1);
//        set.add(new Student("Alex5", 18, 8));
//        set.add(new Student("Alex1", 27, 7));
//        set.add(new Student("Alex3", 21, 6));
//        set.add(new Student("Alex2", 18, 9));
//        set.add(new Student("Alex4", 19, 10));

//        set.add(new Student("Alex2", 21, 10));
//        set.add(new Student("Alex3", 22, 10));
//        set.add(new Student("Alex4", 23, 10));
//        set.add(new Student("Alex5", 24, 10));

//        view(set);
    }

    public static void view(Iterable<Student> iterable) {
        for (Student st : iterable) {
            System.out.println(st);
        }
    }
}
