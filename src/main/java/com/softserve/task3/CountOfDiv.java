package com.softserve.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Find numbers from 1 to 10000 with the maximum number of dividers.
 * @author Yurii Antokhiv
 * @version 1.0
 */
class CountOfDiv {

    /**
     * Return the numbers with the largest number of dividers.
     *
     * @return <code> List</code> of numbers with largest number of dividers
     */
    List<Integer> getNumWithMaxDivider() {
        List<Integer> listOfAllDividers = countDivOfNumber();

        int max = Collections.max(listOfAllDividers);

        List<Integer> numbersWithMaxDiv = new ArrayList<>();

        for (int i = 0; i < listOfAllDividers.size(); i++) {
            if (listOfAllDividers.get(i) == max) {
                numbersWithMaxDiv.add(i + 1);
            }
        }
        return numbersWithMaxDiv;
    }

    /**
     * Сounts all dividers for each number
     * in the range from 1 to 10000
     * and returns the numbers with largest number of dividers.
     *
     * @return List of numbers with largest number of dividers
     */
    private List<Integer> countDivOfNumber() {
        List<Integer> listOfDiv = new ArrayList<>();

        int length = 10000;

        for (int k = 1; k <= length; k++) {
            int count = 0;
            for (int i = 1; i <= k; i++) {

                if ((k % i) == 0) {
                    count++;
                }
            }
            listOfDiv.add(count);
        }
        return listOfDiv;
    }

    /**
     * Print all numbers with largest number of dividers.
     *
     * @param listOfDiv list of numbers with largest number of dividers
     */
    void printNumbers(final List<Integer> listOfDiv) {
        System.out.print("Numbers from 1 to 10000 "
                + "with max count of dividers is ");

        for (Integer elem : listOfDiv) {
            System.out.print(elem + " ");
        }
    }
}
