package by.kursy.vikvik.javalessons.lesson15.model.logic;

//index -> 0 1 2 3 4 5
//arr =    1 2 3 4 5 6

// size = length / 2
// i = 0
// t = arr[i]
// arr[i] = arr[arr.length - 1 - i]
// arr[arr.length - 1] = t

// i = 1
// t = arr[i]
// arr[i] = arr[arr.length - 1 - i]
// arr[arr.length - 1 - 1] = t

// i = 2
// t = arr[i]
// arr[i] = arr[arr.length - 1 - i]
// arr[arr.length - 1 - 2] = t

public class ArrayWorker {
    public static void reverse(int[] array) {
        // fool prove
        if (array == null) {
            return;
        }

        int size = array.length / 2;
        for (int i = 0; i < size; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }
}
