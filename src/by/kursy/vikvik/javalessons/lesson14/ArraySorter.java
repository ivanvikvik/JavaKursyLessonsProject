package by.kursy.vikvik.javalessons.lesson14;

public class ArraySorter {
    public static void bubbleSortAcs(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    flag = false;
                }
                count++;
            }

            if (flag) {
                break;
            }
        }
        System.out.println("\nCount = " + count);

    }

    public static void bubbleSortDecs(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }

    public static void insertedSortAsc(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
                count++;
            }

            array[j + 1] = element;
        }

        System.out.println("\nCount = " + count);
    }

    public static void selectedSortAsc(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
//            //for best case
//            boolean flag = true;
//            for (int q = i; q < array.length - 1; q++ ) {
//                if (array[q] > array[q + 1]) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) {
//                break;
//            }

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]){
                    index = j;
                }
                count++;
            }

            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }
        System.out.println("\nCount = " + count);
    }

    public static void selectedSortDesc(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[index] < array[j]){
                    index = j;
                }
                count++;
            }

            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }
        System.out.println("\nCount = " + count);
    }
}
