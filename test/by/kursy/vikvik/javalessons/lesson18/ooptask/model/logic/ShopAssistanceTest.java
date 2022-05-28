package by.kursy.vikvik.javalessons.lesson18.ooptask.model.logic;

import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.Bouquet;
import by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity.Flower;
import org.junit.*;

import static org.junit.Assert.*;


public class ShopAssistanceTest {

    private static Bouquet bouquet;

    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass");
        Flower[] flowers = {
                new Flower("Rose", "red", 3.0, 100, 100),
                new Flower("Rose", "red", 3.0, 100, 130),
                new Flower("Rose", "red", 3.0, 100, 75),
                new Flower("Rose", "red", 3.0, 100, 120),
                new Flower("Rose", "red", 3.0, 100, 110),
        };
        bouquet = new Bouquet(flowers);
    }

    @AfterClass
    public static void destroy(){
        System.out.println("@AfterClass");
        bouquet = null;
    }

    @AfterClass
    public static void destroy1(){
        System.out.println("@AfterClass");
        bouquet = null;
    }

    @AfterClass
    public static void destroy2(){
        System.out.println("@AfterClass");
        bouquet = null;
    }

    @Before
    public void connect(){
        System.out.println("connect to Database...1");
    }

    @Before
    public void connect1(){
        System.out.println("connect to Database...2");
    }

    @Before
    public void connect2(){
        System.out.println("connect to Database...3");
    }


    @After
    public void disconnect(){
        System.out.println("disconnect from Database...");
    }

    @Test
    public void testCalculateTotalPricePositive() {
        // connect to Database
        System.out.println("testCalculateTotalPricePositive");
        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 15;
        double actual = ShopAssistance.calculateTotalPrice(bouquet);
        assertEquals(expected, actual, 0.01);
        // disconnect from database
    }

    @Test
    public void testCalculateTotalPriceWithNull() {
        System.out.println("testCalculateTotalPriceWithNull");
        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalPriceWithEmptyObject() {
        System.out.println("testCalculateTotalPriceWithEmptyObject");
        Flower[] flowers = {};

        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightPositive() {
        System.out.println("testCalculateTotalWeightPositive");
        double expected = 500;
        double actual = ShopAssistance.calculateTotalWeight(bouquet);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalculateTotalWeightWithNull() {
        System.out.println("testCalculateTotalWeightWithNull");
        double expected = 0;
        double actual = ShopAssistance.calculateTotalWeight(null);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightWithEmptyObject() {
        System.out.println("testCalculateTotalWeightWithEmptyObject");
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);
        double expected = 0;
        double actual = ShopAssistance.calculateTotalWeight(bouquet);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void firstTestFindFlowersWithMaxLengthPositive() {
        System.out.println("firstTestFindFlowersWithMaxLengthPositive");
        Flower[] expected = {new Flower("Rose", "red", 3.0, 100, 130)};
        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);
        //assertArrayEquals(expected, actual);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength()
                    || expected[i].getWeight() != actual[i].getWeight()
                    || expected[i].getPrice() != actual[i].getPrice()
                    || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }
    }

    @Test
    public void secondTestFindFlowersWithMaxLengthPositive() {
        System.out.println("secondTestFindFlowersWithMaxLengthPositive");
        Flower[] expected = {new Flower("Rose", "red", 3.0, 100, 130)};
        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);

        //assertArrayEquals(expected, actual);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength()
                    || expected[i].getWeight() != actual[i].getWeight()
                    || expected[i].getPrice() != actual[i].getPrice()
                    || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }
    }
}