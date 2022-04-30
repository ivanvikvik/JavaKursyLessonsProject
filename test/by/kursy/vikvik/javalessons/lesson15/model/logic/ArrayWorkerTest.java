package by.kursy.vikvik.javalessons.lesson15.model.logic;

// [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
// [1, 2, 3, 4, 5, 6] -> [6, 5, 4, 3, 2, 1]
// [1] -> [1]
// [1, 2] -> [2, 1]
// [3, 3, 3] -> [3, 3, 3];
// [] -> []
// null -> Exception

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayWorkerTest {
    @Test
    public void testReverseWithFiveElements() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testReverseWithSixElements() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testReverseAllTheSameElements() {
        int[] array = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testReverseWithEmptyArray() {
        int[] array = {};

        ArrayWorker.reverse(array);

        assertEquals(array.length, 0);
    }

    @Test
    public void testReverseWithOneElement() {
        int[] array = {1};
        int[] expected = {1};

        ArrayWorker.reverse(array);

        assertEquals(expected[0], array[0]);
    }

    @Test
    public void testReverseWithTwoElements() {
        int[] array = {1, 2};
        int[] expected = {2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    public void testReverseWithNull() {
        ArrayWorker.reverse(null);
    }
}
