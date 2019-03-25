package com.softserve.task1;

/**
 * Checks if square of the number contains digit three.
 * @author Yurii Antokhiv
 * @version 1.0
 */
class NumberContainsDigitThree {
    private int number;

    NumberContainsDigitThree(int number) {
        this.number = number;
    }

    /**
     * Returns true if and only if square of this number
     * contains digit three.
     *
     * @return true if square of the number contains digit three
     *         , false if not
     */
    boolean numberContainsThree() {
        int digit = number;
        digit = digit * digit;

        while (digit != 0) {
            if (digit % 10 == 3) {
                return true;
            }
            digit /= 10;
        }
        return false;
    }
    void printAnswer(boolean containsThree){
        System.out.printf("Square of the number %d contains digit three ? %b",number,containsThree);
    }
}
