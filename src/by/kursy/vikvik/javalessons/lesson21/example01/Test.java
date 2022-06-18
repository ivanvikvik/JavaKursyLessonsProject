package by.kursy.vikvik.javalessons.lesson21.example01;

public class Test {
    public static void main(String[] args) {
        Eatable[] eatables = {
                new VenusCactus(),
                new Student("Alex"),
                new Student("Kate"),
                new Student("Peter"),
                new Crocodile()
        };

        Canteen.justEat(eatables);
    }
}
