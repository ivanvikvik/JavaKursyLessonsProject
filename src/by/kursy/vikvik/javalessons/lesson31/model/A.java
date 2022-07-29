package by.kursy.vikvik.javalessons.lesson31.model;

import java.io.Serializable;

public class A {
    //private static final long serialVersionUID = 1L;
    public transient double value;
    public String name;
    //public static int staticfield = 0;
    public int id;


//    public A(){
//        id = 1;
//        value = 5.5;
//        name = "no name";
//    }

//    public A(int id, double value, String name){
//        id = 1;
//        value = 5.5;
//        name = "no name";
//    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", value = " + value
                        + ", name = " + name;

    }
}
