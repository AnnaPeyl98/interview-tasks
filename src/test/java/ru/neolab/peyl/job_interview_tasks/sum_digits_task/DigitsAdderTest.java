package ru.neolab.peyl.job_interview_tasks.sum_digits_task;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitsAdderTest {
    private DigitsAdder digitsAdder;

    @Before
    public void init(){
        digitsAdder = new DigitsAdder();
    }

    @Test
    public void testSumDigitsForZero(){
        int inputNumber = 0;
        int expectedSumDigits = 0;
        int actualSumDigits = digitsAdder.getSumDigitsInNumber(inputNumber);
        assertEquals(expectedSumDigits, actualSumDigits);
    }

    @Test
    public void testSumDigitsForPositiveNumberWithOneDigit(){
        int inputNumber = 4;
        int expectedSumDigits = 4;
        int actualSumDigits = digitsAdder.getSumDigitsInNumber(inputNumber);
        assertEquals(expectedSumDigits, actualSumDigits);
    }

    @Test
    public void testSumDigitsForPositiveNumber(){
        int inputNumber = 1894;
        int expectedSumDigits = 22;
        int actualSumDigits = digitsAdder.getSumDigitsInNumber(inputNumber);
        assertEquals(expectedSumDigits, actualSumDigits);
    }

    @Test
    public void testSumDigitsForNegativeNumberWithOneDigit(){
        int inputNumber = -7;
        int expectedSumDigits = 7;
        int actualSumDigits = digitsAdder.getSumDigitsInNumber(inputNumber);
        assertEquals(expectedSumDigits, actualSumDigits);
    }

    @Test
    public void testSumDigitsForNegativeNumber(){
        int inputNumber = -379;
        int expectedSumDigits = 19;
        int actualSumDigits = digitsAdder.getSumDigitsInNumber(inputNumber);
        assertEquals(expectedSumDigits, actualSumDigits);
    }
}
