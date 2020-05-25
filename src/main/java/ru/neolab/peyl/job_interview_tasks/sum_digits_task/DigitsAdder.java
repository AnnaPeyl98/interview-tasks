package ru.neolab.peyl.job_interview_tasks.sum_digits_task;

/**
 * Class for finding sums of digits in number
 */
public class DigitsAdder {

    /**
     * Method finds sum of digits in number
     *
     * @param inputNumber - number of digits of which will be located
     * @return sum of digits in number
     */
    public int getSumDigitsInNumber(final int inputNumber) {

        int number = Math.abs(inputNumber);
        int sumDigits = 0;
        int digit;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            sumDigits += digit;
        }

        return sumDigits;
    }

}
