package by.kursy.vikvik.javalessons.lesson21.example02;

public class ToothBrush implements SwitchComponent {
    @Override
    public void on() {
        System.out.println("Toothbrush was switched on.");
    }

    @Override
    public void off() {
        System.out.println("Toothbrush was switched off.");
    }
}
