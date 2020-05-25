package ru.neolab.peyl.job_interview_tasks.three_max_numbers_task;

import java.util.Arrays;

/**
 * Class for finding three maximum elements in array
 */
public class ThreeMaxElementsFinder {
    private static final int COUNT_MAX_NUMBERS = 3;

    /**
     * Method for finding three maximum elements in double array
     *
     * @param inputArray - array from which maximum elements will be selected
     * @return three maximum double elements
     * @throws ThreeMaxElementsFinderException if array is null or length less that 3
     */
    public double[] getThreeMaxElements(final double[] inputArray) throws ThreeMaxElementsFinderException {

        if (inputArray == null) {
            throw new ThreeMaxElementsFinderException("Array is empty");
        }

        if (inputArray.length < COUNT_MAX_NUMBERS) {
            throw new ThreeMaxElementsFinderException("Array less than 3");
        }

        double[] maxElements = Arrays.copyOf(inputArray, COUNT_MAX_NUMBERS);

        Arrays.sort(maxElements);

        if (inputArray.length == COUNT_MAX_NUMBERS) {
            return maxElements;
        }

        for (int i = 3; i < inputArray.length; i++) {
            if (maxElements[2] < inputArray[i]) {
                maxElements[0] = maxElements[1];
                maxElements[1] = maxElements[2];
                maxElements[2] = inputArray[i];
            } else if (maxElements[1] < inputArray[i]) {
                maxElements[0] = maxElements[1];
                maxElements[1] = inputArray[i];
            } else if (maxElements[0] < inputArray[i]) {
                maxElements[0] = inputArray[i];
            }
        }

        return maxElements;
    }

    /**
     * Method for finding three maximum elements in integer array
     *
     * @param inputArray - array from which maximum elements will be selected
     * @return three maximum integer elements
     * @throws ThreeMaxElementsFinderException if array is null or length less that 3
     */
    public int[] getThreeMaxElements(final int[] inputArray) throws ThreeMaxElementsFinderException {

        if (inputArray == null) {
            throw new ThreeMaxElementsFinderException("Array is empty");
        }

        if (inputArray.length < COUNT_MAX_NUMBERS) {
            throw new ThreeMaxElementsFinderException("Array less than 3");
        }

        int[] maxElements = Arrays.copyOf(inputArray, COUNT_MAX_NUMBERS);

        Arrays.sort(maxElements);

        if (inputArray.length == COUNT_MAX_NUMBERS) {
            return maxElements;
        }

        for (int i = 3; i < inputArray.length; i++) {
            if (maxElements[2] < inputArray[i]) {
                maxElements[0] = maxElements[1];
                maxElements[1] = maxElements[2];
                maxElements[2] = inputArray[i];
            } else if (maxElements[1] < inputArray[i]) {
                maxElements[0] = maxElements[1];
                maxElements[1] = inputArray[i];
            } else if (maxElements[0] < inputArray[i]) {
                maxElements[0] = inputArray[i];
            }
        }

        return maxElements;
    }
}
