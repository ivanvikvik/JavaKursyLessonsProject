package by.kursy.vikvik.javalessons.lesson23.ooptask.controller;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.TheIteratorPattern.*;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.DynamicArray;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.FixedArray;

import java.util.ArrayList;
import java.util.HashSet;

public class ControllerForIterator {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());

        Iterator iterator = new DynamicArrayIterator(array);

        FixedArray fixedArray = new FixedArray();
        fixedArray.add(new Flower("Rose"));
        fixedArray.add(new Flower("Rose"));
        fixedArray.add(new Flower("Rose"));
        fixedArray.add(new Flower("Rose"));
        fixedArray.add(new Flower("Rose"));

        iterator = new FixedArrayIterator(fixedArray);


        ArrayList list = new ArrayList();
        list.add(new Flower("Red Rose"));
        list.add(new Flower("Red Rose"));
        list.add(new Flower("Red Rose"));

        iterator = new ArrayListIterator(list);

        HashSet hashSet = new HashSet();

        hashSet.add(new Flower("White Rose"));
        hashSet.add(new Flower("White Rose"));
        hashSet.add(new Flower("White Rose"));

        iterator = new HashSetIterator(hashSet);

        view(iterator);
        //iterator.reset();
        view(iterator);
    }

    public static void view(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
