package by.kursy.vikvik.javalessons.lesson28.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;

        try {
            stream = new FileOutputStream(fileName);

            for (int i = 0; i < 100; i++) {
                stream.write(i);
            }

//            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

    }
}
