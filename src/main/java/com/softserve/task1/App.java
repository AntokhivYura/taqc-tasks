package com.softserve.task1;

import com.softserve.io.read.ReadFromConsole;

/**
 * Starts the application NumberContainsDigitThree.
 */
public class App {

    public static void main(String[] args) {
        ReadFromConsole readFromConsole = new ReadFromConsole();
        int numberFromConsole = readFromConsole.getValueFromConsole();

        NumberContainsDigitThree containsDigitThree = new NumberContainsDigitThree(numberFromConsole);
        boolean containsThree = containsDigitThree.numberContainsThree();
        containsDigitThree.printAnswer(containsThree);

    }
}
