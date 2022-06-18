package by.kursy.vikvik.javalessons.lesson21.example01;

public class Canteen {
    public static void justEat(Eatable[] eatables) {
        for (Eatable eatable : eatables) {
            eatable.eat();
        }
    }
}
