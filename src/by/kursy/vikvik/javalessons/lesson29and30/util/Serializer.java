package by.kursy.vikvik.javalessons.lesson29and30.util;

import by.kursy.vikvik.javalessons.lesson31.model.A;

import java.io.*;

public class Serializer<T> {
    private String file = "c:/test/bouquet.bin";

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void serialize(T t) {
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(file)))) {

            stream.writeObject(t);

            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public T deserialize() {
        T t = null;

        try (ObjectInputStream stream =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(file)))) {

            t = (T) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }

        return t;
    }
}
