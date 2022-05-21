package by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet() {
        flowers = new Flower[0];
    }

    public Bouquet(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = flowers;
        } else {
            flowers = new Flower[0];
        }
    }

    public int size() {
        return flowers.length;
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.length) {
            return flowers[index];
        }
        return null;
    }

    public void add(Flower flower) {
        Flower[] temp = new Flower[flowers.length + 1];

        int i = 0;
        for (; i < flowers.length; i++) {
            temp[i] = flowers[i];
        }
        temp[i] = flower;
        flowers = temp;
    }

    public void remove(Flower flower) {
        boolean flag = false;
        Flower[] temp = new Flower[flowers.length - 1];

        for (int i = 0, j = 0; i < flowers.length; i++) {

            if (flag || (!flowers[i].getName().equals(flower.getName())
                    && !flowers[i].getColor().equals(flower.getColor())
                    && flowers[i].getLength() != flower.getLength()
                    && flowers[i].getWeight() != flower.getWeight()
                    && flowers[i].getPrice() != flower.getPrice())) {
                temp[j] = flowers[i];
                j++;
            } else {
                flag = true;
            }
        }
        flowers = temp;
    }

    public void remove(int index) {
        Flower[] temp = new Flower[flowers.length - 1];

        for (int i = 0, j = 0; i < flowers.length; i++) {

            if (index != i) {
                temp[j] = flowers[i];
                j++;
            }
        }
        flowers = temp;
    }

    //default constructor + constructor with params
    // add
    // remove
    // size
    // get
    // toString
}
