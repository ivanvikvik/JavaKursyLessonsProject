package by.kursy.vikvik.javalessons.lesson13.task01;

public class LinearSearching {
//    public static boolean checkValue(int[] array, int value) {
//        boolean flag = false;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value){
//                flag = true;
//                break;
//            }
//        }
//
//        return flag;
//    }

    public static boolean checkValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

//    public static int findFirstIndex(int[] array, int value){
//        int index = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value){
//                index = i;
//                break;
//            }
//        }
//
//        return index;
//    }

    public static int findFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    //bad algorithm
//    public static int findLastIndex(int[] array, int value) {
//        int index = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                index = i;
//            }
//        }
//
//        return index;
//    }

    //    public static int findLastIndex(int[] array, int value) {
//        int index = -1;
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] == value) {
//                index = i;
//                break;
//            }
//        }
//
//        return index;
//    }

    public static int findLastIndex(int[] array, int value) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int countValue(int[] array, int value) {
        int count = 0;

        for (int element : array) {
            if (element == value) {
                count++;
            }
        }

        return count;
    }
}
