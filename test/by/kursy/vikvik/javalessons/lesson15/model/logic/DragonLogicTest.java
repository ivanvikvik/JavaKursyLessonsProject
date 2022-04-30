package by.kursy.vikvik.javalessons.lesson15.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

// head = 3

// 0) fool prove: age <= 0 --> -1
// 1) 1 .. 200 --> 3 heads
// 2) 201 .. 300 --> 2 heads
// 3) 301 .. --> 1 head
// bounds: 1, 200, 201, 300, 301

public class DragonLogicTest {
    @Test
    public void testCountHeadsForFirstPeriod() {
        int age = 100;
        int expected = 303;

        int actual = DragonLogic.countHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsForSecondPeriod() {
        int age = 250;
        int expected = 3 + 600 + 100;

        int actual = DragonLogic.countHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsForThirdPeriod() {
        int age = 350;
        int expected = 3 + 600 + 200 + 50;

        int actual = DragonLogic.countHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByNegativeAge() {
        int age = -1;
        int expected = -1;

        int actual = DragonLogic.countHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByZeroAge() {
        int age = 0;
        int expected = -1;

        int actual = DragonLogic.countHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsWithBounds() {
        int[] bounds = {1, 200, 201, 300, 301};
        int[] expected = {6, 603, 605, 803, 804};

        for (int i = 0; i < bounds.length; i++) {
            int actual = DragonLogic.countHeads(bounds[i]);
            assertEquals(expected[i], actual);
        }
    }

}
