package by.kursy.vikvik.javalessons.lesson29and30.util;

import by.kursy.vikvik.javalessons.lesson29and30.model.Bouquet;
import by.kursy.vikvik.javalessons.lesson29and30.model.Flower;

import java.io.*;

public class FlowerCharParser {
    public static void writeBouquet(String fileName, Bouquet bouquet) {
        try (Writer stream = new BufferedWriter(
                new FileWriter(fileName))) {

            for (Flower flower : bouquet) {
                stream.write(flower.getName() + " ");
                stream.write(flower.getColor() + " ");
                stream.write(flower.getPrice() + " ");
                stream.write(flower.getWeight() + " ");
                stream.write(flower.getLength() + "\n");
            }

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Bouquet readBouquet(String fileName) {
        Bouquet bouquet = new Bouquet();

        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            while(stream.ready()){
                String s = stream.readLine();
                String[] params = s.split(" ");

                Flower flower = new Flower();
                flower.setName(params[0]);
                flower.setColor(params[1]);
                flower.setPrice(Double.parseDouble(params[2]));
                flower.setWeight(Double.parseDouble(params[3]));
                flower.setLength(Integer.parseInt(params[4]));

                bouquet.add(flower);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }

        return bouquet;
    }
}
