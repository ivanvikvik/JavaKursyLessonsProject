package by.kursy.vikvik.javalessons.lesson25.JCF;

import java.util.*;

public class Main {

    public void first() {
        second();
    }

    public void second() {
        third();
    }

    public void third() {

    }

    public static void main(String[] args) {
//        first();
//        ArrayList list = new ArrayList();
//        LinkedList list = new LinkedList();
//        HashSet list = new HashSet();
        //PriorityQueue<String> list = new PriorityQueue<>();
//        TreeSet list = new TreeSet();
//
//        list.add("d");
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("e");


//        System.out.println(list);

//        test(list);

        CustomCollection collection = new CustomCollection(new PriorityQueue<>());
        collection.add(45);
        collection.add(5);
        collection.add(3);
        collection.add(87);
        collection.add(9);

        view(collection);
        System.out.println("Sum = " + justDoIt(collection));
    }


    public static void view(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static int justDoIt(CustomCollection collection) {
        int sum = 0;

        for (int element : collection) {
            sum += element;
        }

        return sum;
    }
}
