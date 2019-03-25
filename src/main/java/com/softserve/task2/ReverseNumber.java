package com.softserve.task2;

/**
 * Reverses number.
 * @author Yurii Antokhiv
 * @version 1.0
 */

public class ReverseNumber {

    /**
     * Reverses the inputted number.
     *
     * @param n input number
     * @return reversed inputted number
     */
    public int reverseNumber(int n) {
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }
}
