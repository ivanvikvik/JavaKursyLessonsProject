package by.kursy.vikvik.javalessons.lesson27;

import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

//        Throwable
//        Error
//        Exception
//        InputStream inputStream = new BufferedInputStream(new FileInputStream("text.txt"));
//
//        inputStream.close();
//        inputStream.read();


//1)ArithmeticException
        //        int a = 10;
//        int b = 0;

//        try {
//            int c = a / b;
//            System.out.printf("%d / %d = %d", a, b, c);
//        } catch (ArithmeticException exception) {
//            System.out.println(exception);
//        }

//        if (b != 0) {
//            int c = a / b;
//            System.out.printf("%d / %d = %d", a, b, c);
//        } else {
//            System.err.println("Error! Division by ZERO!!!");
//        }

        // 2)
//        int[] array = {1, 2, 3, 4, 5};
//        int index = 10;

//        try {
//            System.out.println(array[index]);
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Error! Index is out of array!");
//        }

//        if (index >= 0 && index < array.length) {
//            System.out.println(array[index]);
//        } else {
//            System.out.println("Error! Index is out of array!");
//        }

        //3) NullPointerException
//        String s = null;
//
//        try {
//            System.out.println(s.equals("Exception!"));
//        } catch (NullPointerException exception) {
//            System.out.println("Error! Reference is NULL!");
//        }

//        if (s != null) {
//            System.out.println(s.equals("Exception!"));
//        } else {
//            System.out.println("Error! Reference is NULL!");
//        }

//        A a = new B();
        B b = new B();
//        try {
//            B b = (B)a;
//        } catch(ClassCastException exception) {
//            System.out.println(exception);
//        }

//        if (a instanceof B) {
//            B b = (B)a;
//        } else {
//            System.out.println("Error! 'a' reference can't be cast to class B");
//        }

        // compiler error
//        if (b instanceof C) {
//            C c = (C)b;
//        } else {
//            System.out.println("Error! 'a' reference can't be cast to class B");
//        }
    }
}


class A {

}

class B extends A {

}

class C extends A {

}

class D {

}

