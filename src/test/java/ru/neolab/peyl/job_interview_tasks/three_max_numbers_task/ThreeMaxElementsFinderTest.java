package ru.neolab.peyl.job_interview_tasks.three_max_numbers_task;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ThreeMaxElementsFinderTest {
    private ThreeMaxElementsFinder threeMaxElementsFinder;
    private static final double DELTA = 0.000001;

    @Before
    public void init(){
        threeMaxElementsFinder = new ThreeMaxElementsFinder();
    }

    @Test
    public void testAllEqualsIntegerNumbers() throws ThreeMaxElementsFinderException {
        int[] inputArray = {2, 2, 2, 2, 2, 2};
        int[] expectedArray = {2, 2, 2};
        int[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testPositiveIntegerNumbers() throws ThreeMaxElementsFinderException {
        int[] inputArray = {14, 2, 4, 8, 20, 6};
        int[] expectedArray = {8, 14, 20};
        int[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testPositiveAndNegativeIntegerNumbers() throws ThreeMaxElementsFinderException {
        int[] inputArray = {-7, 2, -1, -14, -2, -9};
        int[] expectedArray = {-2, -1, 2};
        int[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testThreeIntegerNumbersInArray() throws ThreeMaxElementsFinderException {
        int[] inputArray = {-7, 2, -1};
        int[] expectedArray = {-7, -1, 2};
        int[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test(expected = ThreeMaxElementsFinderException.class)
    public void testIntegerArrayNull() throws ThreeMaxElementsFinderException {
        int[] inputArray = null;
        threeMaxElementsFinder.getThreeMaxElements(inputArray);
    }

    @Test(expected = ThreeMaxElementsFinderException.class)
    public void testIntegerArrayLessThatThree() throws ThreeMaxElementsFinderException {
        int[] inputArray = {2, -1};
        threeMaxElementsFinder.getThreeMaxElements(inputArray);
    }

    @Test
    public void testAllEqualsDoubleNumbers() throws ThreeMaxElementsFinderException {
        double[] inputArray = {5.0, 5.0, 5.0, 5.0, 5.0, 5.0};
        double[] expectedArray = {5.0, 5.0, 5.0};
        double[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray, DELTA);
    }

    @Test
    public void testPositiveDoubleNumbers() throws ThreeMaxElementsFinderException {
        double[] inputArray = {14.5, 14.2, 4.7, 8.1, 20.5, 20.8};
        double[] expectedArray = {14.5, 20.5, 20.8};
        double[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray, DELTA);
    }

    @Test
    public void testPositiveAndNegativeDoubleNumbers() throws ThreeMaxElementsFinderException {
        double[] inputArray = {-7.7, 2.1, -1.8, -1.5, -1.9, -9.3};
        double[] expectedArray = {-1.8, -1.5, 2.1};
        double[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray, DELTA);
    }

    @Test
    public void testThreeDoublerNumbersInArray() throws ThreeMaxElementsFinderException {
        double[] inputArray = {-7.5, 2.1, -1.8};
        double[] expectedArray = {-7.5, -1.8, 2.1};
        double[] actualArray = threeMaxElementsFinder.getThreeMaxElements(inputArray);

        assertArrayEquals(expectedArray, actualArray, DELTA);
    }

    @Test(expected = ThreeMaxElementsFinderException.class)
    public void testDoubleArrayNull() throws ThreeMaxElementsFinderException {
        double[] inputArray = null;
        threeMaxElementsFinder.getThreeMaxElements(inputArray);
    }

    @Test(expected = ThreeMaxElementsFinderException.class)
    public void testDoubleArrayLessThatThree() throws ThreeMaxElementsFinderException {
        double[] inputArray = {2.5, -1.9};
        threeMaxElementsFinder.getThreeMaxElements(inputArray);
    }
}
