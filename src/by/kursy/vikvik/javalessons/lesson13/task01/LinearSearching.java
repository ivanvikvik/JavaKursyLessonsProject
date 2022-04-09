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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
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

    public static int findFirstIndex(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
