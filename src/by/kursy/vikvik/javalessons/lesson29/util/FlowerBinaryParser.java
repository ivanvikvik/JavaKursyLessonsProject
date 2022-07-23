package by.kursy.vikvik.javalessons.lesson29.util;

import by.kursy.vikvik.javalessons.lesson29.model.Bouquet;
import by.kursy.vikvik.javalessons.lesson29.model.Flower;

import java.io.*;

public class FlowerBinaryParser {
    public static void writeFlower(String fileName, Flower flower) {
        try (DataOutputStream stream =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(fileName)))) {

            stream.writeUTF(flower.getName());
            stream.writeUTF(flower.getColor());
            stream.writeDouble(flower.getWeight());
            stream.writeDouble(flower.getPrice());
            stream.writeInt(flower.getLength());

//            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Flower readFlower(String fileName) {
        Flower temp = new Flower();

        try (DataInputStream stream =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(fileName)))) {

            temp.setName(stream.readUTF());
            temp.setColor(stream.readUTF());
            temp.setWeight(stream.readDouble());
            temp.setPrice(stream.readDouble());
            temp.setLength(stream.readInt());

        } catch (IOException exception) {
            System.err.println(exception);
        }

        return temp;
    }

    public static void writeBouquet(String fileName, Bouquet bouquet) {
        DataOutputStream stream = null;

        try {
            stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));

            for (Flower flower : bouquet) {
                stream.writeUTF(flower.getName());
                stream.writeUTF(flower.getColor());
                stream.writeDouble(flower.getWeight());
                stream.writeDouble(flower.getPrice());
                stream.writeInt(flower.getLength());
            }

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }
    }

    public static Bouquet readBouquet(String fileName) {
        Bouquet bouquet = new Bouquet();

        try (DataInputStream stream =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(fileName)))) {

            while (stream.available() > 0) {
                Flower temp = new Flower();

                temp.setName(stream.readUTF());
                temp.setColor(stream.readUTF());
                temp.setWeight(stream.readDouble());
                temp.setPrice(stream.readDouble());
                temp.setLength(stream.readInt());

                bouquet.add(temp);
            }

        } catch (IOException exception) {
            System.err.println(exception);
        }

        return bouquet;
    }
}
