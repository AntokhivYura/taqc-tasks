package com.softserve.task4;

/**
 * Uses Euclid's algorithm to get the highest divider of two numbers.
 * @author Yrii Antokhiv
 * @version 1.0
 */
class EuclidAlgorithm {

    /**
     * Uses Euclid's algorithm to get
     * the highest divider for two numbers.
     *
     * @param n first number
     * @param m second number
     * @return highest divider
     */
    int getHighestDiv(int n, int m) {

        if (m > n) {
            if ((m % n) == 0) {
                return n;
            } else {
                return getHighestDiv(n, m % n);
            }
        } else {
            if ((n % m) == 0) {
                return m;
            } else {
                return getHighestDiv(m, n % m);
            }
        }
    }

    void printAnswer(int arg0, int arg1, int divider){
        System.out.printf("Highest divider for %d and %d is %d",arg0,arg1,divider);
    }
}