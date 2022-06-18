package by.kursy.vikvik.javalessons.lesson21.example02;

public class TVSet implements SwitchComponent, Showable{
    @Override
    public void show() {
        System.out.println("Show new program...");
    }

    @Override
    public void on() {
        System.out.println("TV was switched on.");
    }

    @Override
    public void off() {
        System.out.println("TV was switched off.");
    }
}
