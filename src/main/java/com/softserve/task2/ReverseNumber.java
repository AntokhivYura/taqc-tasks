package com.softserve.task2;

/**
 * Reverses number.
 * @author Yurii Antokhiv
 * @version 1.0
 */

class ReverseNumber {
    /**
     * The number to operate with.
     */
    private int number;

    /**
     * Constructor for ReverseNumber class.
     *
     * @param number number to operate with
     */
    ReverseNumber(int number) {
        this.number = number;
    }

    /**
     * Reverses the inputted number.
     *
     * @return reversed inputted number
     */
    int reverseNumber() {
        int digit = number;
        int reverse = 0;

        while (digit != 0) {
            reverse = reverse * 10;
            reverse = reverse + digit % 10;
            digit = digit / 10;
        }
        return reverse;
    }

    /**
     * Prints reversed number to console.
     *
     * @param reversedNumber reversed number
     */
    void printAnswer(final int reversedNumber) {
        System.out.printf("%d after reversing "
                + "become %d", number, reversedNumber);
    }
}
