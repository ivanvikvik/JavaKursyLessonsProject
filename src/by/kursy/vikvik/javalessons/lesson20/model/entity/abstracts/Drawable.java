package by.kursy.vikvik.javalessons.lesson20.model.entity.abstracts;

interface ConstClass {
    int VALUE = 10;
    String NAME = "No name";
    double SIZE = 10.0;
}

public interface Drawable {


    int VALUE = 10;

    void draw1();

    void draw2();

    void draw3();

    void draw4();

    default void method() {

    }

    public static void main(String[] args) {

    }
}


interface DoubleDrawable extends Drawable {
    void draw5();

    void draw6();
}

class A implements DoubleDrawable {

    @Override
    public void draw1() {

    }

    @Override
    public void draw2() {

    }

    @Override
    public void draw3() {

    }

    @Override
    public void draw4() {

    }

    @Override
    public void draw5() {

    }

    @Override
    public void draw6() {

    }
}

class ExternSystem {
    public static void test1(Drawable drawable) {
        drawable.draw1();
        drawable.draw2();
        drawable.draw3();
        drawable.draw4();
    }

    public static void test2(DoubleDrawable drawable) {
        drawable.draw6();
        drawable.draw5();
    }

    public static void main(String[] args) {
        A a = new A();
        test1(a);
        test2(a);
    }
}
