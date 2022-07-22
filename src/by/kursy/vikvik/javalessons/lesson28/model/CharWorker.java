package by.kursy.vikvik.javalessons.lesson28.model;

import java.io.*;

public class CharWorker {
    public static void write(String fileName) {
        Writer stream = null;

        try {
            stream = new FileWriter(fileName);

            for (int i = 200; i < 300; i++) {
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

    public static String read(String fileName) {
        Reader stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileReader(fileName);

            int number;

            while((number = stream.read()) != -1){
                builder.append(number).append(" ");
            }

            // 2
//            int number = stream.read();
//
//            while(number != -1){
//                builder.append(number).append(" ");
//                number = stream.read();
//            }

            // 3
//            while(stream.ready()){
//                int number = stream.read();
//                builder.append(number).append(" ");
//            }

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

        return builder.toString();
    }
}
