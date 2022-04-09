package by.kursy.vikvik.javalessons.lesson13.task06;

public class ArrayWorker {
    public static int findSecondIndex(int[] array, int value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;

                if (count == 2) {
                    return i;
                }
            }
        }

        return -1;
    }
}
