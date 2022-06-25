package by.kursy.vikvik.javalessons.lesson23.ooptask.model.container;

public abstract class AbstractContainer implements Container {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
