package by.kursy.vikvik.javalessons.lesson29and30.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Bouquet implements Iterable<Flower>, Serializable {
    private static final long serialVersionUID = 1L;

    private Collection<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public Bouquet(Collection<Flower> flowers) {
        this.flowers = flowers;
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(Flower flower) {
        flowers.remove(flower);
    }

    public void clear(){
        flowers.clear();
    }

    public int size(){
        return flowers.size();
    }

    @Override
    public String toString() {
        Iterator<Flower> it = flowers.iterator();
        StringBuilder builder = new StringBuilder();

        while (it.hasNext()){
            builder.append(it.next()).append("\n");
        }

        return builder.toString();
    }

    @Override
    public Iterator<Flower> iterator() {
        return flowers.iterator();
    }
}